package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public Main() {
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
		contentPane.setBackground(Color.BLACK);
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		Color redColor = new Color(150, 15, 15);
		// Makes closeButton
		JButton closeButton = new JButton("X"); // <html> <p style='color:orange'>X</p></html>
		// Sets Button to 50x 50y 100w 50h
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(redColor);
		closeButton.setForeground(Color.WHITE);
		// Adds actionListener
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);
		text = new JLabel("Hello World");
		text.setBounds(50, 250, 100, 50);
		text.setForeground(redColor);
		contentPane.add(text);

		JButton changeTextButton = new JButton("Change text on label");
		// Sets Button to 50x 50y 100w 50h
		changeTextButton.setBounds(50, 150, 200, 50);
		changeTextButton.setBackground(redColor);
		changeTextButton.setForeground(Color.WHITE);
		// Adds actionListener
		changeTextButton.addActionListener(event -> changeTextButtonPressed());
		contentPane.add(changeTextButton);
	}

	public void changeTextButtonPressed() {
		// Returns text
		// String currentText = text.getText();
		if (text.getText().equalsIgnoreCase("hello world"))
			// Sets text
			text.setText("Bye world");
		else
			text.setText("Hello World");
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {
		Main frame = new Main();
		// frame.addButtons(contentPane);
	}

}
