package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;

public interface HospitalService {
	public Hospital addHospital(Hospital hospital);
	public Hospital updateHospitalById(Long id,Hospital hospital);
	public void deleteHospitalById(Long id);
	public Doctor addDoctor(Doctor doctor);
	public Optional<Doctor> getDoctorDetails(Long productId);
	public Optional<Hospital> findHospitalById(Long id);
	public List<Doctor> getAllDoctor();
	public List<Hospital> getAllHospitals();
	public List<Doctor> getAllHospitalDoctors(Long hospitalId);
	
}
