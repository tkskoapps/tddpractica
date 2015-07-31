package ats;

public class Ahorcado {

	private char[] palabraClave;
	private char[] estado;

	public Ahorcado(String palabra) {
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

		//int cambios = 0;
		for (int x = 0; x < palabraClave.length; x++) {
			if (palabraClave[x] == letra) {
				estado[x] = letra;	
			}
		}

	}

	public Object esGanador() {
		// TODO Auto-generated method stub
		return String.valueOf(palabraClave).equals(String.valueOf(estado));
	}

}
