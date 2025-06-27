package com.devraphael.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devraphael.desafio.entities.City;

public interface EventRepository extends JpaRepository<City, Long> {

}
