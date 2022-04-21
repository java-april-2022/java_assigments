package com.spring.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	@RequestMapping("/")
	public String index (@RequestParam(value="name")String searchQuery) {
		return "Hello " + searchQuery;
	}
}
