package entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import render.IRenderable;

public class PlayerStatus implements IRenderable {
	Sheep sheep = new Sheep();
	public PlayerStatus(){
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setFont(new Font("Tahoma",Font.BOLD, 40));
	    g2d.setColor(Color.WHITE);
		g2d.drawString(sheep.getScore()+"",1150, 60);
		
	}

	@Override
	public boolean IsVisible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}
}
