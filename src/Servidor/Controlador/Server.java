/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Controlador;

import Servidor.Modelo.Jugador;
import Servidor.Modelo.ModeradorJuego;
import Servidor.Modelo.Movimiento;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ARMC3PO
 */
public class Server {
	public static void main(String[] args) throws IOException {
		String clientSentence;
		String respuesta;
		int cantidadJugadores = 0;
		int valorAlAzarEntreUnoYCien = (int) (Math.random() * 101 + 1);
		boolean seleccionDeTurnos = false;
		boolean seleccionSimbolo = false;
		boolean manejoDeJuego = false;
		ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
		ModeradorJuego moderador = new ModeradorJuego(movimientos);
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		ServerSocket listener = new ServerSocket(9091);
		try {
			while (true) {
				Socket socket = listener.accept();
				try {
					respuesta = "";
					BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
					clientSentence = inFromClient.readLine();
					System.out.println("Received: " + clientSentence);

					// Registro de jugadores
					if ((clientSentence.toUpperCase()).compareTo("SOLICITUD") == 0) {
						String respuestaSolicitud = "";
						if (cantidadJugadores == 0) {
							jugadores.add(new Jugador("JUGADOR1"));
							respuestaSolicitud = "JUGADOR1";
							System.out.println("Registrado JUGADOR1");
							cantidadJugadores++;
						} else if (cantidadJugadores == 1) {
							jugadores.add(new Jugador("JUGADOR2"));
							respuestaSolicitud = "JUGADOR2";
							System.out.println("Registrado JUGADOR 2");
							cantidadJugadores++;
						} else if (cantidadJugadores > 1) {
							respuestaSolicitud = "SALA_LLENA";
						}
						respuesta = respuestaSolicitud;

					}

					if (((clientSentence.toUpperCase()).compareTo("CLOSECXN")) == 0) {
						outToClient.writeBytes("Connection Closed");
						socket.close();
						listener.close();
						break;
					}
					outToClient.writeBytes(respuesta);

				} finally {
					socket.close();
				}
			}
		} finally {
			listener.close();
		}
	}
}
