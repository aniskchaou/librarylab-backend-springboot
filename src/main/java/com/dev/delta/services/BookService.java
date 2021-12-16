package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Book;
import com.dev.delta.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public Book saveOrUpdate(Book book) {

		return bookRepository.save(book);
	}

	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findById(Long id) {
		return bookRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Book book = findById(id);
		bookRepository.delete(book);
	}

	public Book filterBook(String edition_year, String publishing_year, String publishing_place,
			String number_of_pages) {
		return bookRepository.findBookFilter(edition_year, publishing_year, publishing_place, number_of_pages);
	}
}
