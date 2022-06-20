package com.springboot.employeeData.app.service;

import java.util.List;


import java.util.Objects;


import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.stereotype.Service;

import com.springboot.employeeData.app.entity.Employee;

import com.springboot.employeeData.app.respository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

	
	public EmployeeServiceImp(EmployeeRepository employeerepo) {
		super();
		this.employeeRepository = employeerepo;
	}


	@Override
	public List<Employee> fetchEmployeeList() {
	
		return employeeRepository.findAll();
	}


	@Override
	public Employee fetchEmployeeById(Integer employeeId) {
		
	
		
		return employeeRepository.findById(employeeId).get();
	}


	@Override
	public void deleteEmployeeById(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}


	@Override
	public Employee updateEmployee(Integer employeeId, Employee employee) {
		
		Employee empDB = employeeRepository.findById(employeeId).get();
		
		if(Objects.nonNull(employee.getName()) &&
		        !"".equalsIgnoreCase(employee.getName())) {
		            empDB.setName(employee.getName());
		        }

		        if(Objects.nonNull(employee.getAge())) {
		            empDB.setAge(employee.getAge());
		        }

		        if(Objects.nonNull(employee.getSalary())) {
		            empDB.setSalary(employee.getSalary());
		        }

		        return employeeRepository.save(empDB);
	}


	@Override
	public Employee fetchEmployeeByName(String employeeName) {
		
	return employeeRepository.findByNameIgnoreCase(employeeName);
	}






	
	
	

}
