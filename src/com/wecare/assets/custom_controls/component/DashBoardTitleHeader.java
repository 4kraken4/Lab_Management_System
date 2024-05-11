package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DashBoardTitleHeader extends javax.swing.JPanel {

    public DashBoardTitleHeader() {
        initComponents();
        setOpaque(false);
        color = Color.decode("#1fa0c8");
        setBackground(new Color(0,0,0,0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g;
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, this.color, getWidth(), getHeight(), new Color(255,255,255,0));
        gd.setPaint(gp);
        gd.fillRect(0, 0, getWidth(), getHeight());
        gd.setColor(new Color(255, 255, 255, 50));
        super.paintComponent(g);
    }
    
    public void setTitle(String title) {
        this.title.setText(title);
    }
    
    public String getTitle() {
        return this.title.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();

        title.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    private Color color;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
