package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import core.Main;

public class Pacman
{

	protected int x;
	protected int y;
	private boolean up=false;
	private boolean down=false;
	private boolean left=false;
	private boolean right=false;


	public Pacman(int x, int y) 
	{
		this.x=x;
		this.y=y;

	}


	public void render(Graphics g) 
	{
		g.setColor(Color.white);
		if(up==true) {
			g.drawImage(Images.upScaled, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		}
		else if(down==true) {
			g.drawImage(Images.downScaled, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		}
		else if(right==true) {
			g.drawImage(Images.rightScaled, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		}
		else if(left==true) {
			g.drawImage(Images.leftScaled, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		}
		}
	

	public void update() 
	{

	}

	public void keyPressed(int key, char c) 
	{
		if (key == Input.KEY_UP && !Grid.getCell(x, y -1).isWall()) 
		{
			y = y - 1;
			up=true;
		}
//		else {
//			up=false;
//		}
		if (key == Input.KEY_DOWN&&!Grid.getCell(x,y+1).isWall()) {
			y = y + 1;
			down=true;
		}
//		else {
//			down=false;
//		}
		if (key == Input.KEY_RIGHT&&!Grid.getCell(x+1,y).isWall()) {
			x = x + 1;
			right=true;
		}
//		else {
//			right=false;
//		}
		if (key == Input.KEY_LEFT&&!Grid.getCell(x-1,y).isWall()) {
			x = x - 1;
			left=true;
		}
//		else {
//			left=false;
//		}
	}
	int getY(int y){
		return y;
	}
	int getX(int x){
		return x;
	}

}





