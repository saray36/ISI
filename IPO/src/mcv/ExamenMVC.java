package mcv;

import java.awt.EventQueue;

public class ExamenMVC {

	public static void main(String[] args) {
		
		InterfazExamen ie=new InterfazExamen();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	

	}

}
