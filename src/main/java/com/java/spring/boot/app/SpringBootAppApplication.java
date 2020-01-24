package com.java.spring.boot.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootAppApplication.class);

	public void init() {
		logger.info("Application Started......");

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
