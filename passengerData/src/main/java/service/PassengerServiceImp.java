package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Passenger;
import repository.PassengerRepository;
@Service
public class PassengerServiceImp implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;
	
	
	@Override
	public Passenger savePassenger(Passenger passenger) {
		
		return passengerRepository.save(passenger);
		
	}

	
	public PassengerServiceImp(PassengerRepository passengerrepo) {
		super();
		this.passengerRepository = passengerrepo;
	}


	@Override
	public List<Passenger> showPassenger() {
		
		return passengerRepository.findAll() ;
	}

}
