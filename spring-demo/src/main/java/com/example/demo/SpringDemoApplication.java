package com.example.demo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println(context.getBean("timeBean"));
		System.out.println(context.getBean("timeBean"));
		System.out.println(context.getBean("timeBean"));
		System.out.println(context.getBean("timeBean"));
		System.out.println(context.getBean("timeBean"));
	}
	
	@Bean("mrBean")
	public String helloWorld() {
		return "Hello World";
	}
	
	@Bean("timeBean")
	@Scope("prototype")
	public LocalTime time() {
		return LocalTime.now();
	}

}
