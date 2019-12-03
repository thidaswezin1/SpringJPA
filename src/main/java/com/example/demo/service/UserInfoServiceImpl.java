package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.UserInfoRepository;
import com.example.demo.entity.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoRepository userRepository;
	
	@Autowired
	public UserInfoServiceImpl(UserInfoRepository theUserRepository) {
		userRepository = theUserRepository;
	}
	
	@Override
	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void save(UserInfo user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}
}
