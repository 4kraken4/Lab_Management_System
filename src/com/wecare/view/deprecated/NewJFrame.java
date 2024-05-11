package com.wecare.view.deprecated;

import com.wecare.assets.chart.LabLineChart;
import com.wecare.assets.chart.LabRingChart;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_base = new javax.swing.JPanel();
        btn_fill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_base.setBackground(new java.awt.Color(255, 102, 102));
        pnl_base.setLayout(new java.awt.CardLayout());

        btn_fill.setBackground(new java.awt.Color(255, 117, 0));
        btn_fill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_fill.setForeground(new java.awt.Color(51, 51, 51));
        btn_fill.setText("FIll");
        btn_fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btn_fill, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_fill, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fillActionPerformed
//        pnl_base.add(new LabLineChart());
        pnl_base.add(new LabRingChart());
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_fillActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fill;
    private javax.swing.JPanel pnl_base;
    // End of variables declaration//GEN-END:variables
}
