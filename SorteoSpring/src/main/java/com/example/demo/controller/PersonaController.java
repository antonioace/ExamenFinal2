package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.SorteoRepository;
import com.example.demo.model.Persona;
import com.example.demo.model.Sorteo;

@Controller
public class PersonaController {
	@Autowired
	PersonaController personaDAO;
	
	@RequestMapping(value = "/persona")
	public String crear(Model model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		
		return "formpersona";
	}

}
