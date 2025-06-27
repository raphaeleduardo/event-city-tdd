package com.devraphael.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devraphael.desafio.dto.EventDTO;
import com.devraphael.desafio.entities.City;
import com.devraphael.desafio.entities.Event;
import com.devraphael.desafio.exceptions.ResourceNotFoundException;
import com.devraphael.desafio.repository.EventRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	
	@Transactional
	public EventDTO update(Long id, EventDTO dto) {
		try {
			Event entity = repository.getReferenceById(id);
			entity.setName(dto.getName());
			entity.setDate(dto.getDate());
			entity.setUrl(dto.getUrl());
			entity.setCity(new City(dto.getCityId(), null));
			entity = repository.save(entity);
			return new EventDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}
}
