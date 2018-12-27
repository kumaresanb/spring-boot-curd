package com.evolvus.springboot.curd.springbootcurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages="com.evolvus.springboot.curd.repository")
@EntityScan("com.evolvus.springboot")
@ComponentScan("com.evolvus.springboot")
public class SpringBootCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdApplication.class, args);
	}

}

