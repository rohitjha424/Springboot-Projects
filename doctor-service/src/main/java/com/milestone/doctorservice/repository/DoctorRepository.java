package com.milestone.doctorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milestone.doctorservice.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

	Doctor findByDoctorId(Integer doctorId);
	
	
   // User findByUserId(Long userId);
}
