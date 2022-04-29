package gameplay;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Images 
{
	public static Image pacmanUp;
	public static Image upScaled;
	public static Image pacmanDown;
	public static Image downScaled;
	public static Image pacmanRight;
	public static Image rightScaled;
	public static Image pacmanLeft;
	public static Image leftScaled;
	public static Image redghost;
	public static Image redghostscaled;
	public static Image blinky;

	
	public static void loadImages() throws SlickException
	{
		pacmanUp= new Image("res/pacUp.png");
		upScaled=pacmanUp.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanDown= new Image("res/pacDown.png");		
		downScaled=pacmanDown.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanRight= new Image("res/pacRight.png");
		rightScaled=pacmanRight.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanLeft= new Image("res/pacLeft.png");
		leftScaled=pacmanLeft.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		redghost=new Image("res/redghost.png");
		redghostscaled= redghost.getScaledCopy(25,25);	
		blinky=new Image("res/Blinky.png");
	}
	
}
