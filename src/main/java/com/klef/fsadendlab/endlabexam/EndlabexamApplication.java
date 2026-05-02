package com.klef.fsadendlab.endlabexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.klef.fsadendlab", "com.klef.fsad"})
@EnableJpaRepositories(basePackages = {"com.klef.fsad.exam.repository"})
@EntityScan(basePackages = {"com.klef.fsad.exam.model"})
public class EndlabexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndlabexamApplication.class, args);
	}

}
