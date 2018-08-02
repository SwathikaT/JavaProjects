package com.deloitte.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDao implements Dao<User> {

	@Override
	public User get(long id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
	
		return null;
	}

	@Override
	public void save(User user) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		//load or register a jdbc driver for mediating dbms and java
		try {
			Context initCtx = new InitialContext();
			 DataSource ds = (DataSource)initCtx.lookup("java:comp/env/jdbc/TeamDB");

			 

			Connection conn = ds.getConnection();
			//<!-- ... use this connection to access the database ... -->
			conn.close();
		//establish a connection
		connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "swat", "swat123");
		//query the database
		ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
		ps.setInt(1, user.getId());
		ps.setString(2,user.getUsername());
		ps.setString(3,user.getFirstname());
		ps.setString(4,user.getLastname());                                                                                
		ps.setString(5,user.getPasswd());
		ps.setString(6,user.getStatus());
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				if(ps != null && !ps.isClosed()) {
				ps.close();}
				if(connection != null && !connection.isClosed()) {
				connection.close();}
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void update(User t, String[] params) {
		
		
	}

	@Override
	public void delete(User t) {
		
		
	}

}