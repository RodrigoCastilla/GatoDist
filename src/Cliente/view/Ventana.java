package Cliente.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Cliente.controller.componentes.ComponentePanelPrincipal;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	
	public static String IP = "";
	
	private JPanel panel;
	
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
		
		this.panel = new ComponentePanelPrincipal().getPanelPrincipal();
		setContentPane(this.panel);
		repaint();
	}
	
	public PanelPrincipal getPanelPrincipal() {
		return (PanelPrincipal) this.panel;
	}
	
	public static void main(String[] args) throws Exception {
		if(args.length == 1) {
			IP = args[0];
			new Ventana();
		} else {
			throw new Exception("No cumple el formato del parametro: java Ventana <IP-Cliente>");
		}
	}
}
