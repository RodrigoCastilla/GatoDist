/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.Modelo.Movimiento;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ARMC3PO
 */
public class ProxyCliente {
    private final String HOST = "localhost";
    private final int PUERTO = 9091;
 
    
    public ProxyCliente(){
    }
    
    
    /*
    *Método que consulta los movimientos del tablero, registrados hasta el momento.
    *La cadena, se recibe de la siguiente manera: fila,columna,JUGADOR
    *En caso de que no  haya sido jugada aún una casilla, se devolverá VACIO en lugar de JUGADOR1 o JUGADOR2
    */
    public String mandarMensajeAlServidor(String mensaje) throws IOException, InterruptedException{
                String mensajeRecibido = "";
                String sentence = "";
                Socket s = new Socket(HOST, PUERTO);
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
                
                System.out.println("Enviado: " + mensaje);
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
                
                sentence = mensaje;
                
                outToServer.writeBytes(sentence + '\n');
                mensajeRecibido = inFromServer.readLine();
                
                
                
                if (mensajeRecibido !=  null){
                    System.out.println("Recibido: "+ mensajeRecibido);
                } else{
                    System.out.println("Recibido: ...");
                }
                Thread.sleep(50);
                s.close();
        return mensajeRecibido;
    }
    
    
    //Método que envía un movimiento al servidor el cual, después de procesar la solicitud, regresa una cadena que indica si fue exitoso el envío o no llegó;
    public String realizarMovimiento(int fila, int columna, String nombreJugador) throws IOException, InterruptedException{
        String estadoMovimiento = "NO_RECIBIDO";
        String mensaje = "REGMOV," + fila + "," + columna + "," + (nombreJugador.toUpperCase());
        String mensajeRecibido = "";
                Socket s  = new Socket(HOST, PUERTO);
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
                
                System.out.println("Enviado: " + mensaje);
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
                
                outToServer.writeBytes(mensaje + '\n');
                mensajeRecibido = inFromServer.readLine();

                if (mensajeRecibido !=  null){
                    System.out.println("Recibido: "+ mensajeRecibido);
                    estadoMovimiento = "RECIBIDO";
                }
                Thread.sleep(25);
                s.close();
        
        return estadoMovimiento;
    }
    
    public ArrayList<String> obtenerDatosTablero() throws IOException, InterruptedException{
                ArrayList<String> movimientosJuego= new ArrayList<String> ();
                int cantidadFilasJuego = 3;
                int cantidadColumnasJuego = 3;
                for(int i=0; i<cantidadFilasJuego; i++){
                    for (int j=0; j< cantidadColumnasJuego; j++){
                        String mensajeRecibido = "";
                        String mensaje = (i+1)+ ","+(j+1)+ ",SOLMOVS";
                        Socket s  = new Socket(HOST, PUERTO);
                        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                        DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());

                        System.out.println("Enviado: " + mensaje);
                        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));

                        outToServer.writeBytes(mensaje + '\n');
                        mensajeRecibido = inFromServer.readLine();
                        movimientosJuego.add(mensajeRecibido);
                        System.out.println("Recibido: "+ mensajeRecibido);
                        
                        Thread.sleep(10);
                        s.close();
                    }

                }    
        return movimientosJuego;
    }
    

    


    
    
    
}
