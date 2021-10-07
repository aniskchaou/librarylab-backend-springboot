package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Archive;
import com.dev.delta.repositories.ArchiveRepository;


@Service
public class ArchiveService {
	@Autowired
	ArchiveRepository  archiveRepository;
	
	public Archive saveOrUpdate(Archive archive)
	{
		
		return archiveRepository.save(archive);
	}
	
	public Iterable<Archive> findAll()
	{
		return archiveRepository.findAll();
	}
	
	public Archive findById(Long id)
	{
		return archiveRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Archive archive=findById(id);
		archiveRepository.delete(archive);
	}
}
