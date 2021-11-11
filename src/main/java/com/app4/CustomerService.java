package com.app4;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	private int custId;
	private String custName;
	
	public CustomerService() {
		super();
		System.out.println("customer service cons..");
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	

}
