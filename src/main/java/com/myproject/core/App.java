package com.myproject.core;

import com.myproject.customer.bo.impl.CustomerBoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBoImpl customer = (CustomerBoImpl) appContext.getBean("customerBo");
		//customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		customer.addCustomerThrowException();
		
		//customer.addCustomerAround("mkyong");

	}
}