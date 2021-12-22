package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Circulation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member memberName;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book bookName;
	@ManyToOne
	@JoinColumn(name = "writer_id")
	private Writer writer;
	private String issueDate;
	private String lastDate;
	private String toReturn;
	private String returnDate;
	private String penalty;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CirculationStatus returnStatus;

	public Circulation() {
		// TODO Auto-generated constructor stub
	}

	public Circulation(Long id, Member memberName, Book bookName, Writer writer, String issueDate, String lastDate,
			String toReturn, String returnDate, String penalty, CirculationStatus returnStatus) {
		super();
		this.id = id;
		this.memberName = memberName;
		this.bookName = bookName;
		this.writer = writer;
		this.issueDate = issueDate;
		this.lastDate = lastDate;
		this.toReturn = toReturn;
		this.returnDate = returnDate;
		this.penalty = penalty;
		this.returnStatus = returnStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Member getMemberName() {
		return memberName;
	}

	public void setMemberName(Member memberName) {
		this.memberName = memberName;
	}

	public Book getBookName() {
		return bookName;
	}

	public void setBookName(Book bookName) {
		this.bookName = bookName;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getToReturn() {
		return toReturn;
	}

	public void setToReturn(String toReturn) {
		this.toReturn = toReturn;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getPenalty() {
		return penalty;
	}

	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public CirculationStatus getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(CirculationStatus returnStatus) {
		this.returnStatus = returnStatus;
	}

}
