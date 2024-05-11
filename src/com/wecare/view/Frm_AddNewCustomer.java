package com.wecare.view;

import com.wecare.assets.custom_controls.model.CustomTextField;
import com.wecare.assets.custom_controls.model.DatePicker;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.CustomerController;
import com.wecare.controller.Validator;
import com.wecare.model.Customer;
import java.awt.Component;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frm_AddNewCustomer extends javax.swing.JPanel {

    public Frm_AddNewCustomer() {
        initComponents();
        setOpaque(false);
        initForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        opt_gender = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        jLabel11 = new javax.swing.JLabel();
        dp_dob = new com.wecare.assets.custom_controls.model.DatePicker();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        cmb_female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cmb_male = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_lname = new com.wecare.assets.custom_controls.model.CustomTextField();
        txt_fname = new com.wecare.assets.custom_controls.model.CustomTextField();
        txt_email = new com.wecare.assets.custom_controls.model.CustomTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_phone = new com.wecare.assets.custom_controls.model.CustomTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_find = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

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
        jLabel11.setText("Email");

        dp_dob.setColor_bg(new java.awt.Color(204, 204, 204));
        dp_dob.setColor_fg(new java.awt.Color(51, 51, 51));

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

        opt_gender.add(cmb_female);
        cmb_female.setForeground(new java.awt.Color(51, 51, 51));
        cmb_female.setText("Female");
        cmb_female.setActionCommand("Female");
        cmb_female.setActionCommand("F");
        cmb_female.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmb_female.setDoubleBuffered(true);

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Phone No.");

        opt_gender.add(cmb_male);
        cmb_male.setForeground(new java.awt.Color(51, 51, 51));
        cmb_male.setText("Male");
        cmb_male.setActionCommand("Male");
        cmb_male.setActionCommand("M");
        cmb_male.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmb_male.setDoubleBuffered(true);

        jSeparator4.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Gender");

        txt_lname.setForeground(new java.awt.Color(51, 51, 51));
        txt_lname.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_lname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_lname.setHint("Last name");

        txt_fname.setForeground(new java.awt.Color(51, 51, 51));
        txt_fname.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_fname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_fname.setHint("First name");
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_email.setHint("Email");

        jSeparator2.setPreferredSize(new java.awt.Dimension(450, 30));

        txt_phone.setForeground(new java.awt.Color(51, 51, 51));
        txt_phone.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_phone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_phone.setHint("Phone no.");

        jSeparator6.setPreferredSize(new java.awt.Dimension(450, 30));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Date of Birth");

        btn_find.setBackground(new java.awt.Color(6, 159, 93));
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/search-white.png"))); // NOI18N
        btn_find.setText("Find");
        btn_find.setFocusPainted(false);
        btn_find.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btn_find.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_find.setRoundness(35);
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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGap(75, 75, 75)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(cmb_male)
                        .addGap(91, 91, 91)
                        .addComponent(cmb_female))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(dp_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(dp_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_male)
                    .addComponent(cmb_female))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel3, gridBagConstraints);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

//    @Override
//    protected void paintComponent(Graphics g) {
//        try {
//            BufferedImage img = ImageIO.read(new File("src\\com\\wecare\\assets\\image\\logo\\pngegg.png"));
//            Graphics2D g2 = (Graphics2D) g;
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            g2.setColor(getBackground());
//            if (img != null) {
//                g2.drawImage(img, 0, 0, img.getWidth(), getHeight(), this);
//            }
//            super.paintComponent(g2);
//            g2.dispose();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        this.checkValidity();
        if (f_fname == false
                && f_lname == false
                && f_dob == false
                && f_phone == false
                && f_email == false) {
            Customer new_c = new Customer();
            new_c.setId(Service.getNextId(CustomerController.getLastCustomer().getId()));
            new_c.setFname(txt_fname.getText());
            new_c.setLname(txt_lname.getText());
            new_c.setDOB(Date.valueOf(dp_dob.getDatePicker().getModel().getValue().toString()));
            new_c.setGender(opt_gender.getSelection().getActionCommand());
            new_c.setEmail(txt_email.getText());
            new_c.setPhone(txt_phone.getText());
            CustomerController c_con = new CustomerController(new_c);
            if (c_con.findCustomer()) {
                new_c = c_con.getCustomer();
                JOptionPane.showMessageDialog(null,
                        "Existing customer record found.",
                        "Info",
                        JOptionPane.INFORMATION_MESSAGE);
                this.resetUI();
            }
            if (Service.catchComponent(this.getParent(), "main_container") instanceof JPanel pnl) {
                pnl.removeAll();
                pnl.add(new Frm_TestSelection(new_c));
                pnl.repaint();
                pnl.revalidate();
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        this.checkEmail();
        if (f_email == false) {
            Customer c = new Customer();
            c.setEmail(txt_email.getText());
            c.setPhone(txt_phone.getText());
            CustomerController c_con = new CustomerController(c);
            if (c_con.findCustomer()) {
                int opt = JOptionPane.showConfirmDialog(null,
                        "Existing record found\nDou you want to go automatic.",
                        "Hey,",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                switch (opt) {
                    case 0 -> {
                        Customer customer = c_con.getCustomer();
                        this.txt_fname.setText(customer.getFname());
                        this.txt_lname.setText(customer.getLname());
                        this.txt_email.setText(customer.getEmail());
                        this.txt_phone.setText(customer.getPhone());
                        this.dp_dob.setInitialDate(customer.getDOB());
                        if (customer.getGender().equals("F")) {
                            this.cmb_female.setSelected(true);
                        } else {
                            this.cmb_male.setSelected(true);
                        }
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

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void checkEmail() {
        String email = txt_email.getText();
        setTextfieldBorderNORMAL(this.txt_email);
        f_email = true;
        error = "";
        if (f_email) {
            if (Validator.isNull(email) || Validator.isEmpty(email)) {
                f_email = true;
                error = "Email id is required.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.checkLength(email, 50)) {
                f_email = true;
                error = "Email is expected to be only 50 characters in length.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.isEmailVerified(email)) {
                f_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com""";
                setTextfieldBorderRED(this.txt_email);
            } else {
                f_email = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_email);
            }
            showErrorMessage(f_email);
        }
    }

    private void resetUI() {
        this.txt_fname.setText("");
        this.txt_lname.setText("");
        this.cmb_male.setSelected(true);
        this.dp_dob.setInitialDate(Date.valueOf(LocalDate.now()));
        this.txt_email.setText("");
        this.txt_phone.setText("");
    }

    private void initForm() {
        this.cmb_male.setSelected(true);
        this.dp_dob.setInitialDate(Date.valueOf(LocalDate.now()));
    }

    private void checkValidity() {
        String fname = txt_fname.getText();
        String lname = txt_lname.getText();
        String phone = txt_phone.getText();
        String email = txt_email.getText();

        setTextfieldBorderNORMAL(this.txt_fname);
        setTextfieldBorderNORMAL(this.txt_lname);
        setTextfieldBorderNORMAL(this.dp_dob);
        setTextfieldBorderNORMAL(this.txt_phone);
        setTextfieldBorderNORMAL(this.txt_email);

        f_fname = true;
        f_lname = true;
        f_dob = true;
        f_phone = true;
        f_email = true;
        error = "";

        if (f_fname) {
            if (Validator.isNull(fname) || Validator.isEmpty(fname)) {
                f_fname = true;
                error = "Customer name is required.";
                setTextfieldBorderRED(this.txt_fname);
            } else if (Validator.allLetters(fname)) {
                f_fname = true;
                error = "First name must be all letters.";
                setTextfieldBorderRED(this.txt_fname);
            } else if (Validator.checkLength(fname, 20)) {
                f_fname = true;
                error = "Name is expected to be only 20 characters in length.";
                setTextfieldBorderRED(this.txt_fname);
            } else {
                f_fname = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_fname);
            }
            showErrorMessage(f_fname);
        }
        if (!f_fname && f_lname) {
            if (Validator.isNull(lname) || Validator.isEmpty(lname)) {
                f_lname = true;
                error = "Customer name is required.";
                setTextfieldBorderRED(this.txt_lname);
            } else if (!Validator.isAlphaWithSpace(lname)) {
                f_lname = true;
                error = "Last name must have only letters and 1 spase inbetween if needed.";
                setTextfieldBorderRED(this.txt_lname);
            } else if (Validator.checkLength(lname, 30)) {
                f_lname = true;
                error = "Name is expected to be only 30 characters in length.";
                setTextfieldBorderRED(this.txt_lname);
            } else {
                f_lname = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_lname);
            }
            showErrorMessage(f_lname);
        }
        if (!f_fname && !f_lname && f_dob) {
            if (Validator.isNullDate(dp_dob)) {
                f_dob = true;
                error = "Date is required.";
                setTextfieldBorderRED(this.dp_dob);
            } else if (Validator.checkDateForEarly(dp_dob)) {
                f_dob = true;
                error = "Date is expected to be an early date from today.";
                setTextfieldBorderRED(this.dp_dob);
            } else {
                f_dob = false;
                error = "";
                setTextfieldBorderNORMAL(this.dp_dob);
            }
            showErrorMessage(f_dob);
        }
        if (!f_fname && !f_lname && !f_dob && f_phone) {
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
        if (!f_fname && !f_lname && !f_dob && !f_phone && f_email) {
            if (Validator.isNull(email) || Validator.isEmpty(email)) {
                f_email = true;
                error = "Email id is required.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.checkLength(email, 50)) {
                f_email = true;
                error = "Email is expected to be only 50 characters in length.";
                setTextfieldBorderRED(this.txt_email);
            } else if (Validator.isEmailVerified(email)) {
                f_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com""";
                setTextfieldBorderRED(this.txt_email);
            } else {
                f_email = false;
                error = "";
                setTextfieldBorderNORMAL(this.txt_email);
            }
            showErrorMessage(f_email);
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
        }
    }

    private static void setTextfieldBorderNORMAL(Component t) {
        if (t instanceof CustomTextField txt) {
            txt.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (t instanceof DatePicker dp) {
            dp.setBorder(javax.swing.BorderFactory.
                    createLineBorder(new java.awt.Color(0, 0, 0)));
        }
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    private String error;
    private boolean f_fname;
    private boolean f_lname;
    private boolean f_dob;
    private boolean f_phone;
    private boolean f_email;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_find;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JRadioButton cmb_female;
    private javax.swing.JRadioButton cmb_male;
    private com.wecare.assets.custom_controls.model.DatePicker dp_dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.ButtonGroup opt_gender;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_email;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_fname;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_lname;
    private com.wecare.assets.custom_controls.model.CustomTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
