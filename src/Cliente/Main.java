package Cliente;

import java.io.IOException;

import Cliente.controller.conexion.Conexion;
import Cliente.view.Ventana;

public class Main {

	private static String NUMERO_RANDOM;
	
	public static void main(String[] args) throws Exception {
		if(args.length == 2) {
			Ventana.IP = args[0];
			NUMERO_RANDOM = args[1];
			new Ventana(solicitarJugador());
		} else {
			throw new Exception("No cumple el formato del parametro: java Main <IP Cliente> <Numero Random>");
		}
	}
	
	private static String solicitarJugador() throws IOException, InterruptedException {
		Conexion conexion = new Conexion();
		conexion.iniciarConexion();
		conexion.enviarDatos(Ventana.SOLICITUD);
		String jugador = conexion.recibirDatos();
		conexion.enviarDatos(NUMERO_RANDOM);
		Ventana.ICONO_XO = conexion.recibirDatos();
		conexion.cerrarConexion();
		return jugador;
	}
}
