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
		this.panelPrincipal.getCoord_1a().addMouseListener(new EventosCoordenadas(new Coordenada(1, 'a', this.panelPrincipal.getCoord_1a())));
		this.panelPrincipal.getCoord_1b().addMouseListener(new EventosCoordenadas(new Coordenada(1, 'b', this.panelPrincipal.getCoord_1b())));
		this.panelPrincipal.getCoord_1c().addMouseListener(new EventosCoordenadas(new Coordenada(1, 'c', this.panelPrincipal.getCoord_1c())));
		this.panelPrincipal.getCoord_2a().addMouseListener(new EventosCoordenadas(new Coordenada(2, 'a', this.panelPrincipal.getCoord_2a())));
		this.panelPrincipal.getCoord_2b().addMouseListener(new EventosCoordenadas(new Coordenada(2, 'b', this.panelPrincipal.getCoord_2b())));
		this.panelPrincipal.getCoord_2c().addMouseListener(new EventosCoordenadas(new Coordenada(2, 'c', this.panelPrincipal.getCoord_2c())));
		this.panelPrincipal.getCoord_3a().addMouseListener(new EventosCoordenadas(new Coordenada(3, 'a', this.panelPrincipal.getCoord_3a())));
		this.panelPrincipal.getCoord_3b().addMouseListener(new EventosCoordenadas(new Coordenada(3, 'b', this.panelPrincipal.getCoord_3b())));
		this.panelPrincipal.getCoord_3c().addMouseListener(new EventosCoordenadas(new Coordenada(3, 'c', this.panelPrincipal.getCoord_3c())));
	}
	
}
