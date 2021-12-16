package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.repositories.CategoryBookRepository;

@Service
public class CategoryBookService {
	@Autowired
	CategoryBookRepository categoryRepository;

	public Category saveOrUpdate(Category category) {

		return categoryRepository.save(category);
	}

	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Category findById(Long id) {
		return categoryRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Category category = findById(id);
		categoryRepository.delete(category);
	}
}
