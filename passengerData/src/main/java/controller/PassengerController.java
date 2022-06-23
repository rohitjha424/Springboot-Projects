package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Passenger;
import service.PassengerService;



@RestController
public class PassengerController {
	
	
	
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/passengers")
	public Passenger savePassenger(@RequestBody Passenger passenger ) {
		
		return passengerService.savePassenger(passenger);
		
		
	}
	
	@GetMapping("/passengers")
	public List<Passenger> showPassenger() {
		
		return passengerService.showPassenger()
		
	}
	
	
	
	
}
