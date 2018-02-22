package com.example.demo.techs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long customerID;

    private String username;
    
    private String fullname;
    
    private String address;
    
    private String uri;

    @JsonIgnore
    private String password;


    private Customer() { } // JPA only

    public Customer(final String username,final String fullname, final String password, String uri) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.uri = uri;
    }

    public Long getId() {
        return customerID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getFullname() {
    	return fullname;
    }

}