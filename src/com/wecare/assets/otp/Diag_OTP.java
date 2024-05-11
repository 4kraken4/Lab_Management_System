package com.wecare.assets.otp;

import com.wecare.model.User;

public class Diag_OTP extends javax.swing.JDialog {

    public Diag_OTP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        isVerified = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verify your account");
        setName("reset_password"); // NOI18N
        setPreferredSize(new java.awt.Dimension(100, 100));
        setResizable(false);

        pnl_container.setBackground(new java.awt.Color(255, 255, 255));
        pnl_container.setName("pnl_otp"); // NOI18N
        pnl_container.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(pnl_container, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(455, 294));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private void init() {
        pnl_container.removeAll();
        pnl_container.add(new Pnl_OTP_Option());
        pnl_container.repaint();
        pnl_container.revalidate();
    }

    private boolean isVerified;
    private User user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_container;
    // End of variables declaration//GEN-END:variables

}
