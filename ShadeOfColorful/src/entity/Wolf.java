package entity;

import java.awt.Graphics2D;
import java.util.ArrayList;

import render.IRenderable;
import render.Resource;

public class Wolf implements IRenderable{
	private static int WolfColor;
	private static int WolfIndex;
	private static int WolfPoint;
	private static boolean destroyed;
	private static boolean visible;
	private static int x;
	private static int y;
	private static int speed;
	
	public Wolf(int WolfColor,int WolfPoint, int speed , int x , int y ){
		this.WolfColor = WolfColor;
		this.WolfIndex = 0;
		this.WolfPoint = WolfPoint;
		this.destroyed=false;
		this.visible=true;
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

	public static int randomGenWolf(int round){
		int[] genWolf = {1,2,3,4};
		int[] wolfweight = {(50-((int)(0.25*round))),(35-((int)(0.1*round))),(10+((int)(0.1*round))),(5+((int)(0.2*round)))}; 
		int totalweight=0;
		for(int a : wolfweight){
			totalweight += a;
		}
		
		ArrayList<Integer>weightwolf = new ArrayList<Integer>();
		int currentwolf=0;
		while(currentwolf<genWolf.length){
			for(int i=0;i<wolfweight[currentwolf];i++){
				weightwolf.add(weightwolf.size(),genWolf[currentwolf]);
			}
			currentwolf++;
		}
		
		int randomnumber = (int)(Math.random()*totalweight);
		return weightwolf.get(randomnumber);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		if(isDestroyed()) g2d.drawImage(Resource.Wolf1,x+50,y-70,null);
		else{
		g2d.drawImage(Resource.Bbright_W0,this.x,this.y,null);
		}
	}

	@Override
	public boolean IsVisible() {
		return visible;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE-2;
	}

	
	
	
}
