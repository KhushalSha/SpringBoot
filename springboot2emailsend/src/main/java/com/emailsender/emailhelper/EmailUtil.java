package com.emailsender.emailhelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailUtil {
    @Autowired
    private JavaMailSender sender;
   

    public void send(String to,String cc,String bcc,String subject,
    String txt, Resource file){
        
        
    }
}
