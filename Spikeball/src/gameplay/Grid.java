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
	final int ROWS = 28;
	final int COLS = 31;
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