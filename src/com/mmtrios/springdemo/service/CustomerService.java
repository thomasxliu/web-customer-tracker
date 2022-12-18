package com.mmtrios.springdemo.service;

import java.util.List;

import com.mmtrios.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer myCustomer);

	public Customer getCustomer(int theId);
}
