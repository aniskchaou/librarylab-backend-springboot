package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RequestedBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "book_id")
	Book book;
	@ManyToOne
	@JoinColumn(name = "writer_id")
	Writer writer;
	@ManyToOne
	@JoinColumn(name = "category_id")
	Category ctagory;
	String edition;
	String note;
	@ManyToOne
	@JoinColumn(name = "member_id")
	Member member;

	public RequestedBook() {
		// TODO Auto-generated constructor stub
	}

	public RequestedBook(Book book, Writer writer, Category ctagory, String edition, String note, Member member) {
		super();
		this.book = book;
		this.writer = writer;
		this.ctagory = ctagory;
		this.edition = edition;
		this.note = note;
		this.member = member;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public Category getCtagory() {
		return ctagory;
	}

	public void setCtagory(Category ctagory) {
		this.ctagory = ctagory;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
