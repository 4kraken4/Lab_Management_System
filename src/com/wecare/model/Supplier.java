package com.wecare.model;

public class Supplier {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    public String getAddr_bno() {
        return addr_bno;
    }

    public void setAddr_bno(String addr_bno) {
        this.addr_bno = addr_bno;
    }

    public String getAddr_street() {
        return addr_street;
    }

    public void setAddr_street(String addr_street) {
        this.addr_street = addr_street;
    }

    public String getAddr_town() {
        return addr_town;
    }

    public void setAddr_town(String addr_town) {
        this.addr_town = addr_town;
    }

    public String getAddr_district() {
        return addr_district;
    }

    public void setAddr_district(String addr_district) {
        this.addr_district = addr_district;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    private String id;
    private String name;
    private String phone;
    private String email;
    private boolean status;
    private String stock_id;
    private String addr_bno;
    private String addr_street;
    private String addr_town;
    private String addr_district;
}
