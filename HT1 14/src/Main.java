import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 18/01/2020
 */
public class Main {

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JButton btnEncender = new JButton("On/Off");
		btnEncender.setForeground(Color.WHITE);
		btnEncender.setBackground(Color.GRAY);
		btnEncender.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEncender.setBounds(12, 13, 105, 106);
		pArriba.add(btnEncender);
		
		JPanel pDisplay = new JPanel();
		pDisplay.setBackground(new Color(106, 129, 115));
		pDisplay.setForeground(Color.DARK_GRAY);
		pDisplay.setBounds(124, 13, 399, 106);
		pArriba.add(pDisplay);
		pDisplay.setLayout(null);
		
		JLabel lblAmFm = new JLabel(" AM");
		lblAmFm.setBounds(0, 3, 98, 103);
		pDisplay.add(lblAmFm);
		lblAmFm.setBackground(Color.BLACK);
		lblAmFm.setFont(new Font("Power Clear", Font.BOLD, 55));
		
		JLabel lblFrecuencia = new JLabel(" 102.6");
		lblFrecuencia.setBackground(Color.BLACK);
		lblFrecuencia.setBounds(110, 3, 277, 103);
		pDisplay.add(lblFrecuencia);
		lblFrecuencia.setFont(new Font("Power Clear", Font.PLAIN, 51));
		
		JButton btnAmFm = new JButton("AM/FM");
		btnAmFm.setForeground(Color.WHITE);
		btnAmFm.setBackground(Color.GRAY);
		btnAmFm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAmFm.setBounds(535, 12, 105, 106);
		pArriba.add(btnAmFm);
		
		JButton btnGrabarEmisora = new JButton("Grabar Emisora ");
		btnGrabarEmisora.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnGrabarEmisora.setForeground(Color.WHITE);
		btnGrabarEmisora.setBackground(Color.GRAY);
		btnGrabarEmisora.setBounds(652, 13, 182, 106);
		pArriba.add(btnGrabarEmisora);
		
		JPanel pBotones = new JPanel();
		pBotones.setBackground(negro);
		frame.getContentPane().add(pBotones);
		pBotones.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setBounds(8, 13, 62, 106);
		pBotones.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setBounds(78, 13, 62, 106);
		pBotones.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setBounds(148, 13, 62, 106);
		pBotones.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setBounds(218, 13, 62, 106);
		pBotones.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setBounds(288, 13, 62, 106);
		pBotones.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setBounds(358, 13, 62, 106);
		pBotones.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setBounds(428, 13, 62, 106);
		pBotones.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setBounds(498, 13, 62, 106);
		pBotones.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setBounds(568, 13, 62, 106);
		pBotones.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn10.setBounds(638, 13, 62, 106);
		pBotones.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn11.setBounds(708, 13, 62, 106);
		pBotones.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn12.setBounds(778, 13, 62, 106);
		pBotones.add(btn12);
		
		frame.setBounds(100, 100, 852, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
