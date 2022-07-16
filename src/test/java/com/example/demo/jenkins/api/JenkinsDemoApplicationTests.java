package com.example.demo.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("from test class");
	}
	
	@Test
	void TestSum()
	{
		assertEquals(true,true);
	}

}
