package com.library.management.libmgnt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table
public class Book {
//Defining book id as primary key  
	@Id
	@Column
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String bookAuthor;
	@Column
	private double bookPrice;
	@Column
	private Date publisedDate;
	@Column
	private Boolean isAvailable;
	@Column
	private String bookLocation;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Date getPublisedDate() {
		return publisedDate;
	}
	public void setPublisedDate(Date publisedDate) {
		this.publisedDate = publisedDate;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getBookLocation() {
		return bookLocation;
	}
	public void setBookLocation(String bookLocation) {
		this.bookLocation = bookLocation;
	}
	
	
}