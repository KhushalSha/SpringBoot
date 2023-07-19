package com.springbootfirstapplication.springboot;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.beans.factory.annotation.Value;

@Component("runner")
@ConfigurationProperties(prefix = "my.app")
public class Runner implements CommandLineRunner{

    private double code;
    private int id;
    private String name;
    private double version;

    @Override
    public String toString() {
        return "Runner [code=" + code + ", id=" + id + ", name=" + name + ", version=" + version + "]";
    }    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println();
    }

}


