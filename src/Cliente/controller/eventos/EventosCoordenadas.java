package Cliente.controller.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import Cliente.controller.conexion.Conexion;
import Cliente.model.Coordenada;
import Cliente.view.Ventana;

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
			String datos = Ventana.IP + "," + coord.getFila() + "," + coord.getColumna();
			System.out.println(datos);
			
			conexion.iniciarConexion();
			conexion.enviarDatos(datos);
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
