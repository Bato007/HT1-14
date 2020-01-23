import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Se encarga de arrancar el programa y de ser el GUI.
 * @author Pablo M�ndez 19195
 * @author Brandon Hernandez 19376
 * @version 18/01/2020
 */
public class Main {
	
	private JLabel lblAmFm;
	private JLabel lblFrecuencia;

	private JButton btnEncender;
	private JButton btnAmFm;
	private JButton btnGrabarEmisora;
	private JButton btnFrecuenciaUp;
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	
	private RadioInterface radio;
	private boolean isAm;
	private boolean guardando;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		radio = new Radio();
		isAm = true;
		guardando = false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		MiListener oyente = new MiListener();
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		Color negro = new Color(73, 82, 85);
		
		JPanel pArriba = new JPanel();
		pArriba.setBackground(negro);
		pArriba.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(pArriba);
		pArriba.setLayout(null);
		
		btnEncender = new JButton("On/Off");
		btnEncender.setForeground(Color.WHITE);
		btnEncender.setBackground(Color.GRAY);
		btnEncender.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEncender.setBounds(12, 13, 105, 106);
		btnEncender.addActionListener(oyente);
		pArriba.add(btnEncender);
		
		JPanel pDisplay = new JPanel();
		pDisplay.setBackground(new Color(106, 129, 115));
		pDisplay.setForeground(Color.DARK_GRAY);
		pDisplay.setBounds(124, 13, 331, 106);
		pArriba.add(pDisplay);
		pDisplay.setLayout(null);
		
		if(radio.estado()) {
			lblAmFm = new JLabel(" AM");
		} else {
			lblAmFm = new JLabel("");
		}
		lblAmFm.setBounds(0, 3, 98, 103);
		pDisplay.add(lblAmFm);
		lblAmFm.setBackground(Color.BLACK);
		lblAmFm.setFont(new Font("Power Clear", Font.BOLD, 45));
		
		
		if(radio.estado()) {
			lblFrecuencia = new JLabel(radio.estacionActual());
		} else {
			lblFrecuencia = new JLabel("");
		}
		lblFrecuencia.setBackground(Color.BLACK);
		lblFrecuencia.setBounds(110, 3, 216, 103);
		pDisplay.add(lblFrecuencia);
		lblFrecuencia.setFont(new Font("Power Clear", Font.PLAIN, 51));
		
		if(radio.estacionActual().length() > 3 || radio.estacionActual().length() == 0)
		{
			lblAmFm.setFont(new Font("Power Clear", Font.PLAIN, 0));
			lblFrecuencia.setFont(new Font("Power Clear", Font.PLAIN, 25));
			lblFrecuencia.setBounds(0, 0, 330, 103);
		}
		
		btnAmFm = new JButton("AM/FM");
		btnAmFm.setForeground(Color.WHITE);
		btnAmFm.setBackground(Color.GRAY);
		btnAmFm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAmFm.setBounds(535, 12, 105, 106);
		btnAmFm.addActionListener(oyente);
		pArriba.add(btnAmFm);
		
		btnGrabarEmisora = new JButton("Grabar Emisora ");
		btnGrabarEmisora.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnGrabarEmisora.setForeground(Color.WHITE);
		btnGrabarEmisora.setBackground(Color.GRAY);
		btnGrabarEmisora.setBounds(652, 13, 182, 106);
		btnGrabarEmisora.addActionListener(oyente);
		pArriba.add(btnGrabarEmisora);
		
		btnFrecuenciaUp = new JButton("+");
		btnFrecuenciaUp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnFrecuenciaUp.setForeground(Color.WHITE);
		btnFrecuenciaUp.setBackground(Color.GRAY);
		btnFrecuenciaUp.setBounds(467, 13, 56, 106);
		btnFrecuenciaUp.addActionListener(oyente);
		pArriba.add(btnFrecuenciaUp);
		
		JPanel pBotones = new JPanel();
		pBotones.setBackground(negro);
		frame.getContentPane().add(pBotones);
		pBotones.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setBounds(8, 13, 62, 106);
		pBotones.add(btn1);
		btn1.addActionListener(oyente);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setBounds(78, 13, 62, 106);
		btn2.addActionListener(oyente);
		pBotones.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setBounds(148, 13, 62, 106);
		btn3.addActionListener(oyente);
		pBotones.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setBounds(218, 13, 62, 106);
		btn4.addActionListener(oyente);
		pBotones.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setBounds(288, 13, 62, 106);
		btn5.addActionListener(oyente);
		pBotones.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setBounds(358, 13, 62, 106);
		btn6.addActionListener(oyente);
		pBotones.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(428, 13, 62, 106);
		btn7.addActionListener(oyente);
		pBotones.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setBounds(498, 13, 62, 106);
		btn8.addActionListener(oyente);
		pBotones.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setBounds(568, 13, 62, 106);
		btn9.addActionListener(oyente);
		pBotones.add(btn9);
		
		btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn10.setBounds(638, 13, 62, 106);
		btn10.addActionListener(oyente);
		pBotones.add(btn10);
		
		btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn11.setBounds(708, 13, 62, 106);
		btn11.addActionListener(oyente);
		pBotones.add(btn11);
		
		btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn12.setBounds(778, 13, 62, 106);
		btn12.addActionListener(oyente);
		pBotones.add(btn12);
		
		frame.setBounds(100, 100, 852, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class MiListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Si se apacha el bot�n encender se borra o se escribe el estado actual en los labels
			if(e.getSource() == btnEncender)
			{
				guardando = false;
				radio.onOff();
				if(radio.estado() == false) 
				{
					lblAmFm.setText("");
					lblFrecuencia.setText("");
				} 
				else 
				{
					//Si se est� encendiendo le cambi� el mensaje a AM o FM
					lblFrecuencia.setText(radio.estacionActual());
					if(isAm) 
					{
						lblAmFm.setText(" AM");
					} 
					else 
					{
						lblAmFm.setText(" FM");
					}
				}
			}
			//Si no se apacha el boton de encender, veo si est� encendido
			else if(radio.estado()) 
			{
				//Si se cambia la frecuencia, cambio el mensaje a AM o FM y actualizo la frecuencia
				if(e.getSource() == btnAmFm) 
				{
					guardando = false;
					radio.cambiarFrecuencia();
					if(isAm) 
					{
						isAm = false;
						lblAmFm.setText(" FM");
						lblFrecuencia.setText(radio.estacionActual());
					} 
					else 
					{
						isAm = true;
						lblAmFm.setText(" AM");
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				// Si trata de aumentar la frecuencia, le cambio la frecuencia y actualizo los labels
				else if(e.getSource() == btnFrecuenciaUp) 
				{
					guardando = false;
					radio.avanzar();
					lblFrecuencia.setText(radio.estacionActual());
				}
				else if(e.getSource() == btnGrabarEmisora) 
					//Si presiona el de guardar emisora, hago que el siguiente bot�n (1-12) guarde una frecuencia
				{
					guardando = true;
				} 
				// Si presiona cualquier bot�n (1-12) pongo la emisora favorita o lo guardo la emisora actual en ese bot�n si se apacho el de guardar emisora
				else if(e.getSource() == btn1) 
					
				{
					if(guardando) {
						guardando = false;
						radio.guardar(1);
					} 
					else 
					{
						radio.seleccionarEmisora(1);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn2) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(2);
					} 
					else 
					{
						radio.seleccionarEmisora(2);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn3) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(3);
					} 
					else 
					{
						radio.seleccionarEmisora(3);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn4) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(4);
					} 
					else 
					{
						radio.seleccionarEmisora(4);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn5) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(5);
					} 
					else 
					{
						radio.seleccionarEmisora(5);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn6) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(6);
					} 
					else 
					{
						radio.seleccionarEmisora(6);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn7) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(7);
					} 
					else 
					{
						radio.seleccionarEmisora(7);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn8) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(8);
					} 
					else 
					{
						radio.seleccionarEmisora(8);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn9) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(9);
					} 
					else 
					{
						radio.seleccionarEmisora(9);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn10) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(10);
					} 
					else 
					{
						radio.seleccionarEmisora(10);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn11) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(11);
					} 
					else 
					{
						radio.seleccionarEmisora(11);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
				else if(e.getSource() == btn12) 
				{
					if(guardando) {
						guardando = false;
						radio.guardar(12);
					} 
					else 
					{
						radio.seleccionarEmisora(12);
						lblFrecuencia.setText(radio.estacionActual());
					}
				}
			}
			
		}
	}
}