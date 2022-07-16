package com.cta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidTrackingApplication.class, args);
	}

}
