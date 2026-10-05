package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {

	private Carpeta inbox, borradores;
    private Email mail1, mail2;
    
	@BeforeEach
	void setUp() throws Exception {
		inbox = new Carpeta("Inbox");
        borradores = new Carpeta("Borradores");
        mail1 = new Email("Objetos1", "Hola");
		mail2 = new Email("Objetos2", "Chau");
		inbox.agregarEmail(mail1);
		inbox.agregarEmail(mail2);
	}

	@Test
	void testBuscar() {
		assertNotNull(inbox.buscarEmail("Objetos1"));
		assertNull(inbox.buscarEmail(""));
		assertNull(inbox.buscarEmail("Foto"));
		assertNull(inbox.buscarEmail(null));
	}
	
	@Test
	void tamañoTotalTest() {
		inbox.agregarEmail(mail1);
		borradores.agregarEmail(mail2);
		assertEquals(36, inbox.tamanioCarpeta());
		assertEquals(12, borradores.tamanioCarpeta());
	}

	@Test
	void testMover() {
		inbox.mover(mail1, borradores);
		assertNotNull(borradores.buscarEmail("Objetos1"));
		assertNull(inbox.buscarEmail("Objetos1"));
	}

}
