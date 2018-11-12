package com.example.rest.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.impl.HolaMundoServiceImpl;

@RestController
public class Holamundodelweb {
	
	@Autowired
	private HolaMundoServiceImpl holamundoserviceimpl;

	@GetMapping("saludar/{saludo}")
	public String saludar(@PathVariable String saludo) {
		return this.holamundoserviceimpl.DarBienvenida(saludo);
	}
}
