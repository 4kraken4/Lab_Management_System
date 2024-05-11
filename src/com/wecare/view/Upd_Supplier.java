package com.wecare.view;

import com.wecare.assets.custom_controls.component.Dialog_RadioButtons;
import com.wecare.assets.custom_controls.component.Dialog_TextField;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.SupplierController;
import com.wecare.controller.Validator;
import com.wecare.model.Supplier;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Upd_Supplier extends javax.swing.JPanel {

    public Upd_Supplier(Supplier supplier) {
        initComponents();
        this.supplier = supplier;
        init();
    }

    private void init() {
        lbl_name.setText(this.supplier.getName());
        id.setText(this.supplier.getId());
        name.setText(this.supplier.getName());
        phone.setText(this.supplier.getPhone());
        email.setText(this.supplier.getEmail());
        status.setText(this.supplier.getStatus() == true ? "Good" : "Bad");
        street.setText(this.supplier.getAddr_street());
        bno.setText(this.supplier.getAddr_bno());
        town.setText(this.supplier.getAddr_town());
        district.setText(this.supplier.getAddr_district());

        this.f_name = true;
        this.f_phone = true;
        this.f_email = true;
        this.f_status = true;
        this.f_address = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        bno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        btn_update = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel10 = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        district = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        edit_name = new javax.swing.JLabel();
        edit_phone = new javax.swing.JLabel();
        edit_email = new javax.swing.JLabel();
        edit_status = new javax.swing.JLabel();
        edit_bno = new javax.swing.JLabel();
        edit_street = new javax.swing.JLabel();
        edit_town = new javax.swing.JLabel();
        edit_district = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bno.setForeground(new java.awt.Color(102, 102, 102));
        bno.setText("block no");
        bno.setName("block no."); // NOI18N

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Block no.");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Street");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Name");

        street.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        street.setForeground(new java.awt.Color(102, 102, 102));
        street.setText("street");
        street.setName("street"); // NOI18N

        name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("name");
        name.setName("name"); // NOI18N

        lbl_name.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(102, 102, 102));
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name.setText("name");

        phone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(102, 102, 102));
        phone.setText("phone");
        phone.setName("phone no."); // NOI18N

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Phone");

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("email");
        email.setName("email"); // NOI18N

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Status");

        status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(102, 102, 102));
        status.setText("status");
        status.setName("status"); // NOI18N

        btn_update.setBackground(new java.awt.Color(51, 102, 255));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.setEffectColor(new java.awt.Color(161, 204, 242));
        btn_update.setFocusPainted(false);
        btn_update.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_update.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_update.setRoundness(30);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Town");

        town.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        town.setForeground(new java.awt.Color(102, 102, 102));
        town.setText("town");
        town.setName("town"); // NOI18N

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("District");

        district.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        district.setForeground(new java.awt.Color(102, 102, 102));
        district.setText("district");
        district.setName("district"); // NOI18N

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Id");

        id.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setText("id");
        id.setName("id"); // NOI18N

        edit_name.setForeground(new java.awt.Color(102, 204, 255));
        edit_name.setText("edit");
        edit_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_nameMouseClicked(evt);
            }
        });

        edit_phone.setForeground(new java.awt.Color(102, 204, 255));
        edit_phone.setText("edit");
        edit_phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_phoneMouseClicked(evt);
            }
        });

        edit_email.setForeground(new java.awt.Color(102, 204, 255));
        edit_email.setText("edit");
        edit_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_emailMouseClicked(evt);
            }
        });

        edit_status.setForeground(new java.awt.Color(102, 204, 255));
        edit_status.setText("edit");
        edit_status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_statusMouseClicked(evt);
            }
        });

        edit_bno.setForeground(new java.awt.Color(102, 204, 255));
        edit_bno.setText("edit");
        edit_bno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_bnoMouseClicked(evt);
            }
        });

        edit_street.setForeground(new java.awt.Color(102, 204, 255));
        edit_street.setText("edit");
        edit_street.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_streetMouseClicked(evt);
            }
        });

        edit_town.setForeground(new java.awt.Color(102, 204, 255));
        edit_town.setText("edit");
        edit_town.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_townMouseClicked(evt);
            }
        });

        edit_district.setForeground(new java.awt.Color(102, 204, 255));
        edit_district.setText("edit");
        edit_district.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_districtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(21, 21, 21)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(district)
                                .addGap(18, 18, 18)
                                .addComponent(edit_district))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(town)
                                .addGap(18, 18, 18)
                                .addComponent(edit_town))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(street)
                                .addGap(18, 18, 18)
                                .addComponent(edit_street))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email)
                                .addGap(18, 18, 18)
                                .addComponent(edit_email))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(status)
                                .addGap(18, 18, 18)
                                .addComponent(edit_status))
                            .addComponent(id)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(18, 18, 18)
                                .addComponent(edit_name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phone)
                                .addGap(18, 18, 18)
                                .addComponent(edit_phone))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bno)
                                .addGap(18, 18, 18)
                                .addComponent(edit_bno)))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jLabel3)
                    .addComponent(edit_name))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(jLabel4)
                    .addComponent(edit_phone))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(jLabel5)
                    .addComponent(edit_email))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(jLabel9)
                    .addComponent(edit_status))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bno)
                    .addComponent(jLabel7)
                    .addComponent(edit_bno))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street)
                    .addComponent(jLabel8)
                    .addComponent(edit_street))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(town)
                    .addComponent(jLabel10)
                    .addComponent(edit_town))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(district)
                    .addComponent(jLabel11)
                    .addComponent(edit_district))
                .addGap(18, 18, 18)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        this.checkValidity();
        if (fc_name == false
                && fc_phone == false
                && fc_email == false
                && fc_bno == false
                && fc_street == false
                && fc_town == false
                && fc_district == false) {

            if (!f_name || !f_phone || !f_email || !f_status || !f_address) {
                String message = "Do you want to save changes you just made?";
                Supplier s = this.supplier;
                if (!f_name) {
                    message += "\n'" + supplier.getName() + "' -> '" + name.getText() + "'";
                    s.setName(name.getText());
                }
                if (!f_phone) {
                    message += "\n'" + supplier.getPhone() + "' -> '" + phone.getText() + "'";
                    s.setPhone(phone.getText());
                }
                if (!f_email) {
                    message += "\n'" + supplier.getEmail() + "' -> '" + email.getText() + "'";
                    supplier.setEmail(email.getText());
                }
                if (!f_status) {
                    String sts = this.supplier.getStatus() == true ? "Good" : "Bad";
                    message += "\n'" + sts + "' -> '" + status.getText() + "'";
                    supplier.setStatus(status.getText().equalsIgnoreCase("Good"));
                }
                if (!f_address) {
                    message += "\n'" + supplier.getAddr_bno() + ", "
                            + "" + supplier.getAddr_street() + ", "
                            + "" + supplier.getAddr_town() + ", "
                            + "" + supplier.getAddr_district() + "' -> '" + bno.getText() + ", "
                            + "" + street.getText() + ", "
                            + "" + town.getText() + ", "
                            + "" + district.getText() + "'";
                    s.setAddr_bno(bno.getText());
                    s.setAddr_street(street.getText());
                    s.setAddr_town(town.getText());
                    s.setAddr_district(district.getText());
                }
                int ans = JOptionPane.showConfirmDialog(this,
                        message,
                        "confirm,",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                switch (ans) {
                    case 0 -> {
                        SupplierController s_con = new SupplierController(s);
                        if (s_con.update(supplier)) {
                            JOptionPane.showMessageDialog(this, "Supplier Data updated.",
                                    "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Data couldn't be updated.\nDatabase issue.",
                                    "Failure", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    default -> {
                        JOptionPane.showMessageDialog(this, "Changes(s) discarded.",
                                "Failure", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void edit_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_nameMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(name);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        lbl_name.setText(this.name.getText());
        this.f_name = name.getText().equalsIgnoreCase(this.supplier.getName());
        evt.consume();
    }//GEN-LAST:event_edit_nameMouseClicked

    private void edit_phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_phoneMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(phone);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_phone = phone.getText().equalsIgnoreCase(this.supplier.getPhone());
        evt.consume();
    }//GEN-LAST:event_edit_phoneMouseClicked

    private void edit_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_emailMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(email);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_email = !email.getText().equalsIgnoreCase(this.supplier.getEmail());
        evt.consume();
    }//GEN-LAST:event_edit_emailMouseClicked

    private void edit_statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_statusMouseClicked
        Dialog_RadioButtons d = new Dialog_RadioButtons(null, true);
        d.setData(status);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_status = status.getText().equalsIgnoreCase(this.supplier.getStatus() == true ? "Good" : "Bad");
        evt.consume();
    }//GEN-LAST:event_edit_statusMouseClicked

    private void edit_bnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_bnoMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(bno);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_address = bno.getText().equalsIgnoreCase(this.supplier.getAddr_bno());
        evt.consume();
    }//GEN-LAST:event_edit_bnoMouseClicked

    private void edit_streetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_streetMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(street);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_address = street.getText().equalsIgnoreCase(this.supplier.getAddr_street());
        evt.consume();
    }//GEN-LAST:event_edit_streetMouseClicked

    private void edit_townMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_townMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(town);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_address = town.getText().equalsIgnoreCase(this.supplier.getAddr_town());
        evt.consume();
    }//GEN-LAST:event_edit_townMouseClicked

    private void edit_districtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_districtMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(district);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        this.f_address = district.getText().equalsIgnoreCase(this.supplier.getAddr_district());
        evt.consume();
    }//GEN-LAST:event_edit_districtMouseClicked

    private void dispose() {
        if (Service.catchComponent(this, "update_dialog") instanceof javax.swing.JDialog diag) {
            ((UpdateDialog) diag).dispose();
        }
    }

    private void checkValidity() {
        String n = this.name.getText();
        String p = this.phone.getText();
        String e = this.email.getText();
        String b = this.bno.getText();
        String s = this.street.getText();
        String t = this.town.getText();
        String d = this.district.getText();

        fc_name = true;
        fc_phone = true;
        fc_email = true;
        fc_bno = true;
        fc_street = true;
        fc_town = true;
        fc_district = true;

        setPropertyBorderNORMAL(name);
        setPropertyBorderNORMAL(phone);
        setPropertyBorderNORMAL(email);
        setPropertyBorderNORMAL(bno);
        setPropertyBorderNORMAL(street);
        setPropertyBorderNORMAL(town);
        setPropertyBorderNORMAL(district);

        error = "";

        if (fc_name) {
            if (Validator.isNull(n) || Validator.isEmpty(n)) {
                fc_name = true;
                error = "Supplier name is required.";
                setPropertyBorderRED(this.name);
            } else if (!Validator.isAlphaWithSpace(n)) {
                fc_name = true;
                error = "Name must be letters only.";
                setPropertyBorderRED(this.name);
            } else if (Validator.checkLength(n, 30)) {
                fc_name = true;
                error = "Name is expected to be only 30 characters in length.";
                setPropertyBorderRED(this.name);
            } else {
                fc_name = false;
                error = "";
                setPropertyBorderNORMAL(this.name);
            }
            showErrorMessage(fc_name);
        }
        if (!fc_name && fc_phone) {
            if (Validator.isNull(p) || Validator.isEmpty(p)) {
                fc_phone = true;
                error = "Phone number is required.";
                setPropertyBorderRED(this.phone);
            } else if (Validator.isPhoneVerified(p)) {
                fc_phone = true;
                error = """
                        Invalid phone number.
                        Ex: (0xx)1234567
                                OR
                            +(94)771234567""";
                setPropertyBorderRED(this.phone);
            } else {
                fc_phone = false;
                error = "";
                setPropertyBorderNORMAL(this.phone);
            }
            showErrorMessage(fc_phone);
        }
        if (!fc_name && !fc_phone && fc_email) {
            if (Validator.isNull(e) || Validator.isEmpty(e)) {
                fc_email = true;
                error = "Email id is required.";
                setPropertyBorderRED(this.email);
            } else if (Validator.checkLength(e, 30)) {
                fc_email = true;
                error = "Email is expected to be only 30 characters in length.";
                setPropertyBorderRED(this.email);
            } else if (Validator.isEmailVerified(e)) {
                fc_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com
                        """;
                setPropertyBorderRED(this.email);
            } else {
                fc_email = false;
                error = "";
                setPropertyBorderNORMAL(this.email);
            }
            showErrorMessage(fc_email);
        }
        if (!fc_name && !fc_phone && !fc_email && fc_bno) {
            if (Validator.isNull(b) || Validator.isEmpty(b)) {
                fc_bno = true;
                error = "Block number of supplier's place, which is required.";
                setPropertyBorderRED(this.bno);
            } else if (!Validator.isAddressVerified(b)) {
                fc_bno = true;
                error = """
                        Block number of supllier's place, which is required.
                        Ex: 123/B/45  OR no.42/B, XYZ Villa
                        """;
                setPropertyBorderRED(this.bno);
            } else if (Validator.checkLength(b, 20)) {
                fc_bno = true;
                error = "Name is expected to be only 20 characters in length.";
                setPropertyBorderRED(this.bno);
            } else {
                fc_bno = false;
                error = "";
                setPropertyBorderNORMAL(this.bno);
            }
            showErrorMessage(fc_bno);
        }
        if (!fc_name && !fc_phone && !fc_email && !fc_bno && fc_street) {
            if (Validator.isNull(s) || Validator.isEmpty(s)) {
                fc_street = true;
                error = "Street where supplier's place located, which is required.";
                setPropertyBorderRED(this.street);
            } else if (!Validator.isAddressVerified(s)) {
                fc_street = true;
                error = """
                        Street name where supplier located is required.
                        Ex: 4th Avenue, xyz cross street
                        """;
                setPropertyBorderRED(this.street);
            } else if (Validator.checkLength(s, 30)) {
                fc_street = true;
                error = "Street name is expected to be only 30 characters in length.";
                setPropertyBorderRED(this.street);
            } else {
                fc_street = false;
                error = "";
                setPropertyBorderNORMAL(this.street);
            }
            showErrorMessage(fc_street);
        }
        if (!fc_name && !fc_phone && !fc_email && !fc_bno && !fc_street && fc_town) {
            if (Validator.isNull(t) || Validator.isEmpty(t)) {
                fc_town = true;
                error = "Supplier's town required.";
                setPropertyBorderRED(this.town);
            } else if (Validator.allLetters(t)) {
                fc_town = true;
                error = "Name of the town is expeted to be all in letters";
                setPropertyBorderRED(this.town);
            } else if (Validator.checkLength(t, 30)) {
                fc_town = true;
                error = "Name of the town is expected to be only 30 characters in length.";
                setPropertyBorderRED(this.town);
            } else {
                fc_town = false;
                error = "";
                setPropertyBorderNORMAL(this.town);
            }
            showErrorMessage(fc_town);
        }
        if (!fc_name && !fc_phone && !fc_email && !fc_bno && !fc_street && !fc_town && fc_district) {
            if (Validator.isNull(d) || Validator.isEmpty(d)) {
                fc_district = true;
                error = "Supplier's district required.";
                setPropertyBorderRED(this.district);
            } else if (Validator.allLetters(d)) {
                fc_district = true;
                error = "Name of the distritc is expeted to be all in letters";
                setPropertyBorderRED(this.district);
            } else if (Validator.checkLength(d, 20)) {
                fc_district = true;
                error = "Name of the district is expected to be only 20 characters in length.";
                setPropertyBorderRED(this.district);
            } else {
                fc_district = false;
                error = "";
                setPropertyBorderNORMAL(this.district);
            }
            showErrorMessage(fc_district);
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
            lbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        }
    }

    private boolean f_name;
    private boolean f_phone;
    private boolean f_email;
    private boolean f_status;
    private boolean f_address;
    private final Supplier supplier;

    private String error;
    private boolean fc_name;
    private boolean fc_phone;
    private boolean fc_email;
    private boolean fc_bno;
    private boolean fc_street;
    private boolean fc_town;
    private boolean fc_district;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bno;
    private com.wecare.assets.custom_controls.model.CustomButton btn_update;
    private javax.swing.JLabel district;
    private javax.swing.JLabel edit_bno;
    private javax.swing.JLabel edit_district;
    private javax.swing.JLabel edit_email;
    private javax.swing.JLabel edit_name;
    private javax.swing.JLabel edit_phone;
    private javax.swing.JLabel edit_status;
    private javax.swing.JLabel edit_street;
    private javax.swing.JLabel edit_town;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel status;
    private javax.swing.JLabel street;
    private javax.swing.JLabel town;
    // End of variables declaration//GEN-END:variables
}
