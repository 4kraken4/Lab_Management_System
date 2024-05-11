package com.wecare.assets.communication;
import com.sun.mail.util.MailConnectException;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.*;
import java.util.Properties;

import com.wecare.assets.communication.model.Email;
import com.wecare.assets.communication.model.OTP;

public class Manage_email {

    public Manage_email(Email email) {
        this.email = email;
    }
    public int send() {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.debug", "false");       // turning on debug mode
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        // creating a session and checks credentials
        try {
            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email.getFrom(), email.getPassword());
                }
            }); session.setDebug(false);     // turning on debug mode
            try (Transport transport = session.getTransport()) {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getTo()));
                message.setSubject(email.getSubject());
                // text part
                BodyPart txtPart = new MimeBodyPart();
                txtPart.setText(email.getMessage());
                // file part
                BodyPart filePart = new MimeBodyPart();
                DataSource source = new FileDataSource(email.getFile());
                filePart.setDataHandler(new DataHandler(source));
                filePart.setFileName(email.getFile());
                // combining both parts
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(txtPart);
                // only if there is a file, below code will get considered
                if (!filePart.getFileName().isEmpty())
                    multipart.addBodyPart(filePart);
                // composing the message
                message.setContent(multipart);
                // sending...
                transport.connect();
                Transport.send(message);
            }
            return 1;
        } catch (AuthenticationFailedException e) {
            System.err.println("Password or username does not match.");
        } catch (MailConnectException e) {
            System.err.println("Connection is not established. Check your connection.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public void send_OTP(OTP otp) {
        this.email.setSubject("Verification code");
        this.email.setMessage("""
                              Your one time password for recovery of laboratory system account.
                              """ + otp.getOTP() + "." + 
                "\nPlease do not reply back."+
                "\nThank you.");
        this.send();
    }
    
    private final Email email;
}
