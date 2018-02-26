package Cliente.Test;


import Cliente.Controlador.ControladorVentanaConexion;
import Cliente.Controlador.ControladorVentanaGato;
import Cliente.Controlador.ControladorVentanaSeleccion;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARMC3PO
 */
public class testClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*final int SALA_CONEXION = 1;
        final int SELECCION_SIMBOLOS = 2;
        final int JUEGO_GATO = 3;
        int estadoJuego = 1;
        
        //---Sala de conexion
        ControladorVentanaConexion conexion1 = new ControladorVentanaConexion();
        ControladorVentanaConexion conexion2 = new ControladorVentanaConexion();
        while(estadoJuego == SALA_CONEXION){
            Thread.sleep(1000);
            if(conexion1.verificarSalaDeJuegos() || conexion2.verificarSalaDeJuegos()){
                estadoJuego = SELECCION_SIMBOLOS;
                break;
            }

        }
        
        
        //----Seleccion de simbolos-----
        ControladorVentanaSeleccion seleccion1 = new ControladorVentanaSeleccion(conexion1.getNombreJugador());
        ControladorVentanaSeleccion seleccion2 = new ControladorVentanaSeleccion(conexion2.getNombreJugador());
        while(estadoJuego == SALA_CONEXION){
            if(conexion1.verificarSalaDeJuegos() == false || conexion2.verificarSalaDeJuegos() == false){
                estadoJuego = JUEGO_GATO;
            }
        }
        
        
        //---JuegoGato------
        if(estadoJuego == JUEGO_GATO){
            ControladorVentanaGato gato1 = new ControladorVentanaGato(seleccion1.getNombreJugador());
            ControladorVentanaGato gato2 = new ControladorVentanaGato(seleccion2.getNombreJugador());
            while(estadoJuego == JUEGO_GATO){
            gato1.actualizarVistaTablero();
            gato2.actualizarVistaTablero();
            
            Thread.sleep(500);
            
        }
        }*/
        
        ControladorVentanaGato gato1 = new ControladorVentanaGato();
            ControladorVentanaGato gato2 = new ControladorVentanaGato();
            while(true){
            gato1.actualizarVistaTablero();
            gato2.actualizarVistaTablero();
            
            Thread.sleep(500);
            
            }
    }
    
}
