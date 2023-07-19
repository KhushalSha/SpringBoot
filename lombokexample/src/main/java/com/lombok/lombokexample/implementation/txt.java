package com.lombok.lombokexample.implementation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.lombok.lombokexample.service;

import lombok.Data;

@Component
@Data
@Profile("default")
@ConfigurationProperties(prefix="code.model")
public class txt implements service {
    private String format;
    @Override
    public String sendMsg() {
        return format;
    }
}
