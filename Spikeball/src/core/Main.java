package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import gameplay.Gameplay;

public class Main extends StateBasedGame 
{
	public final static int FRAMES_PER_SECOND = 60;
	private static AppGameContainer appgc;
	
    
	public static final int TITLE = 0;
    public static final int INSTRUCTIONS = 1;
    public static final int GAMEPLAY = 2;
    public static final int LEVELWIN  = 3;
    public static final int LEVELLOSE = 4;
    public static final int PAUSESCREEN = 5;
    public static final int ENDSCREEN = 6;

    
    private BasicGameState title;
    private BasicGameState instructions;
    private BasicGameState gameplay;
    private BasicGameState PauseScreen;
    
	public Main(String name) 
	{
		super(name);
		
    	title = new Title(TITLE);
        instructions = new Instructions(INSTRUCTIONS);
    	gameplay = new Gameplay(GAMEPLAY);
    	PauseScreen = new PauseScreen(PAUSESCREEN);
    	
	}

	public static int getScreenWidth()
	{
		return appgc.getScreenWidth();
	}
	
	public static int getScreenHeight()
	{
		return appgc.getScreenHeight();
	}
	

	public void initStatesList(GameContainer gc) throws SlickException 
	{

    	addState(title);
    	addState(instructions);
    	addState(gameplay);
    	addState(PauseScreen);
     
    	
	}

	public static void main(String[] args) 
	{
		try 
		{
			appgc = new AppGameContainer(new Main("Spikeball"));
			System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");
		
			appgc.setDisplayMode(appgc.getScreenWidth(), appgc.getScreenHeight(), false);
			appgc.setTargetFrameRate(FRAMES_PER_SECOND);
			appgc.start();
			appgc.setVSync(true);

		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}

	}
}
