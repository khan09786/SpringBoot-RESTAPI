package com.egiants.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.ComponentScan;

import lombok.Data;

@Data
@Entity
@ComponentScan(basePackages = "com.javainuse.model.Employee,com.javainuse.model.Address")
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String name;
	
	private String course;
	
	private Integer year;
	
	@OneToMany(mappedBy = "employee")
//	@JsonManagedReference
	List<Address> address;
	

}
