package Servidor.Modelo;


import Servidor.Modelo.Jugador;
import Servidor.Modelo.Movimiento;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARMC3PO
 */
public class ModeradorJuego {
    private ArrayList<Movimiento> movimientosJuego = new ArrayList<Movimiento>();

    public ModeradorJuego(ArrayList<Movimiento> movimientos) {
        this.movimientosJuego = movimientos;
    }
    
    public void registrarMovimiento(int fila, int columna, Jugador jugador){
        for(int i =0; i< movimientosJuego.size(); i++){
            if(movimientosJuego.get(i).getFila() == fila && movimientosJuego.get(i).getColumna() == columna){
                if(movimientosJuego.get(i).getJugador().getNombreJugador().compareTo(jugador.getNombreJugador()) == 0){
                    movimientosJuego.get(i).setJugador(jugador);
                }
            }
        }
    }
    
    public String verificarGanador(){
        String ganador = "NADIE";
        
        String victorioso = verificarCasoVictoria();
        if (victorioso.compareTo("NADIE") != 0){
            ganador = victorioso;
        }
        if(verificarCasoEmpate() == true){
            ganador = "EMPATE";
        }
        
        return ganador;
    }
    /**
     * 
     */
    
    private String verificarCasoVictoria(){
        String jugadorVictorioso = "NADIE"; //Caso por defecto
        
        //Caso 1 : Fila  1
        boolean caso1 = ((movimientosJuego.get(0).getJugador().getNombreJugador().compareTo(movimientosJuego.get(1).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(1).getJugador().getNombreJugador().compareTo(movimientosJuego.get(2).getJugador().getNombreJugador())) ==0);
        boolean caso1NoVacio =  (movimientosJuego.get(0).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(1).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(2).getJugador().getNombreJugador().compareTo("VACIO") != 0);                        
        if(caso1 && caso1NoVacio)
            jugadorVictorioso = movimientosJuego.get(0).getJugador().getNombreJugador();    
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 2 : Fila  2
        boolean caso2 = ((movimientosJuego.get(3).getJugador().getNombreJugador().compareTo(movimientosJuego.get(4).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(4).getJugador().getNombreJugador().compareTo(movimientosJuego.get(5).getJugador().getNombreJugador())) ==0) ;
        boolean caso2NoVacio =  (movimientosJuego.get(3).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(4).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(5).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso2 && caso2NoVacio)
            jugadorVictorioso = movimientosJuego.get(3).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 3 : Fila  3
        boolean caso3 = ((movimientosJuego.get(6).getJugador().getNombreJugador().compareTo(movimientosJuego.get(7).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(7).getJugador().getNombreJugador().compareTo(movimientosJuego.get(8).getJugador().getNombreJugador())) ==0) ;
        boolean caso3NoVacio =  (movimientosJuego.get(6).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(7).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(8).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso3 && caso3NoVacio)
            jugadorVictorioso = movimientosJuego.get(6).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 4 : Columna  1
        boolean caso4 = ((movimientosJuego.get(0).getJugador().getNombreJugador().compareTo(movimientosJuego.get(3).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(3).getJugador().getNombreJugador().compareTo(movimientosJuego.get(6).getJugador().getNombreJugador())) ==0) ;
        boolean caso4NoVacio =  (movimientosJuego.get(0).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(3).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(6).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso4 && caso4NoVacio)
            jugadorVictorioso = movimientosJuego.get(0).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 5 : Columna  2
        boolean caso5 = ((movimientosJuego.get(1).getJugador().getNombreJugador().compareTo(movimientosJuego.get(4).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(4).getJugador().getNombreJugador().compareTo(movimientosJuego.get(7).getJugador().getNombreJugador())) ==0) ;
        boolean caso5NoVacio =  (movimientosJuego.get(1).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(4).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(7).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso5 && caso5NoVacio)
            jugadorVictorioso = movimientosJuego.get(1).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 6 : Columna  3
        boolean caso6 = ((movimientosJuego.get(2).getJugador().getNombreJugador().compareTo(movimientosJuego.get(5).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(5).getJugador().getNombreJugador().compareTo(movimientosJuego.get(8).getJugador().getNombreJugador())) ==0) ;
        boolean caso6NoVacio =  (movimientosJuego.get(2).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(5).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(8).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso6 && caso6NoVacio)
            jugadorVictorioso = movimientosJuego.get(2).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 7 : Diagonal 1, Izq(sup)-Der(inf)
        boolean caso7 = ((movimientosJuego.get(0).getJugador().getNombreJugador().compareTo(movimientosJuego.get(4).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(4).getJugador().getNombreJugador().compareTo(movimientosJuego.get(8).getJugador().getNombreJugador())) ==0) ;
        boolean caso7NoVacio =  (movimientosJuego.get(0).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(4).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(8).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso7 && caso7NoVacio)
            jugadorVictorioso = movimientosJuego.get(0).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Caso 8 : Diagonal 2, Der(sup)-Izq(inf)
        boolean caso8 = ((movimientosJuego.get(2).getJugador().getNombreJugador().compareTo(movimientosJuego.get(4).getJugador().getNombreJugador())) ==0) && 
                        ((movimientosJuego.get(4).getJugador().getNombreJugador().compareTo(movimientosJuego.get(6).getJugador().getNombreJugador())) ==0) ;
        boolean caso8NoVacio =  (movimientosJuego.get(2).getJugador().getNombreJugador().compareTo("VACIO") != 0) && 
                                (movimientosJuego.get(4).getJugador().getNombreJugador().compareTo("VACIO") != 0) &&
                                (movimientosJuego.get(6).getJugador().getNombreJugador().compareTo("VACIO") != 0);
        if(caso8 && caso8NoVacio)
            jugadorVictorioso = movimientosJuego.get(2).getJugador().getNombreJugador();
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        return jugadorVictorioso;
    }
    
    /**
     *
    */
    private boolean verificarCasoEmpate(){
        boolean empate = false;
        if(verificarCasoVictoria().compareTo("NADIE") == 0){
            int contadorCasillasUsadas = 0;
            for(int i=0; i< movimientosJuego.size(); i++){
                if(movimientosJuego.get(i).getJugador().getNombreJugador().compareTo("VACIO") != 0)
                    contadorCasillasUsadas++;
            }
            int cantidadCasillasJuego = 9;
            if(contadorCasillasUsadas == cantidadCasillasJuego){
                empate = true;
            } else{
                empate = false;
            }
        } 
        return empate;
    }
    
    
}
