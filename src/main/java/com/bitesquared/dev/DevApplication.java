package com.bitesquared.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DevApplication.class, args);
		System.out.println("A sample Spring Boot application is running.");
		// context.getBean(x.class) can be used to get a bean.
	}

}
