package ar.edu.unlp.info.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}
	
	/*ponerEnCero() ahora vacía la lista.
    No hace falta guardar los totales porque se pueden calcular dinámicamente a partir 
    de los productos */
}
