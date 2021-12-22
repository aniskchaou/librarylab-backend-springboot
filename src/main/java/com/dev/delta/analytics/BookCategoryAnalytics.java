package com.dev.delta.analytics;

import java.util.List;

public class BookCategoryAnalytics {

	private List<Integer> books;
	private List<String> categories;

	public List<Integer> getBooks() {
		return books;
	}

	public void setBooks(List<Integer> list) {
		this.books = list;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

}
