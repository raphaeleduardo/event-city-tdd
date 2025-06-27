package com.devraphael.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devraphael.desafio.entities.Event;

@Repository	
public interface EventRepository extends JpaRepository<Event, Long> {

}
