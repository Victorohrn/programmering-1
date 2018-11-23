package functions;

import java.awt.Color;
import java.awt.Container;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import swing.Main;

public class LeapYear extends JFrame implements KeyListener {
	private JTextField txtField;
	private JLabel text;
	private static JLabel out;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public LeapYear() {
		// sets DefaultCloseOperation to a constant
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Sets window size to fullscreen
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		// Sets window to have no frame
		this.setUndecorated(true);
		// Sets window to visible
		this.setVisible(true);
		// Creates conentPane
		Container contentPane = this.getContentPane();
		// Sets contentPane to null
		contentPane.setLayout(null);
		// Sets window background
		Color grey = new Color(192,192,192);
		contentPane.setBackground (grey);
		addButtons(contentPane);
	}


	public void addButtons(Container contentPane) {
		Color redColor = new Color(150, 15, 15);
		// Makes closeButton
		JButton closeButton = new JButton("X");
		// Sets Button to 50x 50y 100w 50h
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(redColor);
		closeButton.setForeground(Color.WHITE);
		// Adds actionListener
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("Enter a Leapyear");
		text.setBounds(915, 450, 200, 50);
		text.setForeground(redColor);
		contentPane.add(text);

		out = new JLabel();
		out.setBounds(1080, 490, 200, 50);
		out.setForeground(redColor);
		contentPane.add(out);

		txtField = new JTextField(20);
		// Sets Button to 50x 50y 100w 50h
		txtField.setBounds(860, 490, 200, 50);
		txtField.setBackground(Color.WHITE);
		txtField.setForeground(Color.BLACK);
		// Adds actionListener
		txtField.addKeyListener(this);
		contentPane.add(txtField);
		contentPane.repaint();
	}

	public int txtField() {
		String year = txtField.getText();
		return Integer.parseInt(year);
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear frame = new LeapYear();
	}

	public static void leapyear(int year) {
		boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		if (leap) {
			out.setText(year + " is a leapyear");
		} else {
			out.setText(year + " is not a leapyear");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			leapyear(txtField());
		} 

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
