package com.newsdot.newsdot.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

import com.newsdot.newsdot.service.MailService;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void mainSender(String content, String emial ,String subject) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            mimeMessage.setSubject(subject);
            mimeMessage.setContent(content,"text/html");
            mimeMessage.setFrom(new InternetAddress(emial));
            mimeMessage.addRecipient(Message.RecipientType.TO,
                    new InternetAddress("sangeethkasun12345@gmail.com"));
            System.out.printf("mail send", mimeMessage);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    
}
