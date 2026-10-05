package ar.edu.unlp.oo1.ejercicio17;

import java.util.List;
import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public List<Archivo> adjuntos() {
		return new ArrayList<Archivo>(adjuntos);
	}
	
	public int tamanio() {
		int total = this.titulo.length() + this.cuerpo.length();
        for (Archivo a : this.adjuntos)
            total += a.tamanio();
        return total;
	}
	
	public boolean tieneTexto(String texto) {
	    if (texto == null || texto.isEmpty()) {
	        return false;
	    }
	    return (getTitulo().contains(texto) || getCuerpo().contains(texto));
	}
}
