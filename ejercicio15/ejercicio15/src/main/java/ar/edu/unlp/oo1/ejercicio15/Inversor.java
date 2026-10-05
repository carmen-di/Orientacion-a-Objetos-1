package ar.edu.unlp.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List <Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return nombre;
	}

    public void agregarInversion(Inversion unaInversion) {
    	this.inversiones.add(unaInversion);
    }
    
    public void quitarInversion(Inversion unaInversion) {
    	this.inversiones.remove(unaInversion);
    }
	
    public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}
}
