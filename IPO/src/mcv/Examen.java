package mcv;

import java.util.Date;

public class Examen {
	
	private String asignatura;
	private String titulacion;
	private int curso;
	private Date fechaYhora;
	//en el constructor de date se le pasa año, mes, fecha, hora y minuto (en ese orden)
	private int aula;
	private Convocatoria c;

	
	public Examen(String asignatura, String titulacion, int curso, Date fechaYhora, int aula, Convocatoria c){
		
		this.asignatura=asignatura;
		this.titulacion=titulacion;
		this.curso=curso;
		this.fechaYhora=fechaYhora;
		this.aula=aula;
		this.c=c;
	}
}
