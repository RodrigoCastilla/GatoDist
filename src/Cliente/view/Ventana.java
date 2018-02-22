package Cliente.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Cliente.controller.componentes.ComponentePanelPrincipal;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	
	public static final String SOLICITUD = "SOLICITUD";
	public static String IP = "";
	
	private JPanel panel;
	private String numJugador;
	
	public Ventana(String numJugador) {
		this.numJugador = numJugador;
		initComponents();
	}
    
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 620);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		
		this.panel = new ComponentePanelPrincipal(this.numJugador).getPanelPrincipal();
		setContentPane(this.panel);
		repaint();
	}
	
	public PanelPrincipal getPanelPrincipal() {
		return (PanelPrincipal) this.panel;
	}
}
