package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Author;
import com.cg.util.AutUtil;

public class AuthorDaoImpl implements AuthorDao {

	@Override
	public boolean create(Author aut) {
		try {
		EntityManager em=AutUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(aut);
		em.getTransaction().commit();
		return true;
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;

}

	@Override
	public Author getAut(int id) {
		Author emp = null;
		try {
		EntityManager em=AutUtil.getEntityManager();
		emp=em.find(Author.class,id);
		}catch(Exception e)
		{
			
		}
		return emp;
	}

	@Override
	public boolean update(Author aut) {
		try {
			EntityManager em=AutUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(aut);
			em.getTransaction().commit();
			return true;
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public boolean delete(Author aut) {
		try {
			EntityManager em=AutUtil.getEntityManager();
			em.getTransaction().begin();
			em.remove(aut);
			em.getTransaction().commit();
			return true;
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			return false;
	}
}
