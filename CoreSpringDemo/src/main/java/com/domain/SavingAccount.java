package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("saving")
public class SavingAccount implements Account{

	private Double balance=new Double(0.0);
	@Autowired
	Customer customer;
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public Double getBalance() {
		return balance;
	}

	
}
