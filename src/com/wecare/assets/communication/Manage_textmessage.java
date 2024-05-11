package com.wecare.assets.communication;

import com.wecare.assets.communication.model.OTP;
import com.wecare.assets.communication.model.TextMessage;
import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Manage_textmessage {
    private final String ACCOUNT_SID;
    private final String AUTH_TOKEN;
    private final TextMessage message;
    public Manage_textmessage(TextMessage message) {
        ACCOUNT_SID = "ACe77a3b24145a38328cc0ff6f12aece37";
        AUTH_TOKEN = "3529df07c3f0dcf30f5b69f3e349edc1";
        this.message = message;
    }
    
    public void send_OTP(OTP otp) throws ApiException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(message.getTo()),
                new PhoneNumber(message.getFrom()),
                """
                Your one time password for recovery of laboratory system account.
                """ + otp.getOTP() + "." + 
                "\nPlease do not reply back."
        ).create();
        System.out.println("Message sent successfully!");
    }
}
