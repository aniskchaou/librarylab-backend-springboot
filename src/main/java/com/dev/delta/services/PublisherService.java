package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Publisher;
import com.dev.delta.repositories.PublisherRepository;

@Service
public class PublisherService {
	@Autowired
	PublisherRepository publisherRepository;

	public Publisher saveOrUpdate(Publisher publisher) {

		return publisherRepository.save(publisher);
	}

	public Iterable<Publisher> findAll() {
		return publisherRepository.findAll();
	}

	public Publisher findById(Long id) {
		return publisherRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Publisher publisher = findById(id);
		publisherRepository.delete(publisher);
	}
}
