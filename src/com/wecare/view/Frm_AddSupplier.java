package com.wecare.view;

import com.wecare.assets.custom_controls.model.CustomTextArea;
import com.wecare.assets.custom_controls.model.CustomTextField;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.SupplierController;
import com.wecare.controller.Validator;
import com.wecare.model.Supplier;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Frm_AddSupplier extends javax.swing.JPanel {

    public Frm_AddSupplier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel11 = new javax.swing.JLabel();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_name = new com.wecare.assets.custom_controls.model.CustomTextField();
        txt_email = new com.wecare.assets.custom_controls.model.CustomTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_phone = new com.wecare.assets.custom_controls.model.CustomTextField();
        txt_bno = new com.wecare.assets.custom_controls.model.CustomTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_street = new com.wecare.assets.custom_controls.model.CustomTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txt_town = new com.wecare.assets.custom_controls.model.CustomTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_district = new com.wecare.assets.custom_controls.model.CustomTextField();
        btn_find = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

        btn_cancel.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setEffectColor(new java.awt.Color(207, 207, 207));
        btn_cancel.setFocusPainted(false);
        btn_cancel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_cancel.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_cancel.setRoundness(35);

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Email");

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

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Phone No.");

        jSeparator4.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_name.setForeground(new java.awt.Color(51, 51, 51));
        txt_name.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_name.setHint("supplier name");

        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_email.setHint("email");

        jSeparator2.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_phone.setForeground(new java.awt.Color(51, 51, 51));
        txt_phone.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_phone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_phone.setHint("phone number");

        txt_bno.setForeground(new java.awt.Color(51, 51, 51));
        txt_bno.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_bno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_bno.setHint("block number");

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Block no.");

        jSeparator3.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_street.setForeground(new java.awt.Color(51, 51, 51));
        txt_street.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_street.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_street.setHint("street name");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Street");

        jSeparator5.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_town.setForeground(new java.awt.Color(51, 51, 51));
        txt_town.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_town.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_town.setHint("town");

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Town");

        jSeparator6.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("District");

        jSeparator7.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_district.setForeground(new java.awt.Color(51, 51, 51));
        txt_district.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_district.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_district.setHint("district");

        btn_find.setBackground(new java.awt.Color(6, 159, 93));
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/search-white.png"))); // NOI18N
        btn_find.setText("find");
        btn_find.setEffectColor(new java.awt.Color(189, 232, 213));
        btn_find.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_find.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_find.setRoundness(30);
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(txt_town, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel14))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(txt_bno, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel12))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel13))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel15)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_bno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_town, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        add(jPanel3, gridBagConstraints);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        this.checkValidity();
        if (f_name == false
                && f_phone == false
                && f_email == false
                && f_bno == false
                && f_street == false
                && f_town == false
                && f_district == false) {
            Supplier s = new Supplier();
            s.setId(Service.getNextId(SupplierController.getLastSupplier().getId()));
            s.setName(txt_name.getText());
            s.setPhone(txt_phone.getText());
            s.setEmail(txt_email.getText());
            s.setAddr_bno(txt_bno.getText());
            s.setAddr_street(txt_street.getText());
            s.setAddr_town(txt_town.getText());
            s.setAddr_district(txt_district.getText());
            s.setStatus(true);
            SupplierController sup_con = new SupplierController(s);
            if (sup_con.save()) {
                JOptionPane.showMessageDialog(null,
                        "Supplier data saved.",
                        "Success.",
                        JOptionPane.INFORMATION_MESSAGE);
                this.resetUI();
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        f_email = true;
        error = "";
        if (f_email) {
            if (Validator.isNull(txt_email.getText()) || Validator.isEmpty(txt_email.getText())) {
                f_email = true;
                error = "Email id is required to find a match.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.checkLength(txt_email.getText(), 30)) {
                f_email = true;
                error = "Email is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.isEmailVerified(txt_email.getText())) {
                f_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com
                        """;
                setTextfieldBorderRED(this.txt_email);
            } else {
                f_email = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_email);
            }
            showErrorMessage(f_email);
        }
        if (f_email == false) {
            Supplier s = new Supplier();
            s.setEmail(txt_email.getText());
            if (txt_phone.getText() == null) {
                s.setPhone(txt_phone.getText());
            }
            SupplierController s_con = new SupplierController(s);
            if (s_con.findSupplier()) {
                int opt = JOptionPane.showConfirmDialog(null,
                        "Existing record found\nDou you want to go automatic.",
                        "Hey,",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                switch (opt) {
                    case 0 -> {
                        Supplier supplier = s_con.getSupplier();
                        this.txt_name.setText(supplier.getName());
                        this.txt_phone.setText(supplier.getPhone());
                        this.txt_email.setText(supplier.getEmail());
                        this.txt_bno.setText(supplier.getAddr_bno());
                        this.txt_street.setText(supplier.getAddr_street());
                        this.txt_town.setText(supplier.getAddr_town());
                        this.txt_district.setText(supplier.getAddr_district());
                    }
                    default -> {
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "This seems like a fresh record",
                        "Hey,",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void checkValidity() {
        String name = txt_name.getText();
        String phone = txt_phone.getText();
        String email = txt_email.getText();
        String bno = txt_bno.getText();
        String street = txt_street.getText();
        String town = txt_town.getText();
        String district = txt_district.getText();

        f_name = true;
        f_phone = true;
        f_email = true;
        f_bno = true;
        f_street = true;
        f_town = true;
        f_district = true;

        setTextfieldBorderNORMAL(txt_name);
        setTextfieldBorderNORMAL(txt_phone);
        setTextfieldBorderNORMAL(txt_email);
        setTextfieldBorderNORMAL(txt_bno);
        setTextfieldBorderNORMAL(txt_street);
        setTextfieldBorderNORMAL(txt_town);
        setTextfieldBorderNORMAL(txt_district);

        error = "";

        if (f_name) {
            if (Validator.isNull(name) || Validator.isEmpty(name)) {
                f_name = true;
                error = "Supplier name is required.";
                setTextfieldBorderRED(this.txt_name);
            } else if (!Validator.isAlphaWithSpace(name)) {
                f_name = true;
                error = "Name must be letters only.";
                setTextfieldBorderRED(this.txt_name);
            } else if (Validator.checkLength(name, 30)) {
                f_name = true;
                error = "Name is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_name);
            } else {
                f_name = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_name);
            }
            showErrorMessage(f_name);
        }
        if (!f_name && f_phone) {
            if (Validator.isNull(phone) || Validator.isEmpty(phone)) {
                f_phone = true;
                error = "Phone number is required.";
                setTextfieldBorderRED(this.txt_phone);
            } else if (Validator.isPhoneVerified(phone)) {
                f_phone = true;
                error = """
                        Invalid phone number.
                        Ex: (0xx)1234567
                                OR
                            +(94)771234567""";
                setTextfieldBorderRED(this.txt_phone);
            } else {
                f_phone = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_phone);
            }
            showErrorMessage(f_phone);
        }
        if (!f_name && !f_phone && f_email) {
            if (Validator.isNull(email) || Validator.isEmpty(email)) {
                f_email = true;
                error = "Email id is required.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.checkLength(email, 30)) {
                f_email = true;
                error = "Email is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.isEmailVerified(email)) {
                f_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com
                        """;
                setTextfieldBorderRED(this.txt_email);
            } else {
                f_email = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_email);
            }
            showErrorMessage(f_email);
        }
        if (!f_name && !f_phone && !f_email && f_bno) {
            if (Validator.isNull(bno) || Validator.isEmpty(bno)) {
                f_bno = true;
                error = "Block number of supplier's place, which is required.";
                setTextfieldBorderRED(this.txt_bno);
            } else if (!Validator.isAddressVerified(bno)) {
                f_bno = true;
                error = """
                        Block number of supllier's place, which is required.
                        Ex: 123/B/45  OR no.42/B, XYZ Villa
                        """;
                setTextfieldBorderRED(this.txt_bno);
            } else if (Validator.checkLength(bno, 20)) {
                f_bno = true;
                error = "Name is expected to be only 20 characters in length.";
                setTextfieldBorderRED(this.txt_bno);
            } else {
                f_bno = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_bno);
            }
            showErrorMessage(f_bno);
        }
        if (!f_name && !f_phone && !f_email && !f_bno && f_street) {
            if (Validator.isNull(street) || Validator.isEmpty(street)) {
                f_street = true;
                error = "Street where supplier's place located, which is required.";
                setTextfieldBorderRED(this.txt_street);
            } else if (!Validator.isAddressVerified(street)) {
                f_street = true;
                error = """
                        Street name where supplier located is required.
                        Ex: 4th Avenue, xyz cross street
                        """;
                setTextfieldBorderRED(this.txt_street);
            } else if (Validator.checkLength(street, 30)) {
                f_street = true;
                error = "Street name is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_street);
            } else {
                f_street = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_street);
            }
            showErrorMessage(f_street);
        }
        if (!f_name && !f_phone && !f_email && !f_bno && !f_street && f_town) {
            if (Validator.isNull(town) || Validator.isEmpty(town)) {
                f_town = true;
                error = "Supplier's town required.";
                setTextfieldBorderRED(this.txt_town);
            } else if (Validator.allLetters(town)) {
                f_town = true;
                error = "Name of the town is expeted to be all in letters";
                setTextfieldBorderRED(this.txt_town);
            } else if (Validator.checkLength(town, 30)) {
                f_town = true;
                error = "Name of the town is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_town);
            } else {
                f_town = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_town);
            }
            showErrorMessage(f_town);
        }
        if (!f_name && !f_phone && !f_email && !f_bno && !f_street && !f_town && f_district) {
            if (Validator.isNull(district) || Validator.isEmpty(district)) {
                f_district = true;
                error = "Supplier's district required.";
                setTextfieldBorderRED(this.txt_district);
            } else if (Validator.allLetters(district)) {
                f_district = true;
                error = "Name of the distritc is expeted to be all in letters";
                setTextfieldBorderRED(this.txt_district);
            } else if (Validator.checkLength(district, 20)) {
                f_district = true;
                error = "Name of the district is expected to be only 20 characters in length.";
                setTextfieldBorderRED(this.txt_district);
            } else {
                f_district = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_district);
            }
            showErrorMessage(f_district);
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
        } else if (t instanceof CustomTextArea txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof JComboBox cmb) {
            cmb.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    private void resetUI() {
        this.txt_name.setText("");
        this.txt_email.setText("");
        this.txt_phone.setText("");
        this.txt_bno.setText("");
        this.txt_street.setText("");
        this.txt_town.setText("");
        this.txt_district.setText("");
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    private String error;
    private boolean f_name;
    private boolean f_phone;
    private boolean f_email;
    private boolean f_bno;
    private boolean f_street;
    private boolean f_town;
    private boolean f_district;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_find;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_bno;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_district;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_email;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_name;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_phone;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_street;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_town;
    // End of variables declaration//GEN-END:variables
}
