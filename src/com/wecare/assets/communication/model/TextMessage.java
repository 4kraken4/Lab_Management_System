package com.wecare.assets.communication.model;

public class TextMessage {

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getMsg() {
        return msg;
    }
    
    public TextMessage() {
        this.to = "";
        this.from = "+17692105846";
        this.msg = "";
    }

    public TextMessage(String to, String msg) {
        this.to = to;
        this.from = "+17692105846";
        this.msg = msg;
    }
    
    public TextMessage(String to, String from, String msg) {
        this.to = to;
        this.from = from;
        this.msg = msg;
    }
    
    private String to;
    private String from;
    private String msg;
}
