package com.jenkins.jenkinsDemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	@PostConstruct
	public  void log(){
		logger.info("PostConstruct:Application started ***************************************");
	}

	public static void main(String[] args) {
		logger.info("Application executed ***************************************");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
