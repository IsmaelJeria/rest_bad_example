package com.example.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.entity.Holamundo;
import com.example.rest.jpadao.HolamundoRepository;
import com.example.rest.service.HolaMundoService;

@Service
public class HolaMundoServiceImpl implements HolaMundoService {

	@Autowired
	private HolamundoRepository holamundoRepository;
	
	
	@Override
	public String DarBienvenida(String bienvenida) {
		if(bienvenida.equals("hola_conchetumare")) {
			return "no le puedes dar esa bienvenida a los comensales";
		}
		
		Holamundo holamundo = new Holamundo();
		holamundo.setSaludo(bienvenida);
		holamundoRepository.save(holamundo);
		return "le has dado la bienvenida a los loquitos " + holamundo.getSaludo() +"se ha guardado como comentario";
	}

}
