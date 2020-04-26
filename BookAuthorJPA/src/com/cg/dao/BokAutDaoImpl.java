package com.cg.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Book;
import com.cg.util.JPAutil;

public class BokAutDaoImpl implements BokAutDao {
JPAutil con;
EntityManager em;

	public BokAutDaoImpl() {
	con=new JPAutil();
	em=con.getEntityManager();
}

	@Override
	public List<Book> getAllBooks() {
		String query= "select b from Book b";
		TypedQuery<Book> t= em.createQuery(query, Book.class);
		return t.getResultList();
	}

	@Override
	public List<Book> getBooksByAuthor(String author_name) {
		Query query=  em.createQuery("select b from Book b join b.authorList a where a.authorName=:author_name");
		query.setParameter("author_name",author_name);
		return query.getResultList();
	}

	@Override
	public List<Book> getBooksByPriceRange(double min, double max) {
		String query= "select b from Book b where price between "+min+" and "+max;
		TypedQuery<Book> t= em.createQuery(query, Book.class);
		return t.getResultList();
	}

	@Override
	public List<String> getAuthorName(long b_id) {
		Query query=  em.createQuery("select a.authorName from Author a join a.bookList b where b.bookIsbn=:b_id");
		query.setParameter("b_id",b_id);
		return query.getResultList();	}

}
