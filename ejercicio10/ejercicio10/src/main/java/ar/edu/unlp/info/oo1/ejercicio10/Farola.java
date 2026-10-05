package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;
import java.util.ArrayList;

public class Farola {
	private boolean on;
	private ArrayList<Farola> farolas;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola() {
		this.on = false;
		this.farolas = new ArrayList<Farola>();
	}
	
	/* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	
	public void agregarFarola(Farola unaFarola) {
		this.farolas.add(unaFarola);
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.farolas.contains(otraFarola)) {
			this.agregarFarola(otraFarola);
			otraFarola.agregarFarola(this);
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors () {
		return this.farolas;
	}
	
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!this.isOn()) {
			this.on = true;
			for (Farola f: farolas) {
				f.turnOn();
			}
		}
	}
	
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (!this.isOff()) {
			this.on = false;
			for (Farola f: farolas) {
				f.turnOff();
			}
		}
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.on;
	}
	
	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return !this.on;
	}
	
}
