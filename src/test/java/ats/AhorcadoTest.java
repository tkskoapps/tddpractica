package ats;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AhorcadoTest {

	@Test
	public void ahorcadoWithPepe() {
		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		Assert.assertEquals("****", ahorcado.getEstado());
	}

	@Test
	public void jugarLetraP() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('p');
		String estado = ahorcado.getEstado();
		Assert.assertEquals("p*p*", ahorcado.getEstado());

	}

	@Test
	public void jugarLetraZ() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('z');
		String estado = ahorcado.getEstado();
		Assert.assertEquals("****", ahorcado.getEstado());

	}

	@Test
	public void esGanadorReturnTrue() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('p');
		ahorcado.juegaLetra('e');
		Assert.assertEquals(true, ahorcado.esGanador());

	}
	
	@Test
	public void esGanadorReturnFalse() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('p');
		ahorcado.juegaLetra('h');
		Assert.assertEquals(false, ahorcado.esGanador());

	}
}
