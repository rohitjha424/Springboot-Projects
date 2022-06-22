package com.milestone.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milestone.hospital.entity.Hospital;
import com.milestone.hospital.service.HospitalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class HospitalController {
	
	
	@Autowired
    private HospitalService hospitalService;
	
	
	@PostMapping("/")
    public Hospital saveHospital(@RequestBody Hospital hospital) {
		
		
    //    log.info("Inside saveDepartment method of DepartmentController");
		
		
        return  hospitalService.saveHospital(hospital);
    }

    @GetMapping("/{id}")
    public Hospital findHospitalById(@PathVariable("id") Integer hospitalId) {
      //  log.info("Inside findDepartmentById method of DepartmentController");
    	
        return hospitalService.findHospitalById(hospitalId);
    }
	
	
	
	

}