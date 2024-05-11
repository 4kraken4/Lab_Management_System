package com.wecare.controller;

import com.wecare.assets.db.Database;
import com.wecare.model.LabIncharge;
import com.wecare.model.LabTechnetian;
import com.wecare.model.Receptionist;
import com.wecare.model.StockManager;
import com.wecare.model.User;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class UserController {

    public void setUserBy_ID() {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_user WHERE user_id = '" + user.getUsrID() + "'";
            this.setData(stmt.executeQuery(sql));
        } catch (NumberFormatException | SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setUserBy_Email() {      // for otp process
        String sql = "SELECT * FROM tbl_user WHERE email = ? limit 1";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.user.getUsrEmail());
            this.setData(pst.executeQuery());
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void setUserBy_PhoneNo() {      // for otp process
        String sql = "SELECT * FROM tbl_user WHERE phone = ? limit 1";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, this.user.getUsrPhone());
            this.setData(pst.executeQuery());
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public boolean updatePassword() {
        boolean i = false;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "Update tbl_user SET "
                    + "password ='" + user.getUsrPassword() + "' "
                    + "WHERE user_id = '" + user.getUsrID() + "'";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                i = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

    private void setData(ResultSet result) throws SQLException, ParseException {
        if (result.next()) {
            do {
                user.setUsrID(result.getString(1));
                user.setUsrWorkrole(result.getString(2));
                user.setUsrPhone(result.getString(5));
                user.setUsrEmail(result.getString(6));
                user.setLabID(result.getString(7));
            } while (result.next());
        }
    }

    public void createUserByRole() {
        User u = this.user;
        if (null != user.getUsrWorkrole()) {
            switch (this.user.getUsrWorkrole()) {
                case "REC" ->
                    user = new Receptionist();
                case "INC" ->
                    user = new LabIncharge();
                case "TEC" ->
                    user = new LabTechnetian();
                case "STM" ->
                    user = new StockManager();
                default -> {
                }
            }
        }
        this.user.setUsrID(u.getUsrID());
    }

    public static boolean verifyEmail(User user) {
        String sql = "SELECT user_id FROM tbl_user WHERE email = ? limit 1";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, user.getUsrEmail());
            ResultSet r = pst.executeQuery();
            if (r.next()) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }

    public static boolean verifyTelephone(User user) {
        String sql = "SELECT user_id FROM tbl_user WHERE phone = ? limit 1";
        try ( PreparedStatement pst = Database.getConnectionTo_SystemDB().prepareStatement(sql)) {
            pst.setString(1, user.getUsrPhone());
            ResultSet r = pst.executeQuery();
            if (r.next()) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }

    public static void setUserFrom_ID(User user) {
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT * FROM tbl_user WHERE user_id = '" + user.getUsrID() + "'";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                user.setUsrID(result.getString(1));
                user.setUsrWorkrole(result.getString(2));
                user.setUsrPhone(result.getString(5));
                user.setUsrEmail(result.getString(6));
                user.setLabID(result.getString(7));
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static ResultSet getLabData() throws SQLException {
        String sql = "SELECT * FROM tbl_laboratory";
        Statement st = Database.getConnectionTo_SystemDB().createStatement();
        return st.executeQuery(sql);
    }

    public static void getLabs(Component c) {
        if (c instanceof JComboBox jc) {
            jc.removeAllItems();
            jc.addItem("select lab");
            try {
                ResultSet t = UserController.getLabData();
                if (t.next()) {
                    do {
                        jc.addItem("(" + t.getString(4) + ")-" + t.getString(1));
                    } while (t.next());
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    public boolean recoverPassword() {
        return false;
    }

    public User getUser() {
        return user;
    }

    public UserController(User user) {
        this.user = user;
    }

    private User user;
}
