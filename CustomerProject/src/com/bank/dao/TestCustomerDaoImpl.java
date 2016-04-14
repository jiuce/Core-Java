package com.bank.dao;

import java.util.ArrayList;

public class TestCustomerDaoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c;
		ArrayList<Customer> list = new ArrayList<Customer>();
		CustomerDaoImpl cust = new CustomerDaoImpl();
		
		//testing insert method
		c = new Customer(3,"dgpam","irvine",60099,1085678);
		cust.add(c);
		
		//testing customer by mobile number
		c= cust.getCustomerbyMobilenum(1245678);
		System.out.println("Customers name for this mobile no is "+c.getCustName());
		
		//delete record
		//cust.delete(3);
		
		//update city
		//cust.updateCity(2, "Irvine");
		
		//get ALL customers for given city
		
		list=cust.getAllCustbyCity("Irvine");
		//System.out.println(list);
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
		
	
	}
