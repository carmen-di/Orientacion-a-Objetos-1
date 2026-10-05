package ar.edu.unlp.oo1.ejercicio17;

import java.util.List;
import java.util.ArrayList;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(this.inbox);
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
        for (Carpeta c : this.carpetas) {
            Email encontrado = c.buscarEmail(texto);
            if (encontrado != null)
                return encontrado;
        }
        return null;
    }
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamanioCarpeta()).sum();
	}
	
	public Carpeta getInbox() {
	    return this.inbox;
	}
}
