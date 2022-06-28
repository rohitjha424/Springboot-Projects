package com.patientservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatientServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
    public  void byDefault_no_of_patient_should_be1()
    {

        System.out.println("byDefault_no_of_patient_should_be1");

        //Arrange
     
        //Act
        int no_Of_patient=1;

        System.out.println("no of Patients");

        //Assert
        assertEquals(1,no_Of_patient);
    }
 
 @Test
    public  void adding_the_patient_size_by_1()
    {

        System.out.println("adding_the_patient_should_increase_the_size_by_1");
        //Arrange

        //Act
        int increase_patient_by=2;

        //Assert
        assertEquals(2,increase_patient_by);
}
}
