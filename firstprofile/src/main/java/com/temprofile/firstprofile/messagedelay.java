package com.temprofile.firstprofile;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class messagedelay {
    
    @Scheduled(cron = "0 * * * * * ")
    public void sendMsg(){
        System.out.println("hey" + new Date());
    }
}
