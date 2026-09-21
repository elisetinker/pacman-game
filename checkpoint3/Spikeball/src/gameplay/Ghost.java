package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import core.Main;

public class Ghost
{
	boolean moreEast;
	boolean moreWest;
	boolean moreSouth;
	boolean moreNorth;
	protected int x;
	protected int y;
	boolean touching=false;
	Pacman pMan;

	String direction = "up";


	public Ghost(Pacman p) 
	{
		pMan=p;
	}	

	public void render(Graphics g) 
	{
		//g.drawString("" + x + ", " +  y, Cell.CELL_SIZE*x, Cell.CELL_SIZE * y - 15);
	}

	public void update(int i, int j) 
	{
		//simpleMovement();
		mediumMovement();
		if(i==x&&j==y) {
			touching=true;
			System.out.println("You are at the same location");

	}
	}
	
	public boolean canMove(int x, int y)
	{
		return !Grid.hasWall(x,  y);
	}
	
	public void moveToCell(int newX, int newY)
	{
		if(canMove(newX, newY))
		{
			x = newX;
			y = newY;
		}
		else
		{
			System.out.println("Error: trying to move to invalid cell");
		}
	}
	
//	public void moveUp()
//	{
//		if (canMove(x,  y - 1)) 
//		{
//			y = y - 1;
//		}
//	}
//	
//	public void moveDown()
//	{
//		if (canMove(x,  y + 1)) {
//			y = y + 1;
//		}
//	}
//	public void moveRight()
//	{
//		if (canMove(x + 1,  y)) {
//			x = x + 1;
//		}
//	}
//	public void moveLeft()
//	{
//		if (canMove(x - 1,  y)) {
//			x = x - 1;
//		}
//	}
	
	public boolean moreVertical()
	{
//		System.out.println(x + " | " + Pacman.getX());
//		System.out.println(x + " | " + Pacman.getX());

		int xDiff = x - pMan.getX();
		int yDiff = y - pMan.getY();
		
		return Math.abs(xDiff) < Math.abs(yDiff);
	}
	
	public boolean pacIsRight()
	{
		return x < pMan.getX();
	}
	
	public boolean pacIsDown()
	{
		return y < pMan.getY();
	}
	
	
	public void mediumMovement() 
	{
		// First attempt - go to best direction
		
		String dir = getBestDirection();
		
		int nextX = x + getXMove(dir);
		int nextY = y + getYMove(dir);
		
		if(canMove(nextX, nextY))
		{
			moveToCell(nextX, nextY);
			return;
		}

		// Second attempt - go to second best direction
		
		dir = getSecondBestDirection();
		
		nextX = x + getXMove(dir);
		nextY = y + getYMove(dir);
		
		if(canMove(nextX, nextY))
		{
			moveToCell(nextX, nextY);
			return;
		}

	
	}
	

	public int getXMove(String direction)
	{
		if(direction.equals("right"))
		{
			return 1;
		}
		if(direction.equals("left"))
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public int getYMove(String direction)
	{
		if(direction.equals("down"))
		{
			return 1;
		}
		if(direction.equals("up"))
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public String getBestDirection() 
	{
		if(moreVertical())
		{
			if(pacIsDown())
			{
				return "down";
			}
			else
			{
				return "up";
			}
		}
		else
		{
			if(pacIsRight())
			{
				return "right";
			}
			else
			{
				return "left";
			}
		}		
	}
	
	
	public String getSecondBestDirection() 
	{
		
		// In second best case, it Pacman is above me primarily... we go right or left
		// Because we don't want to go directly away
		if(moreVertical())
		{
			if(pacIsRight())
			{
				return "right";
			}
			else
			{
				return "left";
			}

		}
		else
		{
			if(pacIsDown())
			{
				return "down";
			}
			else
			{
				return "up";
			}
		}		
	}
	
//	public void simpleMovement() 
//	{
//		if(moreVertical())
//		{
//			if(pacIsDown())
//			{
//				moveDown();
//			}
//			else
//			{
//				moveUp();
//			}
//		}
//		else
//		{
//			if(pacIsRight())
//			{
//				moveRight();
//			}
//			else
//			{
//				moveLeft();
//			}
//		}		
//	}
	public boolean isTouching()
	{
		return touching;
	}
	public void setTouching (boolean status) {
		touching = status;
	}


}





