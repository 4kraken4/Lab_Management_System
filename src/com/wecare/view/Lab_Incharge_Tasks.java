package com.wecare.view;

import com.wecare.assets.custom_controls.component.AddScrollForm;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.component.ViewForm;
import com.wecare.assets.custom_controls.model.CustomScrollBar;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.CustomerController;
import com.wecare.controller.ResultController;
import com.wecare.controller.SampleController;
import com.wecare.controller.TestController;
import com.wecare.controller.TestTypeController;
import com.wecare.model.CBC_Result;
import com.wecare.model.Customer;
import com.wecare.model.Sample;
import com.wecare.model.Test;
import com.wecare.model.TestType;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Lab_Incharge_Tasks extends javax.swing.JPanel {

    public Lab_Incharge_Tasks() {
        initComponents();
        initScrollBar();
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
        view = new ViewForm();
        add = new AddScrollForm();
    }

    private void initScrollBar() {
        scrollpane.setVerticalScrollBar(new CustomScrollBar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnl_manage_customer2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_addCustomer = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewCustomer = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manageUser = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btn_addSample = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewSample = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manage_tests = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btn_addTestType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewTestType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manage_results = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btn_viewTestReport = new com.wecare.assets.custom_controls.model.CustomCardButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        scrollpane.setBorder(null);
        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        pnl_manage_customer2.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(929, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_customer2.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout9 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout9.setAlignOnBaseline(true);
        jPanel8.setLayout(flowLayout9);

        btn_addCustomer.setForeground(new java.awt.Color(51, 51, 51));
        btn_addCustomer.setText("New customer");
        btn_addCustomer.setColor_bottom(new java.awt.Color(27, 184, 75));
        btn_addCustomer.setColor_top(new java.awt.Color(153, 242, 111));
        btn_addCustomer.setEffectColor(new java.awt.Color(202, 238, 185));
        btn_addCustomer.setFocusPainted(false);
        btn_addCustomer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addCustomer.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addCustomer.setRoundness(30);
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });
        jPanel8.add(btn_addCustomer);

        btn_viewCustomer.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewCustomer.setText("View customer");
        btn_viewCustomer.setColor_bottom(new java.awt.Color(153, 242, 111));
        btn_viewCustomer.setColor_top(new java.awt.Color(27, 184, 75));
        btn_viewCustomer.setEffectColor(new java.awt.Color(202, 238, 185));
        btn_viewCustomer.setFocusPainted(false);
        btn_viewCustomer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewCustomer.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewCustomer.setRoundness(30);
        btn_viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCustomerActionPerformed(evt);
            }
        });
        jPanel8.add(btn_viewCustomer);

        pnl_manage_customer2.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_manage_customer2);

        pnl_manageUser.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sasmple");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(936, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageUser.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(450, 160));
        java.awt.FlowLayout flowLayout10 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout10.setAlignOnBaseline(true);
        jPanel9.setLayout(flowLayout10);

        btn_addSample.setForeground(new java.awt.Color(51, 51, 51));
        btn_addSample.setText("New sample");
        btn_addSample.setColor_bottom(new java.awt.Color(24, 96, 158));
        btn_addSample.setColor_top(new java.awt.Color(36, 198, 246));
        btn_addSample.setEffectColor(new java.awt.Color(172, 229, 246));
        btn_addSample.setFocusPainted(false);
        btn_addSample.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addSample.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addSample.setRoundness(30);
        btn_addSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSampleActionPerformed(evt);
            }
        });
        jPanel9.add(btn_addSample);

        btn_viewSample.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewSample.setText("View samples");
        btn_viewSample.setColor_bottom(new java.awt.Color(36, 198, 246));
        btn_viewSample.setColor_top(new java.awt.Color(24, 96, 158));
        btn_viewSample.setEffectColor(new java.awt.Color(172, 229, 246));
        btn_viewSample.setFocusPainted(false);
        btn_viewSample.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewSample.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewSample.setRoundness(30);
        btn_viewSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewSampleActionPerformed(evt);
            }
        });
        jPanel9.add(btn_viewSample);

        pnl_manageUser.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_manageUser);

        pnl_manage_tests.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tests");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(963, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_tests.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(450, 160));
        java.awt.FlowLayout flowLayout11 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout11.setAlignOnBaseline(true);
        jPanel10.setLayout(flowLayout11);

        btn_addTestType.setForeground(new java.awt.Color(51, 51, 51));
        btn_addTestType.setText("New Test");
        btn_addTestType.setColor_bottom(new java.awt.Color(180, 113, 63));
        btn_addTestType.setColor_top(new java.awt.Color(216, 229, 82));
        btn_addTestType.setEffectColor(new java.awt.Color(222, 229, 160));
        btn_addTestType.setFocusPainted(false);
        btn_addTestType.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addTestType.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addTestType.setRoundness(30);
        btn_addTestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTestTypeActionPerformed(evt);
            }
        });
        jPanel10.add(btn_addTestType);

        btn_viewTestType.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewTestType.setText("View tests");
        btn_viewTestType.setColor_bottom(new java.awt.Color(216, 229, 82));
        btn_viewTestType.setColor_top(new java.awt.Color(180, 113, 63));
        btn_viewTestType.setEffectColor(new java.awt.Color(222, 229, 160));
        btn_viewTestType.setFocusPainted(false);
        btn_viewTestType.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewTestType.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewTestType.setRoundness(30);
        btn_viewTestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewTestTypeActionPerformed(evt);
            }
        });
        jPanel10.add(btn_viewTestType);

        pnl_manage_tests.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_manage_tests);

        pnl_manage_results.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Test Results");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(920, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_results.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout12 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout12.setAlignOnBaseline(true);
        jPanel11.setLayout(flowLayout12);

        btn_viewTestReport.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewTestReport.setText("View reports");
        btn_viewTestReport.setColor_bottom(new java.awt.Color(51, 255, 221));
        btn_viewTestReport.setColor_top(new java.awt.Color(34, 121, 101));
        btn_viewTestReport.setEffectColor(new java.awt.Color(178, 255, 242));
        btn_viewTestReport.setFocusPainted(false);
        btn_viewTestReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewTestReport.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewTestReport.setRoundness(30);
        btn_viewTestReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewTestReportActionPerformed(evt);
            }
        });
        jPanel11.add(btn_viewTestReport);

        pnl_manage_results.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_manage_results);

        scrollpane.setViewportView(jPanel1);

        add(scrollpane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add new patient");

        Frm_AddNewCustomer addcus = new Frm_AddNewCustomer();
        addcus.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(add, r);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(add, r);
        });

        add.addForm(addcus);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void btn_viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewCustomerActionPerformed
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
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
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
    }//GEN-LAST:event_btn_viewCustomerActionPerformed

    private void btn_addSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSampleActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add new sample");
        Frm_AddSample addSample = new Frm_AddSample();
        addSample.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks lt = new Lab_Incharge_Tasks();
            changeContent(add, lt);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(add, r);
        });

        add.addForm(addSample);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addSampleActionPerformed

    private void btn_viewSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewSampleActionPerformed
        view = new ViewForm();
        view.setTitle("Samples");
        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Id");
        dt.addColumn("customer id");
        dt.addColumn("type");
        dt.addColumn("status");
        SampleController.getSamples(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_Samples();
                    e.consume();
                }
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_Samples();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                SampleController.getSamples(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewSampleActionPerformed

    private void btn_addTestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTestTypeActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add new test type");
        Frm_AddTestType at = new Frm_AddTestType();
        at.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks tec = new Lab_Incharge_Tasks();
            changeContent(add, tec);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(add, r);
        });

        changeContent(this, add);
        add.addForm(at);
    }//GEN-LAST:event_btn_addTestTypeActionPerformed

    private void btn_viewTestTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewTestTypeActionPerformed
        view = new ViewForm();
        view.setTitle("Test Types");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Name");
        dt.addColumn("Price (Rs.)");
        TestTypeController.getTestTypes(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_TestTypes();
                    e.consume();
                }
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_TestTypes();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                TestTypeController.getTestTypes(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewTestTypeActionPerformed

    private void btn_viewTestReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewTestReportActionPerformed
        view = new ViewForm();
        view.setTitle("Test Results");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("RID");
        dt.addColumn("CID");
        dt.addColumn("Last updated");
        dt.addColumn("Test");
        dt.addColumn("Status");
        ResultController.getTests(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_Results();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                ResultController.getTests(view.getTable(), view.getTextField().getText());
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_Results();
                    e.consume();
                }
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewTestReportActionPerformed

    private void show_TestTypes() {
        int row = view.getTable().getSelectedRow();
        TestType tt = new TestType();
        TestTypeController ttc = new TestTypeController(tt);
        tt.setTestName((String) view.getTable().getValueAt(row, 0));
        ttc.setData();

        UpdateDialog upd = new UpdateDialog(null, true);
        upd.setLocationRelativeTo(view);
        upd.setTitle("Test data");
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.addForm(new Upd_TestType(ttc.getTestType()));
        upd.pack();
        upd.setVisible(true);

        view.getTable().setRowSelectionInterval(row, row);
    }

    private void show_Results() {
        int row = view.getTable().getSelectedRow();
        Test t = new Test();
        t.setResult_id((String) view.getTable().getValueAt(row, 0));
        TestController t_con = new TestController(t);
        t_con.getTestByResult();
        String name = t_con.getTest().getTest_name();
        AddScrollForm rlt_input = new AddScrollForm();
        rlt_input.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Incharge_Tasks r = new Lab_Incharge_Tasks();
            changeContent(rlt_input, r);
        });

        if (!t.getStatus() && name.equals(com.wecare.assets.custom_controls.model.TestType.CBC.name())) {
            rlt_input.setTitle("Complete bood count");
            CBC_Result rlt = new CBC_Result();
            rlt.setId(t.getResult_id());
            Frm_Add_CBC_Result rlt_cbc = new Frm_Add_CBC_Result(t, rlt);
            rlt_cbc.getBtn_cancel().addActionListener((ActionEvent ev) -> {
                changeContent(rlt_cbc, view);
            });
            changeContent(view, rlt_input);
            rlt_input.addForm(rlt_cbc);
        }
        view.getTable().setRowSelectionInterval(row, row);
    }

    private void show_Samples() {
        int row = view.getTable().getSelectedRow();
        Sample s = new Sample();
        SampleController sc = new SampleController(s);
        s.setId((String) view.getTable().getValueAt(row, 0));
        sc.setSampleData();

        UpdateDialog upd = new UpdateDialog(null, true);
        upd.setLocationRelativeTo(view);
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.setTitle("Sample data");
        upd.addForm(new Frm_SampleData(sc.getSample()));
        upd.setVisible(true);

        view.getTable().setRowSelectionInterval(row, row);
    }

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
        upd.addForm(new Upd_Customer(cc.getCustomer()));
        upd.setVisible(true);

        view.getTable().setRowSelectionInterval(row, row);
    }

    private AddScrollForm add;
    private ViewForm view;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addCustomer;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addSample;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addTestType;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewCustomer;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewSample;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewTestReport;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewTestType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnl_manageUser;
    private javax.swing.JPanel pnl_manage_customer2;
    private javax.swing.JPanel pnl_manage_results;
    private javax.swing.JPanel pnl_manage_tests;
    private javax.swing.JScrollPane scrollpane;
    // End of variables declaration//GEN-END:variables
}
