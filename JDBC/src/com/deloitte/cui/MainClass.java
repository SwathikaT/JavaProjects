package com.deloitte.cui;
import com.deloitte.entities.User;
import com.deloitte.main.UserDao;

public class MainClass {
	public static void main(String[] args) {
		UserDao udao = new UserDao();
		User user = new User(1,"Swathika","Swathika","T","swat@teamdb","swat123");
		udao.save(user);
		
	}

}
