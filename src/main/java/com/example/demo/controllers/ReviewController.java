package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.techs.CustomerRepository;
import com.example.demo.techs.TechnicianRepository;

@RestController
@RequestMapping("/reviews")
class ReviewController {

	private final CustomerRepository customerRepository;
	private final TechnicianRepository technicianRepository;


	@Autowired
	ReviewController(CustomerRepository customerRepository, TechnicianRepository technicianRepository) {
		this.customerRepository = customerRepository;
		this.technicianRepository = technicianRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	String justATest() {
		return "accross the board";
	}
	
}