package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class Runner implements CommandLineRunner{

    private String name;
    private int id;
    private List<String> colors;

   

    @Override
    public String toString() {
        return "Runner [name=" + name + ", id=" + id + ", colors=" + colors + "]";
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        
    }
    
}
