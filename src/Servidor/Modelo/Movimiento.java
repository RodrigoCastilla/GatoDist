/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Modelo;

/**
 *
 * @author ARMC3PO
 */
public class Movimiento {
    private int fila, columna;
    private Jugador jugador;
    
    public Movimiento(int fila, int columna, Jugador jugador){
        this.fila = fila;
        this.columna = columna;
        this.jugador = jugador;
    }

    public Movimiento() {
        this.fila = 0;
        this.columna = 0;
        this.jugador = new Jugador();
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }


    @Override
    public String toString() {
        return "(" + fila + "," + columna + ") - " + jugador.toString();
    }

    
    
    
}
