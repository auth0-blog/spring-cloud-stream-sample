package com.auth0.springkafkastreams.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringKafkaStreamsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaStreamsDemoApplication.class, args);
	}
}
