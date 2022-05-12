package com.spring.safetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.spring.safetravels.models.Travel;
import com.spring.safetravels.services.TravelService;

@Controller
public class MainController {
	@Autowired
	private TravelService travelService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("newPrice")Travel newCost, Model model) {
		List<Travel> travels = travelService.getAll();
		model.addAttribute("allTravels", travels);
		return "index.jsp";
	}

	@PostMapping("/create")
	public String createExpense(@Valid @ModelAttribute("newPrice") Travel newCost, BindingResult results, Model model) {
		if(results.hasErrors()) {
			List<Travel> travels = travelService.getAll();
			model.addAttribute("allTravels", travels);
			return "index.jsp";
		}
		travelService.createExpense(newCost);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable Long id, Model model) {
		Travel editExpense = travelService.expenseInfo(id);
		model.addAttribute("editExpense", editExpense);
		return "edit.jsp";
	
	}
	
	@PutMapping ("/update/{id}")
	public String updateExpense(@ModelAttribute("editExpense") Travel editsExpense, @PathVariable Long id) {
		travelService.updateExpense(editsExpense);
		return "redirect:/";
	}

	@GetMapping ("/view/{id}")
	public String expenseDetails(@PathVariable Long id, Model model) {
		Travel expense = travelService.expenseInfo(id);
		model.addAttribute("expense", expense);
		return "info.jsp";
	}
	
	@DeleteMapping ("/delete/{id}")
	public String deleteExpense(@PathVariable Long id) {
		travelService.deleteExpense(id);
		return "redirect:/";
	}
}
