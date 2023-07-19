package com.lombok.lombokexample.implementation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.lombok.lombokexample.service;

import lombok.Data;


@Component
@Data
@Profile("email")
@ConfigurationProperties(prefix="code.model")
public class Email implements service{
    private String format;
    @Override
    public String sendMsg() {
        return format;
    }
}

