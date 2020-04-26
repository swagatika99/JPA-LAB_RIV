package com.cg.service;

import java.util.List;

import com.cg.entity.Book;

public interface BokAutService {
	public List<Book> getAllBooks();

	public List<Book> getBooksByAuthor(String author_name);

	public List<Book> getBooksByPriceRange(double min, double max);

	public List<String> getAuthorName(long b_id);

}
