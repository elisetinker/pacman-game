package core;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import gameplay.Images;


public class Gameover extends BasicGameState{
	public static final int state = 6;
	StateBasedGame sbg;
	int selection;
	private GameContainer gc;
	private static Image gameoverscreen;
	Image gameoverScaled;
	
	public Gameover (int state)
	{
		//super(state);
		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, org.newdawn.slick.Graphics g)throws SlickException
	{
		
		
		g.drawImage(gameoverScaled,0,0);
		
		
	}

	

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 

	{
	   // Update our reference to the game Engine
		this.sbg=sbg;
		Images.loadImages();
		gameoverscreen = new Image("res/gameoverscreen.png");
		gameoverScaled = gameoverscreen.getScaledCopy(gc.getScreenWidth(), gc.getScreenHeight());
	}

		
	public void mousePressed(int button, int x, int y)
	{
		//here you can put buttons that either go to instructions, restart(gameplay), the title, or the credits
	}
	//}

	public void keyPressed(int key, char c)
	{     
	
	}
	public int getID()
	{
		return 6;
	}





	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}
}