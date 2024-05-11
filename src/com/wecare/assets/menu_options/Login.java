package com.wecare.assets.menu_options;

import com.wecare.assets.custom_controls.component.Pnl_ResetPassword;
import com.wecare.assets.otp.Diag_OTP;
import com.wecare.controller.UserController;
import com.wecare.model.User;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
        txt_username.setHint("Username");
        txt_password.setHint("Password");
        txt_password.setForeground(Color.white);
        txt_username.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_greeting = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_sec = new javax.swing.JLabel();
        lbl_ampm = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        container1 = new javax.swing.JPanel();
        container2 = new javax.swing.JPanel();
        txt_username = new com.wecare.assets.custom_controls.component.LoginTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new com.wecare.assets.custom_controls.component.LoginPasswordField();
        btn_forgottenPassword = new javax.swing.JLabel();
        btn_login = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(30, 33, 35));
        setName("login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);

        lbl_greeting.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        lbl_greeting.setForeground(new java.awt.Color(255, 255, 255));
        lbl_greeting.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_greeting.setText("Hey, good morning!.");

        lbl_time.setFont(new java.awt.Font("Century Gothic", 0, 42)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_time.setText("07:29");
        lbl_time.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_time.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbl_sec.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbl_sec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_sec.setText("42");
        lbl_sec.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_sec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbl_ampm.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbl_ampm.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ampm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ampm.setText("pm");
        lbl_ampm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_ampm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbl_date.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_date.setText("Saturday, 30/10/2021");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_greeting, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ampm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_date, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_greeting)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_sec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ampm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(lbl_date)
                .addGap(170, 170, 170))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 556;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/logo/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 197;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel3, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        container1.setOpaque(false);
        container1.setLayout(new java.awt.GridBagLayout());

        container2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 192, 239));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOGIN");

        btn_forgottenPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_forgottenPassword.setForeground(new java.awt.Color(67, 192, 239));
        btn_forgottenPassword.setText("forgotten password?");
        btn_forgottenPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_forgottenPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_forgottenPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_forgottenPasswordMouseExited(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 102, 255));
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/login.png"))); // NOI18N
        btn_login.setText("L o g i n");
        btn_login.setEffectColor(new java.awt.Color(140, 198, 255));
        btn_login.setFocusPainted(false);
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_login.setIconTextGap(15);
        btn_login.setPreferredSize(new java.awt.Dimension(100, 35));
        btn_login.setRoundness(40);

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container2Layout.createSequentialGroup()
                        .addGroup(container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                        .addGroup(container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_forgottenPassword)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_forgottenPassword)
                .addGap(54, 54, 54)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(240, 238, 340, 159);
        container1.add(container2, gridBagConstraints);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_forgottenPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgottenPasswordMouseEntered
        btn_forgottenPassword.setForeground(new java.awt.Color(128, 212, 244));
    }//GEN-LAST:event_btn_forgottenPasswordMouseEntered

    private void btn_forgottenPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgottenPasswordMouseExited
        btn_forgottenPassword.setForeground(new java.awt.Color(67, 192, 239));
    }//GEN-LAST:event_btn_forgottenPasswordMouseExited

    private void btn_forgottenPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgottenPasswordMouseClicked
            Diag_OTP otp_prompt = new Diag_OTP(null, true);
            otp_prompt.setLocationRelativeTo(this);
            otp_prompt.setVisible(true);
            User u = otp_prompt.getUser();
            if (otp_prompt.isVerified() && u != null) {
                JPanel pnl = this.getLoginPanel();
                container1.removeAll();
                Pnl_ResetPassword reset = new Pnl_ResetPassword();
                container1.add(reset);
                container1.repaint();
                container1.revalidate();
                reset.getBtn_Reset().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        if (reset.isMatch()) {
                            u.setUsrPassword(new String(reset.getNew_password().getPassword()));
                            UserController uc = new UserController(u);
                            if (uc.updatePassword()) {
                                JOptionPane.showMessageDialog(null, "Update successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                container1.removeAll();
                                container1.add(pnl);
                                container1.repaint();
                                container1.revalidate();
                            }
                        }
                    }
                });
            }
    }//GEN-LAST:event_btn_forgottenPasswordMouseClicked

    private JPanel getLoginPanel() {
        return this.container2;
    }
    
    public com.wecare.assets.custom_controls.component.LoginTextField getUserNameField() {
        return this.txt_username;
    }
    
    public com.wecare.assets.custom_controls.component.LoginPasswordField getPasswordField() {
        return this.txt_password;
    }
    
    public final void showGreeting() {
        int curr_hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (curr_hour < 12)
            lbl_greeting.setText("Hey, good morning!");
        else if (curr_hour < 18)
            lbl_greeting.setText("Hey, good afternoon!");
        else
            lbl_greeting.setText("Hey, good evening!");
    }
        
    public void setTimerOFF() {
        timer_state = false;
    }
    
    public void setTimerON() {
        timer_state = true;
    }

    public JLabel getBtn_forgottenPassword() {
        return btn_forgottenPassword;
    }

    public com.wecare.assets.custom_controls.model.CustomButton getBtn_login() {
        return btn_login;
    }
    
    public final void showTime() {
        Thread td_time = new Thread("td_time") {
            @Override
            public void run() {
                while (timer_state) {
                    Date curr_datetime = new Date();
                    lbl_time.setText(new SimpleDateFormat("hh:mm").format(curr_datetime));
                    lbl_sec.setText(new SimpleDateFormat("ss").format(curr_datetime));
                    lbl_ampm.setText(new SimpleDateFormat("a").format(curr_datetime).toLowerCase());
                    lbl_date.setText(new SimpleDateFormat("EEEE, dd/MM/YYYY").format(curr_datetime));
                }
            }
        };  td_time.setDaemon(true);
            td_time.start();
    }
    
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
    
    private User loggedInUser;
    private boolean isLoggedIn;
    private boolean timer_state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_forgottenPassword;
    private com.wecare.assets.custom_controls.model.CustomButton btn_login;
    private javax.swing.JPanel container1;
    private javax.swing.JPanel container2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_ampm;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_greeting;
    private javax.swing.JLabel lbl_sec;
    private javax.swing.JLabel lbl_time;
    private com.wecare.assets.custom_controls.component.LoginPasswordField txt_password;
    private com.wecare.assets.custom_controls.component.LoginTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
