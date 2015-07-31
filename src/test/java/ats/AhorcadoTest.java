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
	public void esGanadorReturnTrueEUpper() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('p');
		ahorcado.juegaLetra('E');
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
	
	@Test
	public void EsGanadorRetornaFalsePorCantidadDeIntentosFallidos() {

		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('z');
		ahorcado.juegaLetra('n');
		ahorcado.juegaLetra('w');
		ahorcado.juegaLetra('l');
		ahorcado.juegaLetra('a');
		ahorcado.juegaLetra('h');
		ahorcado.juegaLetra('y');
		ahorcado.juegaLetra('p');
		ahorcado.juegaLetra('e');
		Assert.assertEquals(false, ahorcado.esGanador());

	}
	
	@Test
	public void quedanIntentosRetornaFalse(){
		
		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('z');
		ahorcado.juegaLetra('n');
		ahorcado.juegaLetra('w');
		ahorcado.juegaLetra('l');
		ahorcado.juegaLetra('a');
		ahorcado.juegaLetra('h');
		ahorcado.juegaLetra('y');
		Assert.assertEquals(false, ahorcado.quedanIntentos());		
		
	}
	
	@Test
	public void quedanIntentosRetornaTrue(){
		
		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		ahorcado.juegaLetra('z');
		ahorcado.juegaLetra('n');
		ahorcado.juegaLetra('w');
		ahorcado.juegaLetra('e');
		ahorcado.juegaLetra('a');
		ahorcado.juegaLetra('h');
		ahorcado.juegaLetra('y');
		Assert.assertEquals(true, ahorcado.quedanIntentos());		
		
	}
	
}
