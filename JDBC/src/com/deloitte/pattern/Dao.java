package com.deloitte.pattern;

import java.util.List;

public interface Dao<T> {
		T get(long id);
		List<T> getAll();
		void save(T t);
		void update(T t,String[] params);
		void delete(T t);
	}

class User{
	int id;
	String fname;
	String lname;
	String password;
	String status;
}