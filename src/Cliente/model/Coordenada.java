package Cliente.model;

public class Coordenada {

	private int fila;
	private char columna;
	
	public Coordenada(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}
	
}
