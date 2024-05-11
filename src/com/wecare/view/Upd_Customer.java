package com.wecare.view;

import com.wecare.assets.custom_controls.component.Dialog_TextField;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.CustomerController;
import com.wecare.controller.Validator;
import com.wecare.model.Customer;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Upd_Customer extends javax.swing.JPanel {

    public Upd_Customer(Customer customer) {
        initComponents();
        this.customer = customer;
        init();
    }

    private void init() {
        lbl_name.setText(this.customer.getFname() + " " + this.customer.getLname());
        name.setText(this.customer.getFname() + " " + this.customer.getLname());
        dob.setText(new SimpleDateFormat("yyyy-MM-dd").format(this.customer.getDOB().getTime()));
        gender.setText("M".equals(this.customer.getGender()) ? "male" : "female");
        email.setText(this.customer.getEmail());
        phone_no.setText(this.customer.getPhone());
        customer.setAge(Service.calculateAge(this.customer.getDOB()));
        age.setText("" + this.customer.getAge());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        edit_name = new javax.swing.JLabel();
        phone_no = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        edit_email = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        edit_phone_no = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        btn_update = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        edit_name.setForeground(new java.awt.Color(102, 204, 255));
        edit_name.setText("edit");
        edit_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_nameMouseClicked(evt);
            }
        });

        phone_no.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        phone_no.setForeground(new java.awt.Color(102, 102, 102));
        phone_no.setText("phone no");
        phone_no.setName("phone no"); // NOI18N

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Phone no.");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Email");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Name");

        edit_email.setForeground(new java.awt.Color(102, 204, 255));
        edit_email.setText("edit");
        edit_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_emailMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("email");
        email.setName("email"); // NOI18N

        name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("name");
        name.setName("name"); // NOI18N

        edit_phone_no.setForeground(new java.awt.Color(102, 204, 255));
        edit_phone_no.setText("edit");
        edit_phone_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_phone_noMouseClicked(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(102, 102, 102));
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name.setText("name");

        dob.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(102, 102, 102));
        dob.setText("dob");
        dob.setName("name"); // NOI18N

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Dob");

        age.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(102, 102, 102));
        age.setText("age");
        age.setName("name"); // NOI18N

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Age");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Gender");

        gender.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(102, 102, 102));
        gender.setText("sex");
        gender.setName("name"); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_email))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phone_no)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_phone_no))
                            .addComponent(dob)
                            .addComponent(age)
                            .addComponent(gender)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(edit_name)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_no)
                    .addComponent(edit_phone_no)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(edit_email)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        checkValidity();
        if (f_name == false
                && f_phone == false
                && f_name == false) {
            Customer c = this.customer;
            String[] str = name.getText().split(" ");
            String lname = "";
            for (int i = 0; i < str.length; i++) {
                if (i == 0) {
                    c.setFname(str[i]);
                } else {
                    lname += " " + str[i];
                } c.setLname(lname);
            }
            c.setPhone(phone_no.getText());
            c.setEmail(email.getText());
            CustomerController con_c = new CustomerController(c);
            if (con_c.updateCustomer()) {
                JOptionPane.showMessageDialog(null,
                        "Customer data updated.",
                        "Success.",
                        JOptionPane.INFORMATION_MESSAGE);
                this.close();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Data not updated.",
                        "Error.",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void edit_phone_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_phone_noMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(phone_no);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        evt.consume();
    }//GEN-LAST:event_edit_phone_noMouseClicked

    private void edit_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_emailMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(email);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        evt.consume();
    }//GEN-LAST:event_edit_emailMouseClicked

    private void edit_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_nameMouseClicked
        Dialog_TextField d = new Dialog_TextField(null, true);
        d.setData(name);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
        lbl_name.setText(this.name.getText());
        evt.consume();
    }//GEN-LAST:event_edit_nameMouseClicked

    private void checkValidity() {
        String n = this.name.getText();
        String p = phone_no.getText();
        String e = this.email.getText();

        setPropertyBorderNORMAL(this.name);
        setPropertyBorderNORMAL(this.phone_no);
        setPropertyBorderNORMAL(this.email);

        f_name = true;
        f_phone = true;
        f_email = true;
        error = "";

        if (f_name) {
            if (Validator.isNull(n) || Validator.isEmpty(n)) {
                f_name = true;
                error = "Name is required.";
                setPropertyBorderRED(this.name);
            } else if (!Validator.isAlphaWithSpace(n)) {
                f_name = true;
                error = "Name must be letters only.";
                setPropertyBorderRED(this.name);
            } else if (Validator.checkLength(n, 20)) {
                f_name = true;
                error = "Name is expected to be only 20 characters in length.";
                setPropertyBorderRED(this.name);
            } else {
                f_name = false;
                error = "";
                setPropertyBorderNORMAL(this.name);
            }
            showErrorMessage(f_name);
        }
        if (!f_name && f_phone) {
            if (Validator.isNull(p) || Validator.isEmpty(p)) {
                f_phone = true;
                error = "Phone number is required.";
                setPropertyBorderRED(this.phone_no);
            } else if (Validator.isPhoneVerified(p)) {
                f_phone = true;
                error = """
                        Invalid phone number.
                        Ex: (0xx)1234567
                                OR
                            +(94)771234567""";
                setPropertyBorderRED(this.phone_no);
            } else {
                f_phone = false;
                error = "";
                setPropertyBorderNORMAL(this.phone_no);
            }
            showErrorMessage(f_phone);
        }
        if (!f_name && !f_phone && f_email) {
            if (Validator.isNull(e) || Validator.isEmpty(e)) {
                f_email = true;
                error = "Email id is required.";
                setPropertyBorderRED(this.email);
            } else if (Validator.checkLength(e, 50)) {
                f_email = true;
                error = "Email is expected to be only 50 characters in length.";
                setPropertyBorderRED(this.email);
            } else if (Validator.isEmailVerified(e)) {
                f_email = true;
                error = """
                        Invalid email number.
                        Ex: abc.company@abc.com""";
                setPropertyBorderRED(this.email);
            } else {
                f_email = false;
                error = "";
                setPropertyBorderNORMAL(this.email);
            }
            showErrorMessage(f_email);
        }
    }

    private Component findParent() {
        return Service.catchComponent(this, "update_dialog");
    }

    private void close() {
        if (findParent() instanceof UpdateDialog d) {
            d.dispose();
        }
    }

    private void showErrorMessage(boolean flag) {
        if (flag) {
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

    private String error;
    private boolean f_name;
    private boolean f_phone;
    private boolean f_email;
    private final Customer customer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private com.wecare.assets.custom_controls.model.CustomButton btn_update;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel edit_email;
    private javax.swing.JLabel edit_name;
    private javax.swing.JLabel edit_phone_no;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone_no;
    // End of variables declaration//GEN-END:variables
}
