package com.wecare.assets.otp;

import com.wecare.assets.communication.model.Email;
import com.wecare.assets.communication.model.TextMessage;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.UserController;
import com.wecare.model.User;
import java.awt.Color;
import javax.swing.JPanel;

public class Pnl_OTP_getData extends javax.swing.JPanel {

    public Pnl_OTP_getData() {
        initComponents();
        lbl_error.setText("");
    }

    public void setOption(String option) {
        this.option = option;
        String hint = "your " + this.option;
        this.txt_data.setHint(hint);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_data = new com.wecare.assets.custom_controls.model.CustomTextField();
        lbl_error = new javax.swing.JLabel();
        btn_send = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_data.setForeground(new java.awt.Color(51, 51, 51));
        txt_data.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_data.setDoubleBuffered(true);
        txt_data.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        lbl_error.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(0, 102, 204));
        lbl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_error.setText("Please provide your email registered eith the lab.");

        btn_send.setBackground(new java.awt.Color(0, 102, 204));
        btn_send.setForeground(new java.awt.Color(255, 255, 255));
        btn_send.setText("Send");
        btn_send.setFocusPainted(false);
        btn_send.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_send.setRoundness(40);
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        User u = new User();
        UserController uc = new UserController(u);
        if (option.equals("email")) {
            u.setUsrEmail(txt_data.getText());
            uc.setUserBy_Email();
        } else {
            u.setUsrPhone(txt_data.getText());
            uc.setUserBy_PhoneNo();
        }
        this.user = uc.getUser();

        if (txt_data.getText().length() == 0) {
            lbl_error.setText("");
            lbl_error.setText("enter an " + option + "...");
        } else if ((option.equals("email") && !UserController.verifyEmail(user)) 
                || (option.equals("phone no") && !UserController.verifyTelephone(user))) {
            lbl_error.setText("");
            lbl_error.setForeground(new Color(255,0,102));
            lbl_error.setText("The email you have entered is not registered in database.");
        } else if (user.getUsrID() != null || user.getUsrPhone() != null) {
            lbl_error.setText("");
            if (Service.catchComponent(this, "pnl_otp") instanceof JPanel pnl) {
                pnl.removeAll();
                Pnl_OTP_Verify verify_otp = null;
                if (option.equals("email")) {
                    verify_otp = new Pnl_OTP_Verify(this.user, new Email());
                } else if (option.equals("phone no")) {
                    verify_otp = new Pnl_OTP_Verify(this.user, new TextMessage());
                }
                pnl.add(verify_otp);
                pnl.repaint();
                pnl.revalidate();
            }
        }
    }//GEN-LAST:event_btn_sendActionPerformed

    private String option;
    private User user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_send;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_error;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_data;
    // End of variables declaration//GEN-END:variables
}
