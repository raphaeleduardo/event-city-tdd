package com.devraphael.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devraphael.desafio.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
}
