package com.wecare.controller;

import com.wecare.assets.db.Database;
import com.wecare.model.Login;
import com.wecare.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginController {

    public LoginController(Login login) {
        this.login = login;
    }

    public boolean login() {
        boolean i = false;
        try ( Statement stmt = Database.getConnectionTo_SystemDB().createStatement()) {
            String sql = "SELECT user_id, role, username, password FROM tbl_user "
                    + "WHERE username = '" + login.getUsername() + "'";
            ResultSet result = stmt.executeQuery(sql);
            if (!(result.getRow() > 1) && result.next()) {
                User u = new User();
                u.setUsrID(result.getString(1));
                u.setUsrWorkrole(result.getString(2));
                u.setUsrUsername(result.getString(3));
                u.setUsrPassword(result.getString(4));

                if (u.getUsrPassword().equals(login.getPassword())) {
                    UserController uc = new UserController(u);
                    uc.createUserByRole();
                    uc.setUserBy_ID();
                    this.user = uc.getUser();
                    i = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Couldn't connect with the server.");
        }
        return i;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    private final Login login;

}
