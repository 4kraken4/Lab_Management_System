package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (null == data.getType()) {
            lbl_name.setText(" ");
        } else switch (data.getType()) {
            case MENU -> {
                lbl_icon.setIcon(data.toIcon());
                lbl_name.setText(data.getName());
            }
            case TITLE -> {
                lbl_icon.setText(data.getName());
                lbl_icon.setFont(new Font("sansserif", 1, 12));
                lbl_name.setVisible(false);
            }
            default -> lbl_name.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics gr) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) gr;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(gr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_icon = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();

        lbl_icon.setForeground(new java.awt.Color(255, 255, 255));
        lbl_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_name.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lbl_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean selected;
    private boolean over;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_name;
    // End of variables declaration//GEN-END:variables
}
