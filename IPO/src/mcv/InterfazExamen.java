package mcv;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InterfazExamen extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnGuardar = new JButton("Guardar");
	private JButton btnAtrs = new JButton("Atr\u00E1s");
	private JTextField txtAsignatura = new JTextField("");
	private JTextField txtTitulacion = new JTextField("");
	private JTextField txtCurso = new JTextField("");
	private JTextField txtHora = new JTextField("");
	private JTextField txtFecha = new JTextField("");
	private JTextField txtAula = new JTextField("");
	private JLabel label = new JLabel("Rellene este campo");
	private JLabel lblRelleneEsteCampo = new JLabel("Rellene este campo");
	private JLabel lblRelleneEsteCampo_1 = new JLabel("Rellene este campo");
	private JLabel label_2 = new JLabel("Rellene este campo");
	private JLabel label_3 = new JLabel("Rellene este campo");
	private JLabel label_4 = new JLabel("Rellene este campo");
	private JLabel lblElijaUnaOpcion = new JLabel("Elija una opci\u00F3n");
	private JLabel lblSeHaGuardado = new JLabel("Se ha guardado el ex\u00E1men.");
	private JRadioButton rdbtnOrdinaria = new JRadioButton("Ordinaria");
	private JRadioButton rdbtnExtraordinaria = new JRadioButton("Extraordinaria");
	private String error = "Debe rellenar este campo.";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private Calendario c= new Calendario();
	private ControladorExamen ce= new ControladorExamen(c, this);

	/**
	 * Create the frame.
	 */
	public InterfazExamen() {
		
		init();
	}

	private void init() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas de texto y etiquetas
		JLabel lblAsignatura = new JLabel("Asignatura: ");
		lblAsignatura.setBounds(30, 81, 89, 20);
		contentPane.add(lblAsignatura);
		txtAsignatura.setBounds(167, 81, 209, 20);
		contentPane.add(txtAsignatura);
		JLabel lblTitulacion = new JLabel("Titulacion: ");
		lblTitulacion.setBounds(30, 112, 89, 20);
		contentPane.add(lblTitulacion);
		txtTitulacion.setBounds(167, 112, 209, 20);
		contentPane.add(txtTitulacion);
		JLabel lblCurso = new JLabel("Curso: ");
		lblCurso.setBounds(30, 141, 89, 20);
		contentPane.add(lblCurso);
		txtCurso.setBounds(167, 143, 209, 20);
		contentPane.add(txtCurso);
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(30, 172, 89, 20);
		contentPane.add(lblFecha);
		txtFecha.setBounds(167, 174, 209, 18);
		contentPane.add(txtFecha);
		JLabel lblHora = new JLabel("Hora: ");
		lblHora.setBounds(30, 203, 89, 20);
		contentPane.add(lblHora);
		txtHora.setBounds(167, 203, 209, 20);
		contentPane.add(txtHora);
		JLabel lblAula = new JLabel("Aula: ");
		lblAula.setBounds(30, 234, 89, 20);
		contentPane.add(lblAula);
		txtAula.setBounds(167, 234, 209, 20);
		contentPane.add(txtAula);
		JLabel lblConvocatoria = new JLabel("Convocatoria: ");
		lblConvocatoria.setBounds(30, 265, 91, 20);
		contentPane.add(lblConvocatoria);
		JLabel lblExmenes = new JLabel("Ex\u00E1men");
		lblExmenes.setFont(new Font("Arial", Font.BOLD, 18));
		lblExmenes.setBounds(196, 22, 101, 20);
		contentPane.add(lblExmenes);
		
		//Labels rellenar campo
		lblRelleneEsteCampo.setForeground(Color.RED);
		lblRelleneEsteCampo.setVisible(false);
		lblRelleneEsteCampo.setBounds(386, 84, 115, 14);
		contentPane.add(lblRelleneEsteCampo);
		
		label.setForeground(Color.RED);
		label.setVisible(false);
		label.setBounds(386, 115, 115, 14);
		contentPane.add(label);
		lblRelleneEsteCampo_1.setForeground(Color.RED);
		lblRelleneEsteCampo_1.setVisible(false);
		lblRelleneEsteCampo_1.setBounds(386, 144, 115, 14);
		contentPane.add(lblRelleneEsteCampo_1);
		label_2.setForeground(Color.RED);
		label_2.setVisible(false);
		label_2.setBounds(386, 175, 115, 14);
		contentPane.add(label_2);
		label_3.setForeground(Color.RED);
		label_3.setVisible(false);
		label_3.setBounds(386, 206, 115, 14);
		contentPane.add(label_3);
		label_4.setForeground(Color.RED);
		label_4.setVisible(false);
		label_4.setBounds(386, 237, 115, 14);
		contentPane.add(label_4);
		lblElijaUnaOpcion.setForeground(Color.RED);
		lblElijaUnaOpcion.setVisible(false);
		lblElijaUnaOpcion.setBounds(386, 268, 99, 14);
		contentPane.add(lblElijaUnaOpcion);
		
		
		
		//Label Guardado
		lblSeHaGuardado.setVisible(false);
		lblSeHaGuardado.setBounds(343, 348, 158, 14);
		contentPane.add(lblSeHaGuardado);
	
		//RadioButtons
		buttonGroup.add(rdbtnOrdinaria);
		rdbtnOrdinaria.setBounds(167, 264, 79, 23);
		contentPane.add(rdbtnOrdinaria);
		buttonGroup.add(rdbtnExtraordinaria);
		rdbtnExtraordinaria.setBounds(248, 264, 128, 23);
		contentPane.add(rdbtnExtraordinaria);
		
		btnAtrs.setBounds(287, 315, 89, 23);
		contentPane.add(btnAtrs);
		btnAtrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		//boton guardar
		btnGuardar.setBounds(167, 315, 89, 23);
		contentPane.add(btnGuardar);
	}
	
	public void setGuardarListener(ActionListener al) { 
		btnGuardar.addActionListener(al); 
	}
	
	public String getAsignatura(){
		if(txtAsignatura.getText().equals("") || txtAsignatura.getText().equals(error) ){
			lblRelleneEsteCampo.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return null;
		}
		return txtAsignatura.getText();
	}
	
	public String getTitulacion(){
		if(txtTitulacion.getText().equals("") || txtTitulacion.getText().equals(error)){
			label.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return null;
		}
		return txtTitulacion.getText();
	}
	
	public int getCurso(){
		if(txtCurso.getText().equals("") || txtCurso.getText().equals(error)){
			lblRelleneEsteCampo_1.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return -1;
		}
		return Integer.parseInt(txtCurso.getText());
	}
	
	public Date getFechaYHora(){
		
		if(txtFecha.getText().equals("") || txtFecha.getText().equals(error)){
			label_2.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return null;
		}
		if(txtHora.getText().equals("") || txtHora.getText().equals(error)){
			label_3.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return null;
		}
		
		Date d= new Date();
		d=ParseFecha(txtFecha.getText());
		String aux= txtHora.getText();
		if(aux.length()==1 || aux.length()==2){
			d.setHours(Integer.parseInt(aux));
		}else{
			int i=aux.indexOf(":");
			d.setHours(Integer.parseInt(aux.substring(0,i)));
			d.setMinutes(Integer.parseInt(aux.substring(i+1,aux.length())));
		}
		return d;
	}
	
	public int getAula(){
		if(txtAula.getText().equals("") || txtAula.getText().equals(error)){
			label_4.setVisible(true);
			lblSeHaGuardado.setVisible(false);
			return -1;
		}
		return Integer.parseInt(txtAula.getText());
	}
	
	public Convocatoria getConvocatoria(){
		if(buttonGroup.getSelection()==null){
			lblElijaUnaOpcion.setVisible(true);
			return null;
		}
		if(rdbtnOrdinaria.isSelected()){
			return Convocatoria.ORDINARIA;
		} 
		return Convocatoria.EXTRAORDINARIA;
	}
	
	
	public static Date ParseFecha(String fecha)
	{
	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date fechaDate = null;
	    try {
	        fechaDate = formato.parse(fecha);
	    }
	    catch (ParseException ex)
	    {
	        System.out.println(ex);
	    }
	    return fechaDate;
	}
}
