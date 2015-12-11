package Main;

import render.GameScreen;
import entity.GameManager;
import entity.GameTitle;

public class Main {
	public static void main(String[] args){
		GameTitle gt = new GameTitle();
		GameScreen gc = new GameScreen();
		GameManager.rungame(gc);
	}
}

	
