package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.techs.TechnicianRepository;

@RestController
@RequestMapping("/technicians")
class TechnicianController {

	private final TechnicianRepository technicianRepository;


	@Autowired
	TechnicianController(TechnicianRepository technicianRepository) {
		this.technicianRepository = technicianRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	String justATest() {
		return "accross the board";
	}
	
}