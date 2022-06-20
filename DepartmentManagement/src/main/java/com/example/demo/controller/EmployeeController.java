package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	DepartmentService service;
	
	@GetMapping()
	private ResponseEntity<List<Employee>> getEmployees(){
		return new ResponseEntity<>(service.getAllEmployees(),HttpStatus.OK);
	}
	
	@PostMapping("/department/{id}")
	private ResponseEntity<Employee> addEmployee(@RequestBody Employee emp,@PathVariable Long deptId) {
		return new ResponseEntity<>(service.addEmployee(emp,deptId), HttpStatus.CREATED);
	}

	@GetMapping("/department/{id}")
	private ResponseEntity<List<Employee>> getAllHospitalDoctors(@PathVariable Long id) {
		return new ResponseEntity<>(service.getAllDepartmentEmployees(id), HttpStatus.OK);

	}
}
