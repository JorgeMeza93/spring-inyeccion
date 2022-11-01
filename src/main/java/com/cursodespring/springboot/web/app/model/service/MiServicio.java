package com.cursodespring.springboot.web.app.model.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio{
	@Override
	public String operacion(){
		return "Ejecutando algun proceso importante";
	}
}
