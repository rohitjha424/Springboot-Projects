package service;

import org.springframework.stereotype.Service;

import controller.List;
import entity.Passenger;

@Service
public interface PassengerService {

	Passenger savePassenger(Passenger passenger);

	List<Passenger> showPassenger();

}
