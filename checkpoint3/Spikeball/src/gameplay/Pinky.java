package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Pinky extends Ghost
{
	
	public Pinky(Pacman p) {
		super(p);
		x = 13;
		y = 15;
	}

	public void render(Graphics g) 
	{
		super.render(g);
		g.drawImage(Images.pinkyScaled, Cell.CELL_SIZE * x , Cell.CELL_SIZE * y);
	}

}




