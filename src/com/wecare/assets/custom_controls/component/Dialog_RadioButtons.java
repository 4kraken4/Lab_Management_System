package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomRadioButton;
import java.awt.Color;
import javax.swing.JLabel;

public class Dialog_RadioButtons extends javax.swing.JDialog {

    public Dialog_RadioButtons(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        container.setOpaque(false);
        this.getRootPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(btn_save);
    }

    public void setData(JLabel data) {
        Dialog_RadioButtons.data = data;
        String t = "Edit " + Dialog_RadioButtons.data.getName();
        title.setText(t);
        if (data.getText().equalsIgnoreCase("Bad")) {
            opt_status.setSelected(rd_bad.getModel(), true);
        } else {
            opt_status.setSelected(rd_good.getModel(), true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opt_status = new javax.swing.ButtonGroup();
        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        container = new javax.swing.JPanel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        title = new javax.swing.JLabel();
        rd_bad = new com.wecare.assets.custom_controls.model.CustomRadioButton();
        rd_good = new com.wecare.assets.custom_controls.model.CustomRadioButton();

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

        title.setForeground(new java.awt.Color(102, 153, 255));
        title.setText("Title");

        rd_bad.setBackground(new java.awt.Color(30, 33, 35));
        opt_status.add(rd_bad);
        rd_bad.setForeground(new java.awt.Color(255, 255, 255));
        rd_bad.setText("Bad");
        rd_bad.setActionCommand("Bad");
        rd_bad.setColor_selected(new java.awt.Color(0, 102, 255));
        rd_bad.setFocusPainted(false);
        rd_bad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        rd_good.setBackground(new java.awt.Color(30, 33, 35));
        opt_status.add(rd_good);
        rd_good.setForeground(new java.awt.Color(255, 255, 255));
        rd_good.setSelected(true);
        rd_good.setText("Good");
        rd_good.setActionCommand("Good");
        rd_good.setColor_selected(new java.awt.Color(0, 102, 255));
        rd_good.setFocusPainted(false);
        rd_good.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(73, 73, 73)
                .addComponent(rd_good, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(rd_bad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_good, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_bad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 432, 198);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String selection = opt_status.getSelection().getActionCommand().equals("Good") ? "Good" : "Bad";
        Dialog_RadioButtons.data.setText(selection);
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    public CustomRadioButton getRd_bad() {
        return rd_bad;
    }

    public CustomRadioButton getRd_good() {
        return rd_good;
    }
    
    private static JLabel data;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JPanel container;
    private javax.swing.ButtonGroup opt_status;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private com.wecare.assets.custom_controls.model.CustomRadioButton rd_bad;
    private com.wecare.assets.custom_controls.model.CustomRadioButton rd_good;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
