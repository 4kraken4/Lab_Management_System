package com.wecare.model;

import com.wecare.assets.utilities.WorkStatus;

public class User {

    public String getUsrID() {
        return usrID;
    }

    public void setUsrID(String usrID) {
        this.usrID = usrID;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrUsername() {
        return usrUsername;
    }

    public void setUsrUsername(String usrUsername) {
        this.usrUsername = usrUsername;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrPhone() {
        return usrPhone;
    }

    public void setUsrPhone(String usrPhone) {
        this.usrPhone = usrPhone;
    }

    public String getUsrWorkrole() {
        return usrWorkrole;
    }

    public void setUsrWorkrole(String usrWorkrole) {
        this.usrWorkrole = usrWorkrole;
    }
    
    public WorkStatus getUsrState() {
        return usrState;
    }

    public void setUsrState(WorkStatus usrState) {
        this.usrState = usrState;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }
    
    private String usrID;
    protected String labID;
    private String usrEmail;
    private String usrUsername;
    private String usrPassword;
    private String usrPhone;
    protected String usrWorkrole;
    private WorkStatus usrState;

}
