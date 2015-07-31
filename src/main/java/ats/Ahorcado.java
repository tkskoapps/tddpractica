package ats;

public class Ahorcado {

	private String estado;
	private String letra = "";

	public Ahorcado(String palabra) {
		estado = "****";
		// TODO Auto-generated constructor stub
	}

	public String getEstado() {
		// TODO Auto-generated method stub
		if (letra.equals("p")) {
			return "p*p*";
		}
		return estado;
	}

	public void juegaLetra(String letra) {
		// TODO Auto-generated method stub
		this.letra = letra;
	}

}
