package entity;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import render.AudioUtility;
import render.GameScreen;
import render.GameWindow;

public class GameTitle extends JPanel{

	private BufferedImage IntroBG, Ishade, Iof, Icolorful,Eu,Em,Ed;
	private static JLabel Stbn = new JLabel();
	private static JLabel Hgbn = new JLabel();
	private static JLabel Abbn = new JLabel();
	private static int eyestate=1,ShadeX,ShadeY,OfX,OfY,ColX,ColY;

	public GameTitle() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(250,700,0,0));
		Stbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		Hgbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		Abbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		ImageIcon St1 = new ImageIcon("image/Start1.png");
		ImageIcon St0 = new ImageIcon("image/Start0.png");
		ImageIcon Hg1 = new ImageIcon("image/Hg1.png");
		ImageIcon Hg0 = new ImageIcon("image/Hg0.png");
		ImageIcon Ab1 = new ImageIcon("image/Ab1.png");
		ImageIcon Ab0 = new ImageIcon("image/Ab0.png");
		Stbn.setIcon(St0);
		Hgbn.setIcon(Hg0);
		Abbn.setIcon(Ab0);
		this.add(Stbn);
		this.add(Hgbn);
		this.add(Abbn);
		
		Stbn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Stbn.setIcon(St0);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(eyestate);
				eyestate=0;
				Stbn.setIcon(St1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				AudioUtility.playSound("Click");
//				Main.Main.frame.ChangeFrame(Main.Main.gc);
				// Main.Main.Gameloop();
			}
		});

		Hgbn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Hgbn.setIcon(Hg0);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(eyestate);
				eyestate=1;
				Hgbn.setIcon(Hg1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				AudioUtility.playSound("Click");

			}
		});

		Abbn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Abbn.setIcon(Ab0);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(eyestate);
				eyestate=2;
				Abbn.setIcon(Ab1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				AudioUtility.playSound("Click");

			}
		});
	}
	
	public void textmove(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			IntroBG = ImageIO.read(new File("image/IntroBG.png"));
			Ishade = ImageIO.read(new File("image/ishade.png"));
			Iof = ImageIO.read(new File("image/iof.png"));
			Icolorful = ImageIO.read(new File("image/icolorful.png"));
			Eu = ImageIO.read(new File("image/Up.png"));
			Em = ImageIO.read(new File("image/Med.png"));
			Ed = ImageIO.read(new File("image/Down.png"));
		} catch (IOException ex) {
			System.out.println("can't load");
		}
		g.drawImage(IntroBG, 0, 0, null);
		g.drawImage(Ishade, 130, 70, null);
		g.drawImage(Iof, 470, 70, null);
		g.drawImage(Icolorful, 630, 70, null);
		if(eyestate==0) g.drawImage(Eu,400,451, null);
		else if(eyestate==1) g.drawImage(Em,404,450, null);
		else if (eyestate==2) g.drawImage(Ed,405,444, null);
	}

}