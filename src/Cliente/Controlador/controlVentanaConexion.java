/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controlador;

import Cliente.Vista.vistaConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ARMC3PO
 */
public class controlVentanaConexion implements ActionListener{
    private vistaConexion ventanaConexion;

    public controlVentanaConexion() {
        this.ventanaConexion.getVolverABuscarBTN().addActionListener(this);
        this.ventanaConexion.getPlayBTN().addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ventanaConexion.getVolverABuscarBTN() == e.getSource()){
            
        } else if(ventanaConexion.getPlayBTN() == e.getSource()){
            
        }
    }
    
}
