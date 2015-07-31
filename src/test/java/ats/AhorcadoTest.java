package ats;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AhorcadoTest {

	@Test
	public void ahorcadoInitWithPepe() {
		String palabra = "pepe";
		Ahorcado ahorcado = new Ahorcado(palabra);
		Assert.assertEquals("****", ahorcado.getEstado());
	}

}
