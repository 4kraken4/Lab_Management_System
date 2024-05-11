package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.Supplier;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SupplierController {

    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean save() {
        boolean i = false;
        String sql = "INSERT INTO tbl_supplier  VALUES (?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, supplier.getId());
            pst.setString(2, supplier.getName());
            pst.setString(3, supplier.getPhone());
            pst.setString(4, supplier.getEmail());
            pst.setInt(5, supplier.getStatus() == true ? 1 : 0);
            int result = pst.executeUpdate();
            i = result > 0;
            if (i) {
                sql = "INSERT INTO tbl_supplier_address  VALUES (?,?,?,?,?)";
                PreparedStatement pst2 = Database.getConnectionTo_SystemDB().prepareStatement(sql);
                pst2.setString(1, supplier.getId());
                pst2.setString(2, supplier.getAddr_bno());
                pst2.setString(3, supplier.getAddr_street());
                pst2.setString(4, supplier.getAddr_town());
                pst2.setString(5, supplier.getAddr_district());
                result = pst2.executeUpdate();
                i = result > 0;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Supplier", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Supplier", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public boolean update(Supplier supplier_ref) {
        boolean i = false;
        String sql = "UPDATE tbl_supplier SET "
                + "name = ?,"
                + " phone = ?,"
                + " email = ?,"
                + " status = ?"
                + " WHERE tbl_supplier.supplier_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getPhone());
            pst.setString(3, supplier.getEmail());
            pst.setInt(4, supplier.getStatus() == true ? 1 : 0);
            pst.setString(5, supplier.getId());
            i = pst.executeUpdate() > 0;
            if (i) {
                sql = "UPDATE tbl_supplier_address SET"
                        + " addr_bno = ?,"
                        + " addr_street = ?,"
                        + " addr_town = ?,"
                        + " addr_district = ?"
                        + " WHERE tbl_supplier_address.SupID = ? AND"
                        + " addr_town = ?";
                PreparedStatement pst2 = Database.getConnectionTo_SystemDB().prepareStatement(sql);
                pst2.setString(1, supplier.getAddr_bno());
                pst2.setString(2, supplier.getAddr_street());
                pst2.setString(3, supplier.getAddr_town());
                pst2.setString(4, supplier.getAddr_district());
                pst2.setString(5, supplier.getId());
                pst2.setString(6, supplier_ref.getAddr_town());
                i = pst2.executeUpdate() > 0;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Supplier", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Supplier", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public boolean findSupplier() {
        boolean i = false;
        String sql = "SELECT s.*, sa.addr_bno, sa.addr_street, sa.addr_town, sa.addr_district "
                + "FROM tbl_supplier s, tbl_supplier_address sa WHERE (s.supplier_id = sa.SupID) "
                + "AND (s.email = ? AND s.phone = ?) OR (s.email = ?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.supplier.getEmail());
            pst.setString(2, this.supplier.getPhone());
            pst.setString(3, this.supplier.getEmail());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                supplier.setId(r.getString(1));
                supplier.setName(r.getString(2));
                supplier.setPhone(r.getString(3));
                supplier.setEmail(r.getString(4));
                supplier.setStatus(r.getInt(5) == 1);
                supplier.setAddr_bno(r.getString(6));
                supplier.setAddr_street(r.getString(7));
                supplier.setAddr_town(r.getString(8));
                supplier.setAddr_district(r.getString(9));
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private static ResultSet getSupplierData(String txt) throws SQLException {
        String sql = "";
        Statement stm = Database.getConnectionTo_SystemDB().createStatement();
        if (txt.isEmpty()) {
            sql = "SELECT "
                    + "s.supplier_id, "
                    + "s.name, "
                    + "s.phone, "
                    + "s.email, "
                    + "a.addr_bno, "
                    + "a.addr_street, "
                    + "a.addr_town, "
                    + "a.addr_district, "
                    + "s.status "
                    + "FROM tbl_supplier s INNER JOIN tbl_supplier_address a ON s.supplier_id = a.SupID WHERE status = 1";
        } else {
            sql = "SELECT s.supplier_id, "
                    + "s.name, "
                    + "s.phone, "
                    + "s.email, "
                    + "a.addr_bno, "
                    + "a.addr_street, "
                    + "a.addr_town, "
                    + "a.addr_district, "
                    + "s.status FROM tbl_supplier s INNER JOIN tbl_supplier_address a ON s.supplier_id = a.SupID "
                    + "WHERE status = 1 AND "
                    + "(s.supplier_id LIKE '%" + txt + "%' OR s.name LIKE '%" + txt + "%' OR s.phone LIKE '%" + txt + "%' "
                    + "OR s.email LIKE '%" + txt + "%' OR a.addr_bno LIKE '%" + txt + "%' OR a.addr_street LIKE '%" + txt + "%' "
                    + "OR a.addr_town LIKE '%" + txt + "%' OR a.addr_district LIKE '%" + txt + "%');";
        }
        return stm.executeQuery(sql);
    }

    public static void getSuppliers(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(7);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = SupplierController.getSupplierData(txt)) {
            if (r.next()) {
                do {
                    String status = (r.getInt(9) == 0 ? "Pending" : "Collected");
                    dt.addRow(new Object[]{r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        (r.getString(5) + ", " + r.getString(6) + ", " + r.getString(7) + ", " + r.getString(8)),
                        status});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static ResultSet getTransactionData(String txt) throws SQLException {
        PreparedStatement pst;
        if (txt.isEmpty()) {
            String sql = "SELECT "
                    + "l.log_id, "
                    + "l.date, "
                    + "st.type, "
                    + "l.quantity, "
                    + "st.qnt_rem, "
                    + "sn.LabID "
                    + "FROM "
                    + "( tbl_stock_item_log l INNER JOIN tbl_sent_stock sn ON l.log_id = sn.LogID ) "
                    + "INNER JOIN "
                    + "tbl_stock_item st ON st.stock_item_id = l.StkID "
                    + "WHERE "
                    + "l.date BETWEEN '2022-03-01' AND '2022-03-30' "
                    + "UNION ALL "
                    + "( SELECT "
                    + "l.log_id, "
                    + "l.date, "
                    + "st.type, "
                    + "l.quantity, "
                    + "st.qnt_rem, "
                    + "rs.SupID "
                    + "FROM "
                    + "( tbl_stock_item_log l INNER JOIN tbl_receive_stock rs ON l.log_id = rs.LogID ) "
                    + "INNER JOIN "
                    + "tbl_stock_item st ON st.stock_item_id = l.StkID)";
            pst = Database.getConnectionTo_SystemDB().prepareStatement(sql);
        } else {
            String sql = "SELECT "
                    + "l.log_id, "
                    + "l.date, "
                    + "st.type, "
                    + "l.quantity, "
                    + "st.qnt_rem, "
                    + "sn.LabID "
                    + "FROM "
                    + "( tbl_stock_item_log l INNER JOIN tbl_sent_stock sn ON l.log_id = sn.LogID ) "
                    + "INNER JOIN "
                    + "tbl_stock_item st ON st.stock_item_id = l.StkID "
                    + "WHERE "
                    + "l.date BETWEEN '2022-03-01' AND '2022-03-30' "
                    + "UNION ALL "
                    + "( SELECT "
                    + "l.log_id, "
                    + "l.date, "
                    + "st.type, "
                    + "l.quantity, "
                    + "st.qnt_rem, "
                    + "rs.SupID "
                    + "FROM "
                    + "( tbl_stock_item_log l INNER JOIN tbl_receive_stock rs ON l.log_id = rs.LogID ) "
                    + "INNER JOIN "
                    + "tbl_stock_item st ON st.stock_item_id = l.StkID "
                    + "WHERE "
                    + "l.date BETWEEN '2022-03-01' AND '2022-03-30' )";
            pst = Database.getConnectionTo_SystemDB().prepareStatement(sql);
        }
        return pst.executeQuery();
    }

    public static void getTransactionData(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(5);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = SupplierController.getTransactionData(txt)) {
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5),
                        r.getString(6)
                    });
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void getSupplierById() {
        String sql = "SELECT "
                + "s.supplier_id, "
                + "s.name, "
                + "s.phone, "
                + "s.email, "
                + "a.addr_bno, "
                + "a.addr_street, "
                + "a.addr_town, "
                + "a.addr_district, "
                + "s.status "
                + "FROM tbl_supplier s INNER JOIN tbl_supplier_address a ON s.supplier_id = a.SupID WHERE s.supplier_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.supplier.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                this.supplier.setId(r.getString(1));
                this.supplier.setName(r.getString(2));
                this.supplier.setPhone(r.getString(3));
                this.supplier.setEmail(r.getString(4));
                this.supplier.setAddr_bno(r.getString(5));
                this.supplier.setAddr_street(r.getString(6));
                this.supplier.setAddr_town(r.getString(7));
                this.supplier.setAddr_district(r.getString(8));
                this.supplier.setStatus(r.getInt(9) == 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Supplier getLastSupplier() {
        String sql = "SELECT "
                + "s.supplier_id, "
                + "s.name, "
                + "s.phone, "
                + "s.email, "
                + "a.addr_bno, "
                + "a.addr_street, "
                + "a.addr_town, "
                + "a.addr_district, "
                + "s.status "
                + "FROM tbl_supplier s INNER JOIN tbl_supplier_address a ON s.supplier_id = a.SupID "
                + "WHERE s.supplier_id = (SELECT MAX(supplier_id) FROM tbl_supplier)";
        Supplier s = new Supplier();
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            ResultSet r = pst.executeQuery(sql);
            while (r.next()) {
                s.setId(r.getString(1));
                s.setName(r.getString(2));
                s.setPhone(r.getString(3));
                s.setEmail(r.getString(4));
                s.setAddr_bno(r.getString(5));
                s.setAddr_street(r.getString(6));
                s.setAddr_town(r.getString(7));
                s.setAddr_district(r.getString(8));
                s.setStatus((r.getInt(9) == 1));
            }
            if (s.getId() == null) {
                s.setId("su00");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return s;
    }

    public static void getSuppliers(Component c) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT supplier_id, name FROM tbl_supplier where status = 1";
            ResultSet r = stmt.executeQuery(sql);
            if (c instanceof JComboBox jComboBox) {
                jComboBox.removeAllItems();
                jComboBox.addItem("select supplier");
                while (r.next()) {
                    jComboBox.addItem("(" + r.getString(2) + ")-" + r.getString(1));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public SupplierController(Supplier supplier) {
        this.supplier = supplier;
    }
    /*
    SELECT
    l.log_id,
    l.date,
    st.type,
    l.quantity,
    st.qnt_rem,
    sn.LabID
FROM
    (
        tbl_stock_item_log l
    INNER JOIN tbl_sent_stock sn ON
        l.log_id = sn.LogID
    )
INNER JOIN tbl_stock_item st ON
    st.stock_item_id = l.StkID
WHERE
    l.date BETWEEN '2022-03-01' AND '2022-03-30'
UNION ALL
    (
    SELECT
        l.log_id,
        l.date,
        st.type,
        l.quantity,
        st.qnt_rem,
        rs.SupID
    FROM
        (
            tbl_stock_item_log l
        INNER JOIN tbl_receive_stock rs ON
            l.log_id = rs.LogID
        )
    INNER JOIN tbl_stock_item st ON
        st.stock_item_id = l.StkID
    WHERE
        l.date BETWEEN '2022-03-01' AND '2022-03-30'
)
     */
}
