package com.milestone.doctorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milestone.doctorservice.entity.Doctor;
import com.milestone.doctorservice.service.DoctorService;
import com.milestone.doctorservice.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/doctors")
@Slf4j
public class DoctorController {
	
	
	@Autowired
    private DoctorService doctorService;

    @PostMapping("/")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/{id}")
   public ResponseTemplateVO getDoctorWithHospital(@PathVariable("id") Integer doctorId) {
        
        return doctorService.getDoctorWithHospital(doctorId);
    }
    
    
    
    

}
