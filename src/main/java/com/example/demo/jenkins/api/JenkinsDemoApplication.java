package com.example.demo.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println("from main springboot class");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
