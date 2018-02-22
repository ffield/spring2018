package com.example.demo.techs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Request {

    @Id
    @GeneratedValue
    private Long requestID;

    @JsonIgnore
    @OneToOne
    private Technician technician;
    
    @JsonIgnore
    @OneToOne
    private Customer customer;

    private String uri;
    
    private boolean isApproved = false;
    


    private Request() { } // JPA only

    public Request(final Technician technician, final Customer customer, final String uri, final String description, final Integer stars) {
        this.uri = uri;
        this.technician = technician;
        this.customer = customer;
    }

    public Long getId() {
        return requestID;
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
    
    public boolean getIsApproved() {
    	return isApproved;
    }
    
    public void approve() {
    	this.isApproved = true;
    }

}