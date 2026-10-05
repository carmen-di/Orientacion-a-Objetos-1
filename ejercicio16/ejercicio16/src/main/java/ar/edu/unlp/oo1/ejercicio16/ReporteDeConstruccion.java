package ar.edu.unlp.oo1.ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream().
				filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.volumen())
				.sum();
				
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().
				filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.superficie())
				.sum();
	}
}
