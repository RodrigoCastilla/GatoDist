package view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelPrincipal extends JPanel {
	
	private JLabel background, turno_text, turno_jugador, coord_1a, coord_1b, coord_1c, coord_2a, coord_2b, coord_2c, coord_3a, coord_3b, coord_3c;
	private JPanel resultado;
	
	public PanelPrincipal() {
		setBackground(Color.WHITE);
		setSize(500, 600);
		setLayout(null);
		setVisible(true);
		initComponents();
	}

	public void initComponents() {
		background = new JLabel();
		background.setBounds(0, 0, 500, 500);
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/images/board.png"));
		Icon backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT));
		
		resultado = new PanelResultado();
		resultado.setLocation(50, 100);
		add(resultado);
		background.setIcon(backgroundIcono);
		add(background);
		
		coord_1a = new JLabel();
		coord_1a.setBounds(10, 11, 146, 146);
		add(coord_1a);
		
		coord_1b = new JLabel();
		coord_1b.setBounds(178, 11, 146, 146);
		add(coord_1b);
		
		coord_1c = new JLabel();
		coord_1c.setBounds(344, 11, 146, 146);
		add(coord_1c);
		
		coord_2a = new JLabel();
		coord_2a.setBounds(10, 178, 146, 146);
		add(coord_2a);
		
		coord_2b = new JLabel();
		coord_2b.setBounds(178, 178, 146, 146);
		add(coord_2b);
		
		coord_2c = new JLabel();
		coord_2c.setBounds(344, 178, 146, 146);
		add(coord_2c);
		
		coord_3a = new JLabel();
		coord_3a.setBounds(10, 343, 146, 146);
		add(coord_3a);
		
		coord_3b = new JLabel();
		coord_3b.setBounds(178, 343, 146, 146);
		add(coord_3b);
		
		coord_3c = new JLabel();
		coord_3c.setBounds(344, 343, 146, 146);
		add(coord_3c);
		
		turno_text = new JLabel("Turno");
		turno_text.setFont(new Font("Verdana", Font.BOLD, 20));
		turno_text.setBounds(40, 520, 80, 50);
		turno_text.setHorizontalAlignment(JLabel.CENTER);
		add(turno_text);
		
		turno_jugador = new JLabel("");
		turno_jugador.setFont(new Font("Verdana", Font.BOLD, 20));
		turno_jugador.setBounds(170, 520, 200, 50);
		turno_jugador.setHorizontalAlignment(JLabel.CENTER);
		add(turno_jugador);
	}
}
