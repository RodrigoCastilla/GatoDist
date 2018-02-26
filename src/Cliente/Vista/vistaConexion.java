package Cliente.Vista;

import Cliente.Modelo.ProxyCliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARMC3PO
 */
public class vistaConexion extends javax.swing.JFrame {

    /**
     * Creates new form Conexion
     */
    public vistaConexion() {
        initComponents();
    }

    public JLabel getJugadorLBL() {
        return jugadorLBL;
    }

    public void setJugadorLBL(JLabel jugadorLBL) {
        this.jugadorLBL = jugadorLBL;
    }

    public JLabel getNumJugadorLBL() {
        return numJugadorLBL;
    }

    public void setNumJugadorLBL(JLabel numJugadorLBL) {
        this.numJugadorLBL = numJugadorLBL;
    }

    public JPanel getPanelBusquedaContrincante() {
        return panelBusquedaContrincante;
    }

    public void setPanelBusquedaContrincante(JPanel panelBusquedaContrincante) {
        this.panelBusquedaContrincante = panelBusquedaContrincante;
    }

    public JPanel getPanelIniciarJuego() {
        return panelIniciarJuego;
    }

    public void setPanelIniciarJuego(JPanel panelIniciarJuego) {
        this.panelIniciarJuego = panelIniciarJuego;
    }

    public JButton getPlayBTN() {
        return playBTN;
    }

    public void setPlayBTN(JButton playBTN) {
        this.playBTN = playBTN;
    }

    public JButton getVolverABuscarBTN() {
        return volverABuscarBTN;
    }

    public void setVolverABuscarBTN(JButton volverABuscarBTN) {
        this.volverABuscarBTN = volverABuscarBTN;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusquedaContrincante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volverABuscarBTN = new javax.swing.JButton();
        panelIniciarJuego = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playBTN = new javax.swing.JButton();
        jugadorLBL = new javax.swing.JLabel();
        numJugadorLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("No hay contrincante disponible...");

        volverABuscarBTN.setText("Volver a buscar");

        javax.swing.GroupLayout panelBusquedaContrincanteLayout = new javax.swing.GroupLayout(panelBusquedaContrincante);
        panelBusquedaContrincante.setLayout(panelBusquedaContrincanteLayout);
        panelBusquedaContrincanteLayout.setHorizontalGroup(
            panelBusquedaContrincanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContrincanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBusquedaContrincanteLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(volverABuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusquedaContrincanteLayout.setVerticalGroup(
            panelBusquedaContrincanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaContrincanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverABuscarBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("¡Contrincante encontrado!");

        playBTN.setText("Jugar");
        playBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIniciarJuegoLayout = new javax.swing.GroupLayout(panelIniciarJuego);
        panelIniciarJuego.setLayout(panelIniciarJuegoLayout);
        panelIniciarJuegoLayout.setHorizontalGroup(
            panelIniciarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciarJuegoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarJuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        panelIniciarJuegoLayout.setVerticalGroup(
            panelIniciarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciarJuegoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jugadorLBL.setText("Juagador: ");

        numJugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        numJugadorLBL.setForeground(new java.awt.Color(102, 102, 0));
        numJugadorLBL.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelIniciarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusquedaContrincante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jugadorLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numJugadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numJugadorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusquedaContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBTNActionPerformed
        try {
            // TODO add your handling code here:
            numJugadorLBL.setText("...");
            ProxyCliente pc = new ProxyCliente();
            String respuesta = pc.mandarMensajeAlServidor("SOLICITUD");
            System.out.println(respuesta);
            numJugadorLBL.setText(respuesta);
            
            Thread.sleep(5000);
            vistaSeleccion seleccion = new vistaSeleccion();
            seleccion.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(vistaConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(vistaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_playBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jugadorLBL;
    private javax.swing.JLabel numJugadorLBL;
    private javax.swing.JPanel panelBusquedaContrincante;
    private javax.swing.JPanel panelIniciarJuego;
    private javax.swing.JButton playBTN;
    private javax.swing.JButton volverABuscarBTN;
    // End of variables declaration//GEN-END:variables
}
