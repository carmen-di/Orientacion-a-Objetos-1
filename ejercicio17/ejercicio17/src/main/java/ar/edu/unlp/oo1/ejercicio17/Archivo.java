package ar.edu.unlp.oo1.ejercicio17;

public class Archivo {
	private String nombre;
	
	public Archivo(String unNombre) {
		nombre = unNombre;
	}

	public int tamanio() {
		return this.nombre.length();
	}

}
