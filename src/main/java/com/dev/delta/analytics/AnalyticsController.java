package com.dev.delta.analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/analytics")
@CrossOrigin
@Api(value="BookController",description=" this is the analytics controller class")
/**
 * AnalyticsController
 * @author Admin
 *
 */
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;

	@ApiOperation(value=" get books ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),@ApiResponse(code = 404, message = "not found")})
	@GetMapping("/books")
	public IssueBookAnalytics getAllBooks() {
		IssueBookAnalytics issueBookAnalytics = new IssueBookAnalytics();
		issueBookAnalytics.setDays(analyticsService.findAllDays());
		issueBookAnalytics.setNumberIssueBook(analyticsService.findBooksByDate());

		return issueBookAnalytics;
	}

	@ApiOperation(value=" get book by categoey ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),@ApiResponse(code = 404, message = "not found")})
	@GetMapping("/booksbycategory")
	public BookCategoryAnalytics getAllBooksByCategory() {
		BookCategoryAnalytics bookCategoryAnalytics = new BookCategoryAnalytics();
		bookCategoryAnalytics.setBooks(analyticsService.findBookByCategory());
		bookCategoryAnalytics.setCategories(analyticsService.findCategries());

		return bookCategoryAnalytics;
	}

	@ApiOperation(value=" dashboard analytics ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),@ApiResponse(code = 404, message = "not found")})
	@GetMapping("/dashboardanalytics")
	public DashboardAnalytics getDashboardAnalytics() {
		return analyticsService.findDashboardAnalytics();

	}
}
