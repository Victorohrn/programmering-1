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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * GamePanel and global variables
 * 
 * @author victor.ohrn
 *
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private JLabel points;
	private static JLabel countDown;
	private int u = 0;
	private int l = 1820;
	private int point = 0;
	private int imageX = 20;
	private int lastX = 0;
	private int pos = 680;
	private int randX = randomX();

	private BufferedImage imageS;
	private BufferedImage imageB;

	/**
	 * adds color gray imports images "Steffe" and "beer" adds the method
	 * "addbuttons" starts the thread
	 */
	public GamePanel() {
		this.setLayout(null);
		Color grey = new Color(192, 192, 192);
		this.setBackground(grey);
		imagePanel("src/swing/img/beer.png");
		imagePanel1("src/swing/img/steffe.png");
		addButtons();

		new Thread(this).start();

	}

	/**
	 * sets the dimensions of the window
	 */

	public Dimension getPreferredSize() {
		return new Dimension(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
	}

	/**
	 * the method that adds all the buttons and labels
	 */
	public void addButtons() {
		Color redColor = new Color(150, 15, 15);
		JButton closeButton = new JButton("X");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(redColor);
		closeButton.setForeground(Color.WHITE);
		closeButton.addActionListener(event -> closeButtonPressed());
		this.add(closeButton);

		JButton rightB = new JButton("RIGHT");
		rightB.setBounds(toolkit.getScreenSize().width - 100, 500, 100, 50);
		rightB.setBackground(redColor);
		rightB.setForeground(Color.WHITE);
		rightB.addActionListener(event -> rightMove());
		this.add(rightB);

		JButton leftB = new JButton("LEFT");
		leftB.setBounds(toolkit.getScreenSize().width - 100, 550, 100, 50);
		leftB.setBackground(redColor);
		leftB.setForeground(Color.WHITE);
		leftB.addActionListener(event -> leftMove());
		this.add(leftB);

		countDown = new JLabel();
		Font countDownFont = new Font("Times new roman", Font.BOLD, 150);
		countDown.setFont(countDownFont);
		countDown.setBounds(900, 300, 500, 300);
		countDown.setForeground(redColor);
		this.add(countDown);

		points = new JLabel("Points: " + point);
		Font pointsFont = new Font("Times new roman", Font.BOLD, 24);
		points.setFont(pointsFont);
		points.setBounds(100, 100, 200, 50);
		points.setForeground(redColor);
		this.add(points);
	}

	/**
	 * paintComponent who draws images imageB is set to random X pos with randX
	 * imageS is set to X with pos function sets imageB to -1Y if it hits the bottom
	 * of the screen
	 */

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(imageB, randX, imageX, null);
		g.drawImage(imageS, pos, 580, null);
		g.drawString("3", 400, 400);
		if (imageX == 1080) {
			g.drawImage(imageB, randX, lastX, null);
		}

	}

	/**
	 * randomX method
	 * 
	 * @return
	 */
	public int randomX() {
		int rX = (int) (Math.random() * (u - l)) + l;
		return rX;
	}

	/**
	 * point system
	 * 
	 * @return
	 */
	public void point() {
		
		if (pos == imageX && pos == lastX) {
			point++;
		}

	}

	/**
	 * closeButton action
	 */
	public void closeButtonPressed() {
		System.exit(0);
	}

	/**
	 * imports the images so they can be drawn by the paintComponent
	 * 
	 * @param url
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

	/**
	 * moves the imageS 20px to the left
	 */
	public void leftMove() {
		pos -= 20;
		if (pos <= -150) {
			pos = -150;
		}
		repaint();
	}

	/**
	 * moves the imageS 20px to the right
	 */
	public void rightMove() {
		pos += 20;
		if (pos >= 1500) {
			pos = 1500;
		}
		repaint();
	}

	/**
	 * sets the speed of the imageB and moves moves the imageB to -1 when it gets to
	 * the bottom of the screen
	 */
	public void update() {
		imageX += 5;

		if (imageX > toolkit.getScreenSize().height) {
			randX = randomX();
			imageX = -1;
		}
	}

	/**
	 * thread for the animated imageB
	 */
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

	/**
	 * keylisteners
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
