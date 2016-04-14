package com.onetomany.uni;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BankAccountHolders {

	public BankAccountHolders() {
		// TODO Auto-generated constructor stub
	}

	@Id
	int accountNum;
	String customerName;
	String accountType;

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankAccountHolders(int accountNum, String customerName,
			String accountType) {
		super();
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.accountType = accountType;
	}

	@ManyToOne
	@JoinColumn(name="bankId")
	Bank bank;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
