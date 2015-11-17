package entity;

import java.awt.Graphics2D;

import render.IRenderable;
import render.Resource;

public class Wolf implements IRenderable{
	private int WolfColor;
	private int WolfIndex;
	private int WolfPoint;
	private boolean destroyed;
	private int speed;
	
	public Wolf(int WolfColor,int WolfPoint, int speed , int x , int y ){
		this.WolfColor = WolfColor;
		this.WolfIndex = 0;
		this.WolfPoint = WolfPoint;
		this.destroyed=false;
		this.speed = speed;
		
	}
	
	public boolean IsDestroyed(){
		return this.destroyed;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawImage(Resource.Bbright_W0,null,720,400);
		
	}

	@Override
	public boolean IsVisible() {
		return !IsDestroyed();
	}

	@Override
	public int getZ() {
		return 3;
	}

	
	
	
}
