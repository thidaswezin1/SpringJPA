package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserAccountRepository;
import com.example.demo.dao.UserInfoRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoRepository userRepository;
	private UserAccountRepository repo;
	
	@Autowired
	public UserInfoServiceImpl(UserInfoRepository theUserRepository,UserAccountRepository repos) {
		userRepository = theUserRepository;
		repo = repos;
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

	@Override
	public UserInfo findById(int userId) {
		// TODO Auto-generated method stub
		Optional<UserInfo> result = userRepository.findById(userId);
		UserInfo user = null;
		if(result.isPresent()) {
			user = result.get();
		}
		else {
			throw new RuntimeException("didn't find Employee id-- "+user);
		}
		return user;
	}

	@Override
	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
