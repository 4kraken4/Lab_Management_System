package com.wecare.view;

import com.wecare.assets.custom_controls.component.AddScrollForm;
import com.wecare.assets.custom_controls.model.CustomScrollBar;
import com.wecare.assets.custom_controls.component.UpdateDialog;
import com.wecare.assets.custom_controls.component.ViewForm;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.ReportController;
import com.wecare.controller.StockItemController;
import com.wecare.controller.SupplierController;
import com.wecare.model.StockItem;
import com.wecare.model.Supplier;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Stock_Manager_Tasks extends javax.swing.JPanel {

    public Stock_Manager_Tasks() {
        initComponents();
        initScrollBar();
    }

    private void changeContent(Component parent, JPanel panel) {
        if (Service.catchComponent(parent, "main_container") instanceof JPanel pnl) {
            pnl.removeAll();
            pnl.add(panel);
            pnl.repaint();
            pnl.revalidate();
        }
    }

    private void initScrollBar() {
        scrollpane.setVerticalScrollBar(new CustomScrollBar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        pnl_manageTransacction = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_addStock = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewLog = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manageSupplier = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_addSupplier = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewSupplier = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_manageStock = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btn_addStockItemType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_viewStockItemType = new com.wecare.assets.custom_controls.model.CustomCardButton();
        pnl_IncomeReports = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btn_showMonthlyIncomeReport = new com.wecare.assets.custom_controls.model.CustomCardButton();
        btn_showStockAvailability = new com.wecare.assets.custom_controls.model.CustomCardButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        scrollpane.setBorder(null);
        scrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        pnl_manageTransacction.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logger");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1025, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageTransacction.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(450, 160));
        jPanel7.setPreferredSize(new java.awt.Dimension(650, 250));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout1.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout1);

        btn_addStock.setForeground(new java.awt.Color(51, 51, 51));
        btn_addStock.setText("Send/Receive items");
        btn_addStock.setColor_bottom(new java.awt.Color(24, 96, 158));
        btn_addStock.setColor_top(new java.awt.Color(36, 198, 246));
        btn_addStock.setEffectColor(new java.awt.Color(172, 229, 246));
        btn_addStock.setFocusPainted(false);
        btn_addStock.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addStock.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addStock.setRoundness(30);
        btn_addStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStockActionPerformed(evt);
            }
        });
        jPanel7.add(btn_addStock);

        btn_viewLog.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewLog.setText("View log");
        btn_viewLog.setColor_bottom(new java.awt.Color(24, 96, 158));
        btn_viewLog.setColor_top(new java.awt.Color(36, 198, 246));
        btn_viewLog.setEffectColor(new java.awt.Color(172, 229, 246));
        btn_viewLog.setFocusPainted(false);
        btn_viewLog.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewLog.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewLog.setRoundness(30);
        btn_viewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewLogActionPerformed(evt);
            }
        });
        jPanel7.add(btn_viewLog);

        pnl_manageTransacction.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnl_manageTransacction);

        pnl_manageSupplier.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(1017, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageSupplier.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(650, 250));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout2.setAlignOnBaseline(true);
        jPanel8.setLayout(flowLayout2);

        btn_addSupplier.setForeground(new java.awt.Color(51, 51, 51));
        btn_addSupplier.setText("Add supplier");
        btn_addSupplier.setColor_bottom(new java.awt.Color(27, 173, 135));
        btn_addSupplier.setColor_top(new java.awt.Color(87, 233, 136));
        btn_addSupplier.setEffectColor(new java.awt.Color(165, 233, 188));
        btn_addSupplier.setFocusPainted(false);
        btn_addSupplier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addSupplier.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addSupplier.setRoundness(30);
        btn_addSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSupplierActionPerformed(evt);
            }
        });
        jPanel8.add(btn_addSupplier);

        btn_viewSupplier.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewSupplier.setText("View suppliers");
        btn_viewSupplier.setColor_bottom(new java.awt.Color(87, 233, 136));
        btn_viewSupplier.setColor_top(new java.awt.Color(27, 173, 135));
        btn_viewSupplier.setEffectColor(new java.awt.Color(165, 233, 188));
        btn_viewSupplier.setFocusPainted(false);
        btn_viewSupplier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewSupplier.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewSupplier.setRoundness(30);
        btn_viewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewSupplierActionPerformed(evt);
            }
        });
        jPanel8.add(btn_viewSupplier);

        pnl_manageSupplier.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnl_manageSupplier);

        pnl_manageStock.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stock");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(1034, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_manageStock.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel9.setPreferredSize(new java.awt.Dimension(650, 250));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout3.setAlignOnBaseline(true);
        jPanel9.setLayout(flowLayout3);

        btn_addStockItemType.setForeground(new java.awt.Color(51, 51, 51));
        btn_addStockItemType.setText("Add stock types");
        btn_addStockItemType.setColor_bottom(new java.awt.Color(228, 120, 0));
        btn_addStockItemType.setColor_top(new java.awt.Color(255, 185, 109));
        btn_addStockItemType.setEffectColor(new java.awt.Color(255, 218, 178));
        btn_addStockItemType.setFocusPainted(false);
        btn_addStockItemType.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_addStockItemType.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_addStockItemType.setRoundness(30);
        btn_addStockItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStockItemTypeActionPerformed(evt);
            }
        });
        jPanel9.add(btn_addStockItemType);

        btn_viewStockItemType.setForeground(new java.awt.Color(51, 51, 51));
        btn_viewStockItemType.setText("View stocks");
        btn_viewStockItemType.setColor_bottom(new java.awt.Color(255, 185, 109));
        btn_viewStockItemType.setColor_top(new java.awt.Color(228, 120, 0));
        btn_viewStockItemType.setEffectColor(new java.awt.Color(255, 218, 178));
        btn_viewStockItemType.setFocusPainted(false);
        btn_viewStockItemType.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_viewStockItemType.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_viewStockItemType.setRoundness(30);
        btn_viewStockItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewStockItemTypeActionPerformed(evt);
            }
        });
        jPanel9.add(btn_viewStockItemType);

        pnl_manageStock.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnl_manageStock);

        pnl_IncomeReports.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reports");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(1022, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_IncomeReports.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(200, 100));
        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 50);
        flowLayout4.setAlignOnBaseline(true);
        jPanel10.setLayout(flowLayout4);

        btn_showMonthlyIncomeReport.setForeground(new java.awt.Color(51, 51, 51));
        btn_showMonthlyIncomeReport.setText("Income");
        btn_showMonthlyIncomeReport.setColor_bottom(new java.awt.Color(255, 0, 102));
        btn_showMonthlyIncomeReport.setColor_top(new java.awt.Color(255, 102, 153));
        btn_showMonthlyIncomeReport.setEffectColor(new java.awt.Color(249, 174, 199));
        btn_showMonthlyIncomeReport.setFocusPainted(false);
        btn_showMonthlyIncomeReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_showMonthlyIncomeReport.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_showMonthlyIncomeReport.setRoundness(30);
        btn_showMonthlyIncomeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showMonthlyIncomeReportActionPerformed(evt);
            }
        });
        jPanel10.add(btn_showMonthlyIncomeReport);

        btn_showStockAvailability.setForeground(new java.awt.Color(51, 51, 51));
        btn_showStockAvailability.setText("Stock avalability");
        btn_showStockAvailability.setColor_bottom(new java.awt.Color(255, 102, 153));
        btn_showStockAvailability.setColor_top(new java.awt.Color(255, 0, 102));
        btn_showStockAvailability.setEffectColor(new java.awt.Color(249, 174, 199));
        btn_showStockAvailability.setFocusPainted(false);
        btn_showStockAvailability.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_showStockAvailability.setPreferredSize(new java.awt.Dimension(250, 150));
        btn_showStockAvailability.setRoundness(30);
        btn_showStockAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showStockAvailabilityActionPerformed(evt);
            }
        });
        jPanel10.add(btn_showStockAvailability);

        pnl_IncomeReports.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnl_IncomeReports);

        scrollpane.setViewportView(jPanel4);

        add(scrollpane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStockActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add Stock");

        Frm_AddStockTransaction add_log_data = new Frm_AddStockTransaction();
        add_log_data.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.addForm(add_log_data);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addStockActionPerformed

    private void btn_viewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewLogActionPerformed
        view = new ViewForm();
        view.setTitle("Transaction Log");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Log id");
        dt.addColumn("Date");
        dt.addColumn("Stock Item");
        dt.addColumn("Qnt.");
        dt.addColumn("Qnt. in hand");
        dt.addColumn("Lab Id/Supplier Id");
        SupplierController.getTransactionData(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(view, r);
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                SupplierController.getTransactionData(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewLogActionPerformed

    private void btn_addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSupplierActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add Supplier");

        Frm_AddSupplier addSupplier = new Frm_AddSupplier();
        addSupplier.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.addForm(addSupplier);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addSupplierActionPerformed

    private void btn_viewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewSupplierActionPerformed
        view = new ViewForm();
        view.setTitle("Suppliers");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Id");
        dt.addColumn("Name");
        dt.addColumn("Phone");
        dt.addColumn("Email");
        dt.addColumn("Address");
        SupplierController.getSuppliers(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_suppliers();
                    e.consume();
                }
            }
        });
        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_suppliers();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                SupplierController.getSuppliers(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewSupplierActionPerformed

    private void btn_addStockItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStockItemTypeActionPerformed
        add = new AddScrollForm();
        add.setTitle("Add Stock Type");

        Frm_AddStockItemType addItemType = new Frm_AddStockItemType();
        addItemType.getBtn_cancel().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(add, r);
        });

        add.addForm(addItemType);
        changeContent(this, add);
    }//GEN-LAST:event_btn_addStockItemTypeActionPerformed

    private void btn_viewStockItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewStockItemTypeActionPerformed
        view = new ViewForm();
        view.setTitle("Equipments");

        DefaultTableModel dt = (DefaultTableModel) view.getTable().getModel();
        dt.addColumn("Item id");
        dt.addColumn("Name");
        dt.addColumn("Min level");
        dt.addColumn("Remaining Qnt");
        dt.addColumn("Status");
        StockItemController.getStockItems(view.getTable(), "");

        view.getBtn_back().addActionListener((ActionEvent e) -> {
            Stock_Manager_Tasks r = new Stock_Manager_Tasks();
            changeContent(view, r);
        });

        view.getTable().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isConsumed()) {
                    show_stockItems();
                    e.consume();
                }
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1 && !e.isConsumed()) {
                    show_stockItems();
                    e.consume();
                }
            }
        });

        view.getTextField().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                StockItemController.getStockItems(view.getTable(), view.getTextField().getText());
            }
        });
        changeContent(this, view);
    }//GEN-LAST:event_btn_viewStockItemTypeActionPerformed

    private void btn_showMonthlyIncomeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showMonthlyIncomeReportActionPerformed
        ReportController.generate_Monthly_Income_Report();
    }//GEN-LAST:event_btn_showMonthlyIncomeReportActionPerformed

    private void btn_showStockAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showStockAvailabilityActionPerformed
        ReportController.generate_Stock_Availability_Report();
    }//GEN-LAST:event_btn_showStockAvailabilityActionPerformed

    private void show_suppliers() {
        int row = view.getTable().getSelectedRow();
        Supplier sup = new Supplier();
        sup.setId((String) view.getTable().getValueAt(row, 0));
        SupplierController sup_con = new SupplierController(sup);
        sup_con.getSupplierById();

        UpdateDialog upd = new UpdateDialog(null, true);
        upd.setLocationRelativeTo(view);
        upd.setTitle("Supplier data");
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.addForm(new Upd_Supplier(sup_con.getSupplier()));
        upd.pack();
        upd.setVisible(true);

        view.getTable().setRowSelectionInterval(row, row);
    }

    private void show_stockItems() {
        int row = view.getTable().getSelectedRow();
        StockItem st = new StockItem();
        st.setId((String) view.getTable().getValueAt(row, 0));
        StockItemController st_con = new StockItemController(st);
        st_con.getItemDataById();

        UpdateDialog upd = new UpdateDialog(null, true);
        upd.setLocationRelativeTo(view);
        upd.setTitle("Stock item data");
        upd.getBtn_Back().addActionListener((ActionEvent e) -> {
            upd.dispose();
        });
        upd.addForm(new Upd_StockItem(st_con.getItem()));
        upd.pack();
        upd.setVisible(true);

        view.getTable().setRowSelectionInterval(row, row);
    }

    private AddScrollForm add;
    private ViewForm view;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addStock;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addStockItemType;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_addSupplier;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_showMonthlyIncomeReport;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_showStockAvailability;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewLog;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewStockItemType;
    private com.wecare.assets.custom_controls.model.CustomCardButton btn_viewSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnl_IncomeReports;
    private javax.swing.JPanel pnl_manageStock;
    private javax.swing.JPanel pnl_manageSupplier;
    private javax.swing.JPanel pnl_manageTransacction;
    private javax.swing.JScrollPane scrollpane;
    // End of variables declaration//GEN-END:variables
}
