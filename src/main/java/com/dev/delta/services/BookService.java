package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Book;
import com.dev.delta.repositories.BookRepository;

/**
 * BookService
 * 
 * @author Admin
 *
 */
@Service
public class BookService {

	/**
	 * BookRepository
	 */
	@Autowired
	BookRepository bookRepository;

	/**
	 * saveOrUpdate
	 * 
	 * @param book
	 * @return
	 */
	public Book saveOrUpdate(Book book) {

		return bookRepository.save(book);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Book findById(Long id) {
		return bookRepository.findById(id).orElseThrow();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		Book book = findById(id);
		bookRepository.delete(book);
	}

	/**
	 * filterBook
	 * 
	 * @param edition_year
	 * @param publishing_year
	 * @param publishing_place
	 * @param number_of_pages
	 * @return
	 */
	public Book filterBook(String edition_year, String publishing_year, String publishing_place,
			String number_of_pages) {
		return bookRepository.findBookFilter(edition_year, publishing_year, publishing_place, number_of_pages);
	}
}
