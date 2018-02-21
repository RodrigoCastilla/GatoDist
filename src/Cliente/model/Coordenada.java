package Cliente.model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Coordenada extends MouseAdapter {

	private int fila;
	private char columna;
	
	public Coordenada(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
	}
	
}
