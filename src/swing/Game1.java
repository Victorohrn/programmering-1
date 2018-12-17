package swing;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.xml.internal.stream.Entity;

import javafx.animation.Animation;

import javax.swing.*;
import java.awt.*;
/**
 * The game of Stefan Ölfven 
 * 
 * @author victor.ohrn
 *
 */
public class Game1 extends JFrame {
	//private JLabel points;
	//private static JLabel countDown;
	//private int lastX = 0;
	//private static Thread animationThread;
	/*private BufferedImage imageB;
	*/private Toolkit toolkit = Toolkit.getDefaultToolkit();
	/* public void ImagePanel() {
	       try {                
	          imageB = ImageIO.read(new File("beer.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
	 }*/
	public Game1() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		

		this.add(new GamePanel());
		
		this.pack();
		this.setVisible(true);
		
		//Container game = this.getContentPane();
		
		//game.setLayout(null);
		
		//Color grey = new Color(192, 192, 192);
		//game.setBackground(grey);
		// game.add(new beer());
		//addButtons(game);

		/*try {
			Thread.sleep(1000);
			countDown.setText("3");
			Thread.sleep(1000);
			countDown.setText("2");
			Thread.sleep(1000);
			countDown.setText("1");
			Thread.sleep(1000);
			countDown.setText("0");
			Thread.sleep(500);
			countDown.setText("");
			animateLine();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
	}
	/*public int point() {
		int point = 0;
	//	if ()
		return point;
	}*/
	/*
	public void addButtons(Container game) {
		Color redColor = new Color(150, 15, 15);
		JButton closeButton = new JButton("X");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(redColor);
		closeButton.setForeground(Color.WHITE);
		closeButton.addActionListener(event -> closeButtonPressed());
		game.add(closeButton);

		countDown = new JLabel();
		Font countDownFont = new Font("Times new roman", Font.BOLD, 150);
		countDown.setFont(countDownFont);
		countDown.setBounds(900, 300, 500, 300);
		countDown.setForeground(redColor);
		game.add(countDown);
		
		points = new JLabel("Points: " + point());
		Font pointsFont = new Font("Times new roman", Font.BOLD, 24);
		points.setFont(pointsFont);
		points.setBounds(100, 100, 200, 50);
		points.setForeground(redColor);
		game.add(points);
	}*/
	/*public void paintComponent(Graphics g) {
		 super.paintComponents(g);
		g.setColor(Color.black);
		g.fillRect(20, 20, 200, 200);
		
		/*Graphics2D gg = (Graphics2D) g;

		int w = getWidth();
		int h = getHeight();

		int beerW = 100;
		int beerH = 10;
		int beerSpeed = 3;

		int x = lastX + beerSpeed;

		if (x > w + beerW) {
			x = -beerW;
		}

	        g.drawImage(imageB, 0, 0, this);    
		gg.fillRect(x, h / 2 + beerH, beerW, beerH);

		lastX = x;*/
	//}
	/*public void animateLine() {
		animationThread = new Thread(new Runnable() {
			public void run() {
				while (true) {
					repaint();
					try {
						Thread.sleep(1000/60);
					} catch (Exception ex) {
					}
				}
			}
		});
		animationThread.start();
	}*/
	/*
	public void closeButtonPressed() {
		System.exit(0);
	}*/
	public static void main(String[] args) {
		new Game1();
	}  

}
