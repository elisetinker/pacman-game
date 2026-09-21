package gameplay;

import java.util.ArrayList;
import java.util.Iterator;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import core.Main;

public class Grid
{
	final static int ROWS = 28;
	final static int COLS = 31;
	private static Cell[][] cells;

	
	public Grid()
	{
		cells = new Cell[28][31];
		
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				cells[i][j] = new Cell(this, i, j);
			}
		}
		
	}
	
	public static Cell getCell(int x, int y)
	{
		return cells[x][y];
	}
	
	public static boolean inBounds(int x, int y)
	{
		return x >= 0 && x < ROWS && y >= 0 && y < COLS;
	}
	
	public static boolean hasCell(int x, int y)
	{
		return inBounds(x, y) && cells[x][y] != null;
	}
	
	public static boolean hasWall(int x, int y)
	{
		return hasCell(x, y) && cells[x][y].isWall();
	}
	
	
	
	public void render(Graphics g) 
	{
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				cells[i][j].render(g);
			}
		}
	}

	public void update() 
	{	
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				cells[i][j].update();
			}
		}
	}
	



}
