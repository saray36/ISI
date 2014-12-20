package mcv;

import java.util.ArrayList;

public class Calendario {
	
	private ArrayList<Examen> examenes=new ArrayList<Examen>();
	
	public Calendario(){
	}
	
	public void anadirExamen(Examen e){
		examenes.add(e);
	} 
}
