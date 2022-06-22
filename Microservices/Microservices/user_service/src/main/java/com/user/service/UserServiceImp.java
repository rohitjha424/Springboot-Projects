package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImp implements UserService{

	List<User> list = List.of(
			
			new User(1311L, "Rohit Kumar Jha", "123456789"),
			new User(1312L, "Bharti Singh Rana", "23638292"),
			new User(1313L, "Rahul Kumar", "732267262")
		
			
			);
	
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
