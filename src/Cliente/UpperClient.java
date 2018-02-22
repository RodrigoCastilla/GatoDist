package Cliente.Controlador;



import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

/**
 * Trivial client for the upper server.
 */
public class UpperClient {

    /**
     * Runs the client as an application.  
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        String sentence,cadenaRecuperada;
        /*String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
            "running the upper service on port 9090:");*/
        Socket s = new Socket();
        /*while(true){
            try{*/
                s = new Socket("localhost", 9091);
         BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
                
                System.out.println("Acción a realizar: ");
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
                //sentence = inFromUser.readLine();
                sentence = "CLOSECXN";
                outToServer.writeBytes(sentence + '\n');
                cadenaRecuperada = inFromServer.readLine();
                System.out.println("From server: "+ cadenaRecuperada);
                if (cadenaRecuperada !=  null){
                    System.out.println(cadenaRecuperada);
                } else{
                    System.out.println("Sin respuesta del servidor...");
                }
                /*if((cadenaRecuperada.toUpperCase()).compareTo("JUGADORES_COMPLETOS") == 0){
                    System.out.println("Completos");
                } else */
                    
               
                System.out.println("Conexión cerrada\n");
                Thread.sleep(1000);
            //} finally{
                s.close();
                
            //}
            
        //}
         
    }
}


