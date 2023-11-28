package com.example.springbootexample01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootexample01.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
