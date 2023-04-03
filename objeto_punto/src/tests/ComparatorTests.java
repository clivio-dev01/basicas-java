package tests;

import org.junit.Assert;
import org.junit.Test;

import objeto_punto.Punto;
import objeto_punto.PuntosPorEjeX;

public class ComparatorTests {

	@Test
	public void comparaEjeX() {
		Punto uno = new Punto(0, 0);
		Punto dos = new Punto(1, -1);
		
		PuntosPorEjeX comparador = new PuntosPorEjeX();
		
		Assert.assertTrue(comparador.compare(uno, dos) < 0);
		Assert.assertTrue(comparador.compare(dos, uno) > 0);
	}
	

}
