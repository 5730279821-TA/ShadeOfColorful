

import input.InputUtility;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import render.GameScreen;
import entity.GameLogic;
import entity.Sheep;
import entity.Wolf;

public class Main {
	
	public Main(){
		
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Shade of Colotful");
		GameScreen gc = new GameScreen();
		GameLogic gl = GameLogic.getInstance();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(gc);
		frame.pack();
		frame.setVisible(true);
		while(true){
			gc.requestFocus();
			try{
				Thread.sleep(20);
			} catch(InterruptedException e){
				//e.printStackTrace();
			}
			gc.repaint();
			gl.logicUpdate();
			InputUtility.Updatestate();
		}
	}
}
