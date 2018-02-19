


import Servidor.Modelo.Jugador;
import Servidor.Modelo.ModeradorJuego;
import Servidor.Modelo.Movimiento;
import java.util.Date;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 * A TCP server that runs on port 9090.  
 */
public class UpperServer {

    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
        String clientSentence;
        String capitalizedSentence;
        int cantidadJugadores;
        int valorAlAzarEntreUnoYCien = (int) (Math.random()*101 + 1);
        boolean seleccionDeTurnos = false;
        boolean seleccionSimbolo = false;
        boolean manejoDeJuego = false;
        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        ModeradorJuego moderador= new ModeradorJuego(movimientos);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();
        ServerSocket listener = new ServerSocket(9091);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
                     clientSentence = inFromClient.readLine();
                     System.out.println("Received: " + clientSentence);
                     
                     cantidadJugadores = jugadores.size();
                     
                     //Registro de jugadores
                     boolean casoJugador1= ((clientSentence.toUpperCase()).compareTo("JUGADOR1")) == 0;
                     boolean casoJugador2=((clientSentence.toUpperCase()).compareTo("JUGADOR2")) == 0;
                     boolean casoSolicitudNuevoJugador = casoJugador1 || casoJugador2;
                     boolean casoEsperandoJugador = cantidadJugadores < 2;
                     if(casoEsperandoJugador && casoSolicitudNuevoJugador){
                        String respuesta = "";
                        if(jugadores.size() == 0){
                            jugadores.add(new Jugador (clientSentence.toUpperCase()));
                            respuesta = "JUGADORES_INCOMPLETOS";
                        } else{
                            boolean jugadorExistente = jugadores.get(0).getNombreJugador().compareTo(clientSentence.toUpperCase()) == 0;
                            if(jugadorExistente == false){
                                jugadores.add(new Jugador (clientSentence.toUpperCase()));
                                respuesta = "JUGADORES_COMPLETOS";
                            } else{
                                System.out.println(jugadores.get(0).getNombreJugador() + "_YAREGISTRADO");
                                respuesta= jugadores.get(0).getNombreJugador() + "_YAREGISTRADO";
                            }
                        }
                         outToClient.writeBytes(respuesta);
                         System.out.println(respuesta);
                     } else if ((casoEsperandoJugador == false)  && casoSolicitudNuevoJugador){
                         outToClient.writeBytes("JUGADORES_COMPLETOS");
                         System.out.println("Ya no se aceptan más jugadores");
                     }
                     
                     
                     
                     if(((clientSentence.toUpperCase()).compareTo("CLOSECXN")) == 0){
                         outToClient.writeBytes("Connection Closed");
                         socket.close();
                         listener.close();
                         break;
                     }
                     
                     
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
}