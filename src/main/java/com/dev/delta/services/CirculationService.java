package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Circulation;
import com.dev.delta.repositories.CirculationRepository;

/**
 * CirculationService
 * 
 * @author Admin
 *
 */
@Service
public class CirculationService {

	/**
	 * CirculationRepository
	 */
	@Autowired
	CirculationRepository circulationRepository;

	public long count() {

		return circulationRepository.count();
	}

	/**
	 * saveOrUpdate
	 * 
	 * @param circulation
	 * @return
	 */
	public Circulation saveOrUpdate(Circulation circulation) {
		return circulationRepository.save(circulation);
	}

	/**
	 * findAll
	 * 
	 * @return
	 */
	public Iterable<Circulation> findAll() {
		return circulationRepository.findAll();
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Circulation findById(Long id) throws Exception {
		return circulationRepository.findById(id).orElseThrow(() -> new Exception("not Found"));
	}

	/**
	 * delete
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void delete(Long id) throws Exception {
		Circulation circulation = findById(id);
		circulationRepository.delete(circulation);
	}

	public Iterable<Circulation> findReturnedBook() throws Exception {
		return circulationRepository.findReturnedBooks();
	}

	public List<Circulation> filterCirculationCriteria(int member_id, int book_id, int category_id) throws Exception {
		return circulationRepository.findBookFilter(member_id, book_id, category_id);
	}

	public void returnBook(int id) {
		circulationRepository.returnBook(id);

	}
}
