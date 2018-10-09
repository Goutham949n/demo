package com.web.awstest.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwstestApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8080);
		SpringApplication.run(AwstestApplication.class, args);
	}
}
