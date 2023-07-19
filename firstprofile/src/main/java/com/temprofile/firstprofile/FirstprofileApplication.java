package com.temprofile.firstprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FirstprofileApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstprofileApplication.class, args);
		messagedelay foo = ac.getBean(messagedelay.class);
		System.out.println(foo);
		
	}

}
