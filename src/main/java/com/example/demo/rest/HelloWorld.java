package com.example.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@Value("${project.name}")
	private String prjName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teaminfo")
	public String sayteamInfo() {
		return "Your project name :"+prjName+", Team name :"+teamName;
	}
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is "+LocalDateTime.now();
	}
	
	@GetMapping("/fortune")
	public String sayFortune() {
		return "You will be a lucky girl";
	}
}
