package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.StockItem;
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

public class StockItemController {

    public boolean save() {
        boolean i = false;
        String sql = "INSERT INTO tbl_stock_item  VALUES (?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.item.getId());
            pst.setString(2, this.item.getType());
            pst.setInt(3, this.item.getQnt_remaining());
            pst.setInt(4, this.item.getQnt_min());
            pst.setString(5, this.item.getDescription());
            int result = pst.executeUpdate();
            i = result > 0;
            if (i) {
                sql = "INSERT INTO tbl_supplier_stock_item VALUES (?,?)";
                PreparedStatement pst2 = Database.getConnectionTo_SystemDB().prepareStatement(sql);
                pst2.setString(1, this.item.getSupplier_id());
                pst2.setString(2, this.item.getId());
                
                result = pst2.executeUpdate();
                i = result > 0;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public boolean update() {
        boolean i = false;
        String sql = "UPDATE tbl_stock_item SET qnt_rem = ? WHERE stock_item_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setInt(1, this.item.getQnt_remaining());
            pst.setString(2, this.item.getId());
            int result = pst.executeUpdate();
            i = result > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        }
        return i;
    }

    public void getItemDataById() {
        String sql = "SELECT * FROM tbl_stock_item WHERE stock_item_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, item.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                this.item.setId(r.getString(1));
                this.item.setType(r.getString(2));
                this.item.setQnt_remaining(r.getInt(3));
                this.item.setQnt_min(r.getInt(4));
                this.item.setDescription(r.getString(5));
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void getItemDataByType(StockItem item) {
        String sql = "SELECT * FROM tbl_stock_item WHERE type = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, item.getType());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                item.setId(r.getString(1));
                item.setType(r.getString(2));
                item.setQnt_remaining(r.getInt(3));
                item.setQnt_min(r.getInt(4));
                item.setDescription(r.getString(5));
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Stocks", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static ResultSet getStockItemData(String txt) throws SQLException {
        String sql = "";
        Statement stm = Database.getConnectionTo_SystemDB().createStatement();
        if (txt.isEmpty()) {
            sql = "SELECT i.stock_item_id, i.type, i.qnt_min, i.qnt_rem FROM tbl_stock_item i";
        } else {
            sql = "SELECT i.stock_item_id,"
                    + " i.type, "
                    + "i.qnt_min, "
                    + "i.qnt_rem FROM tbl_stock_item i "
                    + "WHERE (i.stock_item_id LIKE '%" + txt + "%' "
                    + "OR i.type LIKE '%" + txt + "%' "
                    + "OR i.qnt_rem LIKE '%" + txt + "%' "
                    + "OR i.qnt_min LIKE '%" + txt + "%')";
        }
        return stm.executeQuery(sql);
    }

    public static void getStockItems(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(4);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = StockItemController.getStockItemData(txt)) {
            if (r.next()) {
                do {
                    int min = r.getInt(3);
                    int rem = r.getInt(4);
                    String status;
                    if (rem >= min + 30) {
                        status = "good";
                    } else if (rem >= min) {
                        status = "okay";
                    } else {
                        status = "critical";
                    }
                    dt.addRow(new Object[]{r.getString(1),
                        r.getString(2),
                        min,
                        rem,
                        status
                    });
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Supplier getLastStockItem() {
        String sql = "SELECT stock_item_id  FROM tbl_stock_item where stock_item_id = (select MAX(stock_item_id) from tbl_stock_item)";
        Supplier s = new Supplier();
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            ResultSet r = pst.executeQuery(sql);
            while (r.next()) {
                s.setId(r.getString(1));
            }
            if (s.getId() == null) {
                s.setId("st0000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return s;
    }

    public static void getItems(Component c) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT type FROM tbl_stock_item";
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

    public static boolean logTransaction(Object[] data) {
        boolean i = false;
        String sql = "INSERT INTO tbl_stock_item_log ("
                + "StkID, "
                + "quantity, "
                + "date ) VALUES (?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, (String) data[0]);
            pst.setInt(2, (int) data[2]);
            pst.setTimestamp(3, (java.sql.Timestamp) data[3]);
            i = pst.executeUpdate() > 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private static int getLastLogID() {
        String sql = "Select max(log_id) as \"log_id\" from tbl_stock_item_log;";
        int i = 0;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            ResultSet r = stmt.executeQuery(sql);
            while (r.next()) {
                i = r.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public static boolean log_sent_data(String LabID) {
        String sql = "INSERT INTO `tbl_sent_stock` (`LogID`, `LabID`) VALUES (?, ?)";
        int i = 0;
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setInt(1, getLastLogID());
            pst.setString(2, LabID);
            i = pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i > 0;
    }

    public static boolean log_received_data(String SupID) {
        String sql = "INSERT INTO `tbl_receive_stock` (`LogID`, `SupID`) VALUES (?, ?)";
        int i = 0;
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setInt(1, getLastLogID());
            pst.setString(2, SupID);
            i = pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i > 0;
    }

    public StockItemController(StockItem item) {
        this.item = item;
    }

    public StockItem getItem() {
        return this.item;
    }

    public void setItem(StockItem item) {
        this.item = item;
    }

    private StockItem item;

}
