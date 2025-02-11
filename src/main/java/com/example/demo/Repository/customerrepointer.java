package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entiry.Customer;

@Repository
public interface customerrepointer extends JpaRepository<Customer, Integer>{

}
