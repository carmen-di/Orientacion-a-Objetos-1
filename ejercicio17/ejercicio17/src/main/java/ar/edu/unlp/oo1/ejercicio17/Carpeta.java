package ar.edu.unlp.oo1.ejercicio17;

import java.util.List;
import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private List<Email> emails;

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public Email buscarEmail(String texto) {
		for (Email mail: this.emails) {
			if (mail.tieneTexto(texto))
				return mail;
		}
		return null;
	}
	
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
		destino.agregarEmail(email);
	}
	
	public int tamanioCarpeta() {
		return this.emails.stream().mapToInt(e -> e.tamanio()).sum();
	}
	
	public List<Email> getEmails() {
		return new ArrayList<Email>(emails);
	}
	
	
}
