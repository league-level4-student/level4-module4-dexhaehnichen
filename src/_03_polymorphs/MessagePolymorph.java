package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class MessagePolymorph extends Polymorph{

	private int height = 50;
	private int width = 50;
	
	
	MessagePolymorph(int x, int y, int width, int height) {
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
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), width, height);
	}
	
	public void update(int x, int y, boolean p) {
		if(x < width+getX() && x > 0+getX() && y < height+getY() && y > 0+getY() && p == true) {
			JOptionPane.showMessageDialog(null, "test");
		}
	}
	
}
