package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.CirculationStatus;
import com.dev.delta.repositories.CirculationStatusRepository;

@Service
public class CirculationStatusService {
	@Autowired
	CirculationStatusRepository circulationStatusRepository;

	public CirculationStatus saveOrUpdate(CirculationStatus circulationStatus) {

		return circulationStatusRepository.save(circulationStatus);
	}

	public Iterable<CirculationStatus> findAll() {
		return circulationStatusRepository.findAll();
	}

	public CirculationStatus findById(Long id) {
		return circulationStatusRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		CirculationStatus circulationStatus = findById(id);
		circulationStatusRepository.delete(circulationStatus);
	}
}
