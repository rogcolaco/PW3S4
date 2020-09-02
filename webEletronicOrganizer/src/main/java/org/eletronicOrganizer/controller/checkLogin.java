package org.eletronicOrganizer.controller;

import javax.servlet.http.HttpSession;

import org.eletronicOrganizer.model.User;
import org.eletronicOrganizer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class checkLogin {
	
	private UserRepository repository;
		
	@Autowired
	public checkLogin(UserRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("login")
	public String loginForm() {
		return "login";
	}

	@RequestMapping(value="checkedLogin", method=RequestMethod.POST)
	public String checkUser(User user, HttpSession session) {
		if(repository.checkUser(user)) {
			session.setAttribute("user", user);
			return "mainMenu";
		}
		return "redirect:login";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return "redirect:login";
	}
	
}
