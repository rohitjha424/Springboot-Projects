package com.milestone.doctorservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milestone.doctorservice.entity.Doctor;
import com.milestone.doctorservice.repository.DoctorRepository;
import com.milestone.doctorservice.vo.Hospital;
import com.milestone.doctorservice.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DoctorService {
	
	 @Autowired
	    private DoctorRepository doctorRepository;

	
	public Doctor saveDoctor(Doctor doctor) {
        
        return doctorRepository.save(doctor);
    }

//
//	public ResponseTemplateVO getUserWithDepartment(Integer doctorId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public ResponseTemplateVO getUserWithDepartment(Integer doctorId) {
        
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Doctor doctor = doctorRepository.findByDoctorId(doctorId);

        Hospital hospital = restTemplate.getForObject("http://HOSPITAL-SERVICE/hospitals/" + doctor.getHospitalId()
                        ,Hospital.class);

        vo.setDoctor(doctor);
        vo.setHospital(hospital);

        return  vo;
    }


}
