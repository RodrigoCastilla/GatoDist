package Cliente.controller.componentes;

import Cliente.controller.eventos.EventosPanelPrincipal;
import Cliente.view.PanelPrincipal;

public class ComponentePanelPrincipal {

private PanelPrincipal panelPrincipal;
	
	public ComponentePanelPrincipal() {
		this.panelPrincipal = new PanelPrincipal();
		new EventosPanelPrincipal(panelPrincipal);
	}

	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
}
