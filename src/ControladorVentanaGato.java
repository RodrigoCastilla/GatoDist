
import Cliente.ProxyCliente;
import Cliente.Vista.vistaGato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARMC3PO
 */
public class ControladorVentanaGato implements ActionListener{
    private vistaGato ventanaGato;
    private ProxyCliente proxyCliente;
    private String nombreJugador;
    private ArrayList<String> movimientosTablero;
    
    public ControladorVentanaGato() throws InterruptedException, IOException{
       this.ventanaGato = new vistaGato();
       proxyCliente = new ProxyCliente();
       this.ventanaGato.getA1Btn().addActionListener(this);
       this.ventanaGato.getA2Btn().addActionListener(this);
       this.ventanaGato.getA3Btn().addActionListener(this);
       this.ventanaGato.getB1Btn().addActionListener(this);
       this.ventanaGato.getB2Btn().addActionListener(this);
       this.ventanaGato.getB3Btn().addActionListener(this);
       this.ventanaGato.getC1Btn().addActionListener(this);
       this.ventanaGato.getC2Btn().addActionListener(this);
       this.ventanaGato.getC3Btn().addActionListener(this);
       
       nombreJugador = proxyCliente.mandarMensajeAlServidor("SOLICITUD");
       movimientosTablero = proxyCliente.obtenerDatosTablero();
       
       ventanaGato.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.ventanaGato.getA1Btn() == e.getSource()){
            realizarMovimiento(1,1);
        }if (this.ventanaGato.getA2Btn() == e.getSource()){
            realizarMovimiento(1,2);
        }if (this.ventanaGato.getA3Btn() == e.getSource()){
            realizarMovimiento(1,3);
        }if (this.ventanaGato.getB1Btn() == e.getSource()){
            realizarMovimiento(2,1);
        }if (this.ventanaGato.getB2Btn() == e.getSource()){
            realizarMovimiento(2,2);
        }if (this.ventanaGato.getB3Btn() == e.getSource()){
            realizarMovimiento(2,3);
        }if (this.ventanaGato.getC1Btn() == e.getSource()){
            realizarMovimiento(3,1);
        }if (this.ventanaGato.getC2Btn() == e.getSource()){
            realizarMovimiento(3,2);
        }if (this.ventanaGato.getC3Btn() == e.getSource()){
            realizarMovimiento(3,3);
        }
    }
    
    private void realizarMovimiento(int fila, int columna) {
        try {
            //this.ventanaGato.getPanelJuego().setVisible(false);
            actualizarVistaTablero();
            String estadoMovimiento = proxyCliente.realizarMovimiento(fila, columna, nombreJugador);
            if(estadoMovimiento.compareTo("RECIBIDO")==0){
                actualizarVistaTablero();
                //this.ventanaGato.getPanelJuego().setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Movimiento Registrado Erróneo");
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorVentanaGato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorVentanaGato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarVistaTablero() throws InterruptedException, IOException{
        //this.ventanaGato.getPanelJuego().setVisible(false);
        movimientosTablero = proxyCliente.obtenerDatosTablero();
        String[] a1= (movimientosTablero.get(0)).split(",");
        this.ventanaGato.getA1Btn().setText(a1[2]);
        String[] a2= (movimientosTablero.get(1)).split(",");
        this.ventanaGato.getA2Btn().setText(a2[2]);
        String[] a3= (movimientosTablero.get(2)).split(",");
        this.ventanaGato.getA3Btn().setText(a3[2]);
        String[] b1= (movimientosTablero.get(3)).split(",");
        this.ventanaGato.getB1Btn().setText(b1[2]);
        String[] b2= (movimientosTablero.get(4)).split(",");
        this.ventanaGato.getB2Btn().setText(b2[2]);
        String[] b3= (movimientosTablero.get(5)).split(",");
        this.ventanaGato.getB3Btn().setText(b3[2]);
        String[] c1= (movimientosTablero.get(6)).split(",");
        this.ventanaGato.getC1Btn().setText(c1[2]);
        String[] c2= (movimientosTablero.get(7)).split(",");
        this.ventanaGato.getC2Btn().setText(c2[2]);
        String[] c3= (movimientosTablero.get(8)).split(",");
        this.ventanaGato.getC3Btn().setText(c3[2]);
        
        actualizarUsoBotones();
        this.ventanaGato.getPanelJuego().updateUI();
        //this.ventanaGato.getPanelJuego().setVisible(true);
    }
    
    private void actualizarUsoBotones(){
        String[] a1= (movimientosTablero.get(0)).split(",");
        if(a1[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getA1Btn().setEnabled(false);
        
        String[] a2= (movimientosTablero.get(1)).split(",");
        if(a2[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getA2Btn().setEnabled(false);
        
        String[] a3= (movimientosTablero.get(2)).split(",");
        if(a3[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getA3Btn().setEnabled(false);
        
        String[] b1= (movimientosTablero.get(3)).split(",");
        if(b1[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getB1Btn().setEnabled(false);
        
        String[] b2= (movimientosTablero.get(4)).split(",");
        if(b2[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getB2Btn().setEnabled(false);
        
        String[] b3= (movimientosTablero.get(5)).split(",");
        if(b3[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getB3Btn().setEnabled(false);
        
        String[] c1= (movimientosTablero.get(6)).split(",");
        if(c1[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getC1Btn().setEnabled(false);
        
        String[] c2= (movimientosTablero.get(7)).split(",");
        if(c2[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getC2Btn().setEnabled(false);
        
        String[] c3= (movimientosTablero.get(8)).split(",");
        if(c3[2].compareTo("[ - ]") != 0)
            this.ventanaGato.getC3Btn().setEnabled(false);
    }
}
