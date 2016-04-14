package com.onetoone.bidir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int addressId;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	String City;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	int zipcode;
	@OneToOne(mappedBy="address")
	Employee employee;
	public Address(String city, int zipcode) {
		super();
		City = city;
		this.zipcode = zipcode;
	}
	
	
}
