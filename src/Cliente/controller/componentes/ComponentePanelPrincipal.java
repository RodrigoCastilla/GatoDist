package Cliente.controller.componentes;

import Cliente.controller.eventos.EventosPanelPrincipal;
import Cliente.view.PanelPrincipal;

public class ComponentePanelPrincipal {

private PanelPrincipal panelPrincipal;
	
	public ComponentePanelPrincipal(String jugador) {
		this.panelPrincipal = new PanelPrincipal(jugador);
		new EventosPanelPrincipal(panelPrincipal);
	}

	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
}
