package com.myproject.customer.bo;

public interface CustomerBo {

	void addCustomer() throws Exception;
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}