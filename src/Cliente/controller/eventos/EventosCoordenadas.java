package Cliente.controller.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Cliente.model.Coordenada;

public class EventosCoordenadas extends MouseAdapter {

	private Coordenada coord;
	
	public EventosCoordenadas(Coordenada coord) {
		this.coord = coord;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
	}
	
}
