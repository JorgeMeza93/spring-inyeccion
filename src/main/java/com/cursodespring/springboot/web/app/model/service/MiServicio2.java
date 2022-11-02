package com.cursodespring.springboot.web.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
@Primary
public class MiServicio2 implements IServicio{

	@Override
	public String operacion() {
		return "Ejecutando un proceso aún más complejo";
	}

}
