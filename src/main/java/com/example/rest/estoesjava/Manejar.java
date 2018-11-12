package com.example.rest.estoesjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Manejar {
	Auto auto = new AutoMecanico(0);//velocidad en 0
	
	Auto auto2 = new AutoMecanico(0);
	
	InterfaceAuto auto3= new AutoMecanico(0);
	
	AutoMecanico automecanico = new AutoMecanico(0);
	
	@GetMapping("quieroacelerar")
	public String acelerar() {
		this.auto.acelerar(2);
		return ("el auto ha acelerado " + auto.getkm() + "km");
	}
	
	@GetMapping("quierofrenar")
	public void desacelerar() {
		this.auto.frenar(1);
	}
	
	

}
