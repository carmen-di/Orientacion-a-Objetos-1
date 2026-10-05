package ar.edu.unlp.oo1.ejercicio18;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	private DateLapse periodo;
	
	@BeforeEach
	void setUp() throws Exception {
		periodo = new DateLapse(LocalDate.of(2026, 10, 1), LocalDate.of(2026, 10, 4));
	}

	@Test
	void testSizeInDays() {
		assertEquals(3, this.periodo.sizeInDays());
	}

	@Test
	void testIncludeDate() {
		assertTrue(this.periodo.includesDate(LocalDate.of(2026, 10, 3)));
		assertFalse(this.periodo.includesDate(LocalDate.of(2026, 9, 28)));
	}
}
