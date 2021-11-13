package com.contact.ms.contacs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.contact.ms.controllers", "com.contact.ms.dao", "com.contact.ms.services" })
@EntityScan({ "com.contact.ms.model" })
@EnableJpaRepositories({ "com.contact.ms.dao" })
@SpringBootApplication
public class ContacsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContacsApplication.class, args);
	}

}
