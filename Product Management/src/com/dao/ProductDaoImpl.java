package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.model.Product;

public class ProductDaoImpl {
	
	
	public void add(Product p){
		Connection con=DatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test","root","admin");
		try {
			PreparedStatement psmt=con.prepareStatement("Insert into Product (Name,Price,Stock) values(?,?,?)");
			
			psmt.setString(1, p.getProdName());
			psmt.setDouble(2, p.getProdPrice());
			psmt.setInt(3, p.getStock());
			psmt.executeUpdate();
			System.out.println("Inserted");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	 public Product[] viewAll(){
		 Product[] prod=null;
		 System.out.println("viewall method");
		 Connection con=DatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test","root","admin");
		 int i=0;
		 try {
			PreparedStatement psmt = con.prepareStatement("Select count(Name) as numofproducts from Product");
			ResultSet rs =psmt.executeQuery();
			rs.next();
			int count=rs.getInt("numofproducts");
			System.out.println(count);
			prod=new Product[count];
			 PreparedStatement psmt1=con.prepareStatement("Select Name, Price, Stock from Product");
			ResultSet rs1=psmt1.executeQuery();
			
			while(rs1.next()){
				prod[i]=new Product(rs1.getString(1),rs1.getDouble(2),rs1.getInt(3));
				//System.out.println(rs1.getString("Name"));
				i++;
			}
			rs.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return prod;
	 }
	
	 
	 
	 public boolean update(String prod, double price){
		 System.out.println("update called");
		 System.out.println(prod +""+price);
		 boolean updated= false;
		Connection con=DatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test","root","admin");
		try {
			PreparedStatement psmt =con.prepareStatement("Update Product set Price=? where Name=?");
			psmt.setDouble(1, price);
			psmt.setString(2, prod);
			psmt.executeUpdate();
			updated=true;
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("updated="+updated);
		return updated;
	 }
	 
	 public List<Product> order(){
		List<Product> p =new ArrayList<Product>();
		 int i =0;
		 Connection con=DatabaseUtil.getConnectiontoDB("jdbc:mysql://localhost:3306/test","root","admin");
		 try {
			PreparedStatement psmt = con.prepareStatement("Select Name, Stock from Product where Stock<10");
			ResultSet rs=psmt.executeQuery();
			while(rs.next()){
			p.add(new Product(rs.getString(1),rs.getInt(2)));
			i++;
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return p;
	 }
	
}


