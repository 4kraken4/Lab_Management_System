package com.wecare.assets.otp;

import com.wecare.assets.communication.Manage_email;
import com.wecare.assets.communication.OTP_generator;
import com.twilio.exception.ApiException;
import com.wecare.assets.communication.model.Email;
import com.wecare.assets.communication.model.OTP;
import com.wecare.assets.communication.model.TextMessage;
import com.wecare.assets.utilities.Service;
import com.wecare.model.User;
import javax.swing.JOptionPane;

public class Pnl_OTP_Verify extends javax.swing.JPanel {

    public Pnl_OTP_Verify(User user, TextMessage textmessage) {
        initComponents();
        this.user = user;
        this.textmessage = textmessage;
        this.email = null;
        sendMessage();
    }

    public Pnl_OTP_Verify(User user, Email email1) {
        initComponents();
        this.user = user;
        this.email = email1;
        this.textmessage = null;
        sendMessage();
    }

    private void sendMessage() {
        request = new OTP_generator(new OTP());
        try {
            if (textmessage != null) {
                textmessage.setTo(Service.getStandardPhoneNo(user.getUsrPhone()));
//                Manage_textmessage text_messenger = new Manage_textmessage(textmessage);
//                text_messenger.send_OTP(request.getRespond());          // sends code by sms
            } else {
                email.setTo(user.getUsrEmail());
                Manage_email email_messenger = new Manage_email(email);
                email_messenger.send_OTP(request.getRespond());         // sends code by email
            }
        } catch (ApiException e) {
            JOptionPane.showMessageDialog(null, "Could not connect to the internet.\nCheck your connection.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_otp = new javax.swing.JTextField();
        lbl_error = new javax.swing.JLabel();
        btn_verify = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Verification Code");

        txt_otp.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        txt_otp.setForeground(new java.awt.Color(51, 51, 51));
        txt_otp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_otp.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_otp.setDoubleBuffered(true);

        lbl_error.setBackground(new java.awt.Color(255, 255, 255));
        lbl_error.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(255, 0, 102));
        lbl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_error.setOpaque(true);

        btn_verify.setBackground(new java.awt.Color(0, 102, 204));
        btn_verify.setForeground(new java.awt.Color(255, 255, 255));
        btn_verify.setText("Send");
        btn_verify.setFocusPainted(false);
        btn_verify.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_verify.setRoundness(40);
        btn_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verifyActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("We have sent you an email. Please find the 4 digit ");

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("number and type it in the text box provided.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(txt_otp)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btn_verify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)))
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_otp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_verify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void disposeDialog() {
        if (Service.catchComponent(this, "reset_password") instanceof Diag_OTP diag) {
            diag.setVerified(true);
            diag.setUser(this.user);
            diag.dispose();
        }
    }

    private void btn_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verifyActionPerformed
        if (request.getRespond().getOTP().equals(txt_otp.getText())) {
            this.lbl_error.setText("");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            this.disposeDialog();
        } else {
            this.lbl_error.setText("Attempt faild.");
        }
    }//GEN-LAST:event_btn_verifyActionPerformed

    private final Email email;
    private final TextMessage textmessage;
    private final User user;
    private OTP_generator request;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_verify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JTextField txt_otp;
    // End of variables declaration//GEN-END:variables
}
