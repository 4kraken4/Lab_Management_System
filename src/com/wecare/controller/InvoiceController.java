package com.wecare.controller;

import com.wecare.assets.db.Database;
import com.wecare.model.Invoice;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class InvoiceController {

    public InvoiceController(Invoice invoice) {
        this.invoice = invoice;
    }

    public boolean saveInvoice() {
        String sql = "INSERT INTO tbl_invoice values (?,?,?,?,?)";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.invoice.getId());
            pst.setString(2, this.invoice.getCustomer_id());
            pst.setString(3, this.invoice.getUserid());
            pst.setDate(4, java.sql.Date.valueOf(this.invoice.getDate().toLocalDateTime().toLocalDate()));
            pst.setDouble(5, this.invoice.getTotal_price());
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        return false;
    }

    public static Invoice getLastInvoice() {
        Invoice i = new Invoice();
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_invoice WHERE invoice_id = (SELECT MAX(invoice_id) FROM tbl_invoice)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                i.setId(result.getString(1));
                i.setCustomer_id(result.getString(2));
                i.setUserid(result.getString(3));
                i.setDate(new java.sql.Timestamp(result.getDate(4).getTime()));
                i.setTotal_price(result.getDouble(5));
            }
            if (i.getId() == null) {
                System.out.println("init id null");
                i.setId("i00000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public static Map getMonthlyIncome() {
        Map m = new HashMap<Integer, Double>();
        String sql = "SELECT sum(i.total) as \"total\", count(i.invoice_id), cast(i.date_time as date) as \"date\" from tbl_invoice i group by date";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            ResultSet r = pst.executeQuery();
            int i = 1;
            while (r.next()) {
                i = r.getTimestamp(3).toLocalDateTime().getDayOfMonth();
                m.put(i, r.getDouble(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return new HashMap<Integer, Double>() {
                {put(1, 0D);}
            };
        }
        return m;
    }

    private final Invoice invoice;
}
