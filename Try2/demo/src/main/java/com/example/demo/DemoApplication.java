package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		MyRunner foo =  ac.getBean(MyRunner.class);
		System.out.println(foo);


		// Runner foo =ac.getBean(Runner.class);
		// PropertiesRunner foo1 = ac.getBean(PropertiesRunner.class);
		// MapRunner temp =ac.getBean(MapRunner.class);
		// System.out.println(foo);
		// System.out.println(temp);
		// System.out.println(foo1);
	}

}
