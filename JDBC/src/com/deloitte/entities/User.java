package com.deloitte.entities;

public class User {
	int id;
	String username;
	String firstname;
	String lastname;
	String password;
	String status;
	public User(int id,String username,String firstname,String lastname,String password,String status) {
		
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname=lastname;
		this.password=password;
		this.status=status;
		
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
