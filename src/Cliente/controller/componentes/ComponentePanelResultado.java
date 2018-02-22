package Cliente.controller.componentes;

import Cliente.controller.eventos.EventosPanelResultado;
import Cliente.view.PanelResultado;

public class ComponentePanelResultado {
	
	private PanelResultado panelResultado;
	
	public ComponentePanelResultado() {
		this.panelResultado = new PanelResultado();
		new EventosPanelResultado(panelResultado);
	}

	public PanelResultado getPanelResultado() {
		return panelResultado;
	}
	
}
