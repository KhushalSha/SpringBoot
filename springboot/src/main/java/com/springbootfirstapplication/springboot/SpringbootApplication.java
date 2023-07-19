package com.springbootfirstapplication.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication 
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Runner.class, args);
		Runner foo  = ac.getBean("runner",Runner.class);

		System.out.println(foo);
		

	}

}
