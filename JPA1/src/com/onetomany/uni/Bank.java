package com.onetomany.uni;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	public Bank() {
		// TODO Auto-generated constructor stub
	}
@Id	
 int bankId;
 public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBanklocation() {
	return banklocation;
}
public void setBanklocation(String banklocation) {
	this.banklocation = banklocation;
}
public Set<BankAccountHolders> getAcholder() {
	return acholder;
}
public void setAcholder(Set<BankAccountHolders> acholder) {
	this.acholder = acholder;
}
String bankName;
 String banklocation;
 @OneToMany(mappedBy="bank",cascade=CascadeType.ALL)
 Set<BankAccountHolders> acholder;
 
 
}
