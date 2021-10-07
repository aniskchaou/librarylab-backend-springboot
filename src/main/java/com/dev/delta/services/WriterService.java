package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Writer;
import com.dev.delta.repositories.WriterRepository;


@Service
public class WriterService {
	@Autowired
	WriterRepository  writerRepository;
	
	public Writer saveOrUpdate(Writer writer)
	{
		
		return writerRepository.save(writer);
	}
	
	public Iterable<Writer> findAll()
	{
		return writerRepository.findAll();
	}
	
	public Writer findById(Long id)
	{
		return writerRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Writer writer=findById(id);
		writerRepository.delete(writer);
	}
}
