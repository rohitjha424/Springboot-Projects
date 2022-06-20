package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Department;

public interface DepartmentService {
	public Department addDepartment(Department department);
	public Department updateDepartmentById(Long id,Department department);
	public void deleteDepartmentById(Long id);
	public Employee addEmployee(Employee employee,Long deptId);
	public Optional<Employee> getEmployeeDetails(Long employeeId);
	public Optional<Department> findDepartmentById(Long id);
	public List<Employee> getAllEmployees();
	public List<Department> getAllDepartments();
	public List<Employee> getAllDepartmentEmployees(Long deptId);
	
}
