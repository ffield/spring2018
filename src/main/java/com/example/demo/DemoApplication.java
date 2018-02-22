package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.techs.Customer;
import com.example.demo.techs.CustomerRepository;
import com.example.demo.techs.RecordRepository;
import com.example.demo.techs.RequestRepository;
import com.example.demo.techs.ReviewRepository;
import com.example.demo.techs.Technician;
import com.example.demo.techs.TechnicianRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(CustomerRepository customerRepository,
			RecordRepository recordRepository, RequestRepository requestRepository,
			ReviewRepository reviewRepository, TechnicianRepository technicianRepository) {
		return (evt) -> Arrays.asList(
				"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(
						a -> {
//							Customer customer = customerRepository.save(new Customer(a,a,
//									"password"));
						});
	}
}
