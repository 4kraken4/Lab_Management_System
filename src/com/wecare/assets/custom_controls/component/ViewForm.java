package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomButton;
import com.wecare.assets.custom_controls.model.Table;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class ViewForm extends javax.swing.JPanel {

    public ViewForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        init();
    }

    @Override
    protected void paintComponent(Graphics gr) {
        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#191919"), 0, getHeight(), Color.decode("#303944"));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintComponent(gr);
    }

    private void init() {
        txt_search.setBackground(new Color(63, 63, 63));
        txt_search.setForeground(Color.WHITE);
        txt_search.setBottomLineDisable();
        table.fixTable(scrollpane);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title_header = new com.wecare.assets.custom_controls.component.DashBoardTitleHeader();
        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        scrollpane = new javax.swing.JScrollPane();
        table = new com.wecare.assets.custom_controls.model.Table();
        txt_search = new com.wecare.assets.custom_controls.component.LoginTextField();
        btn_back = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(63, 63, 63));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(63, 63, 63));

        scrollpane.setBackground(new java.awt.Color(255, 255, 255));
        scrollpane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setShowGrid(false);
        scrollpane.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_search.setTextBackground(new java.awt.Color(63, 63, 63));
        txt_search.setTextForeground(java.awt.Color.white);

        btn_back.setBackground(new java.awt.Color(63, 63, 63));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/back.png"))); // NOI18N
        btn_back.setBorderPainted(false);
        btn_back.setDoubleBuffered(true);
        btn_back.setFocusPainted(false);
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title_header, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public CustomButton getBtn_back() {
        return btn_back;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        title_header.setTitle(title);
    }

    public Table getTable() {
        return this.table;
    }
    
    public com.wecare.assets.custom_controls.model.CustomTextField getTextField() {
        return this.txt_search.getTextField();
    }
    
    public void setHaveStatusColumn(boolean b, int column) {
        this.table.setHas_status(b);
        this.table.setStatus_column(column);
    }

    private String title;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_back;
    private javax.swing.JPanel jPanel1;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JScrollPane scrollpane;
    private com.wecare.assets.custom_controls.model.Table table;
    private com.wecare.assets.custom_controls.component.DashBoardTitleHeader title_header;
    private com.wecare.assets.custom_controls.component.LoginTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
