package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.model.Aircraft;

@Service
public interface AircraftService {
	List<Aircraft> findAll();
	Aircraft getOne(Integer aircraft_id);
	void delete(Integer aircraft_id);
	Aircraft saveAndFlush(Aircraft aircraft);
	Aircraft save(Aircraft aircraft);
}
