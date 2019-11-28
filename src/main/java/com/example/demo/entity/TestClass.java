package com.example.demo.entity;

import java.util.List;

public class TestClass {
	private List<Employee> userList;

	public List<Employee> getUserList() {
		return userList;
	}

	public void setUserList(List<Employee> userList) {
		this.userList = userList;
	}

	public TestClass(List<Employee> userList) {
		this.userList = userList;
	}

	public TestClass() {
	}
	
	
}
