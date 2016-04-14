package com.di.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class CustomerDao {

	public CustomerDao() {
		// TODO Auto-generated constructor stub
		
	}
	
	ConnectiontoDao connection1;
	
	public void setConnection1(ConnectiontoDao connection1) {
		this.connection1 = connection1;
	}

	BasicDataSource basicdatasource;
	public void setBasicdatasource(BasicDataSource basicdatasource) {
		this.basicdatasource = basicdatasource;
	}
	
	public void getCustomer(){
		try {
			Connection conn =basicdatasource.getConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}