package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import javax.swing.JLabel;
import org.jdatepicker.impl.JDatePickerImpl;

public class Dialog_DatePicker extends javax.swing.JDialog {
    
    public Dialog_DatePicker(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        container.setOpaque(false);
        this.getRootPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(btn_save);
    }

    public void setData(JLabel data) {
        Dialog_DatePicker.data = data;
        String t = "Edit " + Dialog_DatePicker.data.getName();
        title.setText(t);
    }

    public JDatePickerImpl getDatePicker() {
        return datePicker.getDatePicker();
    }
    
    public void setInitialDate(java.sql.Date init) {
        datePicker.setInitialDate(init);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        container = new javax.swing.JPanel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        title = new javax.swing.JLabel();
        datePicker = new com.wecare.assets.custom_controls.model.DatePicker();

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

        datePicker.setForeground(new java.awt.Color(255, 255, 255));
        datePicker.setColor_bg(new java.awt.Color(102, 102, 102));
        datePicker.setColor_fg(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 362, 206);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Dialog_DatePicker.data.setText(getDatePicker().getJFormattedTextField().getText());
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    private static JLabel data;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JPanel container;
    private com.wecare.assets.custom_controls.model.DatePicker datePicker;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
