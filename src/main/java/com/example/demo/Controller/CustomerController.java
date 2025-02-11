package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entiry.Customer;
import com.example.demo.service.CustomerServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/customerdata")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl ser;
	@PostMapping("/save")
	public ResponseEntity<?> saveData(@RequestBody Customer cust) {
		
	Customer customerr=	ser.saveCustomer(cust);
	
	return new ResponseEntity<>(customerr,HttpStatus.OK);
		 
	}
	
	
	@GetMapping("/getall")
	private ResponseEntity<?> getAllCustomer()
	{
	List<Customer> getalll=	ser.getAllCustomer();
	
	return new ResponseEntity<>(getalll,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	
	private ResponseEntity<?> deleteByIdd(@PathVariable ("id") Integer id)
	{
	   String customerdelete=ser.deleteById(id);
	
	return new ResponseEntity<>(customerdelete,HttpStatus.OK);
	}
	
	
	
	

}
