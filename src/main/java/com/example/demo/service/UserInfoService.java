package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;

public interface UserInfoService {
	List<UserInfo> findAll(); 
	List<User> findUser();
	public void save(UserInfo user);
	public UserInfo findById(int userId);
	
	public void deleteById(int userId);
}
