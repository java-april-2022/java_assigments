package com.spring.dojoandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.dojoandninjas.models.Dojo;
import com.spring.dojoandninjas.models.Ninja;
import com.spring.dojoandninjas.services.DojoService;
import com.spring.dojoandninjas.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	private DojoService dojos;
	@Autowired
	private NinjaService ninjas;
	
	@GetMapping("/dojos/new")
	public String NewDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinja.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String ShowInfo(@PathVariable("id")Long id, Model model) {
		System.out.printf("dojo id from url: %s", id);
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		return "showInfo.jsp";
	}
	
	//redirect
	
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo")Dojo dojo) {
		Dojo newDojos= dojos.create(dojo);
		System.out.printf("new id: %s", dojo.getId());
		return String.format("redirect:/dojos/%s", newDojos.getId());
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja")Ninja ninja) {
		ninja = ninjas.create(ninja);
		return"redirect:/dojos/" + ninja.getDojo().getId();
	}
}
