package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {

	private ReporteDeConstruccion reporte;
	private Pieza cil1;
	private Pieza cil2;
    private Pieza esf1;
	private Pieza esf2;
    private Pieza prsm1;
    private Pieza prsm2;
	  
    @BeforeEach
    void setUp() {
      reporte = new ReporteDeConstruccion();
      cil1 = new Cilindro("madera", "rojo", 12, 25);
      cil2 = new Cilindro("plastico", "azul", 15, 30);
      esf1 = new Esfera("bronce", "dorado", 4.5);
      esf2 = new Esfera("madera", "negro", 6.5);
      prsm1 = new PrismaRectangular("madera", "verde", 28.5, 46, 24);
      prsm2 = new PrismaRectangular("metal", "azul", 40.8, 22.4, 84.9);
      reporte.agregarPieza(cil1);
      reporte.agregarPieza(cil2);
      reporte.agregarPieza(esf1);
      reporte.agregarPieza(esf2);
      reporte.agregarPieza(prsm1);
      reporte.agregarPieza(prsm2);

    }

	@Test
    public void testVolumenDeMaterial() {
      assertEquals(43924.08, reporte.volumenDeMaterial("madera"), 0.02);
      assertEquals(77591.81, reporte.volumenDeMaterial("metal"),0.02);
    }

	@Test
    public void testColorDeMaterial() {
      assertEquals(2789.73, reporte.superficieDeColor("rojo"), 0.02);
      assertEquals(16800.35, reporte.superficieDeColor("azul"),0.01);
    }


}
