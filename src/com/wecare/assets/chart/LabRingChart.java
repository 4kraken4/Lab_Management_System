package com.wecare.assets.chart;

import com.wecare.assets.charts.model.CustomRingPlot;
import java.awt.Color;
import java.awt.Font;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CenterTextMode;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;

public class LabRingChart extends javax.swing.JPanel {

    public LabRingChart() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
        initChartData();
        display();
    }

    private void display() {
        ChartPanel panel = new ChartPanel(createChart());
        panel.setPreferredSize(this.getPreferredSize());
        this.add(panel);
    }

    public void setchartUpdate() {
        this.removeAll();
        display();
        this.repaint();
        this.revalidate();
    }

    private JFreeChart createChart() {
        // Create ring plot
        CustomRingPlot plot = new CustomRingPlot(createDataset());
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(Locale.ENGLISH));
        plot.setInsets(new RectangleInsets(0.0, 0.0, 5.0, 5.0));
        plot.setSectionDepth(0.30);
        JFreeChart chart = new JFreeChart(chartTitle, JFreeChart.DEFAULT_TITLE_FONT, plot, showLegend);
        ChartFactory.getChartTheme().apply(chart);

        // Create the chart
//        plot.setBackgroundPaint(Color.WHITE);
        var trans = new Color(255, 255, 255, 0);
        plot.setBackgroundPaint(trans);
        chart.setBackgroundPaint(trans);

        chart.getLegend().setPosition(RectangleEdge.RIGHT);
        chart.getLegend().setItemFont(new java.awt.Font("Century Gothic", 0, 11));

        plot.setCenterTextMode(CenterTextMode.VALUE);
        plot.setCenterTextFont(plot.getCenterTextFont().deriveFont(Font.PLAIN, 20f));
        plot.setCenterTextColor(Color.decode("#1fa0c8"));
        plot.setCenterText(String.valueOf(pri));

        plot.setLabelGenerator(null);

        plot.setOutlineVisible(false);
        plot.setSectionOutlinesVisible(false);

        plot.setOuterSeparatorExtension(0);
        plot.setInnerSeparatorExtension(0);
        plot.setSeparatorsVisible(false);

        plot.setShadowPaint(null);
        plot.setShadowGenerator(null);

        // Set colors of the chart
        plot.setSectionPaint(plot.getDataset().getKey(0), color_primary);
        plot.setSectionPaint(plot.getDataset().getKey(1), color_secondary);
//        plot.setSectionPaint(plot.getDataset().getKey(2), color_total);

        plot.setExplodePercent(plot.getDataset().getKey(0), 0.05); // 0.05
        plot.setExplodePercent(plot.getDataset().getKey(1), 0.05); // 0.05

//        plot.setExplodePercent("NN", 0.05); // 0.05
        return chart;
    }

    private DefaultPieDataset createDataset() {
        String l1 = "Done";
        String l2 = "Pending";
//        String l3 = "Total";

        calculateData();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(l1, pri);
        dataset.setValue(l2, sec);
//        dataset.setValue(l3, bal);
        return dataset;
    }

    private void initChartData() {
        //  initial values
        showLegend = true;
        chartTitle = null;
        color_primary = new Color(31, 160, 200);
        color_secondary = new Color(248, 156, 36);
        color_total = new Color(148, 144, 132);
        pri = 100;
        sec = 50;
        tot = pri + sec;
    }

    public void calculateData() {
        pri = (pri * 100) / tot;
        sec = 100 - pri;
//        bal = 100 - (pri + sec);
    }

    public boolean isShowLegend() {
        return showLegend;
    }

    public void setChartShowLegend(boolean showLegend) {
        this.showLegend = showLegend;
    }

    public double getChartPrimary() {
        return pri;
    }

    public void setChartPrimary(int primary) {
        this.pri = primary;
    }

    public double getSecondary() {
        return sec;
    }

    public void setChartSecondary(int secondary) {
        this.sec = secondary;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public double getChartTotal() {
        return tot;
    }

    public void setChartTotale(int total) {
        this.tot = total;
    }

    public void setChartData(int primary, int secondary) {
        this.pri = primary;
        this.sec = secondary;
//        this.tot = total;
    }

    public String getChartTitle() {
        return chartTitle;
    }

    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    public Color getChart_Color_primary() {
        return color_primary;
    }

    public void setChart_Color_primary(Color color_primary) {
        this.color_primary = color_primary;
    }

    public Color getChart_Color_secondary() {
        return color_secondary;
    }

    public void setChart_Color_secondary(Color color_secondary) {
        this.color_secondary = color_secondary;
    }

    public Color getChart_Color_total() {
        return color_total;
    }

    public void setChart_Color_total(Color color_total) {
        this.color_total = color_total;
    }

    private double pri;
    private double sec;
    private double bal;
    private double tot;

    private boolean showLegend = false;
    private String chartTitle = null;
    private Color color_primary;
    private Color color_secondary;
    private Color color_total;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(300, 200));
        setPreferredSize(new java.awt.Dimension(300, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
