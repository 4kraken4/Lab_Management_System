package com.wecare.model;

import java.sql.Date;

public class Sample {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getLab_colleted() {
        return lab_colleted;
    }

    public void setLab_colleted(String lab_colleted) {
        this.lab_colleted = lab_colleted;
    }

    public String getLab_tested() {
        return lab_tested;
    }

    public void setLab_tested(String lab_tested) {
        this.lab_tested = lab_tested;
    }
    
    public boolean is_collected() {
        return is_collected;
    }

    public void setcollected(boolean is_collected) {
        this.is_collected = is_collected;
    }
    
    private String id;
    private String customer_id;
    private String user_id;
    private String lab_colleted;
    private String lab_tested;
    private String type;
    private Date date;
    private boolean is_collected;
}
