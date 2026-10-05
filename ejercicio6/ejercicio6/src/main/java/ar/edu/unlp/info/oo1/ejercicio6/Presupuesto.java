package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}

	public double calcularTotal() {
		return items.stream().mapToDouble(item -> item.costo()).sum();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	
}
