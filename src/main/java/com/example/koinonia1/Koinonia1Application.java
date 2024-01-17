package com.example.koinonia1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Koinonia1Application {

	public static void main(String[] args) {
		SpringApplication.run(Koinonia1Application.class, args);
	}

}
