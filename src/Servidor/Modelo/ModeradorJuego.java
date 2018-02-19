/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Modelo;

import java.util.ArrayList;

/**
 *
 * @author ARMC3PO
 */
public class ModeradorJuego {
    
    private ArrayList <Movimiento> movimientosRealizados;
    private int ultimoJugadorEnActuar;
    private Jugador ganador;

    public ModeradorJuego() {
        this.movimientosRealizados = new ArrayList<Movimiento>();
        this.ganador = new Jugador();
    }
    public ModeradorJuego(ArrayList<Movimiento> movimientosRealizados) {
        this.movimientosRealizados = new ArrayList<Movimiento>();
        this.ganador = new Jugador();
    }
    
    public void agregarMovimiento(){
        
    }
    
    
    public String obtenerGanador(){
        String nombreGanador = "NINGUNO";
        
        return nombreGanador;       
    }
    
    private void verificarGanaor(){
        Movimiento movimientoTemp;
        int filaTemp, ColumnaTemp;
        Jugador nombreJugadorTemp;
        for(int i =0; i< movimientosRealizados.size(); i++){
            movimientoTemp = movimientosRealizados.get(i);
            filaTemp = movimientoTemp.getFila();
            ColumnaTemp= movimientoTemp.getColumna();
            nombreJugadorTemp = movimientoTemp.getJugador();
        }
        
        
    }
    
    
    
}
