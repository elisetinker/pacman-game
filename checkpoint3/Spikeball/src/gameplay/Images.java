package gameplay;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Images 
{
	public static Image pacmanBlueUp;
	public static Image pacmanBlueDown;
	public static Image pacmanBlueRight;
	public static Image pacmanBlueLeft;
	public static Image pacmanUp;
	public static Image upScaled;
	public static Image pacmanDown;
	public static Image downScaled;
	public static Image pacmanRight;
	public static Image rightScaled;
	public static Image pacmanLeft;
	public static Image leftScaled;
	public static Image blinkyScaled;
	public static Image blinky;
	public static Image pinkyScaled;
	public static Image pinky;
	public static Image inkyScaled;
	public static Image inky;
	public static Image clydeScaled;
	public static Image clyde;
	public static Image newPoints;
	public static Image newPointsScaled;
	
	public static Image newPowerCookie;
	public static Image newPowerCookieScaled;
	
	public static Image cherry;
	public static Image cherryScaled;
	public static Image strawberry;
	public static Image strawberryScaled;
	public static Image orange;
	public static Image orangeScaled;

	
	public static void loadImages() throws SlickException
	{
		pacmanUp= new Image("res/pacmanblueup2.png");
		upScaled=pacmanUp.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanDown= new Image("res/pacmanbluedown2.png");		
		downScaled=pacmanDown.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanRight= new Image("res/pacmanblueright2.png");
		rightScaled=pacmanRight.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanLeft= new Image("res/pacmanblueleft2.png");
		leftScaled=pacmanLeft.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		blinky=new Image("res/purpleghost.png");
		blinkyScaled= blinky.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pinky=new Image("res/pinkghost.png");
		pinkyScaled= pinky.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		inky=new Image("res/blueghost.png");
		inkyScaled= inky.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		clyde=new Image("res/greenghost.png");
		clydeScaled= clyde.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		newPoints = new Image ("res/newpoints2.png");
		newPointsScaled = newPoints.getScaledCopy(10, 10);
		newPowerCookie=new Image("res/newpowercookie.png");
		newPowerCookieScaled = newPowerCookie.getScaledCopy(20, 20);
		cherry = new Image ("res/spikeballcherry.png");
		cherryScaled = cherry.getScaledCopy(18, 18);
		strawberry = new Image ("res/spikeballstrawberry.png");
		strawberryScaled = strawberry.getScaledCopy(18, 18);
		orange = new Image ("res/spikeballorange.png");
		orangeScaled = orange.getScaledCopy(18, 18);
		
	
	}
	
}
