package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("myrun")
@ConfigurationProperties(prefix = "dbcon")
public class MyRunner {
    private String foo;
    
    private DbConn con;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public DbConn getCon() {
        return con;
    }

    public void setCon(DbConn con) {
        this.con = con;
    }

    @Override
    public String toString() {
        return "MyRunner [foo=" + foo + ", con=" + con + "]";
    }
}
