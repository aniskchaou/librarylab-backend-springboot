package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Tag;
import com.dev.delta.repositories.TagRepository;


@Service
public class TagService {
	@Autowired
	TagRepository  tagRepository;
	
	public Tag saveOrUpdate(Tag tag)
	{
		
		return tagRepository.save(tag);
	}
	
	public Iterable<Tag> findAll()
	{
		return tagRepository.findAll();
	}
	
	public Tag findById(Long id)
	{
		return tagRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		Tag tag=findById(id);
		tagRepository.delete(tag);
	}
}
