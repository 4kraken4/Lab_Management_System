package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import javax.swing.JLabel;

public class Dialog_TextField extends javax.swing.JDialog {

    public Dialog_TextField(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        container.setOpaque(false);
        this.getRootPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(btn_save);
    }

    public void setData(JLabel data) {
        Dialog_TextField.data = data;
        String t = "Edit " + Dialog_TextField.data.getName();
        String hint = "new " + data.getName();
        title.setText(t);
        txt_newData.setHint(hint);
        txt_newData.setText(Dialog_TextField.data.getText());
        txt_newData.selectAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        container = new javax.swing.JPanel();
        txt_newData = new com.wecare.assets.custom_controls.model.CustomTextField();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelBorder1.setBackground(new java.awt.Color(35, 41, 46));
        panelBorder1.setLayout(new java.awt.GridBagLayout());

        container.setBackground(new java.awt.Color(35, 41, 46));

        txt_newData.setBackground(new java.awt.Color(35, 41, 46));
        txt_newData.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_newData.setForeground(new java.awt.Color(255, 255, 255));
        txt_newData.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_newData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_newData.setHint("new text");

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

        title.setForeground(new java.awt.Color(102, 153, 255));
        title.setText("Title");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_newData, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_newData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 14, 6);
        panelBorder1.add(container, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setBounds(0, 0, 420, 226);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Dialog_TextField.data.setText(txt_newData.getText());
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    private static JLabel data;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JPanel container;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JLabel title;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_newData;
    // End of variables declaration//GEN-END:variables
}
