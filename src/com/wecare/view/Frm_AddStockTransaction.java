package com.wecare.view;

import com.wecare.assets.custom_controls.model.CustomTextField;
import com.wecare.assets.custom_controls.model.DatePicker;
import com.wecare.controller.StockItemController;
import com.wecare.controller.SupplierController;
import com.wecare.controller.UserController;
import com.wecare.controller.Validator;
import com.wecare.model.StockItem;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Frm_AddStockTransaction extends javax.swing.JPanel {

    public Frm_AddStockTransaction() {
        initComponents();
        this.sp_quantity.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        initForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        opt_action = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel11 = new javax.swing.JLabel();
        dp_date = new com.wecare.assets.custom_controls.model.DatePicker();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        rd_send = new javax.swing.JRadioButton();
        lbl_thidParty = new javax.swing.JLabel();
        rd_receive = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmb_item_type = new javax.swing.JComboBox<>();
        cmb_thirdParty = new javax.swing.JComboBox<>();
        sp_quantity = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Item type");

        jSeparator5.setPreferredSize(new java.awt.Dimension(450, 30));

        btn_cancel.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setEffectColor(new java.awt.Color(207, 207, 207));
        btn_cancel.setFocusPainted(false);
        btn_cancel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_cancel.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_cancel.setRoundness(35);

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Quantity");

        dp_date.setColor_bg(new java.awt.Color(204, 204, 204));
        dp_date.setColor_fg(new java.awt.Color(51, 51, 51));

        btn_save.setBackground(new java.awt.Color(51, 153, 255));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setEffectColor(new java.awt.Color(162, 208, 255));
        btn_save.setFocusPainted(false);
        btn_save.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_save.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_save.setRoundness(35);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        opt_action.add(rd_send);
        rd_send.setForeground(new java.awt.Color(51, 51, 51));
        rd_send.setText("Send");
        rd_send.setActionCommand("R");
        rd_send.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rd_send.setDoubleBuffered(true);
        rd_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sendActionPerformed(evt);
            }
        });

        lbl_thidParty.setForeground(new java.awt.Color(51, 51, 51));
        lbl_thidParty.setText("Sender or Receiver");

        opt_action.add(rd_receive);
        rd_receive.setForeground(new java.awt.Color(51, 51, 51));
        rd_receive.setText("Receive");
        rd_receive.setActionCommand("R");
        rd_receive.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rd_receive.setDoubleBuffered(true);
        rd_receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_receiveActionPerformed(evt);
            }
        });

        jSeparator4.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Atcion");

        jSeparator2.setPreferredSize(new java.awt.Dimension(450, 30));

        jSeparator6.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Date");

        cmb_item_type.setPreferredSize(new java.awt.Dimension(300, 30));
        cmb_item_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_item_typeActionPerformed(evt);
            }
        });

        cmb_thirdParty.setPreferredSize(new java.awt.Dimension(300, 30));

        sp_quantity.setPreferredSize(new java.awt.Dimension(100, 30));
        sp_quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_quantityStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(sp_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(rd_receive)
                                .addGap(91, 91, 91)
                                .addComponent(rd_send))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(dp_date, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cmb_item_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(cmb_thirdParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lbl_thidParty))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmb_item_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_receive)
                    .addComponent(rd_send))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_thidParty, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmb_thirdParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(dp_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel3, gridBagConstraints);
        rd_receive.setActionCommand("R");
        rd_send.setActionCommand("S");

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            checkValidity();

            if (f_item == false
                    && f_sup == false
                    && f_date == false
                    && f_qnt == false) {
                sp_quantity.commitEdit();
                StockItem i = new StockItem();
                i.setType(cmb_item_type.getSelectedItem().toString());
                StockItemController.getItemDataByType(i);
                String supplier_id = this.cmb_thirdParty.getSelectedItem().toString().split("-")[1];
                java.sql.Timestamp date = Timestamp.valueOf(LocalDateTime.now());
                int quantity = (int) sp_quantity.getValue();
                Object[] log_data = {i.getId(), supplier_id, quantity, date};

                if (StockItemController.logTransaction(log_data)) {
                    if (rd_receive.isSelected()) {
                        i.setQnt_remaining(i.getQnt_remaining() + (int) sp_quantity.getValue());
                        StockItemController.log_received_data(supplier_id);
                    } else {
                        StockItemController.log_sent_data(supplier_id);
                        i.setQnt_remaining(i.getQnt_remaining() - (int) sp_quantity.getValue());
                    }
                    StockItemController s_con = new StockItemController(i);
                    if (s_con.update()) {
                        JOptionPane.showMessageDialog(null,
                                "Data logged",
                                "Hey,",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Data could not be logged.\nDatabase issue.",
                            "Failure",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (HeadlessException | ParseException ex) {
            JOptionPane.showMessageDialog(null,
                    "A data parse issua has occured.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void rd_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sendActionPerformed
        UserController.getLabs(this.cmb_thirdParty);
        this.lbl_thidParty.setText("Laboratory");
    }//GEN-LAST:event_rd_sendActionPerformed

    private void rd_receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_receiveActionPerformed
        SupplierController.getSuppliers(this.cmb_thirdParty);
        this.lbl_thidParty.setText("Suppllier");
    }//GEN-LAST:event_rd_receiveActionPerformed

    private void cmb_item_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_item_typeActionPerformed
        StockItem i = new StockItem();
        i.setType(cmb_item_type.getSelectedItem().toString());
        StockItemController.getItemDataByType(i);
        this.qnt_max = i.getQnt_remaining();
    }//GEN-LAST:event_cmb_item_typeActionPerformed

    private void sp_quantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_quantityStateChanged
        int qnt = (int) sp_quantity.getValue();
        if (rd_send.isSelected() && qnt > this.qnt_max) {
            JOptionPane.showMessageDialog(null,
                    "Selected item has no enough quantity.",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            sp_quantity.setValue(qnt_max);
            sp_quantity.requestFocus();
        }
    }//GEN-LAST:event_sp_quantityStateChanged

    private void resetUI() {
        this.dp_date.setInitialDate(Date.valueOf(LocalDate.now()));
    }

    private void initForm() {
        this.rd_receive.setSelected(true);
        StockItemController.getItems(this.cmb_item_type);
        SupplierController.getSuppliers(this.cmb_thirdParty);
        this.lbl_thidParty.setText("Suppllier");
        this.dp_date.setInitialDate(Date.valueOf(LocalDate.now()));
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    private void checkValidity() throws ParseException {

        sp_quantity.commitEdit();
        int qnt = (int) sp_quantity.getValue();

        setTextfieldBorderNORMAL(this.cmb_item_type);
        setTextfieldBorderNORMAL(this.cmb_thirdParty);
        setTextfieldBorderNORMAL(this.sp_quantity);
        setTextfieldBorderNORMAL(this.dp_date);

        f_date = true;
        f_item = true;
        f_sup = true;
        f_qnt = true;
        error = "";

        if (f_item) {
            if (cmb_item_type.getSelectedIndex() <= 0) {
                f_item = true;
                error = "Select stock type for proceed further.";
                setTextfieldBorderRED(this.cmb_item_type);
            } else {
                f_item = false;
                error = "";
                setTextfieldBorderNORMAL(this.cmb_item_type);
            }
            showErrorMessage(f_item);
        }
        if (!f_item && f_sup) {
            if (cmb_thirdParty.getSelectedIndex() <= 0) {
                f_sup = true;
                if (opt_action.getSelection().getActionCommand().equals(rd_receive.getActionCommand())) {
                    error = "Select a supplier to proceed further.";
                } else {
                    error = "Select a laboratory to proceed further.";
                }
                setTextfieldBorderRED(this.cmb_thirdParty);
            } else {
                f_sup = false;
                error = "";
                setTextfieldBorderNORMAL(this.cmb_thirdParty);
            }
            showErrorMessage(f_sup);
        }
        if (!f_item && !f_sup && f_date) {
            if (Validator.isNullDate(dp_date)) {
                f_date = true;
                error = "Date is required.";
                setTextfieldBorderRED(this.dp_date);
            } else if (Validator.checkDateForEarlyOrTodays(dp_date)) {
                f_date = true;
                error = "Date is expected to be an early or todays date.";
                setTextfieldBorderRED(this.dp_date);
            } else {
                f_date = false;
                error = "";
                setTextfieldBorderNORMAL(this.dp_date);
            }
            showErrorMessage(f_date);
        }
        if (!f_item && !f_sup && !f_date && f_qnt) {
            if (qnt <= 0) {
                f_qnt = true;
                error = "Quantity has to be atleast 1.";
                setTextfieldBorderRED(this.sp_quantity);
            } else {
                f_qnt = false;
                error = "";
                setTextfieldBorderNORMAL(this.sp_quantity);
            }
            showErrorMessage(f_qnt);
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
        } else if (t instanceof DatePicker dp) {
            dp.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            dp.requestFocus();
        } else if (t instanceof JSpinner sp) {
            sp.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            sp.requestFocus();
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
        }
    }

    private static void setTextfieldBorderNORMAL(Component t) {
        if (t instanceof CustomTextField txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof DatePicker dp) {
            dp.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof JSpinner sp) {
            sp.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private String error;
    private boolean f_item;
    private boolean f_sup;
    private boolean f_date;
    private boolean f_qnt;

    private int qnt_max;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JComboBox<String> cmb_item_type;
    private javax.swing.JComboBox<String> cmb_thirdParty;
    private com.wecare.assets.custom_controls.model.DatePicker dp_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_thidParty;
    private javax.swing.ButtonGroup opt_action;
    private javax.swing.JRadioButton rd_receive;
    private javax.swing.JRadioButton rd_send;
    private javax.swing.JSpinner sp_quantity;
    // End of variables declaration//GEN-END:variables
}
