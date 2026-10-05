package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

	private Archivo unArchivo;
    private Archivo unArchivoVacio;

	@BeforeEach
	void setUp() {
		unArchivo = new Archivo("Archivo");
		unArchivoVacio = new Archivo("");
	}

	@Test
	void tamanio() {
		assertEquals(7, unArchivo.tamanio());
		assertEquals(0, unArchivoVacio.tamanio());
	}

}
