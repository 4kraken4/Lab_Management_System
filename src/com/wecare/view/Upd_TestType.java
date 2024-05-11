package com.wecare.view;

import com.wecare.assets.custom_controls.component.Dialog_TextArea;
import com.wecare.assets.custom_controls.component.Dialog_TextField;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.TestTypeController;
import com.wecare.controller.Validator;
import com.wecare.model.TestType;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Upd_TestType extends javax.swing.JPanel {

    public Upd_TestType(TestType test_type) {
        initComponents();
        this.setOpaque(false);
        this.test_type = test_type;
        lbl_testname.setText(this.test_type.getTestName());
        txt_description.setText(this.test_type.getDescription());
        lbl_type.setText(this.test_type.getSample_type().toLowerCase());
        lbl_price.setText("" + this.test_type.getPrice());

    }

    private void resetUI() {
        lbl_price.setText("");
        txt_description.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        btn_update = new com.wecare.assets.custom_controls.model.CustomButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new com.wecare.assets.custom_controls.model.CustomTextArea();
        edit_description = new javax.swing.JLabel();
        edit_price = new javax.swing.JLabel();
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

        btn_update.setBackground(new java.awt.Color(51, 102, 255));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.setEffectColor(new java.awt.Color(161, 204, 242));
        btn_update.setFocusPainted(false);
        btn_update.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_update.setRoundness(30);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txt_description.setEditable(false);
        txt_description.setColumns(20);
        txt_description.setLineWrap(true);
        txt_description.setRows(5);
        txt_description.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane1.setViewportView(txt_description);

        edit_description.setForeground(new java.awt.Color(102, 204, 255));
        edit_description.setText("edit");
        edit_description.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_descriptionMouseClicked(evt);
            }
        });

        edit_price.setForeground(new java.awt.Color(102, 204, 255));
        edit_price.setText("edit");
        edit_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_priceMouseClicked(evt);
            }
        });

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
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(lbl_testname)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_type)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_description))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_price)
                                .addGap(18, 18, 18)
                                .addComponent(edit_price))))
                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_testname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(edit_description)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_type))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbl_price)
                    .addComponent(edit_price)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void edit_descriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_descriptionMouseClicked
        Dialog_TextArea d = new Dialog_TextArea(null, true);
        d.setData(txt_description);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_edit_descriptionMouseClicked

    private void edit_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_priceMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(lbl_price);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_edit_priceMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        this.checkValidity();
        if (f_description == false 
                && f_price == false) {
            if (!lbl_price.getText().isEmpty()) {
                TestType tp = this.test_type;
                tp.setDescription(txt_description.getText());
                tp.setPrice(Double.parseDouble(lbl_price.getText()));                      // validate
                TestTypeController tpc = new TestTypeController(tp);
                if (tpc.update()) {
                    JOptionPane.showMessageDialog(null, "Data updated.");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to update.");
                }
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void dispose() {
        if (Service.catchComponent(this, "update_dialog") instanceof javax.swing.JDialog diag) {
            ((UpdateDialog) diag).dispose();
        }
    }

    private void checkValidity() {
        String description = txt_description.getText();
        String price = lbl_price.getText();

        setPropertyBorderNORMAL(this.txt_description);
        setPropertyBorderNORMAL(this.lbl_price);

        f_description = true;
        f_price = true;
        error = "";

        if (f_description) {
            if (Validator.isNull(description) || Validator.isEmpty(description)) {
                f_description = true;
                error = "Description is required.";
                setPropertyBorderNORMAL(this.txt_description);
            } else if (Validator.checkLength(description, 250)) {
                f_description = true;
                error = "Description is expected to be only 250 characters in length.";
                setPropertyBorderRED(this.txt_description);
            } else {
                f_description = false;
                error = "";
                setPropertyBorderNORMAL(this.txt_description);
            }
            showErrorMessage(f_description);
        }
        if (!f_description && f_price) {
            if (Validator.isNull(price) || Validator.isEmpty(price)) {
                f_price = true;
                error = "Price is required.";
                setPropertyBorderRED(this.lbl_price);
            } else if (Validator.isPriceVerified(price)) {
                f_price = true;
                error = """
                        Your entered price is either invalid or crazily high.
                        The range for price,
                        Rs. 0.00 to Rs. 100000.00""";
                setPropertyBorderRED(this.lbl_price);
            } else {
                f_price = false;
                error = "";
                setPropertyBorderNORMAL(this.lbl_price);
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

    private static void setPropertyBorderRED(Component t) {
        if (t instanceof JLabel lbl) {
            lbl.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            lbl.requestFocus();
        }
    }

    private static void setPropertyBorderNORMAL(Component t) {
        if (t instanceof JLabel lbl) {
            lbl.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private final TestType test_type;

    private boolean f_description;
    private boolean f_price;
    private String error;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_update;
    private javax.swing.JLabel edit_description;
    private javax.swing.JLabel edit_price;
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
