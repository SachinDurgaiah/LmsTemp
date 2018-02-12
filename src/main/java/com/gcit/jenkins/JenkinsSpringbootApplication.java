package com.gcit.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringbootApplication.class, args);
		System.out.println("Hello Jenkins!");
	}
}
