package com.mmtrios.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmtrios.springdemo.dao.CustomerDAO;
import com.mmtrios.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from dao, and add it to theModel
		List<Customer> theCustomers = customerDAO.getCustomer();
		
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
}
