/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author KingArthur
 */
public class Input {

    private final int turn;
    private final JLabel jLabel;

    public Input(int turn, JLabel jLabel) {
        this.turn = turn;
        this.jLabel = jLabel;
    }
    private void setX(JLabel jLabel){
        ImageIcon image = new ImageIcon("src/Image/x-icon.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(
                jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT));
        jLabel.setIcon(icon);
    }
    private void setO(JLabel jLabel){
        ImageIcon image = new ImageIcon("src/Image/o-icon.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(
                jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT));
        jLabel.setIcon(icon);
    }
    public int execute(){
        if (this.turn % 2 == 0) {
            setO(this.jLabel);
            return 1;
        } else {
            setX(this.jLabel);
            return 2;
        }
    }
}