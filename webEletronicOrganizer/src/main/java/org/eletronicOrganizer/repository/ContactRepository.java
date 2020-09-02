package org.eletronicOrganizer.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.eletronicOrganizer.model.Contact;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

	@PersistenceContext
	private EntityManager manager;
	
	public void addContact(Contact contact) {
		manager.persist(contact);
	}
}
