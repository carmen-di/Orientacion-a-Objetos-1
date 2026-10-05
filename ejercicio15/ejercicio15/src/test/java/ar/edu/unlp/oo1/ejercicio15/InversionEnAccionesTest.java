package ar.edu.unlp.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {

private InversionEnAcciones inversionEnAcciones;
	
	@BeforeEach
	public void setUp() {
		inversionEnAcciones = new InversionEnAcciones("Ypf", 5, 1000);
	}
	
	@Test
	public void calcularValorActual() {
		assertEquals(5000, inversionEnAcciones.valorActual());
	}
}
