package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setX(int i) {
    	x = i;
    }
    
    public void setY(int i) {
    	y = i;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
