package core;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import gameplay.Cell;
import gameplay.Images;


public class LevelUp extends BasicGameState{
	public static final int state = 7;
	StateBasedGame sbg;
	int selection;
	private GameContainer gc;
	private static Image levelupscreen;
	Image levelupscaled;
	
	public LevelUp (int state)
	{
		//super(state);
		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, org.newdawn.slick.Graphics g)throws SlickException
	{
		
		
		g.drawImage(levelupscaled,0,0);
		
		
	}

	

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 

	{
	   // Update our reference to the game Engine
		this.sbg=sbg;
		Images.loadImages();
		levelupscreen = new Image("res/levelupcomplete.png");
		levelupscaled = levelupscreen.getScaledCopy(gc.getScreenWidth(), gc.getScreenHeight());
	}

		
	public void mousePressed(int button, int x, int y)
	{
		
	}
	//}

	public void keyPressed(int key, char c)
	{     
		if(key==Input.KEY_SPACE) {
		sbg.enterState(Main.GAMEPLAY);
		Cell.eatenAll=false;
		//show level up screen, set eaten all back to false
		}
	}
	public int getID()
	{
		return 7;
	}





	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}
}