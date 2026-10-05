package ar.edu.unlp.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {
	private PlazoFijo plazoFijo;
	private PlazoFijo plazoFijoFechaActual;
	private PlazoFijo plazoFijoInteres;

	@BeforeEach
	public void setUp() {
        plazoFijo = new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.05); 
        plazoFijoFechaActual = new PlazoFijo(LocalDate.now(), 3000, 0.05); 
        plazoFijoInteres = new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.01); 
    }

	@Test
	public void calcularValorActual() {
        assertEquals(3300, plazoFijo.valorActual());
        assertEquals(3000, plazoFijoFechaActual.valorActual());
        assertEquals(3060, plazoFijoInteres.valorActual());
    }

}