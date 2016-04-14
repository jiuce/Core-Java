package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserValidator {
	public boolean validate(String name, String pwd){
		if(name.equals("aaa")&&pwd.equals("zzz")){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public boolean validatefromDB(String username, String password){
		
		boolean found=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
			String query="Select * from User where username=? and password=?";
			PreparedStatement psmt =con.prepareStatement(query);
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs = psmt.executeQuery();
			//found=rs.next();
			if(rs.next())
				found=true;
			else
				found=false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return found;
	}

}
