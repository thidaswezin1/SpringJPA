package com.example.demo.rest;


import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ErrorStatus;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

@RestController
@RequestMapping("/api")
public class UserInfoRestController {
	
	private UserInfoService userService;
	
	public UserInfoRestController(UserInfoService userInfoService) {
		userService = userInfoService;
	}
	
	
	@PostMapping("/checkUser")
	public ErrorStatus checkUser(@RequestBody User user) {
		List<User> allUser = userService.findUser();
		for(User u : allUser) {
			if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
				return new ErrorStatus("ok",true);
			}
		}
		
		return new ErrorStatus("notok",false);
		
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
	
	@DeleteMapping("/movies/{id}")
	public void deleteEmployee(@PathVariable int id) {
		UserInfo info = userService.findById(id);
		if(info == null) {
			throw new RuntimeException("No Data for Employee" +info);
		}
		userService.deleteById(id);
	
	}
	

}
