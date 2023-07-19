package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("con")
public class DbConn {
    private String dbname;
    private Integer dbid;

    @Override
    public String toString() {
        return "[dbname=" + dbname + ", dbid=" + dbid + "]";
    }
    public String getDbname() {
        return dbname;
    }
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    public Integer getDbid() {
        return dbid;
    }
    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }
}
