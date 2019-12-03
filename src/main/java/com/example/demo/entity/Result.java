package com.example.demo.entity;

import java.util.List;

public class Result {
	List<UserInfo> result;

	public List<UserInfo> getResult() {
		return result;
	}

	public void setResult(List<UserInfo> result) {
		this.result = result;
	}

	public Result(List<UserInfo> result) {
		super();
		this.result = result;
	}
	
}
