package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Circulation;
import com.dev.delta.repositories.CirculationRepository;

/**
 * CirculationService
 * 
 * @author Admin
 *
 */
@Service
public class CirculationService {

	/**
	 * CirculationRepository
	 */
	@Autowired
	CirculationRepository circulationRepository;

	/**
	 * saveOrUpdate
	 * 
	 * @param circulation
	 * @return
	 */
	public Circulation saveOrUpdate(Circulation circulation) {
		return circulationRepository.save(circulation);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<Circulation> findAll() {
		return circulationRepository.findAll();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	public Circulation findById(Long id) throws Exception {
		return circulationRepository.findById(id).orElseThrow(() -> new Exception("not Found"));
	}

	/**
	 * delete
	 * 
	 * @param id
	 * @throws Exception 
	 */
	public void delete(Long id) throws Exception {
		Circulation circulation = findById(id);
		circulationRepository.delete(circulation);
	}
}
