package com.example.demo.techs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Record {

    @Id
    @GeneratedValue
    private Long recordID;

    @JsonIgnore
    @OneToOne
    private Technician technician;
    
    @JsonIgnore
    @OneToOne
    private Customer customer;

    private String uri;

    private Record() { } // JPA only

    public Record(final Technician technician, final Customer customer, final String uri, final String description, final Integer stars) {
        this.uri = uri;
        this.technician = technician;
        this.customer = customer;
    }

    public Long getId() {
        return recordID;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public Technician getTechnician() {
    	return technician;
    }

    public String getUri() {
        return uri;
    }
}