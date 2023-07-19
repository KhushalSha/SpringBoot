package com.springbootfirstapplication.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("getmsg")
public class getMessage {
    
    @Value("${name}")
    private String msg;

    @Value("${id}")
    private int ss;
    
    @Autowired
    private Data empid;

    @Override
    public String toString() {
        
        return "message is " + msg + empid;
    }
   
}
