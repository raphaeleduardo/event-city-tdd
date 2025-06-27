package com.devraphael.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devraphael.desafio.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
}
