package Cliente.controller.conexion;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Conexion {

	private Socket s;
	
	public void iniciarConexion() throws IOException {
		this.s = new Socket("localhost", 9091);
	}
	
	public void cerrarConexion() throws InterruptedException, IOException {
		System.out.println("Conexión cerrada\n");
		Thread.sleep(1000);
		this.s.close();
	}
	
	public void enviarDatos(String sentence) throws IOException {
		DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
		outToServer.writeBytes(sentence + '\n');
	}
	
	public String recibirDatos() throws IOException {
		String cadenaRecuperada;
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
		cadenaRecuperada = inFromServer.readLine();
		System.out.println("From server: " + cadenaRecuperada);
		if (cadenaRecuperada != null) {
			return cadenaRecuperada;
		} else {
			System.out.println("Sin respuesta del servidor...");
			throw new IOException();
		}
	}
}
