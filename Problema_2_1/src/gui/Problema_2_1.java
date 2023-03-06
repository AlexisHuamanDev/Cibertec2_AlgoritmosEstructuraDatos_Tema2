package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import semana_02.Celular;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_2_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	DecimalFormat df = new DecimalFormat("0.00");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_1 frame = new Problema_2_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2_1() {
		setTitle("Problema_2_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		//Declare, cree e inicialice un objeto de tipo Celular (con datos fijos).
		Celular cel = new Celular(999888333, "Pedro", 80 ,4.80);
		
		//Invoque a un método listado que reciba (como parámetro) la referencia a un objeto de tipo
		// Celular y visualice sus datos completos.
		listado(cel);
		
		//Aumente en 20 el número de segundos consumidos, disminuya en 5% el precio por segundo
		//e invoque nuevamente al método listado.
		cel.setSegCon(cel.getSegCon()+20);
		cel.setPrecSeg(cel.getPrecSeg()-cel.getPrecSeg()*0.05);
		listado(cel);
	}
	private void listado(Celular cel) {
		
		imprimir("Valor de memoria: " +cel);
		imprimir("Celular: "+cel.getNumero());
		imprimir("Usuario : "+cel.getUsuario());
		imprimir("Segundos consumidos 	: " +df.format(cel.getSegCon()));
		imprimir("Precio x segundo 	: S/. "+ df.format(cel.getPrecSeg()));
		imprimir("Costo por consumos 	: S/. "+df.format(cel.costoConsumo()));
		imprimir("Importe IGV 		: S/. " + df.format(cel.impuestoIGV()));
		imprimir("Importe total 		: S/. "+df.format(cel.totalPagar()));
		imprimir("");
		
	}

	//  M�todos tipo void (con par�metros)
	private void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}