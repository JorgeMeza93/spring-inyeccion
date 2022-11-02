package com.cursodespring.springboot.web.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cursodespring.springboot.web.app.model.domain.ItemFactura;
import com.cursodespring.springboot.web.app.model.domain.Producto;

@Configuration
public class AppConfig {
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Consola Xbox", 259);
		Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		return Arrays.asList(linea1, linea2);
	}
}
