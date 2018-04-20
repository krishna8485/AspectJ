package com.myproject.customer.bo.impl;

public final class CustomerBoImpl //implements CustomerBo
{

	public void addCustomer() {
		System.out.println("addCustomer() is running ");
		//throw new Exception();
	}
	
	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}