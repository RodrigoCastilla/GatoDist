/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Controlador;

import Cliente.Vista.vistaGato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ARMC3PO
 */
public class ControlVentanaGato implements ActionListener {
    private vistaGato ventanaGato;
    
    public ControlVentanaGato(){
        this.ventanaGato.getA1Btn().addActionListener(this);
        this.ventanaGato.getA2Btn().addActionListener(this);
        this.ventanaGato.getA3Btn().addActionListener(this);
        this.ventanaGato.getB1Btn().addActionListener(this);
        this.ventanaGato.getB2Btn().addActionListener(this);
        this.ventanaGato.getB3Btn().addActionListener(this);
        this.ventanaGato.getC1Btn().addActionListener(this);
        this.ventanaGato.getC2Btn().addActionListener(this);
        this.ventanaGato.getC3Btn().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ventanaGato.getA1Btn()== e.getSource()){  
            
       }else if(ventanaGato.getA2Btn()== e.getSource()){  
            
       } else if(ventanaGato.getA3Btn()== e.getSource()){  
            
       } else if(ventanaGato.getB1Btn()== e.getSource()){  
            
       }else if(ventanaGato.getB2Btn()== e.getSource()){  
            
       } else if(ventanaGato.getB3Btn()== e.getSource()){  
            
       } else if(ventanaGato.getC1Btn()== e.getSource()){  
            
       }else if(ventanaGato.getC2Btn()== e.getSource()){  
            
       } else if(ventanaGato.getC3Btn()== e.getSource()){  
            
       } 
    }
    
}
