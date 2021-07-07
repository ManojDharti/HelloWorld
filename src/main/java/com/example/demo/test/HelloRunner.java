package com.example.demo.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class HelloRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Second Demo Git");
		System.out.println("I done this Demo Git");
	}

}
