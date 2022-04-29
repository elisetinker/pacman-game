package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Cell 
{
	final static int CELL_SIZE = 25;
	
	private Grid owner;
	protected int x;
	protected int y;
	protected boolean isWall;
	Pacman p;
//	Ghost g;
//	Spikeball b;
//	PowerPellet p;
	public Cell(Grid owner, int x, int y)
	{
		this.x = x;
		this.y = y;
		this.owner = owner;
	}
	
	public boolean isWall()
	{
		return isWall;
	}
	
	public void render(Graphics g)
	{
		//g.drawRect(x * CELL_SIZE, y * CELL_SIZE,  CELL_SIZE, CELL_SIZE);
		//drawing the walls 
		
		//top horizontal wall
		if(y==0) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top left wall before carve out
		if(x==0&&y<10) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE,CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top left area- top of 1st carve out 
		if(y==9&&x<5) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//left middle area- right side of 1st carve out
		if(x==5&&y>=9&&y<=13) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//left middle area - bottom side of first carve out
		if(y==13&&x<5) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//left middle area - top side of second carve out 
		if(y==15&&x<6) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//left bottom area - right side of second carve out 
		if(y>=15&&y<=19&&x==5) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//left bottom area - bottom side of second carve out
		if(y==19&&x<5) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//second long line in bottom left
		if(y>18&&x==0) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom horizontal wall 
		if(y==30) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//second long line in bottom right 
		if(y>18&&x==27) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom right area - bottom side of second carve out 
		if(y==19&&x>22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//middle right area - left side of second carve out 
		if(x==22&&y<=19&&y>=15) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//middle right area - top side of second carve out 
		if(x>22&&y==15) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top right area - bottom side of first carve out 
		if(x>22&&y==13) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top right area - left side of first carve out 
		if(x==22&&y<=13&&y>=9) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top right area - top side of first carve out 
		if(y==9&&x>22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top right area - first long line on top right
		if(x==27&&y<10) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//drawing the walls within the grid
		
		//3 by 4 top left box
		if(x>=2&&x<=5&&y>=2&&y<=4) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//3 by 5 top left box
		if(x>=7&&x<=11&&y>=2&&y<=4) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//top section left and right divider
		if(x>=13&&x<=14&&y>=1&&y<=4) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//3 by 5 top right box
		if(x>=16&&x<=20&&y>=2&&y<=4) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//3 by 4 top right box
		if(x>=22&&x<=25&&y>=2&&y<=4) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 4 top left box - second row 
		if(x>=2&&x<=5&&y>=6&&y<=7) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 8 top section-middle T-top of t
		if(x>=10&&x<=17&&y>=6&&y<=7) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//3 by 2 top section-middle t-stem of t 
		if(x>=13&&x<=14&&y>=8&&y<=10) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 4 top right box- second row
		if(x>=22&&x<=25&&y>=6&&y<=7) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//8 by 2 top section-left sided oriented with stem to the right- top of t 
		if(x>=7&&x<=8&&y>=6&&y<=13) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 3 top section-left sided oriented with stem to the right- stem of t 
		if(x>=9&&x<=11&&y>=9&&y<=10) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//8 by 2 top section-right sided oriented with stem to the left- top of t
		if(x>=19&&x<=20&&y>=6&&y<=13) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 3 top section-right sided oriented with stem to the left- stem of t 
		if(x>=16&&x<=18&&y>=9&&y<=10) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//ghost box- door side - left 
		if(x>=11&&x<=12&&y==12) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//ghost box- left side
		if(x==10&&y>=12&&y<=16) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//ghost box- bottom side
		if(x>=11&&x<=16&&y==16) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;	
		}
		//ghost box- right side 
		if(x==17&&y<=16&&y>=12) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//ghost box- door side - right 
		if(x>=15&&x<=17&&y==12) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;	
		}
		//5 by 2 bottom left box - close to left exit
		if(x>=7&&x<=8&&y>=15&&y<=19) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 8 bottom section-first middle T after ghost box-top of t
		if(x>=10&&x<=17&&y>=18&&y<=19) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//3 by 2 bottom section- first middle T after ghost box-stem of t
		if(x>=13&&x<=14&&y>=20&&y<=22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//5 by 2 bottom right box - close to right exit
		if(x>=19&&x<=20&&y>=15&&y<=19) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 2 bottom section left wall divider 
		if(x>=1&&x<=2&&y>=24&&y<=25) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//"7" oriented hook on the left bottom- 2 by 4 box- top of "7"
		if(x>=2&&x<=5&&y>=21&&y<=22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//"7" oriented hook on the left bottom- 3 by 2 box- step of "7"
		if(x>=4&&x<=5&&y>=23&&y<=25) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 5 box bottom middle on left side of t
		if(x>=7&&x<=11&&y>=21&&y<=22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 5 box bottom middle on right side of t 
		if(x>=16&&x<=20&&y>=21&&y<=22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//mirrored "7" with hook facing right on the right bottom- 2 by 4 box- top of "7"
		if(x>=22&&x<=25&&y>=21&&y<=22) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//mirrored "7" with hook facing right on the right bottom- 3 by 2 box- stem of "7"
		if(x>=22&&x<=23&&y>=22&&y<=25) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//2 by 2 bottom section right wall divider 
		if(x>=25&&x<=26&&y>=24&&y<=25) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom left upside down T- 2 by 10 box-top of t
		if(x>=2&&x<=11&&y>=27&&y<=28) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom left upside down T- 3 by 2 box- stem of t
		if(x>=7&&x<=8&&y>=24&&y<=26) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//second middle T - 2 by 8 box- top of T
		if(x>=10&&x<=17&&y>=24&&y<=25) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//second middle T - 3 by 2 box- stem of T
		if(x>=13&&x<=14&&y>=26&&y<=28) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom right upside down T- 2 by 10 box-top of t
		if(x>=16&&x<=25&&y>=27&&y<=28) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		//bottom right upside down T- 3 by 2 box- stem of t 
		if(x>=19&&x<=20&&y>=24&&y<=26) {
		g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
		isWall=true;
		}
		
	}
	
	public void update()
	{
		// not sure if you need it, but hey, it's here
		
	}
	
	public void addGhost()
	{
		
	}
	
}
