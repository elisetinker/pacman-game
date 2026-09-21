package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Inky extends Ghost
{
	
	public Inky(Pacman p) {
		super(p);
		x=12;
		y=15;
	}

	public void render(Graphics g) 
	{
		super.render(g);
		g.drawImage(Images.inkyScaled, Cell.CELL_SIZE * x , Cell.CELL_SIZE * y);

	}

	
}




