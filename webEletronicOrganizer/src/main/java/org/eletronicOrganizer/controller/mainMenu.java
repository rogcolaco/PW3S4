package org.eletronicOrganizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainMenu {
	
	@RequestMapping("mainMenu")
	public String mainMenu() {
		return "mainMenu";
	}

}
