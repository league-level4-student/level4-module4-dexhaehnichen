package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{

	private int height = 50;
	private int width = 50;

	private double dY = 0;
	private double dX = 0;
	
	CirclePolymorph(int x, int y, int width, int height) {
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
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), width, height);
	}
	
	public void update() {
		setY((int) (Math.sin(dY)*100)+250);
		setX((int) (Math.cos(dX)*100)+250);
		dY += 0.1;
		dX += 0.1;
		//System.out.println(getY());
	}
}
