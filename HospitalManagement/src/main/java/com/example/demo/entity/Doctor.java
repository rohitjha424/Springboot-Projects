package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Doctor {
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Doctor_id")
	private Long id;
	
	@Column(name="doctor_name")
	private String name;
	@Column
	private String yearsOfExperience;
	@Column
	private String speciality;
	
	@OneToOne
	@JsonIgnore
	private Hospital hospital;
	
	protected Doctor() {
		
	}

	public Doctor(String name, String age, String location) {
		super();
		this.name = name;
		this.yearsOfExperience = age;
		this.speciality = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return yearsOfExperience;
	}

	public void setAge(String age) {
		this.yearsOfExperience = age;
	}

	public String getLocation() {
		return speciality;
	}

	public void setLocation(String location) {
		this.speciality = location;
	}
	

	
	@Override
	public String toString() {
		return "Buyer [id=" + id + ", name=" + name + ", age=" + yearsOfExperience + ", location=" + speciality + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(id, other.id);
	}
	
}
