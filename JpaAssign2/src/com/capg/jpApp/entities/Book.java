package com.capg.jpApp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book extends Author2{
@Column(name="isbn")
private int isbn;
@Column(name="title")
private String title;
@Column(name="price")
private int price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int authorId, String authorName,int isbn,String title,int price) {
	super(authorId, authorName);
	this.isbn = isbn;
	this.title = title;
	this.price = price;
	// TODO Auto-generated constructor stub
}

public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price
			+ " , toString()=" + super.toString() + "]";
}
}

