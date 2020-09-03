package org.eletronicOrganizer.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.eletronicOrganizer.model.Contact;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {

	@PersistenceContext
	private EntityManager manager;
	
	public void addContact(Contact contact) {
		manager.persist(contact);
	}
	
	public Contact find(int id) {
		return manager.find(Contact.class, id);
	}
	
	public void removeContact(Contact contact) {
		manager.remove(contact);
	}

	
	public List<Contact> readAll(String login){
		List<Contact> contacts = new ArrayList();
		TypedQuery<Contact> query = manager.createQuery("select c from Contact c", Contact.class);
		for (Contact c : query.getResultList()) {
			if (c.getId_user().contentEquals(login)) {
				contacts.add(c);
			}
		}
		return contacts;
	}
	
}
