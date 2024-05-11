package com.wecare.view;

import com.wecare.assets.utilities.Service;
import com.wecare.controller.SampleController;
import com.wecare.model.Sample;
import com.wecare.model.User;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frm_AddSample extends javax.swing.JPanel {

    public Frm_AddSample() {
        initComponents();
        this.setOpaque(false);
        container.setOpaque(false);
        init();
        SampleController.getSamples_notCollected(cmb_sample);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        cmb_sample = new javax.swing.JComboBox<>();
        btn_collect = new com.wecare.assets.custom_controls.model.CustomButton();
        lbl_sample_type = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_age = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_registered_date = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_customer_name = new javax.swing.JLabel();
        lbl_test_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        cmb_test_lab = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Sample");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sample type");

        btn_cancel.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setFocusPainted(false);
        btn_cancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_cancel.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_cancel.setRoundness(20);

        cmb_sample.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmb_sample.setForeground(new java.awt.Color(51, 51, 51));
        cmb_sample.setDoubleBuffered(true);
        cmb_sample.setPreferredSize(new java.awt.Dimension(72, 30));
        cmb_sample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sampleActionPerformed(evt);
            }
        });

        btn_collect.setBackground(new java.awt.Color(51, 153, 255));
        btn_collect.setForeground(new java.awt.Color(255, 255, 255));
        btn_collect.setText("Collect");
        btn_collect.setFocusPainted(false);
        btn_collect.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_collect.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_collect.setRoundness(20);
        btn_collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_collectActionPerformed(evt);
            }
        });

        lbl_sample_type.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_sample_type.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sample_type.setText("sample_type");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Age");

        lbl_age.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_age.setForeground(new java.awt.Color(102, 102, 102));
        lbl_age.setText("age");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Date registered");

        lbl_registered_date.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_registered_date.setForeground(new java.awt.Color(102, 102, 102));
        lbl_registered_date.setText("date");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Customer's name");

        lbl_customer_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_customer_name.setForeground(new java.awt.Color(102, 102, 102));
        lbl_customer_name.setText("name");

        lbl_test_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_test_name.setForeground(new java.awt.Color(102, 102, 102));
        lbl_test_name.setText("test_name");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Test name");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Status");

        lbl_status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(102, 102, 102));
        lbl_status.setText("status");

        cmb_test_lab.setPreferredSize(new java.awt.Dimension(72, 30));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Testing Lab");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel8))
                            .addGap(52, 52, 52)
                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmb_sample, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_test_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(containerLayout.createSequentialGroup()
                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(19, 19, 19)
                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_status)
                                .addComponent(lbl_test_name)
                                .addComponent(lbl_customer_name)
                                .addComponent(lbl_registered_date)
                                .addComponent(lbl_age)
                                .addComponent(lbl_sample_type))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_collect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_sample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_test_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_customer_name))
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_test_name))
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_sample_type))
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_age))
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_registered_date))
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_status))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_collect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(container, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_collectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_collectActionPerformed
        checkValidity();
        if (f_sample == false && f_lab == false) {
            Sample s = new Sample();
            s.setId(cmb_sample.getSelectedItem().toString());
            s.setLab_colleted(this.user.getLabID());
            s.setLab_colleted(cmb_test_lab.getSelectedItem().toString());
            s.setcollected(true);
            SampleController sc = new SampleController(s);
            if (!sc.collectSample()) {
                JOptionPane.showMessageDialog(this,
                        "Sample couldn't update.",
                        "Database issue.",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.lbl_status.setText("collected");
                JOptionPane.showMessageDialog(this,
                        "Sample status successfully updated.",
                        "Success.",
                        JOptionPane.INFORMATION_MESSAGE);
                SampleController.getSamples_notCollected(cmb_sample);
            }
        }
    }//GEN-LAST:event_btn_collectActionPerformed

    private void checkValidity() {
        int sample = cmb_sample.getSelectedIndex();
        int lab = cmb_test_lab.getSelectedIndex();

        f_lab = true;
        f_sample = true;
        error = "";

        setComboBoxNORMAL(this.cmb_sample);
        setComboBoxNORMAL(this.cmb_test_lab);

        if (f_sample) {
            if (sample <= 0) {
                f_sample = true;
                error = "Select sample to proceed.";
                setComboBoxBorderRED(this.cmb_sample);
            } else {
                f_sample = false;
                error = "";
                setComboBoxNORMAL(this.cmb_sample);
            }
            showErrorMessage(f_sample);
        }
        if (!f_sample && f_lab) {
            if (lab <= 0) {
                f_lab = true;
                error = "Select a lab that has the required test type..";
                setComboBoxBorderRED(this.cmb_test_lab);
            } else {
                f_lab = false;
                error = "";
                setComboBoxNORMAL(this.cmb_test_lab);
            }
            showErrorMessage(f_lab);
        }
    }

    private void getLoggedInUser() {
        try {
            if (Service.catchComponent(this, "MainWindow") instanceof JFrame frm) {
                user = ((Dashboard) frm).getUser();
            } else {
                user = new User();
            }
        } catch (NullPointerException e) {
            error = e.getMessage();
            showErrorMessage(true);
        }
    }

    private void showErrorMessage(boolean field_flag) {
        if (field_flag) {
            JOptionPane.showMessageDialog(this,
                    error,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void setComboBoxBorderRED(Component t) {
        if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(255, 16, 0)));
            cmb.requestFocus();
        }
    }

    private static void setComboBoxNORMAL(Component t) {
        if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private void init() {
        this.lbl_customer_name.setText("N/A");
        this.lbl_registered_date.setText("N/A");
        this.lbl_sample_type.setText("N/A");
        this.lbl_test_name.setText("N/A");
        this.lbl_age.setText("N/A");
        this.lbl_status.setText("N/A");
        this.cmb_test_lab.removeAllItems();
        this.cmb_test_lab.addItem("Select Sample to proceed");
    }

    private void cmb_sampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sampleActionPerformed
        if (cmb_sample.getSelectedIndex() != 0 && cmb_sample.getSelectedIndex() > 0) {
            getLoggedInUser();
            setComboBoxNORMAL(this.cmb_sample);
            Sample s = new Sample();
            s.setId(cmb_sample.getSelectedItem().toString());
            SampleController sc = new SampleController(s);
            Object[] obj = sc.getRelatedDate();

            this.lbl_customer_name.setText(obj[7].toString() + " " + obj[8].toString());
            this.lbl_registered_date.setText(((java.sql.Date) obj[4]).toString());
            this.lbl_sample_type.setText(obj[1].toString());
            this.lbl_test_name.setText(obj[10].toString());
            this.lbl_age.setText("" + Service.calculateAge((java.sql.Date) obj[9]));
            this.lbl_status.setText("1".equals(obj[7].toString()) ? "collected" : "not yet collected");
            SampleController.getRelatedLabsForTests(this.cmb_test_lab, obj[10].toString());
            for (int i = 0; i < cmb_test_lab.getItemCount(); i++) {
                if (cmb_test_lab.getItemAt(i).equals(this.user.getLabID())) {
                    cmb_test_lab.setSelectedIndex(i);
                } else {
                    cmb_test_lab.setSelectedIndex(0);
                }
            }
        } else {
            init();
        }
    }//GEN-LAST:event_cmb_sampleActionPerformed

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    private boolean f_sample;
    private boolean f_lab;
    private String error;
    private User user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_collect;
    private javax.swing.JComboBox<String> cmb_sample;
    private javax.swing.JComboBox<String> cmb_test_lab;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_customer_name;
    private javax.swing.JLabel lbl_registered_date;
    private javax.swing.JLabel lbl_sample_type;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_test_name;
    // End of variables declaration//GEN-END:variables
}
