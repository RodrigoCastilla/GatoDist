/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Modelo;

import Servidor.Modelo.*;

/**
 *
 * @author ARMC3PO
 */
public class Jugador {
    
    private String nombreJugador;
    private String simboloJugador;
    private int numeroOrden;

    public Jugador() {
        this.nombreJugador = nombreJugador;
        this.simboloJugador = simboloJugador;
        this.numeroOrden = 0;
    }

    
    public Jugador(String nombreJugador, String simboloJugador, int numeroOrden) {
        this.nombreJugador = nombreJugador;
        this.simboloJugador = simboloJugador;
        this.numeroOrden = numeroOrden;
    }
    
    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.simboloJugador = "";
        this.numeroOrden = 0;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getSimboloJugador() {
        return simboloJugador;
    }

    public void setSimboloJugador(String simboloJugador) {
        this.simboloJugador = simboloJugador;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    
    @Override
    public String toString() {
        return nombreJugador + " (" + simboloJugador + '}';
    }
    
    
    
}
