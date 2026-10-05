package ar.edu.unlp.oo1.ejercicio16;

public class PrismaRectangular extends Pieza {
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public double volumen() {
		return (ladoMayor * ladoMenor * altura);
	}

	public double superficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}

}
