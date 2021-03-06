package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import render.GameScreen;
import render.IRenderable;
import render.Resource;

public class Wolf implements IRenderable{
	private int WolfColor;
	private int WolfIndex;
	private int WolfPoint;
	private boolean destroyed;
	private int x;
	private int y;
	private int speed;
	
	public Wolf(int WolfColor,int WolfPoint, int speed , int x , int y ){
		this.WolfColor = WolfColor;
		this.WolfIndex = 0;
		this.WolfPoint = WolfPoint;
		this.destroyed=false;
		this.speed = speed;
		this.x=x;
		this.y=y;
	}
	
	public int getWolfColor() {
		return WolfColor;
	}

	public void setWolfColor(int wolfColor) {
		WolfColor = wolfColor;
	}

	public int getWolfIndex() {
		return WolfIndex;
	}

	public void setWolfIndex(int wolfIndex) {
		WolfIndex = wolfIndex;
	}

	public int getWolfPoint() {
		return WolfPoint;
	}

	public void setWolfPoint(int wolfPoint) {
		WolfPoint = wolfPoint;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean collide(Sheep sheep){
		if(this.x<=500) return true;
		else return false;
	}

	public void update(){
		x -= speed;
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		if(isDestroyed()) g2d.drawImage(Resource.Wolf1,x,y,null);
		else{
		for(Wolf b : GameLogic.getWolves()){
			if(b.getWolfColor()==0) g2d.drawImage(Resource.Black_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==1) g2d.drawImage(Resource.Rbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==2) g2d.drawImage(Resource.Rdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==3) g2d.drawImage(Resource.Bbright_W0,b.getX(),b.getY(),null);
	        else if(b.getWolfColor()==4) g2d.drawImage(Resource.Bdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==5) g2d.drawImage(Resource.Gbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==6) g2d.drawImage(Resource.Gdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==7) g2d.drawImage(Resource.RBbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==8) g2d.drawImage(Resource.RGbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==9) g2d.drawImage(Resource.GBbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==10) g2d.drawImage(Resource.RBdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==11) g2d.drawImage(Resource.RGdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==12) g2d.drawImage(Resource.GBdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==13) g2d.drawImage(Resource.RGBbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==14) g2d.drawImage(Resource.RGBdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==15) g2d.drawImage(Resource.RbrightGdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==16) g2d.drawImage(Resource.RdarkBbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==17) g2d.drawImage(Resource.GdarkBbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==18) g2d.drawImage(Resource.RdarkGbright_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==19) g2d.drawImage(Resource.RbrightBdark_W0,b.getX(),b.getY(),null);
			else if(b.getWolfColor()==20) g2d.drawImage(Resource.GbrightBdark_W0,b.getX(),b.getY(),null);
		}
		}
	}

	@Override
	public boolean IsVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE-2;
	}

	
	
	
}
