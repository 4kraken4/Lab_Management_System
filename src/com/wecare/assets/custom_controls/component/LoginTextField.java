package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomTextField;
import java.awt.Color;

public class LoginTextField extends javax.swing.JPanel {

    public LoginTextField() {
        initComponents();
    }
    
    public final String getText() {
        return textField.getText();
    }
   
    public final void setText(String text) {
        textField.setText(text);
    }
    
    public void setTextForeground(Color fg) {
        this.fg = fg;
        textField.setForeground(fg);
    }
    
    public void setTextBackground(Color bg) {
        this.bg = bg;
        this.setBackground(bg);
        textField.setBackground(bg);
    }
    
    public void setBottomLineDisable() {
        this.remove(separator);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField = new com.wecare.assets.custom_controls.model.CustomTextField();
        separator = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(30, 33, 35));
        setMinimumSize(new java.awt.Dimension(350, 48));
        setPreferredSize(new java.awt.Dimension(350, 48));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField.setBackground(new java.awt.Color(30, 33, 35));
        textField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textField.setForeground(new java.awt.Color(255, 255, 255));
        textField.setCaretColor(new java.awt.Color(255, 255, 255));
        textField.setDoubleBuffered(true);
        textField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textField.setPreferredSize(new java.awt.Dimension(345, 40));
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, -1));

        separator.setBackground(new java.awt.Color(86, 89, 90));
        separator.setOpaque(true);
        add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 381, 2));
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusGained
        separator.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_textFieldFocusGained

    private void textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusLost
        separator.setBackground(new java.awt.Color(86, 89, 90));
    }//GEN-LAST:event_textFieldFocusLost

    public final void setHint(String hint) {
        textField.setHint(hint);
    }
    
    public CustomTextField getTextField() {
        return textField;
    }
    
    private Color fg;
    private Color bg;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator separator;
    private com.wecare.assets.custom_controls.model.CustomTextField textField;
    // End of variables declaration//GEN-END:variables

}
