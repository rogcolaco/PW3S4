package org.eletronicOrganizer.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.eletronicOrganizer.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void addUser(User user) {
		manager.persist(user);
	}
	
	public boolean checkUser(User user) {
		Query query = manager.createQuery("select u from User u where u.login= ?1 and u.password = ?2");
		query.setParameter(1, user.getLogin()).setParameter(2, user.getPassword());
		try {
			query.getSingleResult();
			return true;
		} catch (NoResultException e) {
			return false;
		}
	}

}
