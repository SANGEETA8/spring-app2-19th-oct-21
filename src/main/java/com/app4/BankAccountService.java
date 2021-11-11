package com.app4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountService {
	
	@Autowired
	private CustomerService customerService;	
	public BankAccountService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Bankaccount service cons..");
	}

	public BankAccountService(CustomerService customerService) {
		super();
		this.customerService = customerService;
		
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
