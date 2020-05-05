package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	private int height = 50;
	private int width = 50;
	private boolean up = false;
	
	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), width, height);
	}
	
	public void update() {
		if(getY() > 150) {
			up = true;
		}else if(getY() < 50){
			up = false;
		}
		
		if(up == true) {
			setY(getY() - 1);
		}else {
			setY(getY() + 1);
		}
	}
}
