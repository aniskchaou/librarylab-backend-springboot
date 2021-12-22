package com.dev.delta.analytics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Category;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.repositories.CategoryBookRepository;
import com.dev.delta.repositories.CirculationRepository;
import com.dev.delta.repositories.MemberRepository;

/**
 * AnalyticsService
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
	MemberRepository memberRepository;

	/**
	 * findAllDays
	 * @return
	 */
	public List<String> findAllDays() {
		List<String> allBooksList = new ArrayList<String>();
		circulationRepository.findAllCirculations().forEach(item -> {
			String issueDate = item;
			allBooksList.add(issueDate);
		});
		;

		return allBooksList;
	}

	/**
	 * findBooksByDate
	 * @return
	 */
	public List<String> findBooksByDate() {
		List<String> allDaysList = new ArrayList<String>();
		circulationRepository.findBookByDate().forEach(item -> {
			Integer numBooks = (item);
			System.out.println(numBooks);
			allDaysList.add(numBooks.toString());
		});
		;

		return allDaysList;
	}

	/**
	 * findCategries
	 * @return
	 */
	public List<String> findCategries() {
		List<String> categoryNames = new ArrayList<String>();
		List<Category> categories = categoryBookRepository.findAll();

		categories.forEach(item -> {
			categoryNames.add(item.getCategory_name());
		});

		return categoryNames;
	}

	/**
	 * findBookByCategory
	 * @return
	 */
	public List<Integer> findBookByCategory() {
		List<Integer> bookByCategories = bookRepository.findBooksByCategory();

		return bookByCategories;
	}

	/**
	 * findDashboardAnalytics
	 * @return
	 */
	public DashboardAnalytics findDashboardAnalytics() {
		DashboardAnalytics dashboardAnalytics = new DashboardAnalytics();
		dashboardAnalytics.setBookNumber(bookRepository.count());
		dashboardAnalytics.setCategoryNumber(categoryBookRepository.count());
		dashboardAnalytics.setIssueBookNumber(circulationRepository.count());
		dashboardAnalytics.setMemberNumber(memberRepository.count());
		;
		return dashboardAnalytics;
	}

}
