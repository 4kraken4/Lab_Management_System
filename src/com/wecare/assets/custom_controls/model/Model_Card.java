package com.wecare.assets.custom_controls.model;

import javax.swing.Icon;
import javax.swing.JPanel;

public class Model_Card {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    public Model_Card() {
    }

    public JPanel getChart() {
        return chart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Model_Card(Icon icon, String title, String values, String description) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.description = description;
    }

    public Model_Card(Icon icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public Model_Card(String title) {
        this.title = title;
    }

    public void setChart(JPanel chart) {
        this.chart = chart;
    }
    
    private Icon icon;
    private JPanel chart;
    private String title;
    private String values;
    private String description;
}
