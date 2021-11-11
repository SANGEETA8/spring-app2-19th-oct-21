package com.app4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingService {
	
	@Autowired
	private CustomerService customerService;

	public ShoppingService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Shopping service cons..");
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	

}
