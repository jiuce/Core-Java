package com.onetoone.bidir;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int empId;
	String empName;
	String empDept;
	@OneToOne(cascade=CascadeType.ALL)
	Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Employee(int empId, String empName, String empDept, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.address = address;
	}
	
}
