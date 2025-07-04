package com.devraphael.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devraphael.desafio.dto.EventDTO;
import com.devraphael.desafio.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventController {

	@Autowired
	private EventService service;

	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
}
