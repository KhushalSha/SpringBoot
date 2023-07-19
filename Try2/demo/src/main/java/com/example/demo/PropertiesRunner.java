package com.example.demo;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "app")
public class PropertiesRunner implements CommandLineRunner {
    private Properties pdata;
    
    @Override
    public String toString() {
        return "PropertiesRunner [pdata=" + pdata + "]";
    }

    public Properties getPdata() {
        return pdata;
    }

    public void setPdata(Properties pdata) {
        this.pdata = pdata;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(pdata);
    }
}
