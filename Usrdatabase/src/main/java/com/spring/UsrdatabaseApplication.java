package com.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})

public class UsrdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsrdatabaseApplication.class, args);
	}

}
