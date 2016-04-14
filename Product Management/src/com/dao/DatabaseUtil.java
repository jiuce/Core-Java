package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	public static Connection getConnectiontoDB(String url, String username, String password){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection(url, username, password);			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
	
}
