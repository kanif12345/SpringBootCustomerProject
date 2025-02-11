
package com.example.demo.service;

import java.util.List;

import com.example.demo.Entiry.Customer;

public interface serviceinter {
	
	public Customer saveCustomer(Customer cust);
	
	public List<Customer> getAllCustomer();
	
	public String deleteById(Integer id);
}
