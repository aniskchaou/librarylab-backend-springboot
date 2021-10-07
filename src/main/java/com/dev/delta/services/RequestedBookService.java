package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.RequestedBook;
import com.dev.delta.repositories.RequestedBookRepository;


@Service
public class RequestedBookService {
	@Autowired
	RequestedBookRepository  requestedRequestedBookRepository;
	
	public RequestedBook saveOrUpdate(RequestedBook requestedRequestedBook)
	{
		
		return requestedRequestedBookRepository.save(requestedRequestedBook);
	}
	
	public Iterable<RequestedBook> findAll()
	{
		return requestedRequestedBookRepository.findAll();
	}
	
	public RequestedBook findById(Long id)
	{
		return requestedRequestedBookRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		RequestedBook requestedRequestedBook=findById(id);
		requestedRequestedBookRepository.delete(requestedRequestedBook);
	}
}
