package Cliente.controller.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Cliente.controller.conexion.Conexion;
import Cliente.model.Coordenada;

public class EventosCoordenadas extends MouseAdapter {

	private Coordenada coord;

	public EventosCoordenadas(Coordenada coord) {
		this.coord = coord;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		Conexion conexion = new Conexion();
		try {
			conexion.iniciarConexion();
			conexion.enviarDatos("JUGADOR" + "," + coord.getFila() + "," + coord.getColumna());
			conexion.cerrarConexion();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
