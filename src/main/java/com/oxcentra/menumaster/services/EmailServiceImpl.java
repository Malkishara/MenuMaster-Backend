package com.oxcentra.menumaster.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private JavaMailSender mailSender;

    public Boolean sendEmail(String toEmail,
                             String body,
                             String subject) {
        log.info(toEmail);
        try{
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("spring.email.from@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        log.info("Mail Send...");
        return true;
        } catch (Exception e) {
            log.error("Failed to send email: " + e.getMessage(), e);
            return false;
        }
    }

}
