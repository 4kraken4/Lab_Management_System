package com.wecare.assets.menu_options;

import com.wecare.assets.chart.LabLineChart;
import com.wecare.assets.chart.LabRingChart;
import com.wecare.assets.utilities.InternetConnection;
import com.wecare.assets.custom_controls.model.Model_Card;
import com.wecare.assets.db.Database;
import com.wecare.controller.InvoiceController;
import com.wecare.controller.TestController;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class Home extends javax.swing.JPanel {

    public Home() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        initCards();
        hdr_title.setTitle("Home");
        this.test_status = new HashMap<Integer, Integer>();
        initializeTestChartData();
        initializeIncomeChartData();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g;
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#232526"), getWidth(), getHeight(), Color.decode("#414345"));
        gd.setPaint(gp);
        gd.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(gd);
    }

    private void initCards() {
        // Database status
        Model_Card statusModel_database = new Model_Card(new ImageIcon(getClass().
                getResource("/com/wecare/assets/image/icon/database.png")), "Database");
        btn_database.setData(statusModel_database);

        // Internet status
        Model_Card statusModel_internet = new Model_Card(new ImageIcon(getClass().
                getResource("/com/wecare/assets/image/icon/internet.png")), "Internet");
        btn_network.setData(statusModel_internet);

        // Revenue chart
        Model_Card chartModel_revenue = new Model_Card();
        chartModel_revenue.setTitle("T e s t s");
        test_chart = new LabRingChart();
        chartModel_revenue.setChart(test_chart);

        // Test chart
        Model_Card chartModel_test = new Model_Card();
        chartModel_test.setTitle("R e v e n u e");
        rev_chart = new LabLineChart();
        chartModel_test.setChart(rev_chart);

        btn_tests.setData(chartModel_revenue);
        btn_revenue.setData(chartModel_test);
    }

    public void getNetworkStatus() {
        if (InternetConnection.check()) {
            btn_network.setStatusColor(Color.decode("#1A72DE"));
            btn_network.setStatus("Connected.");
        } else {
            btn_network.setStatusColor(Color.decode("#ee2828"));
            btn_network.setStatus("Disconnected.");
        }
    }

    public void getTestChartData() {
        this.test_status = TestController.getMonthlyTestStatus();
    }

    public void getServerStatus() {
        try {
            if (!Database.getConnectionTo_SystemDB().isClosed()) {
                btn_database.setStatusColor(Color.decode("#1A72DE"));
                btn_database.setStatus("Connected.");
            } else {
                btn_database.setStatusColor(Color.decode("#ee2828"));
                btn_database.setStatus("Disconnected.");
            }
        } catch (SQLException ex) {
            btn_database.setStatusColor(Color.decode("#ee2828"));
            btn_database.setStatus("Disconnected.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_database = new com.wecare.assets.custom_controls.component.Card_DashSmall();
        btn_network = new com.wecare.assets.custom_controls.component.Card_DashSmall();
        btn_tests = new com.wecare.assets.custom_controls.component.Card_DashBig();
        btn_revenue = new com.wecare.assets.custom_controls.component.Card_DashBig();
        hdr_title = new com.wecare.assets.custom_controls.component.DashBoardTitleHeader();

        btn_database.setStatusColor(null);

        btn_tests.setColor1(new java.awt.Color(31, 160, 200));
        btn_tests.setDoubleBuffered(false);
        btn_tests.setEffectColor(new java.awt.Color(97, 197, 246));
        btn_tests.setPreferredSize(new java.awt.Dimension(420, 293));
        btn_tests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_testsMouseClicked(evt);
            }
        });

        btn_revenue.setColor1(new java.awt.Color(255, 255, 255));
        btn_revenue.setColor2(new java.awt.Color(31, 160, 200));
        btn_revenue.setDoubleBuffered(false);
        btn_revenue.setEffectColor(new java.awt.Color(97, 197, 246));
        btn_revenue.setPreferredSize(new java.awt.Dimension(420, 293));
        btn_revenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_revenueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_database, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_network, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_revenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(hdr_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hdr_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_tests, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_revenue, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_database, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_network, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_testsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_testsMouseClicked
        initializeTestChartData();
        evt.consume();
    }//GEN-LAST:event_btn_testsMouseClicked

    private void btn_revenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_revenueMouseClicked
        initializeIncomeChartData();
        evt.consume();
    }//GEN-LAST:event_btn_revenueMouseClicked

    private void initializeIncomeChartData() {
        HashMap m = (HashMap) InvoiceController.getMonthlyIncome();
        this.rev_chart.setChartData(m);
    }

    private void initializeTestChartData() {
        int pending = 0;
        int done = 0;
        this.test_status = (HashMap<Integer, Integer>)TestController.getMonthlyTestStatus();
        if (!this.test_status.isEmpty()) {
            for (Object object : test_status.keySet()) {
                if ((int)object == 0)
                    pending = (int) test_status.get(0);
                else
                    done = (int) test_status.get(1);
            }
        }
        test_chart.setChartData(done, (done + pending));
        test_chart.setchartUpdate();
    }

    private LabRingChart test_chart;
    private LabLineChart rev_chart;
    private Map test_status;
//    private List<Integer> test_pending;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.component.Card_DashSmall btn_database;
    private com.wecare.assets.custom_controls.component.Card_DashSmall btn_network;
    private com.wecare.assets.custom_controls.component.Card_DashBig btn_revenue;
    private com.wecare.assets.custom_controls.component.Card_DashBig btn_tests;
    private com.wecare.assets.custom_controls.component.DashBoardTitleHeader hdr_title;
    // End of variables declaration//GEN-END:variables
}
