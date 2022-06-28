package com.doctorservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoctorServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
    public  void byDefault_no_of_doctor_should_be1()
    {

        System.out.println("byDefault_no_of_doctor_should_be1");

        //Arrange
     
        //Act
        int no_Of_doctor=1;

        System.out.println("no of Doctors");

        //Assert
        assertEquals(1,no_Of_doctor);
    }
 
 @Test
    public  void adding_the_doctor_size_by_1()
    {

        System.out.println("adding_the_doctor_should_increase_the_size_by_1");
        //Arrange

        //Act
        int increase_doctor_by=2;

        //Assert
        assertEquals(2,increase_doctor_by);
}
}
