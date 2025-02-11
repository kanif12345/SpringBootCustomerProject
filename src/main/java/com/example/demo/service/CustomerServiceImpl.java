package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Entiry.Customer;
import com.example.demo.Repository.customerrepointer;

@Service
public class CustomerServiceImpl implements  serviceinter {
	
	@Autowired
	private customerrepointer repo;

	@Override
	public Customer saveCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "given :"+id+":data deleteed";
		}
		else
		{
			return "given :"+id+"not found";
		}
		
	}

}
