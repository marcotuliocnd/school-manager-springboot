package com.api.schoolmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SchoolManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagerApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello, world!";
	}
}
