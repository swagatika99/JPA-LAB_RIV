package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="book")
public class Book {
@Id
private long bookIsbn;
private String title;
private double price;
@ManyToMany(targetEntity=Author.class)
private List<Author> authorList = new ArrayList<>();
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(long bookIsbn, String title, double price, List<Author> authorList) {
	super();
	this.bookIsbn = bookIsbn;
	this.title = title;
	this.price = price;
	this.authorList = authorList;
}
public long getBookIsbn() {
	return bookIsbn;
}
public void setBookIsbn(long bookIsbn) {
	this.bookIsbn = bookIsbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<Author> getAuthorList() {
	return authorList;
}
public void setAuthorList(List<Author> authorList) {
	this.authorList = authorList;
}



}
