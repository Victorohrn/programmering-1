package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel implements Runnable {
	private static JLabel countDown;
	private int u = 0;
	private int l = 1820
			;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private JLabel points;
	private static Thread animationThread;
	private int lastX = 0;
	private BufferedImage imageS;
	private BufferedImage imageB;

	private int imageX = 20;

	public GamePanel() {
		this.setLayout(null);
		Color grey = new Color(192, 192, 192);
		this.setBackground(grey);
		imagePanel("src/swing/img/beer.png");
		imagePanel1("src/swing/img/steffe.png");
		addButtons();
		/*
		 * try { Thread.sleep(1000); countDown.setText("3"); Thread.sleep(1000);
		 * countDown.setText("2"); Thread.sleep(1000); countDown.setText("1");
		 * Thread.sleep(1000); countDown.setText("0"); Thread.sleep(500);
		 * countDown.setText(""); //animateLine(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

		new Thread(this).start();

	}

	public Dimension getPreferredSize() {
		return new Dimension(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
	}

	public void addButtons() {
		Color redColor = new Color(150, 15, 15);
		JButton closeButton = new JButton("X");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(redColor);
		closeButton.setForeground(Color.WHITE);
		closeButton.addActionListener(event -> closeButtonPressed());
		this.add(closeButton);

		countDown = new JLabel();
		Font countDownFont = new Font("Times new roman", Font.BOLD, 150);
		countDown.setFont(countDownFont);
		countDown.setBounds(900, 300, 500, 300);
		countDown.setForeground(redColor);
		this.add(countDown);

		points = new JLabel("Points: " + point());
		Font pointsFont = new Font("Times new roman", Font.BOLD, 24);
		points.setFont(pointsFont);
		points.setBounds(100, 100, 200, 50);
		points.setForeground(redColor);
		this.add(points);
	}

	private int randX = randomX();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imageB, randX, imageX, null);

		g.drawString("3", 400, 400);
		if (imageX == 1080) {
			g.drawImage(imageB, randX, lastX, null);
		}

	}

	public int randomX() {
		int rX = (int) (Math.random() * (u - l)) + l;
		return rX;
	}

	public int point() {
		int point = 0;
		// if ()
		return point;
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	/*
	 * public void animateLine() { animationThread = new Thread(new Runnable() {
	 * public void run() {
	 * 
	 * } }); animationThread.start(); }
	 */
	public void imagePanel1(String url) {
		try {
			imageS = ImageIO.read(new File(url));
		} catch (IOException ex) {
			// handle exception...
		}
	}

	public void imagePanel(String url) {
		try {
			imageB = ImageIO.read(new File(url));
		} catch (IOException ex) {
			// handle exception...
		}
	}

	public void ölvfen() {

	}

	public void update() {
		imageX += 5;

		if (imageX > toolkit.getScreenSize().height) {
			randX = randomX();
			imageX = -1;
		}
	}

	@Override
	public void run() {
		while (true) {
			repaint();
			update();
			try {
				Thread.sleep(1000 / 60);
			} catch (Exception ex) {
			}
		}

	}
}
