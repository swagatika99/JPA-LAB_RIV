package com.cg.service;

import com.cg.dao.AuthorDao;
import com.cg.dao.AuthorDaoImpl;
import com.cg.entity.Author;

public class AuthorServiceImpl implements AuthorService {
private AuthorDao adao=new AuthorDaoImpl();
	@Override
	public boolean create(Author aut) {
       return adao.create(aut);
		
	}
	@Override
	public Author getAut(int id) {
		// TODO Auto-generated method stub
		return adao.getAut(id);
	}
	@Override
	public boolean update(Author aut) {
		// TODO Auto-generated method stub
		return adao.update(aut);
	}
	@Override
	public boolean delete(Author aut) {
		// TODO Auto-generated method stub
		return adao.delete(aut);
	}

}
