package com.wecare.view;

import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.model.CustomButton;
import com.wecare.assets.utilities.Service;
import com.wecare.model.Customer;
import java.text.SimpleDateFormat;

public class Frm_CustomerData extends javax.swing.JPanel {

    public Frm_CustomerData(Customer customer) {
        initComponents();
        this.customer = customer;
        init();
    }

    private void init() {
        lbl_name.setText(this.customer.getFname() + " " + this.customer.getLname());
        name.setText(this.customer.getFname() + " " + this.customer.getLname());
        dob.setText(new SimpleDateFormat("yyyy-MM-dd").format(this.customer.getDOB().getTime()));
        gender.setText(this.customer.getGender());
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
        phone_no = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        btn_ok = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("email");
        email.setName("email"); // NOI18N

        name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("name");
        name.setName("name"); // NOI18N

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

        btn_ok.setBackground(new java.awt.Color(51, 102, 255));
        btn_ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok.setText("Ok");
        btn_ok.setEffectColor(new java.awt.Color(161, 204, 242));
        btn_ok.setFocusPainted(false);
        btn_ok.setRoundness(30);
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
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
                        .addGap(0, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(email)
                            .addComponent(phone_no)
                            .addComponent(dob)
                            .addComponent(age)
                            .addComponent(gender))
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 9, 40, 9);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        this.dispose();;
    }//GEN-LAST:event_btn_okActionPerformed

    private void dispose() {
        if (Service.catchComponent(this, "update_dialog") instanceof javax.swing.JDialog diag) {
            ((UpdateDialog) diag).dispose();
        }
    }

    private Customer customer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private com.wecare.assets.custom_controls.model.CustomButton btn_ok;
    private javax.swing.JLabel dob;
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
