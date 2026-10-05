package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	private ClienteDeCorreo clienteCorreo;
	private Carpeta carpeta;

	@BeforeEach
	void setUp() {
		clienteCorreo = new ClienteDeCorreo();
		carpeta = new Carpeta("Eliminados");
		clienteCorreo.agregarCarpeta(carpeta);
	}

	@Test
	void testBuscar() {
		Email email = new Email("Hola", "Chau");
		clienteCorreo.recibir(email);
		assertNotNull(clienteCorreo.buscar("Hola"));

		clienteCorreo.getInbox().mover(email, carpeta);
		assertNotNull(clienteCorreo.buscar("Hola"));
	}

	@Test
	void testEspacioOcupado() {
		Email email1 = new Email("1", "2");       // tamaño: 1+1 = 2
		Email email2 = new Email("Uno", "Dos");   // tamaño: 3+3 = 6

		clienteCorreo.recibir(email1);
		carpeta.agregarEmail(email2);

		assertEquals(8, clienteCorreo.espacioOcupado());
	}
}