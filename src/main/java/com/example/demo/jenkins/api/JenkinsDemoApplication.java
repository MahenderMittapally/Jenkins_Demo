package com.example.demo.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println("from main springboot class");
		System.out.println("second committ class");
		System.out.println("third committ class");
		System.out.println("Fifth committ ");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
