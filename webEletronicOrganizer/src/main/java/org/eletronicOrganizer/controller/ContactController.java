package org.eletronicOrganizer.controller;

import org.eletronicOrganizer.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
