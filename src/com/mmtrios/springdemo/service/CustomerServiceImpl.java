package com.mmtrios.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmtrios.springdemo.dao.CustomerDAO;
import com.mmtrios.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {

		return customerDAO.getCustomer();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer myCustomer) {
		customerDAO.saveCustomer(myCustomer);
	}


	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}


	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
		
	}

}
