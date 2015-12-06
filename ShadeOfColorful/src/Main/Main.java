package Main;

import input.InputUtility;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import render.GameScreen;
import render.GameWindow;
import entity.GameLogic;
import entity.GameTitle;
import entity.Sheep;
import entity.Wolf;

public class Main {

	public static GameWindow frame;
	public static GameTitle gt;
	public static GameScreen gc;
	public static GameLogic gl;

	public static void main(String[] args) {
		gt = new GameTitle();
		gc = new GameScreen();
		gl = GameLogic.getInstance();
		frame = new GameWindow(gt);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setResizable(false);
		// frame.add(gc);
		// frame.pack();
		// frame.setVisible(true);
		// Gameloop();
	}

	// public static void StartGame(){
	// frame.getContentPane().setVisible(false);
	// frame.getContentPane().remove(gt);
	// frame.getContentPane().revalidate();
	// frame.add(gc);
	// frame.getContentPane().setVisible(true);
	// frame.getContentPane().revalidate();
	// Gameloop();
	// }
	public static void Gameloop() {
		while (true) {
			gc.requestFocus();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
			gc.repaint();
			gl.logicUpdate();
		}
	}

}
