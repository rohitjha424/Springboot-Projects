package com.springboot.employeeData.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Integer salary;
	
	
		

	public Employee() {
		
	}

	public Employee(Integer id, String name, Integer age, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Id	
//	@Column(name="id")	
//	private Integer id;
//	@Column(name="name")
//	private String name;
//	@Column(name="age")
//	private Integer age;
//	private Integer salary;
//	
//	
//	public Employee(Integer id, String name, Integer age, Integer salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
//
//
//
//	@Column(name="salary")
//	private Integer salary;
//	
//	
//	
//	public Employee() {
//	}
//
//
//
//	public Integer getId() {
//		return id;
//	}
//
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//
//
//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	public Integer getAge() {
//		return age;
//	}
//
//
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//
//
//	public Integer getSalary() {
//		return salary;
//	}
//
//
//
//	public void setSalary(Integer salary) {
//		this.salary = salary;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
//	}
//	
	
	

}
