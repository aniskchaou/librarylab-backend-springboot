package com.dev.delta.analytics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Book;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.Income;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.repositories.CategoryBookRepository;
import com.dev.delta.repositories.CirculationRepository;
import com.dev.delta.repositories.ExpenseRepository;
import com.dev.delta.repositories.IncomeRepository;
import com.dev.delta.repositories.PaymentRepository;

/**
 * AnalyticsService
 * 
 * @author Admin
 *
 */
@Service
public class AnalyticsService {

	@Autowired
	CirculationRepository circulationRepository;

	@Autowired
	CategoryBookRepository categoryBookRepository;

	@Autowired
	BookRepository bookRepository;

	@Autowired
	PaymentRepository memberRepository;

	@Autowired
	ExpenseRepository expenseRepository;

	@Autowired
	IncomeRepository incomeRepository;

	public List<Income> getIncomes() {
		return incomeRepository.findAll();
	}

	public List<Expense> getExpenses() {
		return expenseRepository.findAll();
	}

	public List<Book> getBooksByCategories() {
		return bookRepository.getBooksByCategory();
	}

	public List<Book> getBooksByAuthors() {
		return bookRepository.getBooksByAuhor();
	}

	public List<Book> getBooksByPublishers() {
		return bookRepository.getBooksByPublisher();
	}

	public Long getBookByCategory(Long id) {
		return bookRepository.getBookByCategory(id.intValue());
	}

	public Long getBookByPublisher(Long id) {
		return bookRepository.getBookPublisher(id.intValue());
	}

	public Long getBookByAuthor(Long id) {
		return bookRepository.getBookByWriter(id.intValue());
	}

}
