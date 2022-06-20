package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Department;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private final EmployeeRepo employeeRepo;
	private final DepartmentRepo departmentRepo;

	@Autowired
	public DepartmentServiceImpl(EmployeeRepo employeeRepo, DepartmentRepo departmentRepo) {
		super();
		this.employeeRepo = employeeRepo;
		this.departmentRepo = departmentRepo;
	}

	@Override
	public Department addDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public Department updateDepartmentById(Long id, Department department) {
		department.setId(id);
		departmentRepo.save(department);
		return department;
	}

	@Override
	public void deleteDepartmentById(Long id) {
		departmentRepo.deleteById(id);
	}

	@Override
	public Employee addEmployee(Employee employee,Long deptId) {
		employee.setDepartment(departmentRepo.findById(deptId).get());
		return employeeRepo.save(employee);
	}

	@Override
	public Optional<Department> findDepartmentById(Long id) {
		return departmentRepo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeDetails(Long empId) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(empId);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}
	
	@Override
	public List<Employee> getAllDepartmentEmployees(Long deptId) {
		// TODO Auto-generated method stub
		if (departmentRepo.findById(deptId).isPresent()) {
			Department dept = departmentRepo.findById(deptId).get();
			return dept.getEmployees();
		} else
			throw new DataNotFoundException("No Department Found");
	}

}
