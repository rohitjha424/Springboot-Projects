package com.springboot.employeeData.app.respository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.springboot.employeeData.app.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

	public Employee findByName(String employeeName);
	
	public Employee findByNameIgnoreCase(String employeeName);

}