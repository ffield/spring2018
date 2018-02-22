package com.example.demo.techs;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByUsername(String username);
    List<Customer> findAll();
    Optional<Customer> findByCustomerID(Long customerID);
}