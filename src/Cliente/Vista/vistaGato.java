package Cliente.Vista;

import Cliente.ProxyCliente;
import java.io.IOException;
import java.util.ArrayList;
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
public class vistaGato extends javax.swing.JFrame {
    /**
     * Creates new form vistaGato
     */
    public vistaGato() throws InterruptedException, IOException {
        initComponents();
    }

    public JButton getA1Btn() {
        return A1Btn;
    }

    public void setA1Btn(JButton A1Btn) {
        this.A1Btn = A1Btn;
    }

    public JButton getA2Btn() {
        return A2Btn;
    }

    public void setA2Btn(JButton A2Btn) {
        this.A2Btn = A2Btn;
    }

    public JButton getA3Btn() {
        return A3Btn;
    }

    public void setA3Btn(JButton A3Btn) {
        this.A3Btn = A3Btn;
    }

    public JButton getB1Btn() {
        return B1Btn;
    }

    public void setB1Btn(JButton B1Btn) {
        this.B1Btn = B1Btn;
    }

    public JButton getB2Btn() {
        return B2Btn;
    }

    public void setB2Btn(JButton B2Btn) {
        this.B2Btn = B2Btn;
    }

    public JButton getB3Btn() {
        return B3Btn;
    }

    public void setB3Btn(JButton B3Btn) {
        this.B3Btn = B3Btn;
    }

    public JButton getC1Btn() {
        return C1Btn;
    }

    public void setC1Btn(JButton C1Btn) {
        this.C1Btn = C1Btn;
    }

    public JButton getC2Btn() {
        return C2Btn;
    }

    public void setC2Btn(JButton C2Btn) {
        this.C2Btn = C2Btn;
    }

    public JButton getC3Btn() {
        return C3Btn;
    }

    public void setC3Btn(JButton C3Btn) {
        this.C3Btn = C3Btn;
    }

    public JPanel getPanelTurnoContrincante() {
        return PanelTurnoContrincante;
    }

    public void setPanelTurnoContrincante(JPanel PanelTurnoContrincante) {
        this.PanelTurnoContrincante = PanelTurnoContrincante;
    }

    public JLabel getEstadoJugadorLBL() {
        return estadoJugadorLBL;
    }

    public void setEstadoJugadorLBL(JLabel estadoJugadorLBL) {
        this.estadoJugadorLBL = estadoJugadorLBL;
    }

    public JLabel getEstadoLBL() {
        return estadoLBL;
    }

    public void setEstadoLBL(JLabel estadoLBL) {
        this.estadoLBL = estadoLBL;
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

    public JPanel getPanelBarraEstados() {
        return panelBarraEstados;
    }

    public void setPanelBarraEstados(JPanel panelBarraEstados) {
        this.panelBarraEstados = panelBarraEstados;
    }

    public JPanel getPanelJuego() {
        return panelJuego;
    }

    public void setPanelJuego(JPanel panelJuego) {
        this.panelJuego = panelJuego;
    }

    public JPanel getPanelTurnoLocal() {
        return panelTurnoLocal;
    }

    public void setPanelTurnoLocal(JPanel panelTurnoLocal) {
        this.panelTurnoLocal = panelTurnoLocal;
    }

    public JLabel getSimbJugadorLBL() {
        return simbJugadorLBL;
    }

    public void setSimbJugadorLBL(JLabel simbJugadorLBL) {
        this.simbJugadorLBL = simbJugadorLBL;
    }

    public JLabel getSimboloLBL() {
        return simboloLBL;
    }

    public void setSimboloLBL(JLabel simboloLBL) {
        this.simboloLBL = simboloLBL;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTurnoLocal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelTurnoContrincante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelJuego = new javax.swing.JPanel();
        A1Btn = new javax.swing.JButton();
        A2Btn = new javax.swing.JButton();
        A3Btn = new javax.swing.JButton();
        B3Btn = new javax.swing.JButton();
        B2Btn = new javax.swing.JButton();
        B1Btn = new javax.swing.JButton();
        C1Btn = new javax.swing.JButton();
        C2Btn = new javax.swing.JButton();
        C3Btn = new javax.swing.JButton();
        panelBarraEstados = new javax.swing.JPanel();
        numJugadorLBL = new javax.swing.JLabel();
        jugadorLBL = new javax.swing.JLabel();
        simboloLBL = new javax.swing.JLabel();
        estadoLBL = new javax.swing.JLabel();
        simbJugadorLBL = new javax.swing.JLabel();
        estadoJugadorLBL = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("¡Tu turno!");

        javax.swing.GroupLayout panelTurnoLocalLayout = new javax.swing.GroupLayout(panelTurnoLocal);
        panelTurnoLocal.setLayout(panelTurnoLocalLayout);
        panelTurnoLocalLayout.setHorizontalGroup(
            panelTurnoLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoLocalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        panelTurnoLocalLayout.setVerticalGroup(
            panelTurnoLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoLocalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Tuno de tu contrincante");

        javax.swing.GroupLayout PanelTurnoContrincanteLayout = new javax.swing.GroupLayout(PanelTurnoContrincante);
        PanelTurnoContrincante.setLayout(PanelTurnoContrincanteLayout);
        PanelTurnoContrincanteLayout.setHorizontalGroup(
            PanelTurnoContrincanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTurnoContrincanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTurnoContrincanteLayout.setVerticalGroup(
            PanelTurnoContrincanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTurnoContrincanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        A1Btn.setText(" ");
        A1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1BtnActionPerformed(evt);
            }
        });

        A2Btn.setText(" ");

        A3Btn.setText(" ");

        B3Btn.setText(" ");

        B2Btn.setText(" ");

        B1Btn.setText(" ");
        B1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1BtnActionPerformed(evt);
            }
        });

        C1Btn.setText(" ");
        C1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1BtnActionPerformed(evt);
            }
        });

        C2Btn.setText(" ");

        C3Btn.setText(" ");

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(C1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B2Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        numJugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        numJugadorLBL.setForeground(new java.awt.Color(102, 102, 0));
        numJugadorLBL.setText("1");

        jugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jugadorLBL.setText("Juagador: ");

        simboloLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        simboloLBL.setText("Símbolo:");

        estadoLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        estadoLBL.setText("Estado del juego:");

        simbJugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        simbJugadorLBL.setForeground(new java.awt.Color(0, 153, 0));
        simbJugadorLBL.setText("X");

        estadoJugadorLBL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        estadoJugadorLBL.setForeground(new java.awt.Color(0, 153, 153));
        estadoJugadorLBL.setText("NEUTRAL");

        javax.swing.GroupLayout panelBarraEstadosLayout = new javax.swing.GroupLayout(panelBarraEstados);
        panelBarraEstados.setLayout(panelBarraEstadosLayout);
        panelBarraEstadosLayout.setHorizontalGroup(
            panelBarraEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraEstadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jugadorLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numJugadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simboloLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simbJugadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(estadoLBL)
                .addGap(18, 18, 18)
                .addComponent(estadoJugadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelBarraEstadosLayout.setVerticalGroup(
            panelBarraEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jugadorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numJugadorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simboloLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simbJugadorLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadoLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadoJugadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        actualizar.setText("jButton1");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBarraEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelTurnoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelTurnoContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelBarraEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelTurnoContrincante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTurnoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(actualizar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1BtnActionPerformed
        
    }//GEN-LAST:event_A1BtnActionPerformed

    private void B1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1BtnActionPerformed

    private void C1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1BtnActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

        
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(vistaGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new vistaGato().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(vistaGato.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(vistaGato.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1Btn;
    private javax.swing.JButton A2Btn;
    private javax.swing.JButton A3Btn;
    private javax.swing.JButton B1Btn;
    private javax.swing.JButton B2Btn;
    private javax.swing.JButton B3Btn;
    private javax.swing.JButton C1Btn;
    private javax.swing.JButton C2Btn;
    private javax.swing.JButton C3Btn;
    private javax.swing.JPanel PanelTurnoContrincante;
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel estadoJugadorLBL;
    private javax.swing.JLabel estadoLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jugadorLBL;
    private javax.swing.JLabel numJugadorLBL;
    private javax.swing.JPanel panelBarraEstados;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel panelTurnoLocal;
    private javax.swing.JLabel simbJugadorLBL;
    private javax.swing.JLabel simboloLBL;
    // End of variables declaration//GEN-END:variables
}