package com.example.demo.techs;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByTechnician(Technician technician);
    List<Review> findByCustomer(Customer customer);
}