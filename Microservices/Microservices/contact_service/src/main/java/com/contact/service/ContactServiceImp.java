package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImp implements ContactService{

List<Contact> list = List.of(
			
			new Contact(1L, "amit@gmail.com", "Amit", 1311L),
			new Contact(2L, "rohan@gmail.com", "Rohan", 1312L),
			new Contact(3L, "rachit@gmail.com", "Rachit", 1313L),
			new Contact(4L, "priya@gmail.com", "Priya", 1314L)
			
			);

	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
