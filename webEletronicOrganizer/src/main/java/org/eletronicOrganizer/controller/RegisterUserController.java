package org.eletronicOrganizer.controller;

import javax.transaction.Transactional;

import org.eletronicOrganizer.model.User;
import org.eletronicOrganizer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterUserController {

	
	private UserRepository repository;
	
	@Autowired
	public RegisterUserController(UserRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("registerUser")
	public String registerForm() {
		return "registerUser";
	}
	
	@Transactional
	@RequestMapping(value = "registerUser", method=RequestMethod.POST)
	public String cadastrar(User user) {
		repository.addUser(user);
		return "redirect:login";
	}

}
