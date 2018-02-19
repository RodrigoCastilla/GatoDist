package view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	
	public Ventana() {
		initComponents();
	}
    
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 620);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setContentPane(new PanelPrincipal());
	}
	
	public static void main(String[] args) {
		new Ventana();
	}
}
