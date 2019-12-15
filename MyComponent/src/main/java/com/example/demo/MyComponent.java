package com.example.demo;

import org.springframework.stereotype.Component;

@Component("myComp")
public class MyComponent {
	public void doTheThing() {
		System.out.println("This is a component!");
	}
}