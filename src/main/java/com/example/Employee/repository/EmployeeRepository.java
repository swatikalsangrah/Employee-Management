package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {


}
