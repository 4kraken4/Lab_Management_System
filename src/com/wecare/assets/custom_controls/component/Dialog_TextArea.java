package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import javax.swing.JTextArea;

public class Dialog_TextArea extends javax.swing.JDialog {

    public Dialog_TextArea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        container.setOpaque(false);
        this.getRootPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(btn_save);
    }

    public void setData(JTextArea data) {
        Dialog_TextArea.data = data;
        String t = "Edit " + Dialog_TextArea.data.getName();
        String hint = "new " + data.getName();
        title.setText(t);
        txt_newData.setHint(hint);
        txt_newData.setText(Dialog_TextArea.data.getText());
        txt_newData.selectAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        container = new javax.swing.JPanel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_newData = new com.wecare.assets.custom_controls.model.CustomTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelBorder1.setBackground(new java.awt.Color(35, 41, 46));

        container.setBackground(new java.awt.Color(35, 41, 46));

        btn_save.setBackground(new java.awt.Color(0, 102, 255));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setFocusPainted(false);
        btn_save.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_save.setRoundness(30);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        title.setForeground(new java.awt.Color(58, 199, 249));
        title.setText("Title");

        txt_newData.setBackground(new java.awt.Color(35, 41, 46));
        txt_newData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_newData.setColumns(20);
        txt_newData.setForeground(new java.awt.Color(255, 255, 255));
        txt_newData.setLineWrap(true);
        txt_newData.setRows(5);
        txt_newData.setCaretColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(txt_newData);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(title))
                        .addGroup(containerLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setBounds(0, 0, 465, 318);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Dialog_TextArea.data.setText(txt_newData.getText());
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    private static JTextArea data;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JPanel container;
    private javax.swing.JScrollPane jScrollPane1;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JLabel title;
    private com.wecare.assets.custom_controls.model.CustomTextArea txt_newData;
    // End of variables declaration//GEN-END:variables
}
