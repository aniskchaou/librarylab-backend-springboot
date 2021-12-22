package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.CirculationStatus;
import com.dev.delta.repositories.CirculationStatusRepository;

/**
 * CirculationStatusService
 * 
 * @author Admin
 *
 */
@Service
public class CirculationStatusService {
	/**
	 * CirculationStatusRepository
	 */
	@Autowired
	CirculationStatusRepository circulationStatusRepository;

	/**
	 * saveOrUpdate
	 * 
	 * @param circulationStatus
	 * @return
	 */
	public CirculationStatus saveOrUpdate(CirculationStatus circulationStatus) {

		return circulationStatusRepository.save(circulationStatus);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<CirculationStatus> findAll() {
		return circulationStatusRepository.findAll();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public CirculationStatus findById(Long id) {
		return circulationStatusRepository.findById(id).orElseThrow();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		CirculationStatus circulationStatus = findById(id);
		circulationStatusRepository.delete(circulationStatus);
	}
}
