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
public class Servidor {
    private ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
    public Servidor(){
        Jugador jugador = new Jugador();
        jugador.setNombreJugador("VACIO");
        jugador.setSimboloJugador("[ - ]");
        this.movimientos.add((new Movimiento(1, 1, jugador)));
        this.movimientos.add((new Movimiento(1, 2, jugador)));
        this.movimientos.add((new Movimiento(1, 3, jugador)));
        this.movimientos.add((new Movimiento(2, 1, jugador)));
        this.movimientos.add((new Movimiento(2, 2, jugador)));
        this.movimientos.add((new Movimiento(2, 3, jugador)));
        this.movimientos.add((new Movimiento(3, 1, jugador)));
        this.movimientos.add((new Movimiento(3, 2, jugador)));
        this.movimientos.add((new Movimiento(3, 3, jugador)));
        System.out.println("Servidor Inicializado.");
       
    }
    
    public void correrServidor() throws IOException{
        String clientSentence;
        String respuesta;
        int cantidadJugadores = 0;
        String jugadorQueEligePrimero ="";
        int valorAlAzarEntreUnoYCien = (int) (Math.random()*101 + 1);
        
        ModeradorJuego moderador= new ModeradorJuego(this.movimientos);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();
        ServerSocket listener = new ServerSocket(9091);
        
        String jugadorEnTurno = "JUGADOR1";
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    respuesta = "";
                    BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
                     clientSentence = inFromClient.readLine();
                     System.out.println("Received: " + clientSentence);
                     
                     
                     
                     //Registro de jugadores
                     if((clientSentence.toUpperCase()).compareTo("SOLICITUD") == 0){
                         String respuestaSolicitud="";
                         if(cantidadJugadores == 0){
                             jugadores.add(new Jugador("JUGADOR1"));
                             jugadores.get(0).setSimboloJugador("X");
                             respuestaSolicitud = "JUGADOR1";
                              System.out.println("Registrado JUGADOR1");
                         cantidadJugadores++;
                         } else if (cantidadJugadores ==1){
                             jugadores.add(new Jugador("JUGADOR2"));
                             jugadores.get(1).setSimboloJugador("O");
                             respuestaSolicitud = "JUGADOR2";
                             System.out.println("Registrado JUGADOR 2");
                             cantidadJugadores++;
                         } else if(cantidadJugadores >1){
                             respuestaSolicitud="SALA_LLENA";
                         }
                         respuesta = respuestaSolicitud;
                     }
                     
                     //Solicitud de Simbolo respecto al numero al Azar
                     if((clientSentence.toUpperCase()).contains("REGNUM")){
                         String respuestaSolicitud="";
                         int numJug1 = 0;
                         int numJug2 = 0;
                         
                         String[] partsClient = clientSentence.split(",");
                         if(partsClient.length>2){
                            if(partsClient[1].compareTo("JUGADOR1") == 0){
                                numJug1 = Integer.parseInt(partsClient[2]);
                             
                            }
                            if(partsClient[1].compareTo("JUGADOR2") == 0){
                                numJug2 = Integer.parseInt(partsClient[2]);
                            }
                         
                         } else if (partsClient.length ==  2) {
                             int diferenciaJug1 = 0;
                             int diferenciaJug2 = 0;
                             if(numJug1 != 0 && numJug2 != 0){
                             diferenciaJug1 = Math.abs((valorAlAzarEntreUnoYCien - diferenciaJug1));
                            diferenciaJug2 = Math.abs((valorAlAzarEntreUnoYCien - diferenciaJug2));
                            if(diferenciaJug1 >= diferenciaJug2){
                                respuestaSolicitud = "JUGADOR1";
                                jugadorQueEligePrimero = "JUGADOR1";
                            } else{
                                respuestaSolicitud = "JUGADOR2";
                                jugadorQueEligePrimero = "JUGADOR2";
                            }
                         } else{
                             respuestaSolicitud = "LEYENDO_NUMEROS";
                         }
                         }
                         
                            
                         
                         respuesta = respuestaSolicitud;
                     }
                     
                     if(((clientSentence.toUpperCase()).compareTo("CANT_JUGADORES")) == 0){
                         String respuestaSolicitud= String.valueOf(cantidadJugadores);
                         respuesta = respuestaSolicitud;
                     }
                     
                     
                     if(((clientSentence.toUpperCase()).compareTo("SIMBS_STATE")) == 0){
                         String respuestaSolicitud= "";
                         if(jugadores.get(0).getSimboloJugador().compareTo(" ") == 0 || jugadores.get(1).getSimboloJugador().compareTo(" ") ==0){
                             respuestaSolicitud = "LEYENDO_SIMBOLOS";
                         } else {
                             respuestaSolicitud = "SIMBOLOS_LEIDOS";
                         }
                         respuesta = respuestaSolicitud;
                     }
                     
                     if((clientSentence.toUpperCase()).contains("REGSYM")){
                         String respuestaSolicitud="";
                         String symJug = "";
                         String[] partsClient = clientSentence.split(",");
                         if(partsClient[1].toUpperCase().compareTo(jugadorQueEligePrimero) == 0){
                            if(partsClient[1].compareTo("JUGADOR1") == 0){
                             symJug = partsClient[2];
                             jugadores.get(0).setSimboloJugador(symJug);
                             respuestaSolicitud = "JUGADOR1";
                            }
                            if(partsClient[1].compareTo("JUGADOR2") == 0){
                                symJug = partsClient[2];
                                jugadores.get(0).setSimboloJugador(symJug);
                                respuestaSolicitud = "JUGADOR2";
                            } 
                             
                         } else{
                             respuestaSolicitud = "RIVAL_ELIGIENDO";
                         }
                         respuesta = respuestaSolicitud;
                         
                     }
                     
                     if((clientSentence.toUpperCase()).contains("SOLMOVS")){
                             String respuestaSolicitud= "";
                             String[] cadena = clientSentence.split(",");
                             int filaSol = Integer.parseInt(cadena[0]);
                             int columnaSol = Integer.parseInt(cadena[1]);
                             int cont=0;
                             for(int i=0; i<movimientos.size(); i++){
                                    int fila = movimientos.get(i).getFila();
                                     int columna = movimientos.get(i).getColumna();
                                     String receptor = movimientos.get(i).getJugador().getSimboloJugador();
                                     if((fila == filaSol) && (columna == columnaSol)){
                                         respuestaSolicitud = fila +"," + columna + "," + receptor;
                                         //System.out.println(respuestaSolicitud);
                                     }
                             }
                             respuesta = respuestaSolicitud;
                             
                     }
                     if((clientSentence.toUpperCase()).contains("REGMOV")){
                             String respuestaSolicitud= "NO_RECIBIDO";
                             String[] cadena = clientSentence.split(",");
                             int filaSol = Integer.parseInt(cadena[1]);
                             int columnaSol = Integer.parseInt(cadena[2]);
                             String jugador = cadena[3].toUpperCase();
                             if(jugadorEnTurno.compareTo(jugador) ==0){
                                for(int i=0; i<movimientos.size(); i++){
                                    int fila = movimientos.get(i).getFila();
                                    int columna = movimientos.get(i).getColumna();
                                    if((fila == filaSol) && (columna == columnaSol)){
                                        if(jugador.compareTo("JUGADOR1")==0){
                                            movimientos.get(i).setJugador(jugadores.get(0));
                                            
                                            jugadorEnTurno = "JUGADOR2";
                                        } else if (jugador.compareTo("JUGADOR2")==0){
                                            movimientos.get(i).setJugador(jugadores.get(1));
                                            jugadorEnTurno= "JUGADOR1";
                                        }
                                            
                                        respuestaSolicitud = "RECIBIDO";
                                    }
                                }
                             } else{
                                 respuestaSolicitud = "TURNO_ERRONEO";
                             }
                             
                             respuesta = respuestaSolicitud;
                     }
                     
                     if(((clientSentence.toUpperCase()).compareTo("GANADOR")) == 0){
                         String respuestaSolicitud= moderador.verificarGanador();
                         respuesta = respuestaSolicitud;
                     }
                     
                     
                     if(((clientSentence.toUpperCase()).compareTo("CLOSECXN")) == 0){
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
        }
        finally {
            listener.close();
        }
    }
}
