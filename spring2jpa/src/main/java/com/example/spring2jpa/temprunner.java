package com.example.spring2jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class temprunner implements CommandLineRunner {
    @Autowired
    private Crud foo;

    @Override
    public void run(String... args) throws Exception {
    Employee e1=   foo.save(new Employee(10,"a",3.3));
    System.out.println(e1);}

}
