package com.spring.omikuji.contoller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
	

	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}

	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("resultOmikuji");
		model.addAttribute("result", result);
		return "showOmikuji.jsp";
	}
	
	@PostMapping("/processFormData")
	public String process(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("thing") String thing,
			@RequestParam("message") String message,
			HttpSession session
			) {
	
		String resultOmikuji = String.format(
				  "		In %s years, you will live in %s\r\n"
				+ "		with %s as your roomate,\r\n"
				+ "		%s.\r\n"
				+ "		The next time you see a %s,\r\n"
				+ "		you will have good luck.\r\n"
				+ "		Also, %s.", 
						number, city, person, hobby, thing, message);
		
		session.setAttribute("resultOmikuji", resultOmikuji);
		return "redirect:/omikuji/show";
	}
}
