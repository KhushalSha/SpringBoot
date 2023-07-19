package com.lombok.lombokexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lombok.lombokexample.implementation.Email;

@SpringBootApplication
public class LombokexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(LombokexampleApplication.class, args);
		service foo = ac.getBean(service.class);
		System.out.println(foo);
	}

}
