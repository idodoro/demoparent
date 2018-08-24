package com.example.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemomqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomqApplication.class, args);
		System.out.println("#########start...DemomqApplication"+new Date());
	}
}
