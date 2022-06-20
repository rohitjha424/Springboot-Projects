package com.springboot.employeeData.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employeeData.app.entity.Employee;
import com.springboot.employeeData.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee ) {
		
		return employeeService.saveEmployee(employee);
		
		
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList(){
		
		return employeeService.fetchEmployeeList();
		
	}
	
	@GetMapping("/employees/{id}")
	public Employee fetchEmployeeById(@PathVariable("id")Integer employeeId){
		
		return employeeService.fetchEmployeeById(employeeId);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id")Integer employeeId) {
		
		employeeService.deleteEmployeeById(employeeId);
		
		return "Employee Deleted Successfully";
		
	}
	 @PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") Integer employeeId, 
											@RequestBody Employee employee) {
		 
		 return employeeService.updateEmployee(employeeId,employee);
		
	}
	 
	 
	 @GetMapping("/employees/name/{name}")
		public Employee fetchEmployeeByName(@PathVariable("name")String employeeName){
			
			return employeeService.fetchEmployeeByName(employeeName);
			
		}
	
	
		
	
	
}

