package entity;

import java.awt.Graphics2D;

import render.IRenderable;
import render.Resource;

public class Beam implements IRenderable{
	private int BeamColor;
	private boolean destroyed;
	
	public Beam(int BeamColor){
		this.BeamColor = BeamColor;
		this.destroyed = false;
	}

	

	public int getBeamColor() {
		return BeamColor;
	}



	public void setBeamColor(int beamColor) {
		BeamColor = beamColor;
	}



	public boolean isDestroyed() {
		return destroyed;
	}



	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}



	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawImage(Resource.RedButton,200,200,null);
	}


	@Override
	public boolean IsVisible() {
		// TODO Auto-generated method stub
		return !this.destroyed;
	}


	@Override
	public int getZ() {
		return Integer.MAX_VALUE-1;
	}

	
	
	
}
	