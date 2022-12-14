package com.cursodespring.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursodespring.springboot.web.app.model.service.IServicio;

@Controller
public class IndexController {
	
	@Qualifier("miServicioSimple")
	private IServicio servicio;
	@GetMapping({"index", "", "/"})
	public String index(Model model){
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}
	
}
