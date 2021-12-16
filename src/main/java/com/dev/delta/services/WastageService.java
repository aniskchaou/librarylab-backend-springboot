package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Wastage;
import com.dev.delta.repositories.WastageRepository;

@Service
public class WastageService {
	@Autowired
	WastageRepository wastageRepository;

	public Wastage saveOrUpdate(Wastage wastage) {

		return wastageRepository.save(wastage);
	}

	public Iterable<Wastage> findAll() {
		return wastageRepository.findAll();
	}

	public Wastage findById(Long id) {
		return wastageRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Wastage wastage = findById(id);
		wastageRepository.delete(wastage);
	}
}
