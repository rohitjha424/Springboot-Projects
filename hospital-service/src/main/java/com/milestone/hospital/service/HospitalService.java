package com.milestone.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milestone.hospital.entity.Hospital;
import com.milestone.hospital.repository.HospitalRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HospitalService {
	
	 @Autowired
	    private HospitalRepository hospitalRepository;

	public Hospital saveHospital(Hospital hospital) {
		
		return hospitalRepository.save(hospital);
	}

	
	public Hospital findHospitalById(Integer hospitalId) {
		
      //  log.info("Inside saveDepartment of DepartmentService");
        return hospitalRepository.findByHospitalId(hospitalId);
    }
}
