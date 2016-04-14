package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
	Connection connection;
	public Connection retrieveConnection(){
		return DatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test", "root", "admin");
	}
	
	
	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
	
	try {
		PreparedStatement psmt = retrieveConnection().prepareStatement("Insert into Customer values(?,?,?,?,?)");
		psmt.setInt(1, customer.getCustId());
		psmt.setString(2, customer.getCustName());
		psmt.setString(3, customer.getCity());
		psmt.setDouble(4, customer.getBalance());
		psmt.setInt(5, customer.getMobileNumber());
		
		psmt.executeUpdate();
		
		retrieveConnection().close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Override
	public Customer getCustomerbyMobilenum(int mobileNum) {
		Customer customer = null;
		// TODO Auto-generated method stub
		try {
			PreparedStatement psmt = retrieveConnection().prepareStatement("Select * from Customer where MobileNumber=?");
			psmt.setInt(1, mobileNum);
			ResultSet rs = psmt.executeQuery();
			rs.next();
			System.out.print(rs.getInt("CustId"));
			System.out.print(rs.getString("CustomerName"));
			System.out.print(rs.getString("City"));
			System.out.print(rs.getDouble("Balance"));
			System.out.print(rs.getInt("MobileNumber"));
			
			customer = new Customer(rs.getInt("CustId"), rs.getString("CustomerName"), rs.getString("City"), rs.getDouble("Balance"), rs.getInt("MobileNumber"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public void delete(int custId) {
		// TODO Auto-generated method stub
		try {
			
			PreparedStatement psmt = retrieveConnection().prepareStatement("Delete from Customer where CustId=?");
			psmt.setInt(1, custId);
			psmt.executeUpdate();
			System.out.println("Record for "+custId+" delelted.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateCity(int custId, String newCity) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement psmt = retrieveConnection().prepareStatement("Update Customer set City=? where CustId=?");
			psmt.setString(1,newCity);
			psmt.setInt(2, custId);
			psmt.executeUpdate();
		System.out.println("City has been successfully updated to "+newCity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Customer> getAllCustbyCity(String city) {
		// TODO Auto-generated method stub
		ArrayList<Customer> c = new ArrayList<Customer>();
		try {
			PreparedStatement psmt = retrieveConnection().prepareStatement("Select * from Customer where City=?");
			psmt.setString(1, city);
			ResultSet rs=psmt.executeQuery();
			rs.next();
			//System.out.println(rs.getString(2));
			
			while(rs.next()){
				c.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
	}

}
