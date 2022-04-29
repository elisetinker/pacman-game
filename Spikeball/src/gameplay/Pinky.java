package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Pinky
{

	private int ghostx;
	private int ghosty;
	private int speed = 4;

	public Pinky(int ghostx, int ghosty) 
	{
		this.ghostx=ghostx;
		this.ghosty=ghosty;

	}
	

	public void render(Graphics g) 
	{
		g.setColor(Color.white);

		g.drawImage(Images.redghostscaled, ghostx * Cell.CELL_SIZE, ghosty * Cell.CELL_SIZE);

	}

	public void update() 
	{
		move();
	}
	public void move() {
		if(!Grid.getCell(ghostx+1,ghosty).isWall()) {
			if(!Grid.getCell(ghostx-1,ghosty).isWall()) {
				if(!Grid.getCell(ghostx, ghosty-1).isWall()) {
					if(!Grid.getCell(ghostx,ghosty+1).isWall()) {
							//i dont know 
						
					}
				}
			}
		}
	}

}





