package com.wecare.view;

import com.wecare.assets.custom_controls.component.AddScrollForm;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.component.ViewForm;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.CustomerController;
import com.wecare.controller.ReportController;
import com.wecare.controller.TestController;
import com.wecare.controller.TestTypeController;
import com.wecare.model.Customer;
import com.wecare.model.Test;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Receptionist_Tasks extends javax.swing.JPanel {

    public Receptionist_Tasks() {
        initComponents();
        init();
    }

    private void changeContent(Component parent, JPanel panel) {
        if (Service.catchComponent(parent, "main_container") instanceof JPanel pnl) {
            pnl.removeAll();
            pnl.add(panel);
            pnl.repaint();
            pnl.revalidate();
        }
    }

    public final void init() {
        add = new AddScrollForm();
        view = new ViewForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_manageCustomer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        con_cus = new javax.swing.JPanel();
        btn_addCustomer = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_showCustomers = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manageReports = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        con_rep = new javax.swing.JPanel();
        btn_showReports = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manageTypes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        con_test = new javax.swing.JPanel();
        btn_showTests = new com.wecare.assets.custom_controls.model.CustomCardButton();

        setLayout(new java.awt.GridLayout(3, 0));

        pnl_manageCustomer.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(929, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageCustomer.add(jPanel1, java.awt.BorderLayout.NORTH);

        con_cus.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout1.setAlignOnBaseline(true);
        con_cus.setLayout(flowLayout1);

        btn_addCustomer.setForeground(new java.awt.Color(51, 51, 51));
        btn_addCustomer.setText("Add New");
        btn_addCustomer.setColor_bottom(new java.awt.Color(24, 96, 158));
        btn_addCustomer.setColor_top(new java.awt.Color(36, 198, 246));
        btn_addCustomer.setEffectColor(new java.awt.Color(147, 205, 255));
        btn_addCustomer.setFocusPainted(false);
        btn_addCustomer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addCustomer.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addCustomer.setRoundness(30);
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });
        con_cus.add(btn_addCustomer);

        btn_showCustomers.setForeground(new java.awt.Color(51, 51, 51));
        btn_showCustomers.setText("Show Customers");
        btn_showCustomers.setColor_bottom(new java.awt.Color(24, 96, 158));
        btn_showCustomers.setColor_top(new java.awt.Color(36, 198, 246));
        btn_showCustomers.setEffectColor(new java.awt.Color(172, 229, 246));
        btn_showCustomers.setFocusPainted(false);
        btn_showCustomers.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_showCustomers.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_showCustomers.setRoundness(30);
        btn_showCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showCustomersActionPerformed(evt);
            }
        });
        con_cus.add(btn_showCustomers);

        pnl_manageCustomer.add(con_cus, java.awt.BorderLayout.CENTER);

        add(pnl_manageCustomer);

        pnl_manageReports.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Test Reports");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(916, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageReports.add(jPanel3, java.awt.BorderLayout.NORTH);

        con_rep.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout2.setAlignOnBaseline(true);
        con_rep.setLayout(flowLayout2);

        btn_showReports.setForeground(new java.awt.Color(51, 51, 51));
        btn_showReports.setText("Show Reports");
        btn_showReports.setColor_bottom(new java.awt.Color(180, 113, 63));
        btn_showReports.setColor_top(new java.awt.Color(216, 229, 82));
        btn_showReports.setEffectColor(new java.awt.Color(222, 229, 160));
        btn_showReports.setFocusPainted(false);
        btn_showReports.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_showReports.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_showReports.setRoundness(30);
        btn_showReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showReportsActionPerformed(evt);
            }
        });
        con_rep.add(btn_showReports);

        pnl_manageReports.add(con_rep, java.awt.BorderLayout.CENTER);

        add(pnl_manageReports);

        pnl_manageTypes.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Test Types");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(928, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageTypes.add(jPanel2, java.awt.BorderLayout.NORTH);

        con_test.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout3.setAlignOnBaseline(true);
        con_test.setLayout(flowLayout3);

        btn_showTests.setForeground(new java.awt.Color(51, 51, 51));
        btn_showTests.setText("Show Tests");
        btn_showTests.setColor_bottom(new java.awt.Color(34, 121, 101));
        btn_showTests.setColor_top(new java.awt.Color(51, 255, 221));
        btn_showTests.setEffectColor(new java.awt.Color(178, 255, 242));
        btn_showTests.setFocusPainted(false);
        btn_showTests.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_showTests.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_showTests.setRoundness(30);
        btn_showTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showTestsActionPerformed(evt);
            }
        });
        con_test.add(btn_showTests);

        pnl_manageTypes.add(con_test, java.awt.BorderLayout.CENTER);

        add(pnl_manageTypes);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add new patient");

        Frm_AddNewCustomer addCustomer = new Frm_AddNewCustomer();
        addCustomer.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Receptionist_Tasks r = new Receptionist_Tasks();
            changeContent(add, r);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Receptionist_Tasks r = new Receptionist_Tasks();
            changeContent(add, r);
        });

        add.addForm(addCustomer);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void btn_showCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showCustomersActionPerformed
        view = new ViewForm();
        view.setTitle("Customer detail");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("Gender");
        dt.addColumn("Phone");
        dt.addColumn("Email");
        CustomerController.getCustomers(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Receptionist_Tasks r = new Receptionist_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_Customers();
                    e.consume();
                }
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_Customers();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                CustomerController.getCustomers(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_showCustomersActionPerformed

    private void btn_showReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showReportsActionPerformed
        view = new ViewForm();
        view.setTitle("Test Data");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Id");
        dt.addColumn("Date tested");
        dt.addColumn("Patient");
        dt.addColumn("Test");
        dt.addColumn("Status");
        TestController.getTests(view.getTable(), view.getTextField().getText());

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Receptionist_Tasks r = new Receptionist_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    generateReport();
                    e.consume();
                }
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    generateReport();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                TestController.getTests(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_showReportsActionPerformed

    private void btn_showTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showTestsActionPerformed
        view = new ViewForm();
        view.setTitle("Test Types");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Name");
        dt.addColumn("Price");
        TestTypeController.getTestTypes(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Receptionist_Tasks r = new Receptionist_Tasks();
            changeContent(view, r); // replaces r with view
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                TestTypeController.getTestTypes(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);  // replaces this with view
    }//GEN-LAST:event_btn_showTestsActionPerformed

    private void show_Customers() {
        int row = view.getTable().getSelectedRow();
        Customer c = new Customer();
        CustomerController cc = new CustomerController(c);
        c.setId((String) view.getTable().getValueAt(row, 0));
        cc.setCustomer_by_ID();

        UpdateDialog upd = new UpdateDialog(null, true);
        upd.setLocationRelativeTo(view);
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.setTitle("Customer data");
        upd.addForm(new Frm_CustomerData(cc.getCustomer()));
        upd.setVisible(true);
        view.getTable().setRowSelectionInterval(row, row);
    }

    private void generateReport() {
        int row = view.getTable().getSelectedRow();
        Test t = new Test();
        t.setId((String) view.getTable().getValueAt(row, 0));
        TestController t_con = new TestController(t);
        t_con.getTestById();
        if (t_con.getTest().getStatus()) {
            t = t_con.getTest();
            switch (t.getTest_name()) {
                case "CBC" -> {
                    ReportController.generate_CBC_Report(t.getResult_id());
                }
                default -> {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Test is still ongoing. Please refer test status.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private AddScrollForm add;
    private ViewForm view;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addCustomer;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_showCustomers;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_showReports;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_showTests;
    private javax.swing.JPanel con_cus;
    private javax.swing.JPanel con_rep;
    private javax.swing.JPanel con_test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnl_manageCustomer;
    private javax.swing.JPanel pnl_manageReports;
    private javax.swing.JPanel pnl_manageTypes;
    // End of variables declaration//GEN-END:variables
}
