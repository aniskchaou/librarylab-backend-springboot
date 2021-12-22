package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.RequestedBook;
import com.dev.delta.repositories.RequestedBookRepository;

/**
 * RequestedBookService
 * @author Admin
 *
 */
@Service
public class RequestedBookService {
	/**
	 * RequestedBookRepository
	 */
	@Autowired
	RequestedBookRepository requestedRequestedBookRepository;

	/**
	 * saveOrUpdate
	 * @param requestedRequestedBook
	 * @return
	 */
	public RequestedBook saveOrUpdate(RequestedBook requestedRequestedBook) {
		return requestedRequestedBookRepository.save(requestedRequestedBook);
	}

	/**
	 * findAll
	 * @return
	 */
	public Iterable<RequestedBook> findAll() {
		return requestedRequestedBookRepository.findAll();
	}

	/**
	 * findById
	 * @param id
	 * @return
	 */
	public RequestedBook findById(Long id) {
		return requestedRequestedBookRepository.findById(id).orElseThrow();
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		RequestedBook requestedRequestedBook = findById(id);
		requestedRequestedBookRepository.delete(requestedRequestedBook);
	}
}
