package com.spring.dojoandninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.dojoandninjas.models.Dojo;
import com.spring.dojoandninjas.models.Ninja;
import com.spring.dojoandninjas.services.MainService;


@Controller
public class SuperMegaHyperModeController {
	@Autowired
	private MainService mainService;
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@GetMapping("newNinja")
	public String newNinja(@ModelAttribute ("newNinja") Ninja ninja, Model viewModel) {
		
		viewModel.addAttribute("dojos", mainService.getAllDojos());
			return "newNinja.jsp";
	}
	
	@GetMapping ("/info/{id}")
	public String showInfo(@PathVariable Long id, Model model, Dojo dojo) {
		dojo= mainService.dojoInfo(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", mainService.getAllByDojoId(id));
		return "showInfo.jsp";
		
	}
	
	@PostMapping ("/createDojo")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		this.mainService.createDojo(dojo);
			return "redirect:/newNinja";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute ("newNinja") Ninja ninja, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = this.mainService.getAllDojos();
			viewModel.addAttribute("allDojos", allDojos);
				return "newNinja.jsp";
		}
		
		this.mainService.createNinja(ninja);
			return "redirect:/info/"  + ninja.getDojo().getId();
	}
	
}

