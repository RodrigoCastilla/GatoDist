package Servidor.Controlador;

import Servidor.Modelo.Movimiento;

public class LogicaJuego {

	private Object[] casosVictoria;
	private Movimiento movimientos;
	
	public LogicaJuego() {
		this.movimientos = new Movimiento();
		this.casosVictoria = new Object[8];
	}
}
