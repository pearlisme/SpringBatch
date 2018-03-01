package com.spring.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(value = "com.spring.batch")
public class BatchApp {
	private static final Logger logger = LoggerFactory.getLogger(BatchApp.class);

	public static void main(String[] args) {

		SpringApplication.run(BatchApp.class, args);

		logger.debug("--Application Started--");

	}

}
