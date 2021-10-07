package com.dev.delta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({ "com.dev.delta.security","com.dev.delta.controllers","com.dev.delta.services", "com.dev.delta.dto" }) // to scan repository files
@EntityScan("com.dev.delta.entities")
@EnableJpaRepositories("com.dev.delta.repositories")
@SpringBootApplication
public class SpringbootlibraryLabCodecanyonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootlibraryLabCodecanyonApplication.class, args);
	}

}
