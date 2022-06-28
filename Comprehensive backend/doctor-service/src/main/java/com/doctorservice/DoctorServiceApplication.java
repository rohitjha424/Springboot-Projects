package com.doctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}














/* If Port Number already in use and Web server fails to start then follow this:
 * 
 *  Open cmd 
 *  
 *  		netstat -ano | findstr :8080
 *  
 * 			taskkill /PID <PID> /F
 */
