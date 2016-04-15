package com.di.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class CustomerDao {

	public CustomerDao() {
		// TODO Auto-generated constructor stub
		
	}
		
	BasicDataSource basicdatasource;
	
	public void setBasicdatasource(BasicDataSource basicdatasource) {
		this.basicdatasource = basicdatasource;
	}
	
	
	public void findCustomer(){
		
		try {
			Connection conn = basicdatasource.getConnection();
		    PreparedStatement psmt =conn.prepareStatement("Select CustomerName from customer where CustId=1");
			ResultSet rs =psmt.executeQuery();
			rs.next();
			System.out.println(rs.getString(1));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
