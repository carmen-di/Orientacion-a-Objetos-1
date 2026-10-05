package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {
	private Esfera esfera1;
	private Esfera esfera2;
	
	@BeforeEach
	void setUp() {
		esfera1 = new Esfera("bronce", "dorado", 4.5);
		esfera2 = new Esfera("madera", "negro", 6.5);
	}
	
	@Test
	public void testVolumen() {
		assertEquals(381.70, esfera1.volumen(), 0.01);
		assertEquals(1150.34, esfera2.volumen(), 0.01);
	}

	@Test
	  public void testSuperficie() {
	    assertEquals(254.46, esfera1.superficie(), 0.01);
	    assertEquals(530.92, esfera2.superficie(), 0.01);
	  }
}
