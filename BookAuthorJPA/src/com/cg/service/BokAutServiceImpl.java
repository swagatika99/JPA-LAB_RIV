package com.cg.service;

import java.util.List;

import com.cg.dao.BokAutDaoImpl;
import com.cg.entity.Book;

public class BokAutServiceImpl implements BokAutService {
   BokAutDaoImpl bdao=new BokAutDaoImpl();
	@Override
	public List<Book> getAllBooks() {
		return bdao.getAllBooks();
	}

	@Override
	public List<Book> getBooksByAuthor(String author_name) {
		return bdao.getBooksByAuthor(author_name);
	}

	@Override
	public List<Book> getBooksByPriceRange(double min, double max) {
		if(min>=0&&max>0&&min<max)
			return bdao.getBooksByPriceRange(min, max);
		else
			return null;
	}

	@Override
	public List<String> getAuthorName(long b_id) {

		if(b_id>0)
			return bdao.getAuthorName(b_id);
		else
			return null;
	}

}
