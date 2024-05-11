package com.wecare.view;

import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.utilities.Service;
import com.wecare.model.Sample;

public class Frm_SampleData extends javax.swing.JPanel {

    public Frm_SampleData(Sample sample) {
        initComponents();
        this.setOpaque(false);
        this.sample = sample;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbl_lab_collected = new javax.swing.JLabel();
        lbl_customer_id = new javax.swing.JLabel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        lbl_type = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_date_collected = new javax.swing.JLabel();
        lbl_lab_tested = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_sample = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Lab collected");

        lbl_lab_collected.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_lab_collected.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lab_collected.setText("lab_collected");

        lbl_customer_id.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_customer_id.setForeground(new java.awt.Color(102, 102, 102));
        lbl_customer_id.setText("customer_id");
        lbl_customer_id.setName("date of birth"); // NOI18N

        btn_save.setBackground(new java.awt.Color(51, 153, 255));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Ok");
        btn_save.setFocusPainted(false);
        btn_save.setFocusable(false);
        btn_save.setRoundness(30);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        lbl_type.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_type.setForeground(new java.awt.Color(102, 102, 102));
        lbl_type.setText("type");
        lbl_type.setName("lbl_type"); // NOI18N

        lbl_status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(102, 102, 102));
        lbl_status.setText("status");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Customer Id");

        lbl_date_collected.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_date_collected.setForeground(new java.awt.Color(102, 102, 102));
        lbl_date_collected.setText("date");
        lbl_date_collected.setName("date of birth"); // NOI18N

        lbl_lab_tested.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_lab_tested.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lab_tested.setText("lab_tested");

        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Status");

        lbl_sample.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lbl_sample.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sample.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sample.setText("Sample");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Date collected");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Type");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Lab collected");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 156, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_status)
                                    .addGap(57, 57, 57))
                                .addComponent(lbl_date_collected)
                                .addComponent(lbl_customer_id)
                                .addComponent(lbl_type)
                                .addComponent(lbl_lab_collected)
                                .addComponent(lbl_lab_tested)))
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_sample)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_type))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_date_collected)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_customer_id)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbl_lab_collected))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_lab_tested))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_status)
                    .addComponent(jLabel17))
                .addGap(42, 42, 42)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        lbl_sample.setText(sample.getId());
        lbl_type.setText(sample.getType());
        lbl_lab_collected.setText(sample.getLab_colleted());
        lbl_lab_tested.setText(sample.getLab_tested());
        lbl_date_collected.setText(sample.getDate().toString());
        lbl_customer_id.setText(sample.getCustomer_id());
        lbl_status.setText(sample.is_collected() == true ? "collected":"to be Collected");
    }
    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        close();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void close() {
        if (Service.catchComponent(this, "update_dialog") instanceof UpdateDialog d) {
            d.dispose();
        }
    }
    
    private final Sample sample;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_customer_id;
    private javax.swing.JLabel lbl_date_collected;
    private javax.swing.JLabel lbl_lab_collected;
    private javax.swing.JLabel lbl_lab_tested;
    private javax.swing.JLabel lbl_sample;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_type;
    // End of variables declaration//GEN-END:variables
}
