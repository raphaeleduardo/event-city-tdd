package com.devraphael.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devraphael.desafio.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
