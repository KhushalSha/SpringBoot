package com.lombok.lombokexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "code.model")
public class Ymlexample{
    private String format;
    private String name;

}