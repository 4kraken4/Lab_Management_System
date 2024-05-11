package com.wecare.view;

import com.wecare.assets.custom_controls.component.TestTypeData;
import com.wecare.assets.custom_controls.model.CustomScrollBar;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.ReportController;
import com.wecare.controller.CustomerController;
import com.wecare.controller.InvoiceController;
import com.wecare.controller.ResultController;
import com.wecare.controller.SampleController;
import com.wecare.controller.TestController;
import com.wecare.model.Customer;
import com.wecare.model.Invoice;
import com.wecare.model.Result;
import com.wecare.model.Sample;
import com.wecare.model.Test;
import com.wecare.model.User;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frm_TestSelection extends javax.swing.JPanel {

    public Frm_TestSelection(Customer customer) {
        initComponents();
        total = 0.0;
        this.customer = customer;
        test_tracker = new HashMap<>();
        initScrollBar();
        addTestType(new TestTypeData());
    }

    public void setTotal() {
        total = 0.0;
        test_tracker.forEach((k, v) -> {
            total += ((TestTypeData) v).getTest_type().getPrice();
        });
        this.lbl_total.setText("Total: Rs." + total);
    }

    public final void addTestType(JPanel test_type) {
        String id = ((TestTypeData) test_type).getID();
        test_tracker.put(id, test_type);
        this.pnl_testcontainer.add(test_type);
        this.pnl_testcontainer.repaint();
        this.pnl_testcontainer.revalidate();
        setTotal();
//        String name = ((TestTypeData) test_type).getTest_type().getTestName();
//        test_tracker.forEach((k, v) -> {
//            if (!((TestTypeData) v).getTest_type().getTestName()
//                    .equals(name)) {
//
//            } else {
//                JOptionPane.showMessageDialog(null,
//                        "You have already selected " + name + ".\nSelect a another type.",
//                        "Failure.",
//                        JOptionPane.ERROR_MESSAGE);
//            }
//        });
    }

    public void removeTestType(String id) {
        this.pnl_testcontainer.remove(test_tracker.get(id));
        this.pnl_testcontainer.repaint();
        this.pnl_testcontainer.revalidate();
        this.test_tracker.remove(id);
        setTotal();
    }

    private void initScrollBar() {
        pnl_scrollbar.setVerticalScrollBar(new CustomScrollBar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        pnl_scrollbar = new javax.swing.JScrollPane();
        pnl_testcontainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_next = new com.wecare.assets.custom_controls.model.CustomButton();
        btn_discard = new com.wecare.assets.custom_controls.model.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("pnl_testcontainer"); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Select customer's test(s)");

        btn_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/plus.png"))); // NOI18N
        btn_add.setToolTipText("add a test");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        lbl_total.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(39, 102, 194));
        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_total.setText("Total");
        lbl_total.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.NORTH);

        pnl_scrollbar.setBackground(new java.awt.Color(255, 255, 255));
        pnl_scrollbar.setBorder(null);
        pnl_scrollbar.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pnl_scrollbar.setPreferredSize(new java.awt.Dimension(540, 540));

        pnl_testcontainer.setBackground(new java.awt.Color(255, 255, 255));
        pnl_testcontainer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_testcontainer.setPreferredSize(new java.awt.Dimension(540, 570));
        pnl_testcontainer.setLayout(new javax.swing.BoxLayout(pnl_testcontainer, javax.swing.BoxLayout.PAGE_AXIS));
        pnl_scrollbar.setViewportView(pnl_testcontainer);

        jPanel3.add(pnl_scrollbar, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_next.setBackground(new java.awt.Color(51, 102, 255));
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Finalize");
        btn_next.setEffectColor(new java.awt.Color(159, 189, 255));
        btn_next.setFocusPainted(false);
        btn_next.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_next.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_next.setRoundness(30);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_discard.setBackground(new java.awt.Color(225, 61, 61));
        btn_discard.setForeground(new java.awt.Color(255, 255, 255));
        btn_discard.setText("Discard");
        btn_discard.setEffectColor(new java.awt.Color(255, 177, 177));
        btn_discard.setFocusPainted(false);
        btn_discard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_discard.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_discard.setRoundness(30);
        btn_discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_discardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(btn_discard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_discard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, java.awt.BorderLayout.SOUTH);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 537;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        addTestType(new TestTypeData());
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        boolean flag = true;
        if (Service.catchComponent(this, "MainWindow") instanceof javax.swing.JFrame fr) {
            this.user = ((Dashboard) fr).getUser();
        }
        if (this.customer.isNew()) {
            CustomerController c_con = new CustomerController(this.customer);
            if (!c_con.saveCustomer() || !c_con.adCustomerToLab(this.user.getLabID())) {
                flag = false;
                JOptionPane.showMessageDialog(null,
                        "Data not saved.\nIssue with Database.",
                        "Failure.",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (flag) {
            Invoice i = new Invoice();
            i.setId(Service.getNextId(InvoiceController.getLastInvoice().getId()));
            i.setCustomer_id(this.customer.getId());
            i.setUserid(this.user.getUsrID());
            i.setDate(Timestamp.valueOf(LocalDateTime.now()));
            i.setTotal_price(this.total);
            this.invoice = i;
            InvoiceController i_con = new InvoiceController(i);
            if (!i_con.saveInvoice()) {
                flag = false;
                JOptionPane.showMessageDialog(null,
                        "Data not saved.\nIssue with Database.",
                        "Failure.",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (flag) {
            Sample s = new Sample();
            s.setcollected(false);
            s.setDate(java.sql.Date.valueOf(LocalDate.now()));
            s.setCustomer_id(this.customer.getId());
            s.setUser_id(this.user.getUsrID());
            s.setLab_colleted(this.user.getLabID());
            s.setId(Service.getNextId(SampleController.getLastSample().getId()));

            Result r = new Result();
            r.setUser_id(this.user.getUsrID());
            r.setDatetime(Timestamp.from(Instant.now()));
            r.setStatus(false);
            r.setId(Service.getNextId(ResultController.getLastTest().getId()));

            Test t = new Test();
            t.setStatus(false);
            t.setDate(java.sql.Date.valueOf(LocalDate.now()));
            t.setCustomer_id(this.customer.getId());
            t.setUser_id(this.user.getUsrID());
            t.setInvoice_id(this.invoice.getId());
            t.setId(Service.getNextId(TestController.getLastTest().getId()));

            SampleController s_con = new SampleController();
            ResultController r_con = new ResultController();
            TestController t_con = new TestController();
            test_tracker.forEach((k, v) -> {
                s.setLab_tested(this.user.getLabID());
                s.setType(((TestTypeData) v).getTest_type().getSample_type());
                s_con.setSample(s);
                s_con.saveSample();

                r_con.setResult(r);
                r_con.add_ResultToDo();

                t.setSample_id(s.getId());
                t.setResult_id(r.getId());
                t.setTest_name(((TestTypeData) v).getTest_type().getTestName());
                t_con.setTest(t);
                t_con.saveTest();

                s.setId(Service.getNextId(s.getId()));
                r.setId(Service.getNextId(r.getId()));
                t.setId(Service.getNextId(t.getId()));
            });
            JOptionPane.showMessageDialog(null,
                    "Transaction recorded.",
                    "Success.",
                    JOptionPane.INFORMATION_MESSAGE);
            ReportController.generateInvoice(this.invoice.getId());
            this.dispopse();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_discardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_discardActionPerformed
        this.dispopse();
    }//GEN-LAST:event_btn_discardActionPerformed

    private void dispopse() {
        if (Service.catchComponent(this, "MainWindow") instanceof javax.swing.JFrame fr) {
            ((Dashboard) fr).setUi_to_manaage();
        }
    }

    private final Map<String, JPanel> test_tracker;
    private final Customer customer;
    private Invoice invoice;
    private double total;
    private User user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_add;
    private com.wecare.assets.custom_controls.model.CustomButton btn_discard;
    private com.wecare.assets.custom_controls.model.CustomButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JScrollPane pnl_scrollbar;
    private javax.swing.JPanel pnl_testcontainer;
    // End of variables declaration//GEN-END:variables
}
