package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
		
	static Connection getConnectiontoDB(String url, String username, String pwd){
		
		Connection con = null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//get the connection
			con = DriverManager.getConnection(url, username, pwd);
			
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
