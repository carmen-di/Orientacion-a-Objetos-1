package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro1;
	private CajaDeAhorro cajaDeAhorro2;

	@BeforeEach
	void setUp() {
		cajaDeAhorro1 = new CajaDeAhorro();
		cajaDeAhorro2 = new CajaDeAhorro();
	}
	
	@Test
	void testConstructor() {
		assertEquals(0, cajaDeAhorro1.getSaldo());
	}

	@Test
	void testDepositar() {
		this.cajaDeAhorro1.depositar(100);
		assertEquals(98, cajaDeAhorro1.getSaldo());
	}

	@Test
	void testExtraer() {
		this.cajaDeAhorro1.depositar(100);
		this.cajaDeAhorro1.extraer(50);
		assertEquals(47, cajaDeAhorro1.getSaldo());
		assertFalse(cajaDeAhorro1.extraer(100));
	}
	
	@Test
	void testTransferirACuenta() {
		this.cajaDeAhorro1.depositar(100);
		this.cajaDeAhorro1.transferirACuenta(98, cajaDeAhorro2);
		assertEquals(98, cajaDeAhorro1.getSaldo());
		assertEquals(0, cajaDeAhorro2.getSaldo());
	}
	
}
