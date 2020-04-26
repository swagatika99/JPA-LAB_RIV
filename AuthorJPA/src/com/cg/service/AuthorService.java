package com.cg.service;

import com.cg.entity.Author;

public interface AuthorService {

	boolean create(Author aut);

	Author getAut(int nextInt);

	boolean update(Author aut);

	boolean delete(Author aut);

}
