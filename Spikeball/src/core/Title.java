package core;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import gameplay.Images;


public class Title extends BasicGameState{
	public static final int state = 0;
	StateBasedGame sbg;
	Image titleScaled;
	TrueTypeFont titleFont;
	int selection;
	private GameContainer gc;
	private static Image titleScreen;
	
	
	public Title (int state)
	{
		//super(state);
		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, org.newdawn.slick.Graphics g)throws SlickException
	{
		
		g.setBackground(Color.black);
		g.drawString("Title", 200, 200);
		g.setColor(Color.white);
		g.drawImage(titleScaled,0,0);
		
		
	}

	

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 

	{
	   // Update our reference to the game Engine
		this.sbg=sbg;
		Images.loadImages();
		titleScreen= new Image("res/pacmantitlescreen.png");
		titleScaled = titleScreen.getScaledCopy(gc.getScreenWidth(), gc.getScreenHeight());
	}

		
	public void mousePressed(int button, int x, int y)
	{
		//checks for instructions button is clicked
		if(button == 0 && x>Main.getScreenWidth()*.3463541f&&x<Main.getScreenWidth()*.6583f&&y>Main.getScreenHeight()*.8575f&&y<Main.getScreenHeight()*.9167f)
	    {
			sbg.enterState(Main.INSTRUCTIONS);
	    }
		if(button==0&&x>Main.getScreenWidth()*.3765625f&&x<Main.getScreenWidth()*.63f&&y>Main.getScreenHeight()*.753f&&y<Main.getScreenHeight()*.823f) {
			sbg.enterState(Main.GAMEPLAY);
		}
	    }
	//}

	public void keyPressed(int key, char c)

	{     
	//}
//		if(key == Input.KEY_I )
//		{
//	 		sbg.enterState(Main.INSTRUCTIONS); 
//		}
		if(key==Input.KEY_G) {
			sbg.enterState(Main.GAMEPLAY);
		}
	}
	public int getID()
	{
		return 0;
	}





	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}
}