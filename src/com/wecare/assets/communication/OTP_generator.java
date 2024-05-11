package com.wecare.assets.communication;

import com.wecare.assets.communication.model.OTP;


public class OTP_generator {
    private final OTP respond;

    public OTP_generator(OTP _request) {
        this.respond = _request;
        this.respond.setOTP(this.generateOTP());
    }
    private String generateOTP() {
        int random_no = (int) ((Math.random()*9000)+1000);
        String otp = String.valueOf(random_no);
        return otp;
    }
    public OTP getRespond() {
        return this.respond;
    }
}
