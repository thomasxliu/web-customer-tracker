package com.mmtrios.springdemo.dao;

import java.util.List;

import com.mmtrios.springdemo.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer myCustomer);

	public Customer getCustomer(int theId);
}
