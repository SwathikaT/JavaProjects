package com.deloitte.web.dao;

public class User1 {
	int id;
	String username;
	String firstname;
	String lastname;
	String passwd;
	String status;
	public User1(int id,String username,String firstname,String lastname,String passwd,String status) {
		
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname=lastname;
		this.passwd=passwd;
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
