package com.example.rest.estoesjava;

public abstract class Auto implements InterfaceAuto {
	
	private int km;

	@Override
	public void acelerar(int velocidad) {
	this.km += velocidad;
	}

	@Override
	public void frenar(int desacelerar) {
	this.km -= desacelerar;
		
	}
	
	public Auto(int velocidad) {
		this.km = velocidad;
	}

	public int getkm() {
		return km;
	}

	public void setkm(int velocidad) {
		this.km = velocidad;
	}
	
	

	
}
