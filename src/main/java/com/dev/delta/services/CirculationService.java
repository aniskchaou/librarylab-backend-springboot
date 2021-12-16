package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Circulation;
import com.dev.delta.repositories.CirculationRepository;

@Service
public class CirculationService {
	@Autowired
	CirculationRepository circulationRepository;

	public Circulation saveOrUpdate(Circulation circulation) {

		return circulationRepository.save(circulation);
	}

	public Iterable<Circulation> findAll() {
		return circulationRepository.findAll();
	}

	public Circulation findById(Long id) {
		return circulationRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Circulation circulation = findById(id);
		circulationRepository.delete(circulation);
	}
}
