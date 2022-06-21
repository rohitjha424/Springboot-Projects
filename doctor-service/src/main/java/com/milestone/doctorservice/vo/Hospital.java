package com.milestone.doctorservice.vo;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hospital {

    private Long hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    
    
    public Hospital() {
    	
    }
    
	public Hospital(Long hospitalId, String hospitalName, String hospitalAddress) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
	}
    
    
  
}