package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	DepartmentService service;

	@GetMapping
	private ResponseEntity<List<Department>> getAllDepartments() {
		try {
			List<Department> depts = service.getAllDepartments();
			if (depts.isEmpty())
				return new ResponseEntity<List<Department>>(HttpStatus.NO_CONTENT);
			else
				return new ResponseEntity<List<Department>>(depts, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	private ResponseEntity<Department> addDepartment(@RequestBody Department dept) {
		return new ResponseEntity<>(service.addDepartment(dept), HttpStatus.CREATED);
	}



	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteDepartment(@PathVariable Long id) {
		if (service.findDepartmentById(id).isPresent()) {
			service.deleteDepartmentById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		} else {
			throw new DataNotFoundException("Record Not Found");
		}
	}


}
