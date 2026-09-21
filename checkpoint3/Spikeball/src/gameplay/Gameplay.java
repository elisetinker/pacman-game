package gameplay;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import core.Main;

public class Gameplay extends BasicGameState {

	private GameContainer gc;
	StateBasedGame sbg;
    //private static Image map;
	Grid grid;
	Pacman pacman;
	Blinky blinky;
	Inky inky;
	Pinky pinky;
	Clyde clyde;
	int gameTime = 0;
	int TICK_TIME = 6;
	
	
	public Gameplay(int state) 
	{
		
	}

	public void init (GameContainer gc, StateBasedGame sbg) 
	{
		this.gc = gc;
		this.sbg = sbg;
    	grid = new Grid();
    	try {
    	pacman = new Pacman(13, 17);
    	}catch(IOException e) {
    		//TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	blinky = new Blinky(pacman);
    	inky= new Inky(pacman);
    	pinky=new Pinky(pacman);
    	clyde=new Clyde(pacman);
		
	}
	
	
	public void render(GameContainer arg0, StateBasedGame sbg, Graphics g) 
	{
		g.setBackground(Color.black);
		g.setColor(Color.blue);
		grid.render(g);
		pacman.render(g);
		blinky.render(g);
		inky.render(g);
		pinky.render(g);
		clyde.render(g);
	  }

	public void update(GameContainer arg0, StateBasedGame sbg, int delta) throws SlickException 
	{
		gameTime++;
		grid.update();
//		grid.drawMaze();
		if (blinky.isTouching() || inky.isTouching() || pinky.isTouching() || clyde.isTouching()) {
			pacman.update(true);
			blinky.setTouching(false);
			inky.setTouching(false);
			pinky.setTouching(false);
			clyde.setTouching(false);
		}
		else
			pacman.update(false);
		
		
		if(gameTime % TICK_TIME == 0)
		{
			blinky.update(pacman.getX(),pacman.getY());
			inky.update(pacman.getX(),pacman.getY());
			pinky.update(pacman.getX(),pacman.getY());
			clyde.update(pacman.getX(),pacman.getY());
		}
		if(pacman.isDead()==true) {
			pacman.saveHighScore();
			sbg.enterState(Main.GAMEOVER);
		}
			if(Cell.eatenAll==true) {
				sbg.enterState(Main.LEVELUP);
				TICK_TIME = 4;
				//reseting for level 2 and 3
			}
			
	}	
	
	public void keyPressed(int key, char c) 
	{
		pacman.keyPressed(key, c);
		if(key==Input.KEY_P) {
			sbg.enterState(Main.PAUSESCREEN);
		}
	}
	

	public int getID() 
	{
		return 2;
	}

}