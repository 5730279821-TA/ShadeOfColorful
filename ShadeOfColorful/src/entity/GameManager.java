package entity;

import javax.swing.JPanel;

import render.AudioUtility;
import render.GameScreen;
import render.GameWindow;

public class GameManager {
	public static GameWindow frame;
	public static GameLogic gl;

	public static void rungame(JPanel gamePanel) {
		
		
		if(gamePanel instanceof GameScreen){
			frame = new GameWindow(gamePanel);
//		frame.switchScene(gamePanel);
		gl = GameLogic.getInstance();
		while (true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
			gamePanel.repaint();
			gl.logicUpdate();
		}
		}
		else if(gamePanel instanceof GameTitle){
		frame = new GameWindow(gamePanel);
		AudioUtility.playSound("Intro");
		}
		
		}

	
}
