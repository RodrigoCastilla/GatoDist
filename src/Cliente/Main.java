package Cliente;

import java.io.IOException;

import Cliente.controller.conexion.Conexion;
import Cliente.view.Ventana;

public class Main {

	public static void main(String[] args) throws Exception {
		if(args.length == 1) {
			Ventana.IP = args[0];
			new Ventana(solicitarJugador());
		} else {
			throw new Exception("No cumple el formato del parametro: java Ventana <IP-Cliente>");
		}
	}
	
	public static String solicitarJugador() throws IOException, InterruptedException {
		Conexion conexion = new Conexion();
		conexion.iniciarConexion();
		conexion.enviarDatos(Ventana.SOLICITUD);
		String jugador = conexion.recibirDatos();
		conexion.cerrarConexion();
		return jugador;
	}
}
