
package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.model.Customer;
import com.wecare.assets.db.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerController {

    private final Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public CustomerController(Customer customer) {
        this.customer = customer;
    }

    public void setCustomer_by_ID() {
        String sql = "SELECT * FROM tbl_customer WHERE customer_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.customer.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                customer.setFname(r.getString(2));
                customer.setLname(r.getString(3));
                customer.setGender(r.getString(4));
                customer.setDOB(r.getDate(5));
                customer.setPhone(r.getString(6));
                customer.setEmail(r.getString(7));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean findCustomer() {
        boolean i = false;
        String sql = "SELECT * FROM tbl_customer WHERE (email = ?) OR (email = ? AND phone = ?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.customer.getEmail());
            pst.setString(2, this.customer.getEmail());
            pst.setString(3, this.customer.getPhone());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                customer.setId(r.getString(1));
                customer.setFname(r.getString(2));
                customer.setLname(r.getString(3));
                customer.setGender(r.getString(4));
                customer.setDOB(r.getDate(5));
                customer.setPhone(r.getString(6));
                customer.setEmail(r.getString(7));
                customer.setIsNew(false);
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean saveCustomer() {
        boolean i = false;
        String sql = "INSERT INTO tbl_customer VALUES (?,?,?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, customer.getId());
            pst.setString(2, customer.getFname());
            pst.setString(3, customer.getLname());
            pst.setString(4, customer.getGender());
            pst.setDate(5, customer.getDOB());
            pst.setString(6, customer.getPhone());
            pst.setString(7, customer.getEmail());
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean adCustomerToLab(String labId) {
        boolean i = false;
        String sql = "INSERT INTO tbl_laboratory_customer (LID, CID) VALUES (?, ?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, labId);
            pst.setString(2, this.customer.getId());
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean updateCustomer() {
        boolean i = false;
        String sql = "UPDATE tbl_customer SET fname = ?, lname = ?, gender = ?, dob = ?, phone = ?, email = ? WHERE customer_id = ? ";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.customer.getFname());
            pst.setString(2, this.customer.getLname());
            pst.setString(3, this.customer.getGender());
            pst.setDate(4, this.customer.getDOB());
            pst.setString(5, this.customer.getPhone());
            pst.setString(6, this.customer.getEmail());
            pst.setString(7, this.customer.getId());
            int result = pst.executeUpdate();
            if (result > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean deleteCustomer() {
        boolean i = false;

        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "DELETE FROM tbl_customer  WHERE customer_id = '" + customer.getId() + "'";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private static ResultSet getCustomerData(String txt) throws SQLException {
        Statement stmt = Database.getConnectionTo_SystemDB().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "select * from tbl_customer";
        } else {
            sql = "SELECT * FROM `tbl_customer` WHERE "
                    + "customer_id LIKE '%" + txt + "%' "
                    + "or fname LIKE '%" + txt + "%' "
                    + "or lname LIKE '%" + txt + "%' "
                    + "or gender LIKE '%" + txt + "%' "
                    + "or phone LIKE '%" + txt + "%' "
                    + "or email LIKE '%" + txt + "%' ";
        }
        return stmt.executeQuery(sql);
    }

    public static void getCustomers(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = CustomerController.getCustomerData(txt)) {
            if (r.next()) {
                do {
                    String gen = "M".equals(r.getString(4)) ? "male" : "female";
                    dt.addRow(new Object[]{r.getString(1), (r.getString(2) + " " + r.getString(3)), gen, r.getString(6), r.getString(7)});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void getCustomers(JComboBox c) {
        try ( ResultSet r = CustomerController.getCustomerData("")) {
            c.addItem("select customer");
            if (r.next()) {
                do {
                    c.addItem(r.getString(1));
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Customer getLastCustomer() {
        Customer c = new Customer();
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_customer WHERE customer_id = (SELECT MAX(customer_id) FROM tbl_customer)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                c.setId(result.getString(1));
                c.setFname(result.getString(2));
                c.setLname(result.getString(3));
                c.setGender(result.getString(4));
                c.setDOB(result.getDate(5));
                c.setPhone(result.getString(6));
                c.setEmail(result.getString(7));
            }
            if (c.getId() == null) {
                c.setId("c00000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return c;
    }

}
