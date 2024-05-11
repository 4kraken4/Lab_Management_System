package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.Sample;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SampleController {

    public boolean saveSample() {
        boolean i = false;
        try ( Connection con = Database.getConnectionTo_SystemDB()) {
            String sql = "INSERT INTO tbl_sample  VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, sample.getId());
            pst.setString(2, sample.getCustomer_id());
            pst.setString(3, sample.getUser_id());
            pst.setDate(4, sample.getDate());
            pst.setString(5, sample.getType());
            pst.setString(6, sample.getLab_colleted());
            pst.setString(7, sample.getLab_tested());
            pst.setInt(8, sample.is_collected() == true ? 1 : 0);
            int result = pst.executeUpdate();
            i = result > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "sample", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "sample", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public void setSampleData() {
        try ( Connection con = Database.getConnectionTo_SystemDB()) {
            String sql = "SELECT * FROM tbl_sample WHERE sample_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sample.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                sample.setId(r.getString(1));
                sample.setCustomer_id(r.getString(2));
                sample.setUser_id(r.getString(3));
                sample.setDate(r.getDate(4));
                sample.setType(r.getString(5));
                sample.setLab_colleted(r.getString(6));
                sample.setLab_tested(r.getString(7));
                sample.setcollected((r.getInt(8) == 1));
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean collectSample() {
        boolean i = false;
        try ( Connection con = Database.getConnectionTo_SystemDB()) {
            String sql = "UPDATE tbl_sample SET is_collected = ? WHERE sample_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, this.sample.is_collected() == true ? 1 : 0);
            pst.setString(2, this.sample.getId());
            int result = pst.executeUpdate();
            i = result > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "sample", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "sample", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    private static ResultSet getSampleData(String txt) throws SQLException {
        Statement stmt = Database.getConnectionTo_SystemDB().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "SELECT * FROM tbl_sample";
        } else {
            sql = "SELECT * FROM tbl_sample WHERE"
                    + " is_collected LIKE '%" + txt + "%' "
                    + "or sample_id LIKE '%" + txt + "%' "
                    + "or CID LIKE '%" + txt + "%' "
                    + "or SID LIKE '%" + txt + "%' "
                    + "or date LIKE '%" + txt + "%' ";
        }
        return stmt.executeQuery(sql);
    }

    public static void getSamples(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(3);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = SampleController.getSampleData(txt)) {
            if (r.next()) {
                do {
                    String status = (r.getInt(8) == 0 ? "Pending" : "Collected");
                    dt.addRow(new Object[]{r.getString(1), r.getString(2), r.getString(5), status});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void getSamples_notCollected(Component c) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT s.sample_id FROM tbl_sample s WHERE is_collected = 0";
            ResultSet r = stmt.executeQuery(sql);
            if (c instanceof JComboBox jComboBox) {
                jComboBox.removeAllItems();
                jComboBox.addItem("select sample");
                while (r.next()) {
                    jComboBox.addItem(r.getString(1));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Sample getLastSample() {
        Sample s = new Sample();
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_sample WHERE sample_id = (SELECT MAX(sample_id) FROM tbl_sample)";
            ResultSet r = stmt.executeQuery(sql);
            while (r.next()) {
                s.setId(r.getString(1));
                s.setCustomer_id(r.getString(2));
                s.setUser_id(r.getString(3));
                s.setDate(r.getDate(4));
                s.setType(r.getString(5));
                s.setLab_colleted(r.getString(6));
                s.setLab_tested(r.getString(7));
                s.setcollected((r.getInt(8) == 1));
            }
            if (s.getId() == null) {
                s.setId("s00000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return s;
    }

    public Object[] getRelatedDate() {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT s.sample_id, "
                    + "s.SID, "
                    + "s.LCollect, "
                    + "s.LTest, "
                    + "s.date, "
                    + "s.CID, "
                    + "s.is_collected, "
                    + "c.fname, "
                    + "c.lname, "
                    + "c.dob, "
                    + "t.TTID  "
                    + "     FROM "
                    + "((tbl_sample s INNER JOIN tbl_customer c "
                    + "     on s.CID = c.customer_id ) INNER JOIN tbl_test t "
                    + "     on t.SID = s.sample_id) "
                    + "WHERE s.sample_id = '" + this.sample.getId() + "' AND s.is_collected = 0;";
            ResultSet r = stmt.executeQuery(sql);
            while (r.next()) {
                return new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getDate(5),
                    r.getString(6),
                    r.getInt(7) == 1,
                    r.getString(8),
                    r.getString(9),
                    r.getDate(10),
                    r.getString(11)};
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    public static void getTypes(Component c) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_sample_type";
            ResultSet r = stmt.executeQuery(sql);
            if (c instanceof JComboBox jComboBox) {
                jComboBox.removeAllItems();
                jComboBox.addItem("select type");
                while (r.next()) {
                    jComboBox.addItem(r.getString(1));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void getRelatedLabsForTests(Component c, String test_name) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_laboratory_test_type t where t.TTID = '" + test_name + "';";
            ResultSet r = stmt.executeQuery(sql);
            if (c instanceof JComboBox jComboBox) {
                jComboBox.removeAllItems();
                jComboBox.addItem("select lab");
                while (r.next()) {
                    jComboBox.addItem(r.getString(1));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public SampleController() {
    }

    public SampleController(Sample sample) {
        this.sample = sample;
    }

    private Sample sample;

}
