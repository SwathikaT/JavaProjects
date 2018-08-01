package com.deloitte.web.controller;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean authenticate(String userName, String passwd) {

		if (userName != null && passwd != null) {
			if (userName.equalsIgnoreCase("Swathi") && passwd.equals("123")) {
				firstName = "Swathi";
				lastName = "T";
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
