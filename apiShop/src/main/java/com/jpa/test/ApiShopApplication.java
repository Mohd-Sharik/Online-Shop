package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.jpa.test.*")
@EnableJpaRepositories("com.jpa.test.*")
@ComponentScan("com.jpa.test.*")
public class ApiShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiShopApplication.class, args);
	}

}
