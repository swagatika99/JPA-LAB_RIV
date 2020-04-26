package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	static EntityManagerFactory emf;
	static EntityManager em;
	public static EntityManager getEntityManager() {
		if(em==null || !em.isOpen()){
		  emf = Persistence.createEntityManagerFactory("autentity");
		  em = emf.createEntityManager();
		}
		return em;
	}
}
