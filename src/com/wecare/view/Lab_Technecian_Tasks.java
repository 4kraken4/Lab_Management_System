package com.wecare.view;

import com.wecare.view.*;
import com.wecare.assets.custom_controls.component.AddScrollForm;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.component.ViewForm;
import com.wecare.assets.custom_controls.model.Model_Card;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.ResultController;
import com.wecare.controller.SampleController;
import com.wecare.controller.TestController;
import com.wecare.controller.TestTypeController;
import com.wecare.model.CBC_Result;
import com.wecare.model.Sample;
import com.wecare.model.Test;
import com.wecare.model.TestType;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Lab_Technecian_Tasks extends javax.swing.JPanel {

    public Lab_Technecian_Tasks() {
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

        pnl_manage_samples = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_addSample = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewSample = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manage_tests = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_addTestType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewTestType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manage_results = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_viewTestReport = new com.wecare.assets.custom_controls.model.CustomCardButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(3, 0));

        pnl_manage_samples.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sample");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_samples.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout2.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout2);

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
        jPanel7.add(btn_addSample);

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
        jPanel7.add(btn_viewSample);

        pnl_manage_samples.add(jPanel7, java.awt.BorderLayout.CENTER);

        add(pnl_manage_samples);

        pnl_manage_tests.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_tests.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout1.setAlignOnBaseline(true);
        jPanel8.setLayout(flowLayout1);

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
        jPanel8.add(btn_addTestType);

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
        jPanel8.add(btn_viewTestType);

        pnl_manage_tests.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(pnl_manage_tests);

        pnl_manage_results.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Test Results");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manage_results.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout3.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout3);

        btn_viewTestReport.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewTestReport.setText("View reports");
        btn_viewTestReport.setColor_bottom(new java.awt.Color(34, 121, 101));
        btn_viewTestReport.setColor_top(new java.awt.Color(51, 255, 221));
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
        jPanel4.add(btn_viewTestReport);

        pnl_manage_results.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(pnl_manage_results);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSampleActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add new sample");
        Frm_AddSample addSample = new Frm_AddSample();
        addSample.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Lab_Technecian_Tasks lt = new Lab_Technecian_Tasks();
            changeContent(add, lt);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
            Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
            Lab_Technecian_Tasks tec = new Lab_Technecian_Tasks();
            changeContent(add, tec);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
            Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
            Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.setTitle("Testdata");
        upd.addForm(new Frm_TestTypeData(ttc.getTestType()));
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
        Sample s = new Sample();
        s.setId(t.getSample_id());
        SampleController s_con = new SampleController(s);
        s_con.setSampleData();
        if (s_con.getSample().is_collected()) {
            String name = t_con.getTest().getTest_name();
            AddScrollForm rlt_input = new AddScrollForm();
            rlt_input.getBtn_back().addActionListener((ActionEvent e) -> {
                Lab_Technecian_Tasks r = new Lab_Technecian_Tasks();
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
        } else {
            JOptionPane.showMessageDialog(null,
                    "Samples related to selected test are not collected yet.",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        }
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

    private AddScrollForm add;
    private ViewForm view;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addSample;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addTestType;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewSample;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewTestReport;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewTestType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnl_manage_results;
    private javax.swing.JPanel pnl_manage_samples;
    private javax.swing.JPanel pnl_manage_tests;
    // End of variables declaration//GEN-END:variables
}
