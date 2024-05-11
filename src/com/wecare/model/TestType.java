package com.wecare.model;

public class TestType {

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSample_type() {
        return sample_type;
    }

    public void setSample_type(String sample_type) {
        this.sample_type = sample_type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String testName;
    private String description;
    private String sample_type;
    private Double price;

}
