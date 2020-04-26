package com.cg.dao;

import com.cg.entity.Author;

public interface AuthorDao {

	boolean create(Author aut);

	Author getAut(int id);

	boolean update(Author aut);

	boolean delete(Author aut);



}
