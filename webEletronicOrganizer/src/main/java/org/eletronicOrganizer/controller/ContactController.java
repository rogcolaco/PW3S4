package org.eletronicOrganizer.controller;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.eletronicOrganizer.model.Contact;
import org.eletronicOrganizer.model.User;
import org.eletronicOrganizer.repository.ContactRepository;
import org.eletronicOrganizer.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
private ContactRepository repository;
private ScheduleRepository scheduleRepository;
	
	@Autowired
	public ContactController (ContactRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("newContact")
	public String newContactForm() {
		return "newContact";
	}
	
	@Transactional
	@RequestMapping(value = "registerNewContact", method=RequestMethod.POST)
	public String registerNewContact(HttpSession session, Contact contact) {
		User user = new User();
		user = (User) session.getAttribute("user");
		repository.addContact(contact);
		//System.out.println(user.getLogin());
		scheduleRepository.addUserContact(user, contact);
		return "mainMenu";
	}

}
