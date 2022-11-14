package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/spring")
	public String spring(String name, Model model) {
		model.addAttribute("name",name);
		return "/WEB-INF/views/spring.jsp";
	}
}