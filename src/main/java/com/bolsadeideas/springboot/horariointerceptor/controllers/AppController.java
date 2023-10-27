package com.bolsadeideas.springboot.horariointerceptor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		model.addAttribute("titulo","Bienvenido hoario de atención a clientes");
		return "index";
	}

}
