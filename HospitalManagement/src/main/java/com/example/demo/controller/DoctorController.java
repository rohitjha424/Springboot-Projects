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

import com.example.demo.entity.Doctor;
import com.example.demo.service.HospitalService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	HospitalService service;
	
	@GetMapping()
	private ResponseEntity<List<Doctor>> getDoctor(){
		return new ResponseEntity<>(service.getAllDoctor(),HttpStatus.OK);
	}
	
	@PostMapping()
	private ResponseEntity<Doctor> addDoctor(@RequestBody Doctor buyer) {
		return new ResponseEntity<>(service.addDoctor(buyer), HttpStatus.CREATED);
	}

	@GetMapping("/hospital/{id}")
	private ResponseEntity<List<Doctor>> getAllHospitalDoctors(@PathVariable Long id) {
		return new ResponseEntity<>(service.getAllHospitalDoctors(id), HttpStatus.OK);

	}
}
