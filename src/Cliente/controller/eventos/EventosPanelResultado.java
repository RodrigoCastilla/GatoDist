package Cliente.controller.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Cliente.view.PanelResultado;

public class EventosPanelResultado implements ActionListener {

	private static final String REINICIAR = "REINICIAR", CERRAR = "CERRAR";
	private PanelResultado panelResultado;
	
	public EventosPanelResultado(PanelResultado panelResultado) {
		super();
		this.panelResultado = panelResultado;
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case REINICIAR:
			reiniciar();
			break;
		case CERRAR:
			System.exit(0);
			break;
		}
	}
	
	private void initEvents() {
		this.panelResultado.getReiniciar().addActionListener(this);
		this.panelResultado.getReiniciar().setActionCommand(REINICIAR);
		
		this.panelResultado.getCerrar().addActionListener(this);
		this.panelResultado.getCerrar().setActionCommand(CERRAR);
	}
	
	private void reiniciar() {
		
	}
}
