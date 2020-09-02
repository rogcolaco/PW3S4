package org.eletronicOrganizer.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.eletronicOrganizer.model.Contact;
import org.eletronicOrganizer.model.ContactsSchedule;
import org.eletronicOrganizer.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void addUserContact(User user, Contact contact) {
		ContactsSchedule cs = new ContactsSchedule();
		cs.setUser(user);
		cs.setContacts(contact);
		manager.persist(cs);
	}

}
