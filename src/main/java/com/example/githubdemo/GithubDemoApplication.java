package com.example.githubdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubDemoApplication {

	@GetMapping("/")
	public String get(){
		return "welcome to enggadda";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubDemoApplication.class, args);
	}

}
