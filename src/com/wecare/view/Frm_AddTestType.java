package com.wecare.view;

import com.wecare.assets.custom_controls.model.CustomTextArea;
import com.wecare.assets.custom_controls.model.CustomTextField;
import com.wecare.controller.SampleController;
import com.wecare.controller.TestTypeController;
import com.wecare.controller.Validator;
import com.wecare.model.TestType;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Frm_AddTestType extends javax.swing.JPanel {

    public Frm_AddTestType() {
        initComponents();
        this.setOpaque(false);
        container.setOpaque(false);
        SampleController.getTypes(this.cmb_sample_type);
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new com.wecare.assets.custom_controls.model.CustomTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new com.wecare.assets.custom_controls.model.CustomTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        customTextArea2 = new com.wecare.assets.custom_controls.model.CustomTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt_price = new com.wecare.assets.custom_controls.model.CustomTextField();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cmb_sample_type = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Test Name");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Description");

        txt_name.setForeground(new java.awt.Color(51, 51, 51));
        txt_name.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_name.setHint("Name of the test");
        txt_name.setPreferredSize(new java.awt.Dimension(300, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_description.setColumns(20);
        txt_description.setForeground(new java.awt.Color(51, 51, 51));
        txt_description.setRows(5);
        txt_description.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_description.setDoubleBuffered(true);
        txt_description.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_description.setHint("Description...");
        txt_description.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setViewportView(txt_description);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        customTextArea2.setColumns(20);
        customTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        customTextArea2.setRows(5);
        customTextArea2.setCaretColor(new java.awt.Color(51, 51, 51));
        customTextArea2.setDoubleBuffered(true);
        customTextArea2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        customTextArea2.setHint("Description...");
        jScrollPane2.setViewportView(customTextArea2);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Price (Rs.)");

        txt_price.setForeground(new java.awt.Color(51, 51, 51));
        txt_price.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_price.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_price.setHint("Test price");
        txt_price.setPreferredSize(new java.awt.Dimension(64, 30));

        btn_cancel.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("cancel");
        btn_cancel.setEffectColor(new java.awt.Color(207, 207, 207));
        btn_cancel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_cancel.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_cancel.setRoundness(35);

        btn_save.setBackground(new java.awt.Color(51, 153, 255));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("save");
        btn_save.setEffectColor(new java.awt.Color(162, 208, 255));
        btn_save.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_save.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_save.setRoundness(35);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jSeparator5.setPreferredSize(new java.awt.Dimension(450, 30));

        jSeparator6.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Related Sample Type");

        cmb_sample_type.setPreferredSize(new java.awt.Dimension(272, 30));

        jSeparator7.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_sample_type, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmb_sample_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 90, 6, 106);
        add(container, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        this.checkValidity();
        if (f_name == false
                && f_description == false
                && f_test_type == false
                && f_price == false) {
            TestType tp = new TestType();
            tp.setTestName(txt_name.getText());
            tp.setDescription(txt_description.getText());
            tp.setSample_type(cmb_sample_type.getSelectedItem().toString());
            tp.setPrice(Double.parseDouble(txt_price.getText()));
            TestTypeController tpc = new TestTypeController(tp);
            if (tpc.save()) {
                resetUI();
            } else {
                JOptionPane.showMessageDialog(this, "Couldn't save data.");
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void resetUI() {
        this.txt_name.setText("");
        this.txt_description.setText("");
        this.txt_price.setText("");
    }

    private void checkValidity() {
        String name = txt_name.getText();
        String description = txt_description.getText();
        String price = txt_price.getText();

        f_description = true;
        f_test_type = true;
        f_name = true;
        f_price = true;
        error = "";

        if (f_name) {
            if (Validator.isNull(name) || Validator.isEmpty(name)) {
                f_name = true;
                error = "Test name is required.";
                setTextfieldBorderRED(this.txt_name);
            } else if (Validator.checkLength(name, 5)) {
                f_name = true;
                error = "Name is expected to be only 5 characters in length.";
                setTextfieldBorderRED(this.txt_name);
            } else if (!Validator.isAlphanumeric(name)) {
                f_name = true;
                error = "Test name is expectedted to be alphanumeric.";
                setTextfieldBorderRED(this.txt_name);
            } else {
                f_name = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_name);
            }
            showErrorMessage(f_name);
        }
        if (!f_name && f_description) {
            if (Validator.isNull(description) || Validator.isEmpty(description)) {
                f_description = true;
                error = "Description is required.";
                setTextfieldBorderRED(this.txt_description);
            } else if (Validator.checkLength(description, 250)) {
                f_description = true;
                error = "Name is expected to be only 250 characters in length.";
                setTextfieldBorderRED(this.txt_description);
            } else {
                f_description = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_description);
            }
            showErrorMessage(f_description);
        }
        if (!f_name && !f_description && f_test_type) {
            if (cmb_sample_type.getSelectedIndex() == 0) {
                f_test_type = true;
                error = "Select the related sample type.";
                setTextfieldBorderRED(this.cmb_sample_type);
            } else {
                f_test_type = false;
                error = "";
                setTextfieldBorderNORMAL(this.cmb_sample_type);
            }
            showErrorMessage(f_test_type);
        }
        if (!f_name && !f_description && !f_test_type && f_price) {
            if (Validator.isNull(price) || Validator.isEmpty(price)) {
                f_price = true;
                error = "Price is required.";
                setTextfieldBorderRED(this.txt_price);
            } else if (Validator.isPriceVerified(price)) {
                f_price = true;
                error = """
                        Your entered price is either invalid or crazily high.
                        The range for price,
                        Rs. 0.00 to Rs. 100000.00""";
                setTextfieldBorderRED(this.txt_price);
            } else {
                f_price = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_price);
            }
            showErrorMessage(f_price);
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

    private static void setTextfieldBorderRED(Component t) {
        if (t instanceof CustomTextField txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            txt.requestFocus();
            txt.selectAll();
        } else if (t instanceof CustomTextArea txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            txt.requestFocus();
            txt.selectAll();
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            cmb.requestFocus();
        }
    }

    private static void setTextfieldBorderNORMAL(Component t) {
        if (t instanceof CustomTextField txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
        if (t instanceof CustomTextArea txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private String error;
    private boolean f_name;
    private boolean f_description;
    private boolean f_price;
    private boolean f_test_type;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JComboBox<String> cmb_sample_type;
    private javax.swing.JPanel container;
    private com.wecare.assets.custom_controls.model.CustomTextArea customTextArea2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private com.wecare.assets.custom_controls.model.CustomTextArea txt_description;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_name;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
