package com.model;

public class User {

	String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
}
