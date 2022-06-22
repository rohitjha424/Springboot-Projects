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

import com.example.demo.entity.Hospital;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.service.HospitalService;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
	@Autowired
	HospitalService service;

	@GetMapping
	private ResponseEntity<List<Hospital>> getAllHospitals() {
		try {
			List<Hospital> hospitals = service.getAllHospitals();
			if (hospitals.isEmpty())
				return new ResponseEntity<List<Hospital>>(HttpStatus.NO_CONTENT);
			else
				return new ResponseEntity<List<Hospital>>(hospitals, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	private ResponseEntity<Hospital> addHospital(@RequestBody Hospital hospital) {
		return new ResponseEntity<>(service.addHospital(hospital), HttpStatus.CREATED);
	}

//	@PutMapping("/{id}")
//	private ResponseEntity<?> updateProduct(@RequestBody Hospital product, @PathVariable Long id) {
//		if (service.findHospitalById(id).isPresent())
//			return new ResponseEntity<>(service.updateProductById(id, product), HttpStatus.OK);
//		else {
//			throw new DataNotFoundException("Record Not Found");
//		}
//	}

	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteHospital(@PathVariable Long id) {
		if (service.findHospitalById(id).isPresent()) {
			service.deleteHospitalById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		} else {
			throw new DataNotFoundException("Record Not Found");
		}
	}

//	@GetMapping("/buyer/{id}")
//	private ResponseEntity<List<Hospital>> getProductsByBuyerId(@PathVariable Long id) {
//		return new ResponseEntity<>(service.getAllProductsByBuyerId(id), HttpStatus.OK);
//	}

}
