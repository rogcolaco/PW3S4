package org.eletronicOrganizer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.eletronicOrganizer.model.Commitment;
import org.eletronicOrganizer.model.Contact;
import org.eletronicOrganizer.model.User;
import org.eletronicOrganizer.repository.CommitmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommitmentController {
	
	private CommitmentRepository repository;
	
	@Autowired
	public CommitmentController (CommitmentRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("newCommitment")
	public String newCommitment() {
		return "newCommitment";
	}
	
	@Transactional
	@RequestMapping(value = "registerNewCommitment", method=RequestMethod.POST)
	public String registerNewCommitment(Commitment commitment, HttpSession session) {
		User user = new User();
		user = (User) session.getAttribute("user");
		commitment.setId_user(user.getLogin());
		repository.addCommitment(commitment);
		return "mainMenu";
	}
	
	@Transactional
	@RequestMapping(value = "updateCommitment", method=RequestMethod.POST)
	public String updateCommitment(HttpSession session, Commitment commitment) {
		User user = new User();
		user = (User) session.getAttribute("user");
		commitment.setId_user(user.getLogin());
		repository.update(commitment);
		return "redirect:myCommitments";
	}
	
	@RequestMapping("myCommitments")
	public String readAll(Model model, HttpSession session) {
		User user = new User();
		user = (User) session.getAttribute("user");
		model.addAttribute("commitments", repository.readAll(user.getLogin()));
		return "myCommitments";
	}
	
	@Transactional
	@RequestMapping(value="removeCommitment", method = RequestMethod.GET)
	public String removeCommitment(Commitment commitment) {
		Commitment c = repository.find(commitment.getId());
		repository.removeCommitment(c);
		return "redirect:myCommitments";
	}
	
	@Transactional
	@RequestMapping(value="selectCommitment")
	public String selectCommitment(Model model, Commitment commitment) {
		Commitment c = repository.find(commitment.getId());
		model.addAttribute("commitments", repository.find(commitment.getId()));
		return "selectCommitment";
	}

}
