/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KingArthur
 */
public class Play {

    private final int[][] array;
    private final JPanel jPan;
    private final JLabel jLBL1;
    private final JLabel jLBL2;
    private final JLabel jLBL3;
    private final JLabel jLBL4;
    private final JButton jBut1;
    private final JButton jBut2;
    private final int turn;

    public Play(int[][] array, JPanel jPan, JLabel jLBL1, JLabel jLBL2
            , JLabel jLBL3 , JLabel jLBL4 , JButton jBut1, JButton jBut2
            , int turn) {
        this.array = array;
        this.jPan = jPan;
        this.jLBL1 = jLBL1;
        this.jLBL2 = jLBL2;
        this.jLBL3 = jLBL3;
        this.jLBL4 = jLBL4;
        this.jBut1 = jBut1;
        this.jBut2 = jBut2;
        this.turn = turn;
    }
    public boolean whoWin(){
        boolean finish = false;
        int[] r = {1, 2};
        int cont = 0;
        int [][] a = {{this.array[0][0], this.array[1][0], this.array[2][0]}
        , {this.array[0][1], this.array[1][1], this.array[2][1]}
        , {this.array[0][2], this.array[1][2], this.array[2][2]}
        , {this.array[0][0], this.array[1][1], this.array[2][2]}
        , {this.array[2][2], this.array[1][1], this.array[0][0]}
        , {this.array[0][0], this.array[0][1], this.array[0][2]}
        , {this.array[1][0], this.array[1][1], this.array[1][2]}
        , {this.array[2][0], this.array[2][1], this.array[2][2]}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (r[i] == a[j][k]) {
                        cont++;
                    }
                    if (cont == 3) {
                        if (i == 0) {
                            this.jLBL2.setText("El ganador es: Jugador");
                        } else {
                            this.jLBL2.setText("El ganador es: IA");
                        }
                        show();
                        finish = true;
                        break;
                    }
                }
                cont = 0;
            }
        }
        if (this.turn == 8 && !finish) {
            this.jLBL2.setText("Empate");
            show();
            finish = true;
        }
        return finish;
    }
    private void show(){
        this.jPan.setVisible(true);
        this.jLBL1.setVisible(true);
        this.jLBL2.setVisible(true);
        this.jBut1.setVisible(true);
        this.jBut2.setVisible(true);
        this.jLBL3.setVisible(false);
        this.jLBL4.setVisible(false);
    }
}