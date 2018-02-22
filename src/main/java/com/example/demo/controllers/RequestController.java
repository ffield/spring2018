package com.example.demo.controllers;

import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.techs.CustomerRepository;
import com.example.demo.techs.Record;
import com.example.demo.techs.TechnicianRepository;

@RestController
@RequestMapping("/requests")
class RequestController {

	private final CustomerRepository customerRepository;
	private final TechnicianRepository technicianRepository;


	@Autowired
	RequestController(CustomerRepository customerRepository, TechnicianRepository technicianRepository) {
		this.customerRepository = customerRepository;
		this.technicianRepository = technicianRepository;
	}
	
	
//	@RequestMapping(method = RequestMethod.GET)
//	Collection<Record> getRecords() {
//		return this.recordRepository.findAll();
//	}
//	
//	@RequestMapping(method = RequestMethod.GET, value = "/{recordId}")
//	Record getRecord(@PathVariable Long recordId) {
//		//Optional<Customer>
//		return this.recordRepository.findByRecordID(recordId).get();
//	}
//
//
//	@RequestMapping(method = RequestMethod.POST)
//	ResponseEntity<?> add( @RequestBody Record input) {
//		URI location = ServletUriComponentsBuilder
//				.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(input.getId()).toUri();
//		this.recordRepository.save(input);
//
//		return ResponseEntity.created(location).build();
//	}

	
}