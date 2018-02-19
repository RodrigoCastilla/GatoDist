/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controlador;

import Cliente.Vista.vistaSeleccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ARMC3PO
 */
public class controlVentanaSeleccion implements ActionListener{
    private vistaSeleccion ventanaSeleccion;

    public controlVentanaSeleccion() {
        this.ventanaSeleccion.getActualizarBTN().addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
