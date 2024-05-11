package com.wecare.assets.custom_controls.component;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Dialog_ComboBox extends javax.swing.JDialog {

    public Dialog_ComboBox(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        container.setOpaque(false);
        this.getRootPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(btn_save);
    }

    public void setData(JLabel data) {
        Dialog_ComboBox.data = data;
        String t = "Select " + Dialog_ComboBox.data.getName();
        title.setText(t);
    }

    public JComboBox<String> getCmb_option() {
        return cmb_option;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        container = new javax.swing.JPanel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        title = new javax.swing.JLabel();
        cmb_option = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelBorder1.setBackground(new java.awt.Color(30, 33, 35));
        panelBorder1.setLayout(new java.awt.GridBagLayout());

        container.setBackground(new java.awt.Color(30, 33, 35));

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

        cmb_option.setBackground(new java.awt.Color(102, 102, 102));
        cmb_option.setEditable(true);
        cmb_option.setForeground(new java.awt.Color(255, 255, 255));
        cmb_option.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmb_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_optionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(cmb_option, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(cmb_option, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        panelBorder1.add(container, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 322, 156);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Dialog_ComboBox.data.setText(cmb_option.getSelectedItem().toString());
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void cmb_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_optionActionPerformed
        if (evt.getSource().equals(cmb_option) && cmb_option.getSelectedIndex() == 0) {
            btn_save.setEnabled(false);
        } else if (evt.getSource().equals(cmb_option) && cmb_option.getSelectedIndex() != 0) {
            btn_save.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_optionActionPerformed

    private static JLabel data;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JComboBox<String> cmb_option;
    private javax.swing.JPanel container;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
