package com.springboot.employeeData.app.service;


import java.util.List;



import com.springboot.employeeData.app.entity.Employee;


public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);

	public List<Employee> fetchEmployeeList();

	public Employee fetchEmployeeById(Integer employeeId) ;

	public void deleteEmployeeById(Integer employeeId);

	public Employee updateEmployee(Integer employeeId, Employee employee);

	public Employee fetchEmployeeByName(String employeeName);
	
	


	

}
