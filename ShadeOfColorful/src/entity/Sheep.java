package entity;

import input.InputUtility;

import java.awt.Graphics2D;
import java.util.concurrent.CopyOnWriteArrayList;

import render.IRenderable;
import render.Resource;

public class Sheep implements IRenderable{
	private int SheepColor;
	private int SheepIndex;
	private int Score;
	private boolean IsShot;
	private Beam beam = new Beam(0);
	private int state = InputUtility.getState();
	
	
	public Sheep(){
		this.SheepColor=0;
		this.SheepIndex=0;
		this.IsShot=false;
		this.state=0;
		
	}

	public int getSheepColor() {
		return SheepColor;
	}

	public void setSheepColor(int sheepColor) {
		SheepColor = sheepColor;
	}

	public int getSheepIndex() {
		return SheepIndex;
	}

	public void setSheepIndex(int sheepIndex) {
		SheepIndex = sheepIndex;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public boolean isIsShot() {
		return IsShot;
	}

	public void setIsShot(boolean isShot) {
		IsShot = isShot;
	}

	public Beam getBeam() {
		return beam;
	}

	public void setBeam(Beam beam) {
		this.beam = beam;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setColor(int state){
		//nColor will be in range 0-14
		
		if(SheepColor==1){
			if(state==3) SheepColor=7;
			if(state==4) SheepColor=19;
			if(state==5) SheepColor=8;
			if(state==6) SheepColor=15;
		}
		
		else if(SheepColor==2){
			if(state==3) SheepColor=16;
			if(state==4) SheepColor=10;
			if(state==5) SheepColor=18;
			if(state==6) SheepColor=11;
		}
		
		else if(SheepColor==3){
			if(state==1) SheepColor=7;
			if(state==2) SheepColor=16;
			if(state==5) SheepColor=9;
			if(state==6) SheepColor=17;
		}
		
		else if(SheepColor==4){
			if(state==1) SheepColor=19;
			if(state==2) SheepColor=10;
			if(state==5) SheepColor=20;
			if(state==6) SheepColor=12;
		}

		else if(SheepColor==5){
			if(state==1) SheepColor=8;
			if(state==2) SheepColor=18;
			if(state==3) SheepColor=9;
			if(state==4) SheepColor=20;
		}

		else if(SheepColor==6){
			if(state==1) SheepColor=15;
			if(state==2) SheepColor=11;
			if(state==3) SheepColor=17;
			if(state==4) SheepColor=12;
		}
		
		else{
			SheepColor = state;
		}
		
		setSheepColor(SheepColor);
	}
	
	protected void update(){
		setColor(this.state);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawImage(Resource.Black_S0,300,320,200,181,null);
		
	}

	@Override
	public boolean IsVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return 3;
	}



	
	
	
	
}
