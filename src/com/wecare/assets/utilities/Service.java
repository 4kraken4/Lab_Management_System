package com.wecare.assets.utilities;

import com.wecare.assets.db.Database;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Component;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public final class Service {

    public static Component catchComponent(Component current_panel, Object target) throws NullPointerException {
        boolean flag = true;
        Component p = current_panel;
        synchronized (current_panel.getTreeLock()) {
            while (flag) {
                p = p.getParent();
                flag = !(target.equals(p.getName()));
            }
            return p;
        }
    }

    public static int calculateAge(java.sql.Date dob) {
        Instant instant = new java.util.Date(dob.getTime()).toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate date = zdt.toLocalDate();
        Period period = Period.between(date, LocalDate.now());
        return period.getYears();
    }

    public static String getStandardPhoneNo(String number) {
        if (number.length() > 0) {
            switch (number.charAt(0)) {
                case '+' -> {
                    return number;
                }
                case '0' -> {
                    StringBuilder s = new StringBuilder(number);
                    s = s.replace(0, 1, "+94");
                    number = s.toString();
                }
                default -> {
                    StringBuilder s = new StringBuilder(number);
                    s = s.replace(0, 0, "+94");
                    number = s.toString();
                }
            }
        }
        return number;
    }

public static void getCities(JComboBox c) {
        List cities = new ArrayList<String>();
        c.addItem("select city");
        try ( Statement stm = Database.getConnectionTo_LocationDB().createStatement()) {
            String sql = "SELECT name_en FROM cities";
            ResultSet r = stm.executeQuery(sql);
            while (r.next()) {
                c.addItem(r.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't get locations.");
        }
    }

    public static String getNextId(String id) {
        if (id != null) {
            String prefix = "";
            String str = id;
            int prefix_len = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    prefix_len++;
                    prefix += Character.toString(str.charAt(i));
                }
            }
            str = str.substring(prefix_len);
            int sufix_len = str.length();
            int i = Integer.valueOf(str) + 1;
            id = Integer.toString(i);
            for (int j = 0; j < sufix_len; j++) {
                if (sufix_len > id.length()) {
                    id = "0" + id;
                }
            }
            return prefix + id;
        }
        return "";
    }
}
