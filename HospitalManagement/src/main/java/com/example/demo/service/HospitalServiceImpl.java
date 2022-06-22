package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.repository.DoctorRepo;
import com.example.demo.repository.HospitalRepo;

@Service
public class HospitalServiceImpl implements HospitalService {

	private final DoctorRepo doctorRepo;
	private final HospitalRepo hospitalRepo;

	@Autowired
	public HospitalServiceImpl(DoctorRepo doctorRepo, HospitalRepo hospitalRepo) {
		super();
		this.doctorRepo = doctorRepo;
		this.hospitalRepo = hospitalRepo;
	}

	@Override
	public Hospital addHospital(Hospital hospital) {
		return hospitalRepo.save(hospital);
	}

	@Override
	public Hospital updateHospitalById(Long id, Hospital hospital) {
		hospital.setId(id);
		hospitalRepo.save(hospital);
		return hospital;
	}

	@Override
	public void deleteHospitalById(Long id) {
		hospitalRepo.deleteById(id);
	}

	@Override
	public Doctor addDoctor(Doctor buyer) {
		return doctorRepo.save(buyer);
	}

	@Override
	public Optional<Hospital> findHospitalById(Long id) {
		return hospitalRepo.findById(id);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return doctorRepo.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorDetails(Long productId) {
		// TODO Auto-generated method stub
		return doctorRepo.findById(productId);
	}

	@Override
	public List<Hospital> getAllHospitals() {
		// TODO Auto-generated method stub
		return hospitalRepo.findAll();
	}

	@Override
	public List<Doctor> getAllHospitalDoctors(Long hospitalId) {
		// TODO Auto-generated method stub
		if (hospitalRepo.findById(hospitalId).isPresent()) {
			Hospital hospital = hospitalRepo.findById(hospitalId).get();
			return hospital.getDoctors();
		} else
			throw new DataNotFoundException("No Hospital Found");
	}

}
