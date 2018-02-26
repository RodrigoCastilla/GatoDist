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
        String jugadorQueEligePrimero ="";
        int valorAlAzarEntreUnoYCien = (int) (Math.random()*101 + 1);
        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        ModeradorJuego moderador= new ModeradorJuego(movimientos);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();
        ServerSocket listener = new ServerSocket(9091);
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
                             respuestaSolicitud = "JUGADOR1";
                              System.out.println("Registrado JUGADOR1");
                         cantidadJugadores++;
                         } else if (cantidadJugadores ==1){
                             jugadores.add(new Jugador("JUGADOR2"));
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
                         if(partsClient[1].compareTo("JUGADOR1") == 0){
                             numJug1 = Integer.parseInt(partsClient[2]);
                             
                         }
                         if(partsClient[1].compareTo("JUGADOR2") == 0){
                             numJug2 = Integer.parseInt(partsClient[2]);
                         }
                         int diferenciaJug1 = 0;
                         int diferenciaJug2 = 0;
                         diferenciaJug1 = Math.abs((valorAlAzarEntreUnoYCien - diferenciaJug1));
                         diferenciaJug2 = Math.abs((valorAlAzarEntreUnoYCien - diferenciaJug2));
                         if(diferenciaJug1 >= diferenciaJug2){
                             jugadorQueEligePrimero = "JUGADOR1";
                         } else{
                             jugadorQueEligePrimero = "JUGADOR2";
                         }
                         
                     }
                     if((clientSentence.toUpperCase()).contains("REGSYM")){
                         String respuestaSolicitud="";
                         String symJug = "";
                         String[] partsClient = clientSentence.split(",");
                         if(partsClient[1].compareTo("JUGADOR1") == 0){
                             symJug = partsClient[2];
                             jugadores.get(0).setSimboloJugador(symJug);
                         }
                         if(partsClient[1].compareTo("JUGADOR2") == 0){
                             symJug = partsClient[2];
                             jugadores.get(0).setSimboloJugador(symJug);
                         }
                         
                         
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
