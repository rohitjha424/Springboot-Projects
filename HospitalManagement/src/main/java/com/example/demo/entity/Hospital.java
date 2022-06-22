package com.example.demo.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hospital {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Hospital_id")
	private Long id;

	@Column(name="product_name")
	private String name;

	@Column(name="location")
	private Long location;

	

	@OneToMany(mappedBy = "hospital",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Doctor> doctors;

	protected Hospital() {

	}

	public Hospital( String name, Long location, Doctor doctor) {
		super();
		
		this.name = name;
		this.location = location;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public Long getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Long location) {
		this.location = location;
	}

	
	/**
	 * @return the doctors
	 */
	public List<Doctor> getDoctors() {
		return doctors;
	}

	/**
	 * @param doctors the doctors to set
	 */
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", location=" + location +  "]";
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
		Hospital other = (Hospital) obj;
		return Objects.equals(id, other.id);
	}

}