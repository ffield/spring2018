package com.example.demo.controllers;

import java.net.URI;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.techs.Customer;
import com.example.demo.techs.CustomerRepository;

@RestController
@RequestMapping("/customers")
class CustomerController {

	private final CustomerRepository customerRepository;


	@Autowired
	CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	Collection<Customer> getCustomers() {
		return this.customerRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{customerId}")
	Customer getCustomer(@PathVariable Long customerId) {
		//Optional<Customer>
		return this.customerRepository.findByCustomerID(customerId).get();
	}


	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add( @RequestBody Customer input) {
		this.customerRepository.save(input);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(input.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

	
}