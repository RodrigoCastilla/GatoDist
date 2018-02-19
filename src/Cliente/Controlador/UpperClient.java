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
    public static void main(String[] args) throws IOException {
        String sentence,modifiedSentence;
        /*String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
            "running the upper service on port 9090:");*/
        Socket s;
        while(true){
            s = new Socket("localhost", 9091);

            System.out.println("Conexión iniciada");
            try{
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());
                System.out.println("Introduce el texto que deseas convertir a Mayúscula:");
                BufferedReader inFromServer =
                    new BufferedReader(new InputStreamReader(s.getInputStream()));
                sentence = inFromUser.readLine();
                outToServer.writeBytes(sentence + '\n');
                modifiedSentence = inFromServer.readLine();
                System.out.println("From server: "+ modifiedSentence);
                //sJOptionPane.showMessageDialog(null, modifiedSentence);
                
                if((modifiedSentence.toUpperCase()).compareTo("JUGADORES_CONECTADOS") == 0){
                    System.out.println("Completos");
                    //System.out.println("Ganador: " + inFromServer.readLine().charAt(inFromServer.readLine().length() - 1));
                }
                
                /*if((modifiedSentence.toUpperCase()).contains("GANADOR")){
                    System.out.println("Ganador: " + inFromServer.readLine().charAt(inFromServer.readLine().length() - 1));
                    s.close();
                    System.exit(0);
                    break;
                }*/
                //s.close();
                System.out.println("Conexión cerrada\n");
                //System.exit(0);
                
            } finally{
                s.close();
            }
            
        }
        //Socket s = new Socket("localhost", 9090);
        
    }
}


