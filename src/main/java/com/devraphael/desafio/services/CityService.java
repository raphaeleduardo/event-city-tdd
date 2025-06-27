package com.devraphael.desafio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devraphael.desafio.dto.CityDTO;
import com.devraphael.desafio.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
	public List<CityDTO> findAll() {
		return repository.findAll(Sort.by("name")).stream()
				.map(x -> new CityDTO(x)).collect(Collectors.toList());
	}
}
