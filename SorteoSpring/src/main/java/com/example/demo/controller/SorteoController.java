package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.SorteoRepository;
import com.example.demo.model.Sorteo;

@Controller
public class SorteoController {

	@Autowired
	SorteoRepository sorteoDAO;
	
	
	@RequestMapping(value = "/index")
	public String crear(Model model) {
		Sorteo sorteo = new Sorteo();
		model.addAttribute("sorteo", sorteo);
		
		return "index";
	}

	@RequestMapping(value = "/registrar" , method = RequestMethod.POST)
	public String registrar( @Validated Sorteo sorteo,Model model) {
	
		sorteoDAO.save(sorteo);
		return "index";
	}

	
	@RequestMapping(value = "/lista")
	public String list(Model model) {
		model.addAttribute("listaSorteos", sorteoDAO.findAll());
		
		return "lista";
	}
	
}
