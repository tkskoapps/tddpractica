package ats;

public class Ahorcado {

	private char[] palabraClave;
	private char[] estado;
	
	private int errores;

	public Ahorcado(String palabra) {
		this.errores = 0;
		this.palabraClave = palabra.toLowerCase().toCharArray();
		estado = new char[palabra.length()];
		for (int x = 0; x < palabraClave.length; x++) {
			estado[x] = '*';
		}
	}

	public String getEstado() {
		return String.valueOf(estado);
	}

	public void juegaLetra(char letra) {

		int cambios = 0;
		for (int x = 0; x < palabraClave.length; x++) {
			if (palabraClave[x] == Character.toLowerCase(letra)) {
				estado[x] = Character.toLowerCase(letra);
				cambios++;
			}
		}
		if (cambios == 0) {
			errores++;
		}

	}

	public Object esGanador() {
		// TODO Auto-generated method stub
		return (errores < 7) && String.valueOf(palabraClave).equals(String.valueOf(estado));
	}

	public boolean quedanIntentos() {
		return (errores < 7);
	}

}
