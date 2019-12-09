package com.example.demo.entity;

public class ErrorStatus {
	private boolean error;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean getError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public ErrorStatus( String status,boolean error) {
		super();
		this.error = error;
		this.status = status;
	}
	
	
}
