package com.example.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeId(int id) {
		return employeeRepository.findById(id);
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(int id, Employee updatedEmployee) {

		Employee existing = employeeRepository.findById(id).orElse(null);
		existing.setFirstName(updatedEmployee.getFirstName());
		existing.setLastName(updatedEmployee.getLastName());
		existing.setEmail(updatedEmployee.getEmail());
		existing.setDepartment(updatedEmployee.getDepartment());

		return employeeRepository.save(existing);
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
