package com.evertonfraga.course;

import com.evertonfraga.course.config.TestConfig;
import com.evertonfraga.course.repositories.UserRepository;
import com.evertonfraga.course.resources.UserResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("************         READY!          ********************************");


	}

}
