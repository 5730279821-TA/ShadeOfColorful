package entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import render.GameBackground;
import render.Button;
import render.RenderableHolder;

public class GameLogic {
	private static GameLogic instance = new GameLogic();
	protected Sheep sheep;
	protected PlayerStatus playerStatus;
	protected Button button;
	protected Beam beam;
	protected GameBackground bg;
//	protected List<Wolf> wolves;
	protected Wolf wolf;
	private static final int SPAWN_DELAY = 100;
	private int spawnDelayCounter = 0;

	public GameLogic() {
		sheep = new Sheep();
		playerStatus = new PlayerStatus();
		button = new Button();
		beam = new Beam();
		bg = new GameBackground();
//		wolves = new CopyOnWriteArrayList<Wolf>();
		wolf = new Wolf(0,100,1,810,310);
		RenderableHolder.getInstance().add(sheep);
		RenderableHolder.getInstance().add(playerStatus);
		RenderableHolder.getInstance().add(button);
		RenderableHolder.getInstance().add(beam);
		RenderableHolder.getInstance().add(bg);
		RenderableHolder.getInstance().add(wolf);
	}

	public static GameLogic getInstance() {
		return instance;
	}

	public void logicUpdate() {

	}

}
