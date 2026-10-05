package ar.edu.unlp.oo1.ejercicio16;

public class Esfera extends Pieza {
	private double radio;
	
	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public double volumen() {
		return (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
	}

	public double superficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
	
}
