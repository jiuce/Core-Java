package com.bank.dao;

import java.util.List;

public interface CustomerDao {
	public void add(Customer customer);
	public Customer getCustomerbyMobilenum(int mobileNum);
	public void delete(int custId);
	public void updateCity(int custId, String newCity);
	public List<Customer> getAllCustbyCity(String city);
	

}
