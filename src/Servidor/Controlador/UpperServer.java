package Servidor.Controlador;




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
        boolean esperandoJugadores = true;
        boolean seleccionDeTurnos = false;
        boolean seleccionSimbolo = false;
        boolean manejoDeJuego = false;
        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        ModeradorJuego moderador= new ModeradorJuego(movimientos);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();
        
        ServerSocket listener = new ServerSocket(9091);
            while (true) {
                Socket socket = listener.accept();
                try {
                    BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
                     
                     //Cadena recibida de parte de los clientes
                     clientSentence = inFromClient.readLine();
                     System.out.println("Recibido: " + clientSentence);
                     
                     cantidadJugadores = jugadores.size();
                     
                     //Registro de jugadores
                     boolean casoJugador1= ((clientSentence.toUpperCase()).compareTo("JUGADOR1")) == 0;
                     boolean casoJugador2=((clientSentence.toUpperCase()).compareTo("JUGADOR2")) == 0;
                     boolean casoSolicitudNuevoJugador = casoJugador1 || casoJugador2;
                     boolean casoEsperandoJugador = cantidadJugadores < 2;
                     if(casoEsperandoJugador && casoSolicitudNuevoJugador && esperandoJugadores){
                        String respuesta = "";
                        if(jugadores.size() == 0){
                            jugadores.add(new Jugador (clientSentence.toUpperCase()));
                            respuesta = "JUGADORES_INOMPLETOS";
                        } else{
                            boolean jugadorExistente = jugadores.get(0).getNombreJugador().compareTo(clientSentence.toUpperCase()) == 0;
                            if(jugadorExistente == false){
                                jugadores.add(new Jugador (clientSentence.toUpperCase()));
                                respuesta = "JUGADORES_COMPLETOS";
                                esperandoJugadores =false;
                                seleccionDeTurnos = true;
                            } else{
                                System.out.println(jugadores.get(0).getNombreJugador() + "_YAREGISTRADO");
                                respuesta =jugadores.get(0).getNombreJugador() + "_YAREGISTRADO";
                            }
                        }
                         outToClient.writeBytes(respuesta + "\n");
                     } else if ((casoEsperandoJugador == false)  && casoSolicitudNuevoJugador){
                         outToClient.writeBytes("JUGADORES_COMPLETOS");
                         System.out.println("Ya no se aceptan más jugadores");
                     }
                     //Selección de turnos
                     if(seleccionDeTurnos == true){
                         String[] numJugador = clientSentence.split(",");
                         if(numJugador.length>1){
                            if(jugadores.get(0).getNombreJugador().compareTo(numJugador[0]) == 0)
                                jugadores.get(0).setNumeroOrden(Integer.parseInt(numJugador[1]));
                            else
                                jugadores.get(1).setNumeroOrden(Integer.parseInt(numJugador[1]));

                            if(jugadores.get(0).getNumeroOrden() > 0 && jugadores.get(1).getNumeroOrden() > 0){
                                seleccionDeTurnos = false;
                                seleccionSimbolo = true;
                                int valorJugador1 = Math.abs(jugadores.get(0).getNumeroOrden() - valorAlAzarEntreUnoYCien) ;
                                int valorJugador2 = Math.abs(jugadores.get(1).getNumeroOrden() - valorAlAzarEntreUnoYCien);
                                String jugadorEnElegirSimbolo = "";
                                boolean condicionV1menorV2 = (valorJugador1 < valorJugador2);
                                boolean condicionV2menorV1 = (valorJugador2 < valorJugador1);
                                boolean condicionValoresIguales = (valorJugador1 == valorJugador2);
                                if(condicionV1menorV2 || condicionValoresIguales ){
                                    jugadorEnElegirSimbolo = jugadores.get(0).getNombreJugador();
                                }
                                else if(condicionV2menorV1){
                                    jugadorEnElegirSimbolo = jugadores.get(1).getNombreJugador();
                                }
                                outToClient.writeBytes("ELECCION_" + jugadorEnElegirSimbolo );
                            }
                         } else{
                             System.out.println("Seleccionando turnos... Número a alcanzar: " +valorAlAzarEntreUnoYCien );
                             
                         }
                     }
                     
                     //Selección de simbolos (X u O)
                     if(seleccionSimbolo == true){
                         outToClient.writeBytes("\nAGREGAR_SIMBOLOS\n");
                         System.out.println("Hora de agregar Símbolos");
                         String oracionEnMayusculas = clientSentence.toUpperCase();
                         if(oracionEnMayusculas.contains("X") || oracionEnMayusculas.contains("Y")){
                             if(oracionEnMayusculas.contains(jugadores.get(0).getNombreJugador())){
                             jugadores.get(0).setSimboloJugador(""+oracionEnMayusculas.charAt(oracionEnMayusculas.length() -1));
                            } else if(oracionEnMayusculas.contains(jugadores.get(1).getNombreJugador())){
                                jugadores.get(1).setSimboloJugador(""+oracionEnMayusculas.charAt(oracionEnMayusculas.length() -1));
                            }

                            if((jugadores.get(0).getSimboloJugador().compareTo("") !=0) && 
                               (jugadores.get(1).getSimboloJugador().compareTo("") !=0)){
                                seleccionSimbolo = false;
                                manejoDeJuego = true;
                            }
                         }
                     }
                     
                     //Control del juego
                     if(manejoDeJuego == true){
                         
                         String[] partesMovimientoRealizado = (clientSentence.toUpperCase()).split(",");
                         if(partesMovimientoRealizado.length > 1){
                            Jugador jugadorActual = new Jugador();

                            if(jugadores.get(0).getNombreJugador().compareTo(partesMovimientoRealizado[2])==0){
                                jugadorActual = jugadores.get(0);
                            } else if(jugadores.get(1).getNombreJugador().compareTo(partesMovimientoRealizado[2])==0){
                                jugadorActual = jugadores.get(1);
                            }


                            Movimiento nuevoMovimiento = new Movimiento(Integer.parseInt(partesMovimientoRealizado[0]),
                                                                       Integer.parseInt(partesMovimientoRealizado[1]), 
                                                                       jugadorActual);
                            System.out.println("Movimiento Agregado: " + nuevoMovimiento.toString());
                            outToClient.writeBytes("MOVIMIENTO_AGREGADO");
                            movimientos.add(nuevoMovimiento);

                            String jugadorGanador = moderador.obtenerGanador();

                            if(jugadorGanador == "NINGUNO"){
                                outToClient.writeBytes("GANADOR_" + jugadorGanador);
                                manejoDeJuego = false;
                            } else{

                            }
                         } else{
                             System.out.println(" Agregar movimiento...");
                             outToClient.writeBytes("AGREGAR_MOVIMIENTO");
                         }
                     }
                     
                     //Jugabilidad coordinada por el Moderador
                     
                     
                     
                     
                     if(((clientSentence.toUpperCase()).compareTo("CLOSECXN")) == 0){
                         outToClient.writeBytes("Connection Closed");
                         socket.close();
                         listener.close();
                         break;
                     }
                     System.out.println(cantidadJugadores);
                     
                } finally {
                    socket.close();
                }
            }
    }
}