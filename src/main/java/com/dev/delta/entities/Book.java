package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Book
 * @author Admin
 *
 */
@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String isbn;
	private String title;
	@ManyToOne
	@JoinColumn(name = "author_id")
	Writer writer;
	private String edition;
	private String edition_year;
	private String photo;
	@ManyToOne
	@JoinColumn(name = "publisher_id")
	Publisher publisher;
	private String publishing_year;
	private String publication_place;
	private String number_of_pages;
	private String notes;
	private String status;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	
	public Book(Long id, String isbn, String title, Writer writer, String edition, String edition_year, String photo,
			Publisher publisher, String publishing_year, String publication_place, String number_of_pages, String notes,
			String status, Category category) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.edition = edition;
		this.edition_year = edition_year;
		this.photo = photo;
		this.publisher = publisher;
		this.publishing_year = publishing_year;
		this.publication_place = publication_place;
		this.number_of_pages = number_of_pages;
		this.notes = notes;
		this.status = status;
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getEdition_year() {
		return edition_year;
	}

	public void setEdition_year(String edition_year) {
		this.edition_year = edition_year;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getPublishing_year() {
		return publishing_year;
	}

	public void setPublishing_year(String publishing_year) {
		this.publishing_year = publishing_year;
	}

	public String getPublication_place() {
		return publication_place;
	}

	public void setPublication_place(String publication_place) {
		this.publication_place = publication_place;
	}

	public String getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", edition=" + edition
				+ ", edition_year=" + edition_year + ", photo=" + photo + ", publisher=" + publisher
				+ ", publishing_year=" + publishing_year + ", publication_place=" + publication_place
				+ ", number_of_pages=" + number_of_pages + ", notes=" + notes + ", status=" + status + ", category="
				+ category + "]";
	}

}
