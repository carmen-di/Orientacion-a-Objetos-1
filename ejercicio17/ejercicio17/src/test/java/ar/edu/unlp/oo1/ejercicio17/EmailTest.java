package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	private Email mail1;
    private Archivo adj1, adj2;

	@BeforeEach
	void setUp() throws Exception {
		adj1 = new Archivo("foto.png");
        adj2 = new Archivo("cv.pdf");

        mail1 = new Email("Hola", "Te mando la foto");
        mail1.adjuntos().add(adj1);
        mail1.adjuntos().add(adj2);
	}

	@Test
	void test() {
		assertEquals(20, mail1.tamanio());
	}
    
	@Test
	void tieneTexto() {
		assertTrue(mail1.tieneTexto("foto.png"));
		assertFalse(mail1.tieneTexto("cv.pdf"));
	}

}
