package com.wecare.assets.communication.model;

public class Email {

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getPassword() {
        return pass;
    }

    public String getSubject() {
        return sub;
    }

    public void setSubject(String sub) {
        this.sub = sub;
    }

    public String getMessage() {
        return msg;
    }
    
    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public String getFile() {
        return filename;
    }

    public void setFile(String filename) {
        this.filename = filename;
    }

    public void setMessageBody(String to, String sub, String msg) {
        this.to = to;
        this.sub = sub;
        this.msg = msg;
    }
    public void setMessageBody(String to, String sub, String msg, String filename) {
        this.to = to;
        this.sub = sub;
        this.msg = msg;
        this.filename = filename;
    }
    
    public Email() {
        this.from = "medicallaboratory99@gmail.com";
        this.pass = "medilabnibm";
        this.to = "";
        this.sub = "";
        this.msg = "";
        this.filename = "";
    }
    
    private final String from;
    private final String pass;
    private String to;
    private String sub;
    private String msg;
    private String filename;
}
