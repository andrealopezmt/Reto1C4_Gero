package com.websag11.divinacomedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.websag11.divinacomedia"})
public class DivinacomediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DivinacomediaApplication.class, args);
	}

}
