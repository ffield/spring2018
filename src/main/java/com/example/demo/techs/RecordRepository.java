package com.example.demo.techs;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecordRepository extends JpaRepository<Record, Long> {
    List<Record> findByTechnician(Technician technician);
    List<Record> findByCustomer(Customer customer);
    Optional<Record> findByRecordID(Long recordID);
}