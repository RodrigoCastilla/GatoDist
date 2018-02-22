package Cliente.model;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coordenada {

	private int fila;
	private char columna;
	private JLabel label;
	
	public Coordenada(int fila, char columna, JLabel label) {
		this.fila = fila;
		this.columna = columna;
		this.label = label;
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}
	
	public void setIcon(ImageIcon imageIcon) {
		Icon icono = new ImageIcon(imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
	}
}
