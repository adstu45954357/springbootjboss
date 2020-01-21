package com.mastertheboss.springboot.springbootwildfly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastertheboss.springboot.springbootwildfly.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee,Long> {

}
