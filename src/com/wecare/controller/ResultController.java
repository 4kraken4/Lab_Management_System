package com.wecare.controller;

import com.wecare.assets.custom_controls.model.Table;
import com.wecare.assets.db.Database;
import com.wecare.model.CBC_Result;
import com.wecare.model.Result;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ResultController {

    public boolean add_ResultToDo() {
        boolean i = false;
        String sql = "INSERT INTO tbl_result  VALUES (?,?,?,?)";
        try ( PreparedStatement pst1 = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst1.setString(1, this.result.getId());
            pst1.setString(2, this.result.getUser_id());
            pst1.setTimestamp(3, this.result.getDatetime());
            pst1.setInt(4, this.result.getStatus() == true ? 1 : 0);
            int results = pst1.executeUpdate();
            i = results > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    public boolean save_CBC_Result() {
        boolean i = false;
        CBC_Result cbc = (CBC_Result) result;
        String sql = "INSERT INTO tbl_cbc_result  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( PreparedStatement pst1 = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst1.setString(1, cbc.getId());
            pst1.setDouble(2, cbc.getMcv());
            pst1.setDouble(3, cbc.getHemoglobin());
            pst1.setDouble(4, cbc.getRbc_count());
            pst1.setDouble(5, cbc.getPacked_cell_volume());
            pst1.setDouble(6, cbc.getMch());
            pst1.setDouble(7, cbc.getRdw());
            pst1.setDouble(8, cbc.getNrbc());
            pst1.setDouble(9, cbc.getTotal_leucocyte_count());
            pst1.setDouble(10, cbc.getDlc_neutrophils());
            pst1.setDouble(11, cbc.getDlc_lymphocytes());
            pst1.setDouble(12, cbc.getDlc_monocytes());
            pst1.setDouble(13, cbc.getDlc_eosinophils());
            pst1.setDouble(14, cbc.getAlc_lymphocytes());
            pst1.setDouble(15, cbc.getMchc());
            pst1.setDouble(16, cbc.getAlc_monocytes());
            pst1.setDouble(17, cbc.getAlc_eosinophils());
            pst1.setDouble(18, cbc.getAlc_basophils());
            pst1.setDouble(19, cbc.getPlatelet_count());
            pst1.setDouble(20, cbc.getDlc_basophils());
            pst1.setDouble(21, cbc.getAlc_neutrophils());
            int results = pst1.executeUpdate();
            i = results > 0;
            if (i) {
                sql = "UPDATE tbl_result SET status = ? WHERE result_id = ?";
                PreparedStatement pst2 = Database.getConnectionTo_SystemDB().prepareStatement(sql);
                pst2.setInt(1, 1);
                pst2.setString(2, cbc.getId());
                results = pst2.executeUpdate();
                i = results > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private static ResultSet getResultData(String txt) throws SQLException {
        PreparedStatement pst;
        String sql = "";
        if (txt.isEmpty()) {
            sql = "select r.result_id, r.UID, r.date_time, r.status, t.TTID, t.CID from tbl_result r inner join tbl_test t on r.result_id = t.RID "
                    + "order by r.result_id asc";
            pst = Database.getConnectionTo_SystemDB().prepareStatement(sql);
        } else {
            sql = "select r.result_id, "
                    + "r.UID, "
                    + "r.date_time, "
                    + "r.status, "
                    + "t.TTID, "
                    + "t.CID from tbl_result r inner join tbl_test t on r.result_id = t.RID "
                    + "WHERE (r.result_id LIKE '%?%' "
                    + "or r.UID LIKE '%?%' "
                    + "or r.date_time LIKE '%?%' "
                    + "or t.CID LIKE '%?%' "
                    + "or t.TTID LIKE '%?%') order by r.result_id asc ";
            pst = Database.getConnectionTo_SystemDB().prepareStatement(sql);
            pst.setString(1, txt);
            pst.setString(2, txt);
            pst.setString(3, txt);
            pst.setString(4, txt);
            pst.setString(5, txt);
        }
        return pst.executeQuery(sql);
    }

    public static void getTests(Table table, String txt) {
        table.setHas_status(true);
        table.setStatus_column(4);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);
        try ( ResultSet r = ResultController.getResultData(txt)) {
            if (r.next()) {
                do {
                    String str = (r.getInt(4) == 0 ? "Pending" : "Issued");
                    dt.addRow(new Object[]{r.getString(1),
                        r.getString(6),
                        r.getTimestamp(3).toString(),
                        r.getString(5),
                        str});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setResultData() {
        String sql = "SELECT * FROM tbl_sample WHERE sample_id = ?";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, result.getId());
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                result.setId(r.getString(1));
                result.setUser_id(r.getString(2));
                result.setDatetime(r.getTimestamp(3));
                result.setStatus(r.getInt(4) == 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Result getLastTest() {
        Result r = new Result();
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_result WHERE result_id = (SELECT MAX(result_id) FROM tbl_result)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                r.setId(result.getString(1));
                r.setUser_id(result.getString(2));
                r.setDatetime(result.getTimestamp(3));
                r.setStatus(result.getInt(4) == 1);
            }
            if (r.getId() == null) {
                r.setId("r00000");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }

    public ResultController(Result result) {
        this.result = result;
    }

    public ResultController() {
    }

    public Result getResult() {
        return result;
    }

    private Result result;

    public void setResult(Result result) {
        this.result = result;
    }
}
