package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomPasswordField;
import java.awt.event.MouseEvent;
import javax.swing.Icon;

public class LoginPasswordField extends javax.swing.JPanel {

    public LoginPasswordField() {
        initComponents();
    }
    
    public final void setHideIcon(Icon i) {
        hide.setIcon(i);
    }

    public final void setHint(String hint) {
        passwordField.setHint(hint);
    }
    
    public final char[] getPassword() {
        return passwordField.getPassword();
    }
    
    public CustomPasswordField getPasswordField() {
        return passwordField;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hide = new javax.swing.JLabel();
        passwordField = new com.wecare.assets.custom_controls.model.CustomPasswordField();
        separator = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(30, 33, 35));
        setMinimumSize(new java.awt.Dimension(350, 48));
        setPreferredSize(new java.awt.Dimension(350, 48));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setBackground(new java.awt.Color(30, 33, 35));
        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/hide.png"))); // NOI18N
        hide.setOpaque(true);
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 0, 40, 40));

        passwordField.setBackground(new java.awt.Color(30, 33, 35));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.setDoubleBuffered(true);
        passwordField.setEchoChar('\u25cf');
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 326, 40));

        separator.setBackground(new java.awt.Color(86, 89, 90));
        separator.setOpaque(true);
        add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 378, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        if (evt.getClickCount() == 1 && evt.getButton() == MouseEvent.BUTTON1 && !evt.isConsumed()) {
            passwordField.setEchoChar((char)0);
            hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/show.png")));
            evt.consume();
        }
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        passwordField.setEchoChar('\u25cf');
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/hide.png")));
        evt.consume();
    }//GEN-LAST:event_hideMouseReleased

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        separator.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_passwordFieldFocusGained

    
    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        separator.setBackground(new java.awt.Color(86, 89, 90));
    }//GEN-LAST:event_passwordFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private com.wecare.assets.custom_controls.model.CustomPasswordField passwordField;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
