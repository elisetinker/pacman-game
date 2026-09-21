package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Clyde extends Ghost
{
	
	
	public Clyde(Pacman p) {
		super(p);
		x = 14;
		y = 15;
	}

	public void render(Graphics g) 
	{
		super.render(g);
		g.drawImage(Images.clydeScaled, Cell.CELL_SIZE * x , Cell.CELL_SIZE * y);

	}


}




