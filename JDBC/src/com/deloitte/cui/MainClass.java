package com.deloitte.cui;
import com.deloitte.entities.User;
import com.deloitte.main.UserDao;

public class MainClass {
	public static void main(String[] args) {
		UserDao udao = new UserDao();
		User user = new User(1,"swat@teamdb","Swathika","T","swat123","I");
		udao.save(user);
		
	}

}
