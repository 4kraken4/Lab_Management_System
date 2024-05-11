package com.wecare.view;

import com.wecare.assets.custom_controls.model.CustomTextArea;
import com.wecare.assets.custom_controls.model.CustomTextField;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.StockItemController;
import com.wecare.controller.SupplierController;
import com.wecare.controller.Validator;
import com.wecare.model.StockItem;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Frm_AddStockItemType extends javax.swing.JPanel {

    public Frm_AddStockItemType() {
        initComponents();
        this.setOpaque(false);
        container.setOpaque(false);
        SupplierController.getSuppliers(this.cmb_supplier);
        sp_minimum.setModel(new SpinnerNumberModel(0, 0, 9999, 1));
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
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        sp_minimum = new javax.swing.JSpinner();
        cmb_supplier = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_supplier = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Item Name");

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
        jLabel4.setText("Define minimum value");

        sp_minimum.setPreferredSize(new java.awt.Dimension(100, 30));

        cmb_supplier.setPreferredSize(new java.awt.Dimension(300, 30));

        jSeparator7.setPreferredSize(new java.awt.Dimension(450, 30));

        lbl_supplier.setForeground(new java.awt.Color(51, 51, 51));
        lbl_supplier.setText("Supplier");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(cmb_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_supplier)
                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(containerLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(58, 58, 58)
                                    .addComponent(sp_minimum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmb_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sp_minimum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 74, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        add(container, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        this.checkValidity();
        if (f_name == false
                && f_supplier == false
                && f_description == false
                && f_min == false) {

            StockItem i = new StockItem();
            i.setId(Service.getNextId(StockItemController.getLastStockItem().getId()));
            i.setType(txt_name.getText());
            i.setSupplier_id(cmb_supplier.getSelectedItem().toString().split("-")[1]);
            i.setQnt_min((int) sp_minimum.getValue());
            i.setDescription(txt_description.getText());
            i.setQnt_remaining(0);
            StockItemController si_con = new StockItemController(i);
            if (si_con.save()) {
                JOptionPane.showMessageDialog(this, "Data saved..",
                        "Success", JOptionPane.ERROR_MESSAGE);
                resetUI();
            } else {
                JOptionPane.showMessageDialog(this, "Couldn't save data.\nDatabase issue.",
                        "Failure", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void resetUI() {
        this.txt_name.setText("");
        this.cmb_supplier.setSelectedIndex(0);
        this.txt_description.setText("");
        this.sp_minimum.setValue(0);
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
        } else if (t instanceof JSpinner spn) {
            spn.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            spn.requestFocus();
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
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
        } else if (t instanceof JSpinner spn) {
            spn.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private void checkValidity() {
        String name = txt_name.getText();
        String description = txt_description.getText();

        setTextfieldBorderNORMAL(this.txt_name);
        setTextfieldBorderNORMAL(this.txt_description);
        setTextfieldBorderNORMAL(this.sp_minimum);

        f_description = true;
        f_name = true;
        f_supplier = true;
        error = "";

        if (f_name) {
            if (Validator.isNull(name) || Validator.isEmpty(name)) {
                f_name = true;
                error = "Item name is required.";
                setTextfieldBorderRED(this.txt_name);
            } else if (Validator.checkLength(name, 30)) {
                f_name = true;
                error = "Name is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_name);
            } else if (!Validator.isAlphanumeric(name)) {
                f_name = true;
                error = """
                        Item name is expectedted to be having no symbols.
                        Ex: 5mm Vials, Testtube 20ml
                        """;
                setTextfieldBorderRED(this.txt_name);
            } else {
                f_name = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_name);
            }
            showErrorMessage(f_name);
        }
        if (!f_name && f_supplier) {
            if (cmb_supplier.getSelectedIndex() <= 0) {
                f_supplier = true;
                error = "Select a supplier to proceed further.";
                setTextfieldBorderRED(this.cmb_supplier);
            } else {
                f_supplier = false;
                error = "";
                setTextfieldBorderNORMAL(this.cmb_supplier);
            }
            showErrorMessage(f_supplier);
        }
        if (!f_name && !f_supplier && f_description) {
            if (Validator.isNull(description) || Validator.isEmpty(description)) {
                f_description = false;
                error = """
                        Description is not required.
                        But may help people with providing information about item
                        """;
                setTextfieldBorderNORMAL(this.txt_description);
            } else if (Validator.checkLength(description, 250)) {
                f_description = true;
                error = "Description is expected to be only 250 characters in length.";
                setTextfieldBorderRED(this.txt_description);
            } else {
                f_description = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_description);
            }
            showErrorMessage(f_description);
        }
        if (!f_name && !f_supplier && !f_description && f_min) {
            try {
                int min = (int) sp_minimum.getValue();
                if (min >= 0) {
                    f_min = false;
                    error = "";
                    setTextfieldBorderNORMAL(this.sp_minimum);
                }
                showErrorMessage(f_min);
            } catch (NullPointerException | NumberFormatException e) {
                f_min = true;
                error = """
                        Defining a minimum value is required.
                        """;
                setTextfieldBorderRED(this.sp_minimum);
            }
        }

    }

    private boolean f_name;
    private boolean f_supplier;
    private boolean f_description;
    private boolean f_min;
    private String error;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JComboBox<String> cmb_supplier;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_supplier;
    private javax.swing.JSpinner sp_minimum;
    private com.wecare.assets.custom_controls.model.CustomTextArea txt_description;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
