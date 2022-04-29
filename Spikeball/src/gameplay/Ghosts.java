package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Ghosts
{

	public void Ghost(Images image, int x, int y, int speed) {
		
	}
	
	
	
	

	public void render(Graphics g) 
	{
		g.drawImage(Images.blinky,Cell.CELL_SIZE*13,Cell.CELL_SIZE*14);
//		g.drawImage(Images.blueghostscaled,Cell.CELL_SIZE*13,Cell.CELL_SIZE*14);
//		g.drawImage(Images.greenghostscaled,Cell.CELL_SIZE*13,Cell.CELL_SIZE*14);
//		g.drawImage(Images.purpleghostscaled,Cell.CELL_SIZE*13,Cell.CELL_SIZE*14);

	}

	public void update() 
	{
		
	}
	public void bestCell(int x, int y) {
		if(x>Pacman.getX()) {
			moreEast=true;
		}
		if(y>Pacman.getY()) {
			moreNorth=true;
		}
		if(x<Pacman.getX()) {
			moreWest=true;
		}
		if(y<Pacman.getY()) {
			moreSouth=true;
		}
		
	}

}





