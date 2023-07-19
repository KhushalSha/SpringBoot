package com.springbootfirstapplication.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    public Temp msg(){
        Temp foo1 = new Temp();
        foo1.setTemp1("hi");
        foo1.setTemp2("hi");
        return foo1;

    }
}
