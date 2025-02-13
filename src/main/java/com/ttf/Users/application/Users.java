package com.ttf.Users.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ttf")
public class Users {

	public static void main(String[] args) {
		SpringApplication.run(Users.class, args);
	}

}
