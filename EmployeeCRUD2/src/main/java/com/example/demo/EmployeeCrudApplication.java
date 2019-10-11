package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan("com.example.*")
@ComponentScan("com.example.*")
@EnableJpaRepositories(basePackages={"com.example"})
@EnableSwagger2
//@EnableAspectJAutoProxy
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}

}
