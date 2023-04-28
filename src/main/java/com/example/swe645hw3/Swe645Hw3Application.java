package com.example.swe645hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.swe645hw3.repository")
@EntityScan(basePackages="com.example.swe645hw3.model")
public class Swe645Hw3Application{

	public static void main(String[] args) {
		SpringApplication.run(Swe645Hw3Application.class, args);
	}

}
