package com.lombok.lombokexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class ConsExample implements CommandLineRunner{
    
    @NonNull
    private String name;
    
    
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hi");
    }
    
}
