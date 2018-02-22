package com.example.demo.techs;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByTechnician(Technician technician);
    List<Request> findByCustomer(Customer customer);
}