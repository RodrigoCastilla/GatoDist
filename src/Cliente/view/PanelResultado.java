package Cliente.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

@SuppressWarnings("serial")
public class PanelResultado extends JPanel {
	
	private JLabel texto1, texto2, ganador;
	private JButton reiniciar, cerrar;
	
	public PanelResultado() {
		setBackground(Color.CYAN);
		initComponents();
	}

	private void initComponents() {
		setSize(400, 300);
		setLayout(null);
		setVisible(true);
		
		texto1 = new JLabel();
		texto1.setBackground(Color.CYAN);
		texto1.setText("El juego ha terminado");
		texto1.setBounds(100, 50, 200, 20);
		texto1.setHorizontalAlignment(JLabel.CENTER);
		add(texto1);
		
		texto2 = new JLabel();
		texto2.setBackground(Color.CYAN);
		texto2.setText("El ganador es:");
		texto2.setBounds(100, 70, 200, 20);
		texto2.setHorizontalAlignment(JLabel.CENTER);
		add(texto2);
		
		ganador = new JLabel("");
		ganador.setBackground(Color.CYAN);
		ganador.setBounds(100, 90, 200, 20);
		ganador.setHorizontalAlignment(JLabel.CENTER);
		add(ganador);
		
		reiniciar = new JButton("Reiniciar");
		reiniciar.setBounds(100, 150, 95, 50);
		add(reiniciar);
		
		cerrar = new JButton("Cerrar");
		cerrar.setBounds(200, 150, 95, 50);
		add(cerrar);
	}
}
