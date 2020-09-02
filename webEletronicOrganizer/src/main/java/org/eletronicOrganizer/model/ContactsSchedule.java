package org.eletronicOrganizer.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ContactsSchedule {
	
	@Id
	@GeneratedValue
	Integer id;
	@OneToOne
	User user;
	@OneToOne
	Contact contacts;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Contact getContacts() {
		return contacts;
	}
	public void setContacts(Contact contacts) {
		this.contacts = contacts;
	}

}
