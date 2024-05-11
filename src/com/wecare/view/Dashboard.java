package com.wecare.view;

import com.wecare.assets.menu_options.AboutUs;
import com.wecare.assets.menu_options.Help;
import com.wecare.assets.menu_options.Home;
import com.wecare.assets.menu_options.Login;
import com.wecare.assets.menu_options.Manage;
import com.wecare.controller.LoginController;
import com.wecare.model.User;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        header.setFrame(Dashboard.this);
        pnl_menu.setFrame(Dashboard.this);

        home = new Home();
        manage = new Manage();
        login = new Login();
        help = new Help();
        aboutUs = new AboutUs();

        // Drag move operation
        header.initMoving();

        pnl_menu.addEventMenuSelected((int index) -> {
            switch (index) {
                case 0 -> {
                    setForm(home);
                }
                case 1 -> {
                    setForm(manage);
                }
                case 2 -> {
//                    user.setUser(login.getLoggedInUser());
//                    setForm(user);
                }
                case 5 -> {
                    login = new Login();
                    login.setLoggedIn(false);
                    setForm(login);
                    checkLogin();
                }
                case 6 -> {
                    setForm(help);
                }
                case 7 -> {
                    setForm(aboutUs);
                }
                default -> {
                }
            }
        });
        showLoadingWindow();        // turn on
        setForm(login);
        checkLogin();
    }

    private void initializeWorkSpace() {
        manage.clearPanel();
        setForm(home);
    }

    private void checkLogin() {
        login.getBtn_login().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                com.wecare.model.Login l = new com.wecare.model.Login();
                l.setUsername(login.getUserNameField().getText());
                l.setPassword(new String(login.getPasswordField().getPassword()));
                LoginController lc = new LoginController(l);
                login.setLoggedIn(lc.login());
                if (login.isLoggedIn()) {
                    login.setLoggedInUser(lc.getUser());
                    initializeWorkSpace();
                    manage = configureManageTasks(manage);
                }
            }
        });
    }

    private Manage configureManageTasks(Manage component) {
        if (null != login.getLoggedInUser().getUsrWorkrole()) {
            switch (login.getLoggedInUser().getUsrWorkrole()) {
                case "STM" ->
                    component.add(new Stock_Manager_Tasks());
                case "INC" ->
                    component.add(new Lab_Incharge_Tasks());
                case "TEC" ->
                    component.add(new Lab_Technecian_Tasks());
                case "REC" ->
                    component.add(new Receptionist_Tasks());
                default -> {
                }
            }
        }
        component.repaint();
        component.revalidate();
        return component;
    }
    
    public void setUi_to_manaage() {
        setForm(this.manage);
    }

    private void setForm(JComponent com) {
        if (com instanceof Login) {
            pnl_menu.setVisible(false);
            this.login.setLoggedInUser(null);
            this.login.setTimerON();
            this.login.showGreeting();
            this.login.showTime();
        } else {
            pnl_menu.setVisible(true);
            this.login.setTimerOFF();
        }
        if (com instanceof Home) {
            pnl_menu.setVisible(true);
            this.home.getNetworkStatus();
            this.home.getServerStatus();
        }
        pnl_main.removeAll();
        pnl_main.add(com);
        pnl_main.repaint();
        pnl_main.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        header = new com.wecare.assets.custom_controls.component.Header();
        pnl_menu = new com.wecare.assets.custom_controls.component.Menu();
        jPanel1 = new javax.swing.JPanel();
        pnl_main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratory Management System");
        setName("MainWindow"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(header, java.awt.BorderLayout.NORTH);
        jPanel2.add(pnl_menu, java.awt.BorderLayout.WEST);

        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl_main.setName("main_container"); // NOI18N
        pnl_main.setLayout(new java.awt.CardLayout());
        jPanel1.add(pnl_main, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);

        setSize(new java.awt.Dimension(1600, 905));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showLoadingWindow() {
        WindowLoading loading = new WindowLoading(null, true);
        loading.setLocationRelativeTo(null);
        loading.setVisible(true);
    }
    
    public User getUser() {
        return this.login.getLoggedInUser();
    }

    private Home home;
    private Manage manage;
    private Login login;
    private Help help;
    private AboutUs aboutUs;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.component.Header header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnl_main;
    private com.wecare.assets.custom_controls.component.Menu pnl_menu;
    // End of variables declaration//GEN-END:variables

}
