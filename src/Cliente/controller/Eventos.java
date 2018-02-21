package Cliente.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Cliente.view.Ventana;

public class Eventos implements ActionListener {

	private Ventana ventana;
	
	public Eventos(Ventana ventana) {
		super();
		this.ventana = ventana;
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	public void initEvents() {
		
	}
}
