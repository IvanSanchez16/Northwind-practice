package com.ivansanchez16.northwindpractice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"io.ivansanchez16", "com.ivansanchez16.northwindpractice"})
@EnableJpaRepositories(basePackages = {"com.ivansanchez16.northwindpractice.repositories", "io.ivansanchez16.jpautils"})
public class NorthwindPracticeApplication {


	public static void main(String[] args) {
		SpringApplication.run(NorthwindPracticeApplication.class, args);
	}

}
