package com.example.demo.techs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @OneToOne
    private Technician technician;
    
    @JsonIgnore
    @OneToOne
    private Customer customer;

    private String uri;

    private String description;
    
    private Integer stars;

    private Review() { } // JPA only

    public Review(final Technician technician, final Customer customer, final String uri, final String description, final Integer stars) {
        this.uri = uri;
        this.description = description;
        this.technician = technician;
        this.customer = customer;
        this.stars = stars;
    }

    public Long getId() {
        return id;
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

    public String getDescription() {
        return description;
    }
    
    public Integer getStars() {
    	return stars;
    }
}