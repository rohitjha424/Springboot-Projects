package com.milestone.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milestone.hospital.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

    Hospital findByhospitalId(Integer hospitalId);

	Hospital findByHospitalId(Integer hospitalId);
}

