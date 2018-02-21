package Cliente.controller.eventos;

import java.awt.event.MouseAdapter;

import Cliente.model.Coordenada;
import Cliente.view.PanelPrincipal;

public class EventosPanelPrincipal extends MouseAdapter {

	private PanelPrincipal panelPrincipal;
	
	public EventosPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		initEvents();
	}

	private void initEvents() {
		this.panelPrincipal.getCoord_1a().addMouseListener(new Coordenada(1, 'a'));
		this.panelPrincipal.getCoord_1b().addMouseListener(new Coordenada(1, 'b'));
		this.panelPrincipal.getCoord_1c().addMouseListener(new Coordenada(1, 'c'));
		this.panelPrincipal.getCoord_2a().addMouseListener(new Coordenada(2, 'a'));
		this.panelPrincipal.getCoord_2b().addMouseListener(new Coordenada(2, 'b'));
		this.panelPrincipal.getCoord_2c().addMouseListener(new Coordenada(2, 'c'));
		this.panelPrincipal.getCoord_3a().addMouseListener(new Coordenada(3, 'a'));
		this.panelPrincipal.getCoord_3b().addMouseListener(new Coordenada(3, 'b'));
		this.panelPrincipal.getCoord_3c().addMouseListener(new Coordenada(3, 'c'));
	}
	
}
