package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTest {
	private Cilindro cilindro1;
	private Cilindro cilindro2;
	
	@BeforeEach
	  void setUp() {
	    cilindro1 = new Cilindro("madera", "rojo", 12, 25);
	    cilindro2 = new Cilindro("plastico", "azul", 15, 30);
	  }
	
	@Test
	public void testVolumen() {
		assertEquals(11309.73, cilindro1.volumen(), 0.01);
		assertEquals(21205.75, cilindro2.volumen(), 0.01);
	}

	@Test
	  public void testSuperficie() {
	    assertEquals(2789.73, cilindro1.superficie(), 0.01);
	    assertEquals(4241.15, cilindro2.superficie(), 0.01);
	  }
}
