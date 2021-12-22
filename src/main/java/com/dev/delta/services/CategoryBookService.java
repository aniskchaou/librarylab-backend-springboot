package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.repositories.CategoryBookRepository;

/**
 * CategoryBookService
 * @author Admin
 *
 */
@Service
public class CategoryBookService {
	
	/**
	 * CategoryBookRepository
	 */
	@Autowired
	CategoryBookRepository categoryRepository;

	/**
	 * saveOrUpdate
	 * @param category
	 * @return
	 */
	public Category saveOrUpdate(Category category) {
		return categoryRepository.save(category);
	}

	/**
	 * findAll
	 * @return
	 */
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	/**
	 * findById
	 * @param id
	 * @return
	 */
	public Category findById(Long id) {
		return categoryRepository.findById(id).orElseThrow();
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		Category category = findById(id);
		categoryRepository.delete(category);
	}
}
