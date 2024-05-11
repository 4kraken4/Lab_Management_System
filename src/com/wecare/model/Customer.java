package com.wecare.model;

import java.sql.Date;

public class Customer {

    public String getId() {
        return cusId;
    }

    public void setId(String cusID) {
        this.cusId = cusID;
    }

    public String getFname() {
        return cusFname;
    }

    public void setFname(String cusFname) {
        this.cusFname = cusFname;
    }

    public String getLname() {
        return cusLname;
    }

    public void setLname(String cusLname) {
        this.cusLname = cusLname;
    }
    
    public Date getDOB() {
        return cusDOB;
    }

    public void setDOB(Date cusDOB) {
        this.cusDOB = cusDOB;
    }

    public int getAge() {
        return cusAge;
    }

    public void setAge(int cusAge) {
        this.cusAge = cusAge;
    }

    public String getGender() {
        return cusGender;
    }

    public void setGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getEmail() {
        return cusEmail;
    }

    public void setEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getPhone() {
        return cusPhone;
    }

    public void setPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCity() {
        return cusCity;
    }

    public void setCity(String cusCity) {
        this.cusCity = cusCity;
    }
    
    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    
    public Customer() {
        this.isNew = true;
    }
    
    private String cusId;
    private String cusFname;
    private String cusLname;
    private Date cusDOB;
    private int cusAge;
    private String cusGender;
    private String cusEmail;
    private String cusPhone;
    private String cusCity;
    private boolean isNew;
}
