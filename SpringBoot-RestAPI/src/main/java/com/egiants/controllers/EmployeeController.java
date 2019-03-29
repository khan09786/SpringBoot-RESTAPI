package com.egiants.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.model.Employee;
import com.egiants.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeData;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	Page<Employee> employeesPageable(Pageable pageable) {
		return employeeData.findAll(new PageRequest(0, 10, Direction.ASC, "id"));

	}

}
