package com.wecare.assets.otp;

import com.wecare.assets.utilities.Service;
import java.awt.Color;
import javax.swing.JPanel;

public class Pnl_OTP_Option extends javax.swing.JPanel {

    public Pnl_OTP_Option() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        otp_option = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        opt_email = new javax.swing.JRadioButton();
        opt_sms = new javax.swing.JRadioButton();
        btn_send = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        opt_email.setBackground(new java.awt.Color(255, 255, 255));
        otp_option.add(opt_email);
        opt_email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        opt_email.setForeground(new java.awt.Color(0, 204, 102));
        opt_email.setSelected(true);
        opt_email.setText("Get OTP via email");
        opt_email.setActionCommand("email");
        opt_email.setBorder(null);
        opt_email.setFocusPainted(false);
        opt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_emailActionPerformed(evt);
            }
        });

        opt_sms.setBackground(new java.awt.Color(255, 255, 255));
        otp_option.add(opt_sms);
        opt_sms.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        opt_sms.setForeground(new java.awt.Color(51, 51, 51));
        opt_sms.setText("Get OTP via SMS");
        opt_sms.setActionCommand("phone no");
        opt_sms.setBorder(null);
        opt_sms.setFocusPainted(false);
        opt_sms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_smsActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt_email)
                    .addComponent(opt_sms, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(opt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opt_sms, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void opt_smsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_smsActionPerformed
        if(opt_sms.isSelected()) {
            opt_sms.setForeground(new Color(0, 204, 102));
            opt_email.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_opt_smsActionPerformed

    private void opt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_emailActionPerformed
        if(opt_email.isSelected()) {
            opt_email.setForeground(new Color(0, 204, 102));
            opt_sms.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_opt_emailActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        if (Service.catchComponent(this, "pnl_otp") instanceof JPanel pnl) {
            pnl.removeAll();
            Pnl_OTP_getData otp_data = new Pnl_OTP_getData();
            otp_data.setOption(otp_option.getSelection().getActionCommand());
            pnl.add(otp_data);
            pnl.repaint();
            pnl.revalidate();
        }
    }//GEN-LAST:event_btn_sendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_send;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opt_email;
    private javax.swing.JRadioButton opt_sms;
    private javax.swing.ButtonGroup otp_option;
    // End of variables declaration//GEN-END:variables
}
