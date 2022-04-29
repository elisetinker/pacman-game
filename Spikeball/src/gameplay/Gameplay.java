package gameplay;

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
	Ghosts ghosts;
	public Gameplay(int state) 
	{
		
	}

	public void init (GameContainer gc, StateBasedGame sbg) 
	{
		this.gc = gc;
		this.sbg = sbg;
    	grid = new Grid();
    	pacman = new Pacman(13, 17);
    	ghosts =new Ghosts();
		
	}
	
	
	public void render(GameContainer arg0, StateBasedGame sbg, Graphics g) 
	{
		g.setBackground(Color.black);
		g.setColor(Color.blue);
		grid.render(g);
		pacman.render(g);
		ghosts.render(g);
		
	  }

	public void update(GameContainer arg0, StateBasedGame sbg, int delta) throws SlickException 
	{
		grid.update();
		pacman.update();
		ghosts.update();
	
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
	
	public void level1() {
		//speed=?;
		grid.update();
		pacman.update();
		ghosts.update();
	}
	public void level2() {
		//speed=?
		grid.update();
		pacman.update();
		ghosts.update();
	}
	public void level3() {
		//speed=?
		grid.update();
		pacman.update();
		ghosts.update();
	}

}