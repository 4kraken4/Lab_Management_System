package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.TestType;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TestTypeController {

    public boolean save() {
        boolean i = false;
        String sql = "INSERT INTO tbl_test_type  VALUES (?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, type.getTestName());
            pst.setString(2, type.getDescription());
            pst.setString(3, type.getSample_type());
            pst.setDouble(4, type.getPrice());
            pst.setInt(5, 1);
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public boolean update() {
        boolean i = false;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "Update tbl_test_type SET "
                    + "description = '" + type.getDescription() + "' ,"
                    + "StpID = '" + type.getSample_type() + "' ,"
                    + "price = '" + type.getPrice() + "' ,"
                    + "status = '" + 1 + "' "
                    + "WHERE test_type_id = '" + type.getTestName() + "' ";
            if (stmt.executeUpdate(sql) > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean delete() {
        boolean i = false;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "DELETE FROM tbl_test_types WHERE  test_type_id = " + type.getTestName() + "";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public void setData() {
        String sql = "SELECT * FROM tbl_test_type WHERE test_type_id = ? AND status = 1";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.type.getTestName());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                this.type.setTestName(r.getString(1));
                this.type.setDescription(r.getString(2));
                this.type.setSample_type(r.getString(3));
                this.type.setPrice(r.getDouble(4));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static ResultSet getData(String txt) throws SQLException {
        Statement stmt = Database.getConnectionTo_SystemDB().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "select * from tbl_test_type WHERE status = 1";
        } else {
            sql = "select * from tbl_test_type WHERE status = 1 "
                    + "AND ("
                    + "test_type_id LIKE '%" + txt + "%' "
                    + "or price LIKE '%" + txt + "%')";
        }
        ResultSet result = stmt.executeQuery(sql);
        return result;
    }

    public static void getTestTypes(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try {
            ResultSet r = TestTypeController.getData(txt);
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getString(1), "Rs." + r.getString(4)});
                } while (r.next());
            }
        } catch (SQLException ex) {

        }
    }

    public static Component getTestTypes(Component c) {
        if (c instanceof JComboBox jc) {
            jc.removeAllItems();
            jc.addItem("select test");
            try {
                ResultSet t = TestTypeController.getData("");
                if (t.next()) {
                    do {
                        jc.addItem(t.getString(1));
                    } while (t.next());
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            return jc;
        }
        if (c instanceof Table table) {
            return table;
        }
        return c;
    }

    public static void getTestTypes(List l) {
        try {
            ResultSet t = TestTypeController.getData("");
            if (t.next()) {
                do {
                    ((ArrayList) l).add(t.getString(1));
                } while (t.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public TestType getTestType() {
        return type;
    }

    public TestTypeController(TestType type) {
        this.type = type;
    }

    private final TestType type;

}
