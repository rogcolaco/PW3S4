package org.eletronicOrganizer.controller;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.eletronicOrganizer.model.Contact;
import org.eletronicOrganizer.model.User;
import org.eletronicOrganizer.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
private ContactRepository repository;
	
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
		contact.setId_user(user.getLogin());
		repository.addContact(contact);
		//System.out.println(user.getLogin());
		//scheduleRepository.addUserContact(user, contact);
		return "mainMenu";
	}
	
	@RequestMapping("myContacts")
	public String readAll(Model model, HttpSession session) {
		User user = new User();
		user = (User) session.getAttribute("user");
		model.addAttribute("contacts", repository.readAll(user.getLogin()));
		return "myContacts";
		
	}
	
	/*@Transactional
	@RequestMapping("removeContact")
	public String removeContact(Contact contact) {
		System.out.println(contact.getId());
		System.out.println(contact.getName());
		//Contact c = repository.find(contact.getId());
		//repository.removeContact(c);
		return "myContacts";
	}*/
	
	@Transactional
	@RequestMapping(value="removeContact", method = RequestMethod.GET)
	public String removeContact(Contact contact) {
		Contact c = repository.find(contact.getId());
		repository.removeContact(c);
		return "redirect:myContacts";
	}
}
