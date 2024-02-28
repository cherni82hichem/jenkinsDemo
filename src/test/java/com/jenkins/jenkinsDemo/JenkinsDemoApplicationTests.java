package com.jenkins.jenkinsDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {
	Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Application executed **************************************");
		Assertions.assertEquals(true,true);
		logger.info("Test Application finished **************************************");
	}

}
