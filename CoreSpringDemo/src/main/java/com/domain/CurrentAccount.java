package com.domain;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account{

	private Double balance=new Double(2000.0);
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public Double getBalance() {
		return balance;
	}
	@Override
	public Customer getCustomer() {
		return null;
	}

	
}
