package com.dev.delta.analytics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entities.Book;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.Income;
import com.dev.delta.services.BookService;
import com.dev.delta.services.CategoryBookService;
import com.dev.delta.services.CirculationService;
import com.dev.delta.services.MemberService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/analytics")
@CrossOrigin
@Api(value = "BookController", description = " this is the analytics controller class")
/**
 * AnalyticsController
 * 
 * @author Admin
 *
 */
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;
	@Autowired
	CategoryBookService categoryBookService;
	@Autowired
	BookService bookService;
	@Autowired
	CirculationService circulationService;
	@Autowired
	MemberService memberService;

	@GetMapping("/bookbycategory")
	public ResponseEntity<List<Model>> getBooksByCategories() throws Exception {

		List<Model> list = new ArrayList<Model>();
		List<Book> bookRes = analyticsService.getBooksByCategories();
		for (Book book : bookRes) {
			Model m = new Model();
			m.setName(book.getCategory().getCategory_name());
			m.setValue(analyticsService.getBookByCategory(book.getCategory().getId()).toString());
			list.add(m);
		}
		return new ResponseEntity<List<Model>>(list, HttpStatus.OK);

	}

	@GetMapping("/bookbyauthor")
	public ResponseEntity<List<Model>> getBooksByAuthors() throws Exception {

		List<Model> list = new ArrayList<Model>();
		List<Book> bookRes = analyticsService.getBooksByAuthors();
		for (Book book : bookRes) {
			Model m = new Model();
			m.setName(book.getWriter().getName());
			m.setValue(analyticsService.getBookByAuthor(book.getWriter().getId()).toString());
			list.add(m);
		}
		return new ResponseEntity<List<Model>>(list, HttpStatus.OK);

	}

	@GetMapping("/bookbypublisher")
	public ResponseEntity<List<Model>> getBooksByPublisher() throws Exception {

		List<Model> list = new ArrayList<Model>();
		List<Book> bookRes = analyticsService.getBooksByPublishers();
		for (Book book : bookRes) {
			Model m = new Model();
			m.setName(book.getPublisher().getName());
			m.setValue(analyticsService.getBookByPublisher(book.getPublisher().getId()).toString());
			list.add(m);
		}
		return new ResponseEntity<List<Model>>(list, HttpStatus.OK);

	}

	@SuppressWarnings("deprecation")
	@GetMapping("/incomes")
	public ResponseEntity<List<Model>> getIncomeByDate() throws Exception {

		List<Model> list = new ArrayList<Model>();
		List<Income> incomes = analyticsService.getIncomes();
		for (Income icome : incomes) {
			Model m = new Model();
			m.setValue("" + icome.getAmount());
			m.setName(icome.getDate().toLocaleString());
			list.add(m);
		}
		return new ResponseEntity<List<Model>>(list, HttpStatus.OK);

	}

	@SuppressWarnings("deprecation")
	@GetMapping("/expenses")
	public ResponseEntity<List<Model>> getExpensesByDate() throws Exception {

		List<Model> list = new ArrayList<Model>();
		List<Expense> expenses = analyticsService.getExpenses();
		for (Expense expense : expenses) {
			Model m = new Model();
			m.setValue("" + expense.getAmount());
			m.setName(expense.getDate().toLocaleString());
			list.add(m);
		}
		return new ResponseEntity<List<Model>>(list, HttpStatus.OK);

	}

	@GetMapping("/shortanalytics")
	public ResponseEntity<Analytics> getAnalytics() throws Exception {
		long bookNumber = bookService.count();
		long memberNumber = memberService.count();
		long circulationNumber = circulationService.count();
		long categoryNumber = categoryBookService.count();

		Analytics analytics = new Analytics();

		analytics.setBookNumber(bookNumber);
		analytics.setMemberNumber(memberNumber);
		analytics.setIssueBookNumber(circulationNumber);
		analytics.setIssueBookNumber(categoryNumber);

		return new ResponseEntity<Analytics>(analytics, HttpStatus.OK);

	}

}
