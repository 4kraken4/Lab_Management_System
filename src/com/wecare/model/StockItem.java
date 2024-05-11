package com.wecare.model;

public class StockItem {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQnt_min() {
        return qnt_min;
    }

    public void setQnt_min(int qnt_min) {
        this.qnt_min = qnt_min;
    }

    public int getQnt_remaining() {
        return qnt_remaining;
    }

    public void setQnt_remaining(int qnt_remaining) {
        this.qnt_remaining = qnt_remaining;
    }

    public int getQnt_purchase() {
        return qnt_purchase;
    }

    public void setQnt_purchase(int qnt_purchase) {
        this.qnt_purchase = qnt_purchase;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String id;
    private String supplier_id;
    private String type;
    private int qnt_min;
    private int qnt_remaining;
    private int qnt_purchase;
    private String description;
}
