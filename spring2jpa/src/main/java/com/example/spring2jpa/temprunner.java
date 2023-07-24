package com.example.spring2jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class temprunner implements CommandLineRunner {
    @Autowired
    private Crud foo;

}
