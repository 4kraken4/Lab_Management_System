package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.Test;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TestController {

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public boolean saveTest() {
        boolean i = false;
        String sql = "INSERT INTO tbl_test  VALUES (?,?,?,?,?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, test.getId());
            pst.setString(2, test.getTest_name());
            pst.setString(3, test.getSample_id());
            pst.setString(4, test.getInvoice_id());
            pst.setString(5, test.getUser_id());
            pst.setString(6, test.getCustomer_id());
            pst.setString(7, test.getResult_id());
            pst.setDate(8, (Date) test.getDate());
            pst.setInt(9, test.getStatus() == true ? 1 : 0);

            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public void getTestByResult() {
        String sql = "SELECT * FROM tbl_test WHERE RID = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.test.getResult_id());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                this.test.setId(r.getString(1));
                this.test.setTest_name(r.getString(2));
                this.test.setSample_id(r.getString(3));
                this.test.setInvoice_id(r.getString(4));
                this.test.setUser_id(r.getString(5));
                this.test.setCustomer_id(r.getString(6));
                this.test.setResult_id(r.getString(7));
                this.test.setDate(r.getDate(8));
                this.test.setStatus(r.getInt(9) == 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Map getMonthlyTestStatus() {
        LocalDate first = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        String sql = "select status, COUNT(t.test_id) as 'count' from tbl_test t where t.date between ? and ? GROUP BY status";
        Map m = new HashMap<Integer, Integer>();
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setDate(1, java.sql.Date.valueOf(first));
            pst.setDate(2, java.sql.Date.valueOf(last));
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                m.put(r.getInt(1), r.getInt(2));
            }
            System.out.println("first: "+ first.toString());
            System.out.println("last: "+ last.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return m;
    }

    public void getTestById() {
        String sql = "SELECT * FROM tbl_test WHERE test_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.test.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                this.test.setId(r.getString(1));
                this.test.setTest_name(r.getString(2));
                this.test.setSample_id(r.getString(3));
                this.test.setInvoice_id(r.getString(4));
                this.test.setUser_id(r.getString(5));
                this.test.setCustomer_id(r.getString(6));
                this.test.setResult_id(r.getString(7));
                this.test.setDate(r.getDate(8));
                this.test.setStatus(r.getInt(9) == 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean updateTestDetails() {
        boolean i = false;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            int status = test.getStatus() == true ? 1 : 0;
            String sql = "Update tbl_test SET  "
                    + "date = '" + test.getDate() + "', "
                    + "SID = '" + test.getSample_id() + "', "
                    + "TTID = '" + test.getTest_name() + "', "
                    + "UID = '" + test.getUser_id() + "', "
                    + "IID = '" + test.getInvoice_id() + "', "
                    + "CID = '" + test.getCustomer_id() + "', "
                    + "RID = '" + test.getResult_id() + "', "
                    + "status = '" + status + "' "
                    + "WHERE test_id = '" + test.getId() + "' ";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private static ResultSet getTestData(String txt) throws SQLException {
        Statement stmt = Database.getConnectionTo_SystemDB().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "select t.test_id, t.date, c.fname, c.lname, t.TTID, t.status from tbl_customer c , tbl_test t WHERE c.customer_id = t.CID order by t.test_id asc";
        } else {
            sql = "select t.test_id, t.date, c.fname, c.lname, t.TTID, t.status from tbl_customer c , tbl_test t WHERE (c.customer_id = t.CID) and"
                    + " (t.test_id LIKE '%" + txt + "%' "
                    + "or t.date LIKE '%" + txt + "%' "
                    + "or c.fname LIKE '%" + txt + "%' "
                    + "or c.lname LIKE '%" + txt + "%' "
                    + "or t.TTID LIKE '%" + txt + "%' ) order by t.test_id asc";
        }
        return stmt.executeQuery(sql);
    }

    public static void getTests(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(4);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = TestController.getTestData(txt)) {
            if (r.next()) {
                do {
                    String str = (r.getInt(6) == 0 ? "Pending" : "Done");
                    dt.addRow(new Object[]{r.getString(1),
                        r.getString(2),
                        (r.getString(3) + " " + r.getString(4)),
                        r.getString(5),
                        str});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Test getLastTest() {
        Test t = new Test();
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_test WHERE test_id = (SELECT MAX(test_id) FROM tbl_test)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                t.setId(result.getString(1));
                t.setTest_name(result.getString(2));
                t.setSample_id(result.getString(3));
                t.setInvoice_id(result.getString(4));
                t.setUser_id(result.getString(5));
                t.setCustomer_id(result.getString(6));
                t.setResult_id(result.getString(7));
                t.setDate(result.getDate(8));
                t.setStatus(result.getInt(9) == 1);
            }
            if (t.getId() == null) {
                t.setId("t00000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return t;
    }

    public TestController(Test test) {
        this.test = test;
    }

    public TestController() {
    }

    private Test test;
}
