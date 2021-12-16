package com.dev.delta.analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analytics")
@CrossOrigin
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;

	@GetMapping("/books")
	public IssueBookAnalytics getAllBooks() {
		IssueBookAnalytics issueBookAnalytics = new IssueBookAnalytics();
		issueBookAnalytics.setDays(analyticsService.findAllDays());
		issueBookAnalytics.setNumberIssueBook(analyticsService.findBooksByDate());

		return issueBookAnalytics;
	}

	@GetMapping("/booksbycategory")
	public BookCategoryAnalytics getAllBooksByCategory() {
		BookCategoryAnalytics bookCategoryAnalytics = new BookCategoryAnalytics();
		bookCategoryAnalytics.setBooks(analyticsService.findBookByCategory());
		bookCategoryAnalytics.setCategories(analyticsService.findCategries());

		return bookCategoryAnalytics;
	}

	@GetMapping("/dashboardanalytics")
	public DashboardAnalytics getDashboardAnalytics() {
		return analyticsService.findDashboardAnalytics();

	}
}
