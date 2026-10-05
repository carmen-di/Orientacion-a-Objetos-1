package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {
	private PrismaRectangular prisma1;
	private PrismaRectangular prisma2;

	@BeforeEach
	void setUp() {
	    prisma1 = new PrismaRectangular("madera", "verde", 28.5, 46, 24);
	    prisma2 = new PrismaRectangular("metal", "azul", 40.8, 22.4, 84.9);
	}

	@Test
	public void testCalcularVolumen() {
	    assertEquals(31464, prisma1.volumen(), 0.01);
	    assertEquals(77591.81, prisma2.volumen(), 0.01);
	}

	@Test
	public void testCalcularSuperficie() {
	    assertEquals(6198, prisma1.superficie(), 0.01);
	    assertEquals(12559.2, prisma2.superficie(), 0.01);

	}
}
