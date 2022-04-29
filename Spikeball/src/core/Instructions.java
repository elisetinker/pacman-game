package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Instructions extends BasicGameState {
	
	GameContainer gc;
	StateBasedGame sbg;
	Graphics g;
	public static final int state = 1;
	int selection;
	Image scaledScene;
	Image instructionsScaled;
	private static Image instructionsScreen;

	
	public Instructions (int state)
	{
		
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		this.gc = gc;
		this.sbg=sbg;
		instructionsScreen= new Image("res/instructionsScreen.png");
		instructionsScaled = instructionsScreen.getScaledCopy(gc.getScreenWidth(), gc.getScreenHeight());
	}

	@Override
	public void mousePressed(int button, int x, int y)
	{
		//checks for instructions button is clicked
		if(button == 0 && x>Main.getScreenWidth()*.015f&&x<Main.getScreenWidth()*.40125f&&y>Main.getScreenHeight()*.80333f&&y<Main.getScreenHeight()*.85f)
	    {
			sbg.enterState(Main.TITLE);
	    }
	 }
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
//		g.setBackground(Color.cyan);
//		g.drawString("Instructions", 200, 200);
//		g.setColor(Color.black);
		g.drawImage(instructionsScaled,0,0);
	}
	
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		// TODO Auto-generated method stub
	
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
		
	}
}