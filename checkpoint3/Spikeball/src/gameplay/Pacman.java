package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.io.*;
import java.awt.Font;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.StateBasedGame;

import core.Main;

public class Pacman
{

	protected static int x;
	protected static int y;
	private boolean up=false;
	private boolean down=false;
	private boolean left=false;
	private boolean right=false;
	private int score = 0;
	private static int highScore = 0;
	private int lives=3;
	static boolean die=false;
	private Graphics g = null;
	private int count=0;
	
	public static TrueTypeFont scoreFont;

	public Pacman(int x, int y) throws IOException
	{
		this.x=x;
		this.y=y;
		die=false;
		lives=3;
		score = 0;
		String text = null;
		count=0;
		File file = new File ("res/highscore.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			text = br.readLine();
			if (text != null)
				highScore = Integer.parseInt(text);
//			System.out.println("High Score = " + highScore);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void render(Graphics g) 
	{
		if (this.g == null) {
			this.g = g;
		}
		++count;
		g.setColor(Color.white);
		//up = true;
		//g.drawImage(Images.pacmanBlueUp, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		//up = false;
		if(up) {
			if (!Grid.getCell(x,y).isWall())
				g.drawImage(Images.pacmanUp, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			else
				g.drawImage(Images.pacmanUp, x * Cell.CELL_SIZE, (y+1) * Cell.CELL_SIZE);
		}
		else if(down) {
			if (!Grid.getCell(x,y).isWall())
				g.drawImage(Images.pacmanDown, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			else
				g.drawImage(Images.pacmanDown, x * Cell.CELL_SIZE, (y-1) * Cell.CELL_SIZE);
			
		}
		else if(right) {
			if (!Grid.getCell(x,y).isWall())
				g.drawImage(Images.pacmanRight, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			else
				g.drawImage(Images.pacmanRight, (x-1) * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			
		}
		else if(left) {
			if (!Grid.getCell(x,y).isWall())
				g.drawImage(Images.pacmanLeft, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			else
				g.drawImage(Images.pacmanLeft, (x+1) * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			
		}
		else
			g.drawImage(Images.pacmanUp, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		updateScore();
	}

	public void update(boolean touching) 
	{
		if(touching) {
			System.out.println("lives = "+lives);
			lives=lives-1;
			up = false;
			down = false;
			right = false;
			left = false;
			x=13;
			y=17;
		}
			if(lives==0) {
				die=true;
			}
	}

	public void updateScore() {
		
		
		scoreFont = new TrueTypeFont(new Font("Impact", Font.PLAIN, 18), down);
		g.setFont(Pacman.scoreFont);
		g.setColor(Color.black);
		g.drawString("Current Score: " + score, 200, 3);
		g.setFont(Pacman.scoreFont);
		g.setColor(Color.black);
		if(score>highScore) {
			highScore=score;
		}
		g.drawString("High Score = " + highScore, 400, 3);
		g.drawString("Lives: " +lives, 580, 3);
		if(count<65) {
			g.drawString("Ready...", 100, 3);
		}
	}
	
	public void keyPressed(int key, char c) 
	{
		//System.out.println("X = " + x);
		down=false;
		left=false;
		right=false;
		up=false;
		if (key == Input.KEY_UP && !Grid.getCell(x, y-1).isWall()) 
		{
			y = y - 1;
			up=true;
			if (!Grid.getCell(x, y).isEaten()) {
				if (x==Grid.getCell(x, y).getSpecialX() && y==Grid.getCell(x, y).getSpecialY()) 
					score = score + 5;
				else 
					++score;
				//g.drawString("Score: " + score, 320, 5);
				updateScore();
				//System.out.println("Updating score: " + score);
				Grid.getCell(x, y).setEaten();
			}
		}
		if (key == Input.KEY_DOWN&&!Grid.getCell(x,y+1).isWall()) {
			y = y + 1;
			down=true;
			
			if (!Grid.getCell(x, y).isEaten()) {
				if (x==Grid.getCell(x, y).getSpecialX() && y==Grid.getCell(x, y).getSpecialY()) 
					score = score + 5;
				else 
					++score;
				//g.drawString("Score: " + score, 320, 5);
				updateScore();
				//System.out.println("Updating score: " + score);
				Grid.getCell(x, y).setEaten();
			}
				
		}
		if (key == Input.KEY_RIGHT && (x+1 <= Grid.ROWS)) { // && !Grid.getCell(x+1,y).isWall()) {
			right=true;
			
			if(x+1 == Grid.ROWS)
				x = -1;
			
			//System.out.println("x now = " + x);
			
			if (!Grid.getCell(x+1, y).isWall()) {
				x = x+1;
				//right=true;
				if (!Grid.getCell(x, y).isEaten()) {
					if (x==Grid.getCell(x, y).getSpecialX() && y==Grid.getCell(x, y).getSpecialY()) 
						score = score + 5;
					else 
						++score;
					//g.drawString("Score: " + score, 320, 5);
					updateScore();
					//System.out.println("Updating score: " + score);
					Grid.getCell(x, y).setEaten();
				}
			}
		}if (key == Input.KEY_LEFT && x >=0) { //!Grid.getCell(x-1,y).isWall()) {
			left=true;

			if(x-1 < 0)
				x = Grid.ROWS;
			
			//System.out.println("x now = " + x);
			
			
			if (!Grid.getCell(x-1,y).isWall()) {
				x = x-1;
				//left=true;
				if (!Grid.getCell(x, y).isEaten()) {
					if (x==Grid.getCell(x, y).getSpecialX() && y==Grid.getCell(x, y).getSpecialY())
						score = score + 5;
					else
						++score;
					//g.drawString("Score: " + score, 320, 5);
					updateScore();
					//System.out.println("Updating score: " + score);
					Grid.getCell(x, y).setEaten();
				}

			}
		}
	}
	
	static int getY(){
		return y;
	}
	static int getX(){
		return x;
	}
	public void saveHighScore() {
		File fold=new File("res/highscore.txt");
		fold.delete();
		File fnew=new File("res/highscore.txt");
		

		try {
		    FileWriter f2 = new FileWriter(fnew, false);
		    f2.write("" + highScore);
		    f2.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}           
	}
	public boolean isDead () {
		return die;
	}
}





