package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
		System.out.println("#########start...DemowebApplication"+new Date());
	}
}
