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
		return "mainMenu";
	}
	
	@Transactional
	@RequestMapping(value = "updateContact", method=RequestMethod.POST)
	public String updateContact(HttpSession session, Contact contact) {
		User user = new User();
		user = (User) session.getAttribute("user");
		contact.setId_user(user.getLogin());
		/*System.out.println(contact.getName());
		System.out.println(contact.getPhone());
		System.out.println(contact.getId_user());
		System.out.println(contact.getId());*/
		repository.update(contact);
		return "redirect:myContacts";
	}
	
	@RequestMapping("myContacts")
	public String readAll(Model model, HttpSession session) {
		User user = new User();
		user = (User) session.getAttribute("user");
		model.addAttribute("contacts", repository.readAll(user.getLogin()));
		return "myContacts";
		
	}

	
	@Transactional
	@RequestMapping(value="removeContact", method = RequestMethod.GET)
	public String removeContact(Contact contact) {
		Contact c = repository.find(contact.getId());
		repository.removeContact(c);
		return "redirect:myContacts";
	}
	
	@Transactional
	@RequestMapping(value="selectContact")
	public String selectContact(Model model, Contact contact) {
		Contact c = repository.find(contact.getId());
		model.addAttribute("contacts", repository.find(contact.getId()));
		return "selectContact";
	}
}
