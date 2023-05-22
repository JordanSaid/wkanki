package com.spring.wkanki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class WkankiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WkankiApplication.class, args);
	}

}
