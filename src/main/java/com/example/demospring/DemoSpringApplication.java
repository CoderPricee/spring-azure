package com.example.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringApplication {
	
	@GetMapping("/message")
	public String message() {
		return " Congrats ! your app deployed perfectly in azure!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

}
