package com.spring.safetravels.controllers;

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

import com.spring.safetravels.models.Expense;
import com.spring.safetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseService expenses;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String expenses(@ModelAttribute("expense") Expense expense, Model model) {
		
		model.addAttribute("expenses", expenses.allExpenses());
		
		return "index.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("expense", expenses.findExpense(id));
		model.addAttribute("expenses", expenses.allExpenses());
		
		return "edit.jsp";
	}
	
	@GetMapping("/expenses/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("expense", expenses.findExpense(id));
		
		return "show.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("expenses", expenses.allExpenses());
			return "index.jsp";
		}
		expenses.createExpense(expense);
		
		return "redirect:/expenses";
	}
	
	@PutMapping("/expenses/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("expenses", expenses.allExpenses());
			return "edit.jsp";
		}
		
		expenses.updateExpense(expense);
		
		return "redirect:/expenses";
	}
	
	@DeleteMapping("/expenses/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		
		expenses.deleteExpense(id);
		
		return "redirect:/";
	}
	
}