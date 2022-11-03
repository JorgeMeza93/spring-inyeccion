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
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor LG LCD 24'", 159);
		Producto producto2 = new Producto("Notebook ASUS", 700);
		Producto producto3 = new Producto("Impresora HP laser", 100);
		Producto producto4 = new Producto("Escritorio Oficina", 400);
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 2);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}	
}
