/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controlador;

import Cliente.Modelo.ProxyCliente;
import Cliente.Vista.vistaConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARMC3PO
 */
public class ControladorVentanaConexion implements ActionListener{
    private vistaConexion ventanaConexion;
    private ProxyCliente proxyCliente;
    private String nombreJugador;

    public ControladorVentanaConexion() throws IOException, InterruptedException {
        this.ventanaConexion = new vistaConexion();
        proxyCliente = new ProxyCliente();
        this.ventanaConexion.getVolverABuscarBTN().addActionListener(this);
        this.ventanaConexion.getPlayBTN().addActionListener(this);
        this.ventanaConexion.getPanelIniciarJuego().setVisible(false);
        nombreJugador = proxyCliente.mandarMensajeAlServidor("SOLICITUD");
        this.ventanaConexion.getJugadorLBL().setText(nombreJugador);
        this.ventanaConexion.setVisible(true);
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.ventanaConexion.getPlayBTN() == e.getSource()){
            this.ventanaConexion.dispose();
        } else if (this.ventanaConexion.getVolverABuscarBTN() == e.getSource()){
            verificarSalaDeJuegos();
        }
    }
    
    public boolean verificarSalaDeJuegos(){
        boolean salaCompletada = false;
        try {
            String respuestaServ = proxyCliente.mandarMensajeAlServidor("CANT_JUGADORES");
            if(respuestaServ.compareTo("2") == 0){
                this.ventanaConexion.getPanelIniciarJuego().setVisible(true);
                this.ventanaConexion.getPanelBusquedaContrincante().setVisible(false);
                Thread.sleep(250);
                //this.ventanaConexion.dispose();
                salaCompletada = true;
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ControladorVentanaConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorVentanaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salaCompletada;
    }
}
