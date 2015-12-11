package entity;

import javax.swing.JPanel;

import render.AudioUtility;
import render.GameScreen;
import render.GameWindow;

public class GameManager {
	public static GameWindow frame;
	public static GameScreen gc;
	public static GameTitle gt;
	public static GameLogic gl;
	public static JPanel nextScene = null;

	public static void rungame() {
		
		gt = new GameTitle();
		gc = new GameScreen();
		gl = GameLogic.getInstance();
		frame = new GameWindow(gt);
	
		while(true){
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			frame.getCurrentScene().repaint();
			
			if(frame.getCurrentScene() instanceof GameScreen){
				gl.logicUpdate();
			}
//			if(nextScene != null){
//				if(frame.getCurrentScene() instanceof GameScreen){
//					
//				}
//				if(nextScene instanceof GameScreen){
//					
//				}
//				nextScene=null;
//			}
		}
		
		
		}

	
}
