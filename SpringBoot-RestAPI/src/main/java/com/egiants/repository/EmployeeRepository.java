package com.egiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egiants.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
