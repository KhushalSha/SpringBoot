package com.example.demo;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component("map")
@ConfigurationProperties(prefix = "my.app")
public class MapRunner implements CommandLineRunner{
    
    private Map<String,Integer> edata;
    
    
    @Override
    public String toString() {
        return "MapRunner [edata=" + edata + "]";
    }


    public Map<String, Integer> getEdata() {
        return edata;
    }


    public void setEdata(Map<String, Integer> edata) {
        this.edata = edata;
    }


    @Override
    public void run(String... args) throws Exception {
        
    }
    
}
