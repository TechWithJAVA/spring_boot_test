package com.java.spring.boot.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringBootAppApplicationTests {

	Logger logger=LoggerFactory.getLogger(SpringBootAppApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing......");
		assertEquals(true, true);
	}

}
