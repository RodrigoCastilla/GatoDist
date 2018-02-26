/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controlador;

import Cliente.Modelo.ProxyCliente;
import Cliente.Vista.vistaSeleccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ARMC3PO
 */
public class ControladorVentanaSeleccion implements ActionListener{
    private String nombreJugador;
    private vistaSeleccion ventanaSeleccion;
    private ProxyCliente proxyCliente;

    public ControladorVentanaSeleccion(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.ventanaSeleccion = new vistaSeleccion();
        this.proxyCliente = new ProxyCliente();
        this.ventanaSeleccion.getPanelSeleccionSimbolo().setVisible(false);
        
        
        
        this.ventanaSeleccion.setVisible(true);
    }

    public ControladorVentanaSeleccion() {
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.ventanaSeleccion.getEnviarSimboloBTN() == e.getSource()){
            try {
                String solitcitudAEnviar = "REGSYM," +nombreJugador +"," + this.ventanaSeleccion.getTextoSimbolo();
                String respuestaServidor = proxyCliente.mandarMensajeAlServidor(solitcitudAEnviar);
                if(respuestaServidor.compareTo(nombreJugador) == 0){
                    this.ventanaSeleccion.getEnviarSimboloBTN().setEnabled(false);
                    this.ventanaSeleccion.getPanelSeleccionNumero().setEnabled(false);
                    this.ventanaSeleccion.dispose();
                } else{
                    JOptionPane.showMessageDialog(null, nombreJugador + ", tu rival está eligiendo");
                }
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(this.ventanaSeleccion.getEnviarNumeroBTN() == e.getSource()){
            try {
                String solitcitudAEnviar = "REGNUM," +nombreJugador +"," + this.ventanaSeleccion.getTextoNumeroUnoAlCien();
                String respuestaServidor = proxyCliente.mandarMensajeAlServidor(solitcitudAEnviar);
                this.ventanaSeleccion.getEnviarNumeroBTN().setEnabled(false);
                this.ventanaSeleccion.getPanelSeleccionNumero().setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    public boolean verificarRegistroSimb(){
        boolean registrandoSimb = true;
        try {
            
            String solitcitudAEnviar = "SIMBS_STATE";
            String respuestaServidor = proxyCliente.mandarMensajeAlServidor(solitcitudAEnviar);
            if(respuestaServidor.compareTo("LEYENDO_SIMBOLOS")!= 0){
                registrandoSimb = false;
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorVentanaSeleccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registrandoSimb;
    }
    
    
}
