package com.wecare.view;

import com.wecare.assets.custom_controls.component.Dialog_Spinner;
import com.wecare.assets.custom_controls.component.Dialog_TextArea;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.model.CustomTextArea;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.StockItemController;
import com.wecare.controller.Validator;
import com.wecare.model.StockItem;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Upd_StockItem extends javax.swing.JPanel {

    public Upd_StockItem(StockItem item) {
        initComponents();
        this.setOpaque(false);
        this.item = item;
        lbl_testname.setText(this.item.getType());
        txt_description.setText(this.item.getDescription());
        lbl_remaining.setText("" + this.item.getQnt_remaining());
        lbl_critical.setText("" + this.item.getQnt_min());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_update = new com.wecare.assets.custom_controls.model.CustomButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new com.wecare.assets.custom_controls.model.CustomTextArea();
        edit_description = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_testname = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_remaining = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_critical = new javax.swing.JLabel();
        edit_critical = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Description");

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

        lbl_testname.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl_testname.setForeground(new java.awt.Color(102, 102, 102));
        lbl_testname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_testname.setText("Name");
        lbl_testname.setToolTipText("");

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Remaining qnt.");

        lbl_remaining.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_remaining.setForeground(new java.awt.Color(102, 102, 102));
        lbl_remaining.setText("remaining");
        lbl_remaining.setName("date of birth"); // NOI18N

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Critical level");

        lbl_critical.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_critical.setForeground(new java.awt.Color(102, 102, 102));
        lbl_critical.setText("critical");
        lbl_critical.setName("critical level"); // NOI18N

        edit_critical.setForeground(new java.awt.Color(102, 204, 255));
        edit_critical.setText("edit");
        edit_critical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_criticalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lbl_critical)
                        .addGap(18, 18, 18)
                        .addComponent(edit_critical)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_remaining)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(edit_description)))
                            .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_testname)
                        .addGap(226, 226, 226))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_testname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_remaining))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_critical)
                    .addComponent(edit_critical))
                .addGap(43, 43, 43)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void edit_descriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_descriptionMouseClicked
        Dialog_TextArea d = new Dialog_TextArea(null, true);
        d.setData(txt_description);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_edit_descriptionMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        this.checkValidity();
        if (f_description == false
                && f_min == false) {
            StockItem i = this.item;
            i.setQnt_min(Integer.parseInt(this.lbl_critical.getText()));
            StockItemController st_con = new StockItemController(i);
            if (st_con.update()) {
                JOptionPane.showMessageDialog(this, "Stock item dataData updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Stock item dataData updated.", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void edit_criticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_criticalMouseClicked
        Dialog_Spinner d = new Dialog_Spinner(null, true);
        d.setData(lbl_critical);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }//GEN-LAST:event_edit_criticalMouseClicked

    private void dispose() {
        if (Service.catchComponent(this, "update_dialog") instanceof javax.swing.JDialog diag) {
            ((UpdateDialog) diag).dispose();
        }
    }

    private void checkValidity() {
        String description = txt_description.getText();

        setPropertyBorderNORMAL(this.txt_description);
        setPropertyBorderNORMAL(this.lbl_critical);

        f_description = true;
        f_min = true;
        error = "";

        if (f_description) {
            if (Validator.isNull(description) || Validator.isEmpty(description)) {
                f_description = false;
                error = """
                        Description is not required.
                        But may help people with providing information about item
                        """;
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
        if (!f_description && f_min) {
            try {
                int min = Integer.parseInt(lbl_critical.getText());
            } catch (NullPointerException | NumberFormatException e) {
                f_min = true;
                error = """
                        Defining minimum value is required.
                        """;
                setPropertyBorderRED(this.lbl_critical);
            }
            if (Integer.parseInt(lbl_critical.getText()) > 300) {
                f_min = true;
                error = "minimum value is expected to be only lower than 300.";
                setPropertyBorderRED(this.lbl_critical);
            } else {
                f_min = false;
                error = "";
                setPropertyBorderNORMAL(this.lbl_critical);
            }
            showErrorMessage(f_min);
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
        } else if (t instanceof CustomTextArea txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(215, 0, 0)));
            txt.requestFocus();
            txt.selectAll();
        }
    }

    private static void setPropertyBorderNORMAL(Component t) {
        if (t instanceof JLabel lbl) {
            lbl.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
        if (t instanceof CustomTextArea txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private final StockItem item;

    private boolean f_description;
    private boolean f_min;
    private String error;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_update;
    private javax.swing.JLabel edit_critical;
    private javax.swing.JLabel edit_description;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_critical;
    private javax.swing.JLabel lbl_remaining;
    private javax.swing.JLabel lbl_testname;
    private com.wecare.assets.custom_controls.model.CustomTextArea txt_description;
    // End of variables declaration//GEN-END:variables
}
