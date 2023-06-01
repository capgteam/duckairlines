package com.capgemini.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.AircraftDao;
import com.capgemini.model.Aircraft;
import com.capgemini.service.AircraftService;

@Service
public class AircraftServiceImp implements AircraftService{

	@Autowired
	private AircraftDao aircraftDao;
	
	@Override
	public List<Aircraft> findAll() {
		return aircraftDao.findAll();
	}

	@Override
	public Aircraft getOne(Integer aircraft_id) {
		
		return aircraftDao.getOne(aircraft_id);
	}

	@Override
	public void delete(Integer aircraft_id) {
		aircraftDao.delete(aircraft_id);
	}

	@Override
	public Aircraft saveAndFlush(Aircraft aircraft) {
		
		return aircraftDao.saveAndFlush(aircraft);
	}

	@Override
	public Aircraft save(Aircraft aircraft) {
		
		return aircraftDao.save(aircraft);
	}

}
