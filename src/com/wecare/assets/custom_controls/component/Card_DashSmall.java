package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Card_DashSmall extends javax.swing.JPanel {

    public Card_DashSmall() {
        setOpaque(false);
        initComponents();
    }
    
    public void setData(Model_Card data) {
        lbl_Title.setText(data.getTitle());
        lbl_icon.setText(null);
        lbl_icon.setIcon(data.getIcon());
    }

    public void setStatus(String status) {
        this.lbl_status.setText(status);
    }
    
    public void setStatusColor(Color color) {
        this.lbl_status.setForeground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbl_Title = new javax.swing.JLabel();
        lbl_icon = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        lbl_Title.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Title.setText("T i t l e");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 6, 0, 0);
        add(lbl_Title, gridBagConstraints);

        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icon.setText("icon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 31, 0, 6);
        add(lbl_icon, gridBagConstraints);

        lbl_status.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(26, 114, 222));
        lbl_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_status.setText("status");
        lbl_status.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        add(lbl_status, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#4cf68f"), 0, getHeight(), Color.decode("#579cf0"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 255));
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_status;
    // End of variables declaration//GEN-END:variables
}
