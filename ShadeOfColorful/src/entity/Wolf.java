package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import render.GameScreen;
import render.IRenderable;
import render.Resource;

public class Wolf implements IRenderable{
	private static int WolfColor;
	private static int WolfIndex;
	private static int WolfPoint;
	private static boolean destroyed;
	private static int x;
	private static int y;
	private static int speed;
	
	public Wolf(int WolfColor,int WolfPoint, int speed , int x , int y ){
		this.WolfColor = WolfColor;
		this.WolfIndex = 0;
		this.WolfPoint = WolfPoint;
		this.destroyed=false;
		this.speed = speed;
		this.x=x;
		this.y=y;
	}
	
	public static int getWolfColor() {
		return WolfColor;
	}

	public static void setWolfColor(int wolfColor) {
		WolfColor = wolfColor;
	}

	public static int getWolfIndex() {
		return WolfIndex;
	}

	public static void setWolfIndex(int wolfIndex) {
		WolfIndex = wolfIndex;
	}

	public static int getWolfPoint() {
		return WolfPoint;
	}

	public static void setWolfPoint(int wolfPoint) {
		WolfPoint = wolfPoint;
	}

	public static boolean isDestroyed() {
		return destroyed;
	}

	public static void setDestroyed(boolean destroyed) {
		Wolf.destroyed = destroyed;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Wolf.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Wolf.y = y;
	}

	public static int getSpeed() {
		return speed;
	}

	public static void setSpeed(int speed) {
		Wolf.speed = speed;
	}
	
	public boolean collide(Sheep sheep){
		if(this.x==500) return true;
		else return false;
	}

	
	public static void update(){
		x -= speed;
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		if(isDestroyed()) g2d.drawImage(Resource.Wolf1,x+50,y-70,null);
		else{
		for(Wolf a : GameLogic.getWolves()){
			if(a.getWolfColor()==0) g2d.drawImage(Resource.Black_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==1) g2d.drawImage(Resource.Rbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==2) g2d.drawImage(Resource.Rdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==3) g2d.drawImage(Resource.Bbright_W0,a.getX()+50,a.getY()-70,null);
	        else if(a.getWolfColor()==4) g2d.drawImage(Resource.Bdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==5) g2d.drawImage(Resource.Gbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==6) g2d.drawImage(Resource.Gdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==7) g2d.drawImage(Resource.RBbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==8) g2d.drawImage(Resource.RGbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==9) g2d.drawImage(Resource.GBbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==10) g2d.drawImage(Resource.RBdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==11) g2d.drawImage(Resource.RGdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==12) g2d.drawImage(Resource.GBdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==13) g2d.drawImage(Resource.RGBbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==14) g2d.drawImage(Resource.RGBdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==15) g2d.drawImage(Resource.RbrightGdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==16) g2d.drawImage(Resource.RdarkBbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==17) g2d.drawImage(Resource.GdarkBbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==18) g2d.drawImage(Resource.RdarkGbright_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==19) g2d.drawImage(Resource.RbrightBdark_W0,a.getX()+50,a.getY()-70,null);
			else if(a.getWolfColor()==20) g2d.drawImage(Resource.GbrightBdark_W0,a.getX()+50,a.getY()-70,null);
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
