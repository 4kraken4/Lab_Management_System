package com.wecare.assets.chart;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class LabLineChart extends javax.swing.JPanel {

    public LabLineChart() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
        initChart();
        display();
    }

    public final void display() {
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
        chartTitle = "";
        this.dataset = createDataset();
        JFreeChart chart = ChartFactory.createXYLineChart(
                chartTitle,
                axisX,
                axisY,
                dataset,
                PlotOrientation.VERTICAL,
                false, false, false
        );

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, seriesColor);
        renderer.setSeriesStroke(0, new BasicStroke(1.5f));
        plot.setRenderer(renderer);
        plot.setRangeGridlinesVisible(false);

        var trans = new Color(255, 255, 255, 0);
        plot.setBackgroundPaint(trans);
        chart.setBackgroundPaint(trans);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.GRAY);

        plot.setOutlineVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.setRangeGridlinesVisible(false);

        chart.setTitle(new TextTitle("",
                new Font("Serif", java.awt.Font.BOLD, 18))
        );
        return chart;
    }

    private XYDataset createDataset() {
        XYSeries series = new XYSeries(seriesName);
        data.forEach(
                (x, y) -> {
                    series.add((int) x, y);
                }
        );
        XYSeriesCollection d = new XYSeriesCollection();
        d.addSeries(series);

        return d;
    }

    public String getChartTitle() {
        return chartTitle;
    }

    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    public HashMap<Integer, Double> getChartData() {
        return data;
    }

    public void setChartData(HashMap<Integer, Double> data) {
        this.data = data;
        this.dataset = createDataset();
        setchartUpdate();
    }

    public String getChartSeriesName() {
        return seriesName;
    }

    public void setChartSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getChartAxisX() {
        return axisX;
    }

    public void setChartAxisX(String axisX) {
        this.axisX = axisX;
    }

    public String getChartAxisY() {
        return axisY;
    }

    public void setChartAxisY(String axisY) {
        this.axisY = axisY;
    }

    public Color getChartSeriesColor() {
        return seriesColor;
    }

    public void setChartSeriesColor(Color seriesColor) {
        this.seriesColor = seriesColor;
    }

    private void initChart() {
        chartTitle = "";
        seriesName = "";
        axisX = "Dates";
        axisY = "Income(Rs.)";
        seriesColor = Color.decode("#1fa0c8");
        data = new HashMap<Integer, Double>() {
            {
                put(15, 525D);  // x,y coordinates
                put(20, 282D);
                put(25, 745D);
                put(30, 796D);
                put(35, 931D);
                put(40, 1024D);
            }
        };
    }

    private XYDataset dataset;
    private HashMap<Integer, Double> data;
    private String chartTitle;
    private String seriesName;
    private String axisX;
    private String axisY;
    private Color seriesColor;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(300, 200));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(300, 200));
        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
