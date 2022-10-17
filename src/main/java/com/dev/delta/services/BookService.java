package com.dev.delta.services;

import java.util.List;

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

	public long count() {

		return bookRepository.count();
	}

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
	 * @throws Exception
	 */
	public Book findById(Long id) throws Exception {
		return bookRepository.findById(id).orElseThrow(() -> new Exception("not Found"));
	}

	public List<Book> findArchivedBook() throws Exception {
		return bookRepository.findArchivedBook();
	}

	public List<Book> findDestroyedBook() throws Exception {
		return bookRepository.findDestroyedBook();
	}

	/**
	 * delete
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Long id) throws Exception {
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

	public List<Book> filterBookByCriteria(String edition_year, int authorId, int publisherId, int categoryId) {
		return bookRepository.findBookByCriteria(edition_year, authorId, publisherId, categoryId);
	}

	public List<Book> groupByAuthors() {
		return bookRepository.groupByAuthors();
	}

	public List<Book> groupByEditionYear() {
		return bookRepository.groupByEditionYear();
	}

	public List<Book> groupByPublishers() {
		return bookRepository.groupByPublisher();
	}

	public List<Book> groupByCategories() {
		return bookRepository.groupByCategories();
	}

	public List<Book> filterByYears(int id) {
		// TODO Auto-generated method stub
		return bookRepository.filterByYears(id);
	}

	public List<Book> filterByWriters(int id) {
		// TODO Auto-generated method stub
		return bookRepository.filterByWriters(id);
	}

	public List<Book> filterByCategories(int id) {
		// TODO Auto-generated method stub
		return bookRepository.filterByCategories(id);
	}

	public void archiveBook(int id) {
		bookRepository.archiveBook(id);

	}

	public void destroyBook(int id) {
		bookRepository.destroyBook(id);

	}
}
