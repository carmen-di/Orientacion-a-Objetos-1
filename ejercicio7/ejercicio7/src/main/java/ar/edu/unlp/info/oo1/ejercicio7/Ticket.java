package ar.edu.unlp.info.oo1.ejercicio7;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(int cantDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
	}
	
	public Ticket(List<Producto> productos) {
		this.productos = productos;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPesoTotal() {
	    return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
}
