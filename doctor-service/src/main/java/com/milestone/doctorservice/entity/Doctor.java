package com.milestone.doctorservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Doctor {

	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer docId;
    private String docName;
    private String specialist; 
    private Integer yearsOfExperinec;
    
    
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Integer getYearsOfExperinec() {
		return yearsOfExperinec;
	}
	public void setYearsOfExperinec(Integer yearsOfExperinec) {
		this.yearsOfExperinec = yearsOfExperinec;
	}
	
	public Doctor() {
		
	}
	
	public Doctor(Integer docId, String docName, String specialist, Integer yearsOfExperinec) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.specialist = specialist;
		this.yearsOfExperinec = yearsOfExperinec;
	}
	
	

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + ", specialist=" + specialist + ", yearsOfExperinec="
				+ yearsOfExperinec + "]";
	}

	
    
    
    
}
