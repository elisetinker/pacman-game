
package gameplay;


import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Blinky extends Ghost
{
	
	public Blinky (Pacman p) 
	{
		super(p);
		//pMan = p;
		x = 13;
		y = 11;
	}

	public void render(Graphics g) 
	{
		super.render(g);
		g.drawImage(Images.blinkyScaled, Cell.CELL_SIZE * x , Cell.CELL_SIZE * y);
	}

	

}










