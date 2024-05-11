package com.wecare.view;

import com.wecare.assets.custom_controls.component.LoginPasswordField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class Pnl_ResetPassword extends javax.swing.JPanel {

    public Pnl_ResetPassword() {
        initComponents();
        inti();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_new_password = new com.wecare.assets.custom_controls.component.LoginPasswordField();
        txt_confirm_new_password = new com.wecare.assets.custom_controls.component.LoginPasswordField();
        icon_verify = new javax.swing.JLabel();
        btn_reset = new com.wecare.assets.custom_controls.model.CustomButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 192, 239));
        jLabel6.setText("Reset your password");

        txt_new_password.setHint("new password");

        txt_confirm_new_password.setHint("confirm new password");

        icon_verify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_reset.setBackground(new java.awt.Color(0, 102, 255));
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/padlock.png"))); // NOI18N
        btn_reset.setText("R e s e t");
        btn_reset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reset.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_reset.setIconTextGap(15);
        btn_reset.setRoundness(40);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_confirm_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(icon_verify))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel6))
                    .addComponent(txt_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(txt_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txt_confirm_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(icon_verify)
                        .addGap(82, 82, 82))))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void inti() {
        txt_new_password.setHint("new password");
        txt_confirm_new_password.setHint("confirm new password");
        txt_new_password.setForeground(Color.white);
        txt_confirm_new_password.setForeground(Color.white);
        this.setBackground(new Color(0, 0, 0, 0));

        this.txt_confirm_new_password.getPasswordField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (Arrays.equals(txt_confirm_new_password.getPassword(), txt_new_password.getPassword())) {
                    icon_verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lab/assets/images/correct.png")));
                    setIsMatch(true);
                } else {
                    icon_verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lab/assets/images/incorrect.png")));
                    setIsMatch(false);
                }
            }
        });
    }

    public LoginPasswordField getNew_password() {
        return txt_new_password;
    }

    public boolean isMatch() {
        return isMatch;
    }

    private void setIsMatch(boolean isMatch) {
        this.isMatch = isMatch;
    }

    public com.wecare.assets.custom_controls.model.CustomButton getBtn_Reset() {
        return btn_reset;
    }

    private boolean isMatch;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_reset;
    private javax.swing.JLabel icon_verify;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private com.wecare.assets.custom_controls.component.LoginPasswordField txt_confirm_new_password;
    private com.wecare.assets.custom_controls.component.LoginPasswordField txt_new_password;
    // End of variables declaration//GEN-END:variables
}
