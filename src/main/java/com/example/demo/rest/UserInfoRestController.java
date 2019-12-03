package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Result;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

@RestController
@RequestMapping("/api")
public class UserInfoRestController {
	
	private UserInfoService userService;
	public UserInfoRestController(UserInfoService userInfoService) {
		userService = userInfoService;
	}
	
	@GetMapping("/users")
	public Result findAll() {
		return new Result(userService.findAll());
	}
	
	@PostMapping("/user")
	public void addMovie(@RequestBody UserInfo info) {
		info.setId(0);
		userService.save(info);
		
	}
	

}
