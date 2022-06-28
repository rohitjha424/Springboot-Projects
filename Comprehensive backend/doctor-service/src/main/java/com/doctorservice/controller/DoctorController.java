package com.doctorservice.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctorservice.entity.Doctor;

import com.doctorservice.service.DoctorService;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {
	
	
	
	@Autowired
    private DoctorService doctorService;
	
// ///////////// Add a doctor /////////////////////////
	
    @PostMapping("/")
    public String registerDoctor(@RequestBody Doctor doctor) {
    	return doctorService.registerDoctor(doctor);
        
    }
    
    
  ////////////////////get all Doctors////////////////////
    
    @GetMapping("/getAllDoctors")
    public List<Doctor> findAllDoctors() {
        return doctorService.findAll();
    }
    
    ////////////get Doctor by Id/////////////////////////
    
    @GetMapping("/{id}")
	public Doctor fetchDoctorById(@PathVariable("id")Long doctId){
		
		return doctorService.fetchDoctorById(doctId);
		
	}
    
    
    /////////////////get Doctor by name ///////////////////////
    
    
    @GetMapping("/docName/{docName}")
	public Doctor fetchDoctorByName(@PathVariable("docName")String docName){
		
		return doctorService.fetchDoctorByName(docName);
		
	}
    
    
    /////////////////UPDATE DOCTOR INFORMATION////////////////////
    
    @PutMapping("/{id}")
   	public Doctor updateDoctor(@PathVariable("id") Long doctId, 
   											@RequestBody Doctor doctor) {
   		 
   		 return doctorService.updateDoctor(doctId,doctor);
   		
   	}
    
    
    //////////////////Delete a Doctor///////////////
    
    @DeleteMapping("/{id}")
	public List<Doctor> deleteDoctorById(@PathVariable("id")Long doctId) {
		

		
		return doctorService.deleteDoctorById(doctId);
		
	}
    
    
    

}
