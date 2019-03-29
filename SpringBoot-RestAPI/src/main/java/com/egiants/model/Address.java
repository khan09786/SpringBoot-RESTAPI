package com.egiants.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@ComponentScan(basePackages = "com.javainuse.model.Employee,com.javainuse.model.Address")
public class Address {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long id;
	
	String address;
	
	String city;
	
	String state;
	
	Integer zipCode;
	
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	Employee employee;

}