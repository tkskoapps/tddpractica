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
	public void nombredemierda () {
		
		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);	
		ahorcado.juegaLetra('p');
		String estado = ahorcado.getEstado();
		Assert.assertEquals("p*p*", ahorcado.getEstado());
		
	}

}
