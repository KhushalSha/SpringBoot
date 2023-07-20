package com.emailsender.springboot2emailsend.messagehelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.emailsender.springboot2emailsend.emailhelper.EmailUtil;

@Component
public class MimeMessageHelper implements CommandLineRunner {

    @Autowired
    private EmailUtil emailUtil;

    @Override
    public void run(String... args) throws Exception {
        
        boolean foo = emailUtil.send("kushalshambu@gmail.com", null, null, "hello", "world");
        if(foo){System.out.println("Success");}else{System.out.println("gone");}
    }
}
