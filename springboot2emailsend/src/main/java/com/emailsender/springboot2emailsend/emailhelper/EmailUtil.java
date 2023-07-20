package com.emailsender.springboot2emailsend.emailhelper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtil {
    @Autowired
    private JavaMailSender sender;
   

    public boolean send(String to,String cc,String bcc,String subject,
    String txt) throws MessagingException{
        boolean flag = true;

        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try{
            helper.setTo("kushalshambu@gmail.com");

            if(cc!=null)helper.setCc(cc);

            if(bcc!=null)helper.setBcc(bcc);
            helper.setSubject(subject);
            helper.setText(txt);
        }catch(Exception e){
            flag = false;
            e.printStackTrace();
        }
        return flag;
        
    }
}
