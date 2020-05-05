package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph{

	private int height = 50;
	private int width = 50;
	private boolean up = false;
	
	MousePolymorph(int x, int y, int width, int height) {
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
		setY();
	}
}
