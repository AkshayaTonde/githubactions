package com.javadocker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to the app version 1";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
