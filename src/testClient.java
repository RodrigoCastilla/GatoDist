
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARMC3PO
 */
public class testClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        ControladorVentanaGato gato1 = new ControladorVentanaGato();
        ControladorVentanaGato gato2 = new ControladorVentanaGato();
        
        
        while(true){
            gato1.actualizarVistaTablero();
            gato2.actualizarVistaTablero();
            Thread.sleep(1000);
            
        }
    }
    
}
