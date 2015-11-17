package render;

import input.InputUtility;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;

import entity.Sheep;

public class GameScreen extends JComponent{
	
	public GameScreen(){
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(1280,720));
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				InputUtility.keyRelease(e);
				InputUtility.Updatestate();
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					//get shot
				}
				InputUtility.keyPressed(e);
				if(e.getKeyCode()==KeyEvent.VK_W){
					Button.update(1);
				}
				InputUtility.Updatestate();
			}
		});
	}
	
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for(IRenderable en : RenderableHolder.getInstance().getRenderable()){
			if(en.IsVisible()){
				en.draw(g2d);
			}
		}
	}
}
