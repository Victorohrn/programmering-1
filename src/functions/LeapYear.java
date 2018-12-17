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

/**
 * Calculates if a a year is a leap year or not. Also creates a window where you
 * can write the year.
 * 
 * @author victor.ohrn
 * 
 */
public class LeapYear extends JFrame implements KeyListener {
	private JTextField txtField;
	private JLabel text;
	private static JLabel out;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public LeapYear() {
		// sets DefaultCloseOperation to a constant
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Sets window size to full screen
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
		Color grey = new Color(192, 192, 192);
		contentPane.setBackground(grey);
		addButtons(contentPane);
	}

	/**
	 * Adds the container contentPane and names the contentPane "add buttons"
	 * 
	 * @param contentPane
	 */
	public void addButtons(Container contentPane) {
		// Creates a color based on the rgb scale.
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
		/**
		 * Adds a new JLabel that is named "text" Sets the label to "Enter a Leap year".
		 * Sets the position of the label to 915W and 450H Sets the size to 200W and 50H
		 * Adds this label to the contentPane container
		 */
		text = new JLabel("Enter a Leap year");
		text.setBounds(915, 450, 200, 50);
		text.setForeground(redColor);
		contentPane.add(text);
		/**
		 * Adds a new JLabel that is named "out" The label is empty until you input a
		 * year Sets the position of the label to 1080W and 490H Sets the size to 200W
		 * and 50H Adds this label to the contentPane container
		 */
		out = new JLabel();
		out.setBounds(1080, 490, 200, 50);
		out.setForeground(redColor);
		contentPane.add(out);
		/*
		 * Creates a Text field and names it "txtField" Sets the position of the text
		 * field too 860W, 490H Sets the size to 200W and 50H. Sets the background color
		 * to White and the text that is entered to black. Adds a Keylistener that is
		 * defined in the bottom of the code. Adds the text field to the contentPane
		 * container Makes the text field visible when you launch the program.
		 * 
		 */
		txtField = new JTextField(20);
		txtField.setBounds(860, 490, 200, 50);
		txtField.setBackground(Color.WHITE);
		txtField.setForeground(Color.BLACK);
		txtField.addKeyListener(this);
		contentPane.add(txtField);
		contentPane.repaint();
	}

	/**
	 * Returns the txtField content as an integer.
	 * 
	 * @return
	 */
	public int txtField() {
		String year = txtField.getText();
		return Integer.parseInt(year);
	}

	/**
	 * When the close button is pressed the program receives "System.exit(0);
	 * System.exit(0); closes the program.
	 */
	public void closeButtonPressed() {
		System.exit(0);
	}

	/**
	 * Runs the "LeapYear" frame
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear frame = new LeapYear();
	}

	/**
	 * The method gets the text in "txtfield" and puts it in the method. Leap year
	 * calculates if the year is a leap year or not. The method creates boolean
	 * "leap". Boolean leap that checks if "year" modulus 4 equals 0 or "year"
	 * modulus 400 equals 0 and "year" modulus 100 is not equal to 0. if leap is
	 * equal to true the program puts out "input year" is a leap year. if leap is
	 * equal to false the program puts out "inputs year" is not a leap year.
	 * 
	 * @param year
	 */
	public static void leapyear(int year) {
		boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		if (leap) {
			out.setText(year + " is a leapyear");
		} else {
			out.setText(year + " is not a leapyear");
		}
	}

	/**
	 * When you press keys something happens
	 */
	@Override
	public void keyPressed(KeyEvent e) {

	}

	/**
	 * When you release the key "ENTER" You run the method leap year and txtfield so
	 * you get whatever was in the text field and sends it to the method.
	 * 
	 */
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
