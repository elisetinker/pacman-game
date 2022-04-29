package core;

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
public class PauseScreen extends BasicGameState {

	GameContainer gc;
	StateBasedGame sbg;
	Graphics g;
	public static final int state = 5;
	int selection;
	Image scaledPauseScene;
	
	public PauseScreen(int state)
	{
	}
	
	@Override
	public void init (GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		this.gc=gc;
		this.sbg=sbg;
		Image pausescreen=new Image("res/pacmanPause.png");
		scaledPauseScene = pausescreen.getScaledCopy(gc.getScreenWidth(), gc.getScreenHeight());
		
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(scaledPauseScene,0,0 );
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {	
		
	}
	
     
	@Override
	public int getID() {
		//TODO Auto-generated method stub
		return 5;
	}

}