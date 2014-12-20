package mcv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorExamen {
	
	/**
	 * 
	 */
	private Calendario c;
	private InterfazExamen gui;
	
	
	public ControladorExamen(Calendario c,InterfazExamen gui){
		this.c=c;
		this.gui=gui;
		
		gui.setGuardarListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				Examen aux= new Examen(gui.getAsignatura(),gui.getTitulacion(), gui.getCurso(), gui.getFechaYHora(), gui.getAula(), gui.getConvocatoria());
				gui.setVisible(false);
				gui.setVisible(true);
				c.anadirExamen(aux);  
			} });  
	}
}
