package com.capgemini.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Aircraft;

@Repository
@Transactional
public interface AircraftDao extends JpaRepository<Aircraft, Integer>{

}
