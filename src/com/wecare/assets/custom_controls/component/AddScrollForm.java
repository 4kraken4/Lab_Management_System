package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomButton;
import com.wecare.assets.custom_controls.model.CustomScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AddScrollForm extends javax.swing.JPanel {

    public AddScrollForm() {
        initComponents();
        initScrollBar();
        setBackground(new Color(0,0,0,0));
    }
    
    public void setTitle(String title) {
        formTitle.setTitle(title);
    }
    
    private void initScrollBar() {
        scrollpane.setVerticalScrollBar(new CustomScrollBar());
        scrollpane.getVerticalScrollBar().setBackground(Color.WHITE);
        scrollpane.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scrollpane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
    
    public void addForm(JPanel panel) {
        scrollpane.setViewportView(panel);
    }

    public CustomButton getBtn_back() {
        return btn_back;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upper = new javax.swing.JPanel();
        formTitle = new com.wecare.assets.custom_controls.component.DashBoardTitleHeader();
        btn_back = new com.wecare.assets.custom_controls.model.CustomButton();
        center = new javax.swing.JPanel();
        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        scrollpane = new javax.swing.JScrollPane();

        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setLayout(new java.awt.BorderLayout());

        upper.setBackground(new java.awt.Color(63, 63, 63));
        upper.setPreferredSize(new java.awt.Dimension(422, 80));

        btn_back.setBackground(new java.awt.Color(63, 63, 63));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/back.png"))); // NOI18N
        btn_back.setBorderPainted(false);
        btn_back.setDoubleBuffered(true);
        btn_back.setFocusPainted(false);
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout upperLayout = new javax.swing.GroupLayout(upper);
        upper.setLayout(upperLayout);
        upperLayout.setHorizontalGroup(
            upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addGroup(upperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upperLayout.setVerticalGroup(
            upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperLayout.createSequentialGroup()
                .addComponent(formTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(upper, java.awt.BorderLayout.PAGE_START);

        center.setBackground(new java.awt.Color(63, 63, 63));
        center.setPreferredSize(new java.awt.Dimension(800, 390));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane.setBackground(new java.awt.Color(255, 255, 255));
        scrollpane.setBorder(null);
        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        add(center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_back;
    private javax.swing.JPanel center;
    private com.wecare.assets.custom_controls.component.DashBoardTitleHeader formTitle;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JPanel upper;
    // End of variables declaration//GEN-END:variables
}
