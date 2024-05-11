package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#191919"), 0, getHeight(), Color.decode("#181818"));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_min = new javax.swing.JLabel();
        btn_max = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();

        btn_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/minimize.png"))); // NOI18N
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
        });

        btn_max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/maximize.png"))); // NOI18N
        btn_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maxMouseExited(evt);
            }
        });

        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/close_white.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 568, Short.MAX_VALUE)
                .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_max, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_max, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(btn_min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        btn_min.setOpaque(true);
        btn_min.setBackground(new Color(255, 255, 255, 35));
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseEntered
        btn_max.setOpaque(true);
        btn_max.setBackground(new Color(255, 255, 255, 35));
    }//GEN-LAST:event_btn_maxMouseEntered

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setOpaque(true);
        btn_close.setBackground(new Color(255, 45, 90));
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        btn_min.setBackground(Color.black);
        btn_min.setOpaque(false);
    }//GEN-LAST:event_btn_minMouseExited

    private void btn_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseExited
        btn_max.setBackground(Color.black);
        btn_max.setOpaque(false);
    }//GEN-LAST:event_btn_maxMouseExited

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setBackground(Color.black);
        btn_close.setOpaque(false);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        int ans = JOptionPane.showConfirmDialog(null, "Do you want to close the apllication?",
                "Confirm", JOptionPane.YES_NO_OPTION);
        switch (ans) {
            case 0 -> {
                System.exit(0);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseClicked
        System.out.println("should maximise");
        frm.setState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btn_maxMouseClicked

    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        frm.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minMouseClicked

    public void setFrame(JFrame frm) {
        this.frm = frm;
    }

    public void initMoving() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                frm.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    private int x;
    private int y;
    private JFrame frm;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_max;
    private javax.swing.JLabel btn_min;
    // End of variables declaration//GEN-END:variables
}
