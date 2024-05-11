package com.wecare.view;

import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.utilities.Service;
import com.wecare.model.TestType;

public class Frm_TestTypeData extends javax.swing.JPanel {

    public Frm_TestTypeData(TestType test_type) {
        initComponents();
        this.setOpaque(false);
        this.test_type = test_type;
        lbl_testname.setText(this.test_type.getTestName());
        txt_description.setText(this.test_type.getDescription());
        lbl_type.setText(this.test_type.getSample_type().toLowerCase());
        lbl_price.setText(""+this.test_type.getPrice());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        btn_ok = new com.wecare.assets.custom_controls.model.CustomButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new com.wecare.assets.custom_controls.model.CustomTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_testname = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Description");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Price");

        lbl_price.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(102, 102, 102));
        lbl_price.setText("price");
        lbl_price.setName("date of birth"); // NOI18N

        btn_ok.setBackground(new java.awt.Color(51, 102, 255));
        btn_ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok.setText("Ok");
        btn_ok.setEffectColor(new java.awt.Color(161, 204, 242));
        btn_ok.setFocusPainted(false);
        btn_ok.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_ok.setRoundness(30);
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        txt_description.setEditable(false);
        txt_description.setBackground(new java.awt.Color(255, 255, 255));
        txt_description.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_description.setColumns(20);
        txt_description.setLineWrap(true);
        txt_description.setTabSize(4);
        txt_description.setMargin(new java.awt.Insets(5, 6, 5, 6));
        jScrollPane1.setViewportView(txt_description);

        lbl_testname.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl_testname.setForeground(new java.awt.Color(102, 102, 102));
        lbl_testname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_testname.setText("Name");
        lbl_testname.setToolTipText("");

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Related sample type");

        lbl_type.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_type.setForeground(new java.awt.Color(102, 102, 102));
        lbl_type.setText("type");
        lbl_type.setName("date of birth"); // NOI18N

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Rs.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(96, 96, 96)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(156, 156, 156)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_type)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lbl_price))))))
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(lbl_testname)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_testname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_type))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbl_price)
                    .addComponent(jLabel16))
                .addGap(29, 29, 29)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 6, 6);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_okActionPerformed

    private void dispose() {
        if (Service.catchComponent(this, "update_dialog") instanceof javax.swing.JDialog diag) {
            ((UpdateDialog) diag).dispose();
        }
    }

    private final TestType test_type;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_ok;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_testname;
    private javax.swing.JLabel lbl_type;
    private com.wecare.assets.custom_controls.model.CustomTextArea txt_description;
    // End of variables declaration//GEN-END:variables
}
