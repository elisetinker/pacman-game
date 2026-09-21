package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Cell 
{
	final static int CELL_SIZE = 25;
	
	private Grid owner;
	private Graphics g = null;
	protected int x;
	protected int y;
	protected boolean isWall=false;
	protected boolean isEaten = false;
	private int randomMin = 1;
	private int randomMax = 4;
	private int count = 0; 
	static boolean setSpecial = false;
	static int setSpecialX;
	static int setSpecialY;
	public static boolean eatenAll;
	protected boolean eatRow1;
	protected boolean eatRow2;
	protected boolean eatRow3;
	protected boolean eatRow4;
	protected boolean eatRow5;
	protected boolean eatRow6;
	protected boolean eatRow7;
	protected boolean eatRow8;
	protected boolean eatRow9;
	protected boolean eatRow10;
	protected boolean eatRow11;
	protected boolean eatRow12;
	protected boolean eatRow13;
	protected boolean eatRow14;
	protected boolean eatRow15;
	protected boolean eatRow16;
	protected boolean eatRow17;
	protected boolean eatRow18;
	protected boolean eatRow19;
	protected boolean eatRow20;
	protected boolean eatRow21;
	protected boolean eatRow22;
	protected boolean eatRow23;
	protected boolean eatRow24;
	protected boolean eatRow25;
	protected boolean eatRow26;
	protected boolean eatRow27;
	protected boolean eatRow28;
	protected boolean eatRow29;
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
	public boolean isEaten() {
		return isEaten;
	}
	public void setEaten ()
	{
		isEaten = true;
		//g.drawImage(Images.newPoints, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		if (x==setSpecialX && y==setSpecialY) {
			setSpecial = false;
		}

		g.fillRect((x*CELL_SIZE),  (y*CELL_SIZE), 0, 0);
		//g.drawImage(Images.newPoints, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
		//render (g);		
	}
	
	
	public int getSpecialX() {
		return setSpecialX;
	}
	
	public int getSpecialY() {
		return setSpecialY;
	}
	
	public boolean eatenAll() {
		
		return eatenAll = false;
		
	}
			
	public void render(Graphics g)
	{
		int randomInt;
		++count;
		//System.out.println("Count = " + count + "    setSpecial = " + setSpecial + "   setSpecialX= "+ setSpecialX + "   setSpecialY = " + setSpecialY);
		
		if (this.g == null)
			this.g = g;
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
if(isWall == false ) {
			
			if ( ((y>9 && y<13) && (x<5 || x>22)) || ((y>15 && y<19) && (x<5 || x>22)) )
				g.fillRect((x*CELL_SIZE),  (y*CELL_SIZE), 0, 0);
			//g.drawImage(Images.newPoints, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
			else {	
				if (isEaten == false) {
					if ((x==1 && y==1) || (x==26 && y==1) || (x==1 && y==29) || (x==26 && y==29)) {
						g.drawImage(Images.newPowerCookieScaled, (x * CELL_SIZE)+5,( y * CELL_SIZE)+5);
						//corner points i believe??
						
					}
					else if ((x==13 && y==5) || (x==6 && y==14) || (x==22 && y==14) || (x==13 && y==29)){
						
						 if (count == 200 && setSpecial == false) {
							 randomInt = (int)Math.floor(Math.random()*(randomMax-randomMin+1)+randomMin); 
							 //note: here is where it checks and places the fruits after a certain amount of time
							 if (randomInt == 1) {
								 g.drawImage(Images.cherryScaled, (13 * CELL_SIZE)+5,( 5 * CELL_SIZE)+5);
								 setSpecial = true;
								 setSpecialX = 13;
								 setSpecialY = 5;
							 }
							 else if (randomInt == 2) {
								 g.drawImage(Images.cherryScaled, (6 * CELL_SIZE)+5,( 14 * CELL_SIZE)+5);
								 setSpecial = true;
								 setSpecialX = 6;
								 setSpecialY = 14;
							 }
							 else if (randomInt == 3) {
								 g.drawImage(Images.cherryScaled, (22 * CELL_SIZE)+5,( 14 * CELL_SIZE)+5);
								 setSpecial = true;
								 setSpecialX = 22;
								 setSpecialY = 14;
							 }
							 else {
								 g.drawImage(Images.cherryScaled, (13 * CELL_SIZE)+5,( 29 * CELL_SIZE)+5);
								 setSpecial = true;
								 setSpecialX = 13;
								 setSpecialY = 29;
							 }
						 } else if (setSpecial == true) {
							 if (!Grid.getCell(13, 5).isEaten())
								 g.drawImage(Images.newPoints, (13 * Cell.CELL_SIZE)+5, (5 * Cell.CELL_SIZE)+5);
							 if (!Grid.getCell(6, 14).isEaten())
								 g.drawImage(Images.newPoints, (6 * Cell.CELL_SIZE)+5, (14 * Cell.CELL_SIZE)+5);
							 if (!Grid.getCell(13, 29).isEaten())
								 g.drawImage(Images.newPoints, (13 * Cell.CELL_SIZE)+5, (29 * Cell.CELL_SIZE)+5);
							 if (!Grid.getCell(22, 14).isEaten())
								 g.drawImage(Images.newPoints, (22 * Cell.CELL_SIZE)+5, (14 * Cell.CELL_SIZE)+5);
							// g.fillRect((13*CELL_SIZE)+10,  (5*CELL_SIZE) + 10, 5, 5);
							// g.fillRect((6*CELL_SIZE)+10,  (14*CELL_SIZE) + 10, 5, 5);
							// g.fillRect((13*CELL_SIZE)+10,  (29*CELL_SIZE) + 10, 5, 5);
							// g.fillRect((22*CELL_SIZE)+10,  (14*CELL_SIZE) + 10, 5, 5);
							 g.drawImage(Images.cherryScaled,  (setSpecialX*CELL_SIZE)+5,(setSpecialY*CELL_SIZE)+5);
						 } else
							
							// g.fillRect((x*CELL_SIZE)+10,  (y*CELL_SIZE) + 10, 5, 5);
							 g.drawImage(Images.newPoints, (x * Cell.CELL_SIZE)+5, (y * Cell.CELL_SIZE)+5);
						
					}
					else
						g.drawImage(Images.newPoints, (x * Cell.CELL_SIZE)+5, (y * Cell.CELL_SIZE)+5);
						//g.fillRect((x*CELL_SIZE)+10,  (y*CELL_SIZE) + 10, 5, 5);
				}
				else
					//g.drawImage(Images.newPoints, x * Cell.CELL_SIZE, y * Cell.CELL_SIZE);
					g.fillRect(x*CELL_SIZE,  y*CELL_SIZE, 0, 0);
			}
		
			
		}
		}
	
	
	
	public void update()
	{
		// not sure if you need it, but hey, it's here
		//i know this is ugly code sorryyy
		//ROW 1 EAT CHECK
		if(Grid.getCell(1,1).isEaten()) {
			if(Grid.getCell(2,1).isEaten()) {
				if(Grid.getCell(3,1).isEaten()) {
					if(Grid.getCell(4,1).isEaten()) {
						if(Grid.getCell(5,1).isEaten()) {
							if(Grid.getCell(6,1).isEaten()) {
								if(Grid.getCell(7,1).isEaten()) {
									if(Grid.getCell(8,1).isEaten()) {
										if(Grid.getCell(9,1).isEaten()) {
											if(Grid.getCell(10,1).isEaten()) {
												if(Grid.getCell(11,1).isEaten()) {
													if(Grid.getCell(12,1).isEaten()) {
														if(Grid.getCell(15,1).isEaten()) {
															if(Grid.getCell(16,1).isEaten()) {
																if(Grid.getCell(17,1).isEaten()) {
																	if(Grid.getCell(18,1).isEaten()) {
																		if(Grid.getCell(19,1).isEaten()) {
																			if(Grid.getCell(20,1).isEaten()) {
																				if(Grid.getCell(21,1).isEaten()) {
																					if(Grid.getCell(22,1).isEaten()) {
																						if(Grid.getCell(23,1).isEaten()) {
																							if(Grid.getCell(24,1).isEaten()) {
																								if(Grid.getCell(25,1).isEaten()) {
																									if(Grid.getCell(26,1).isEaten()) {
																										eatRow1=true;
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						
					}
					
				}
				
			}
			
		}
		//ROW 2 EAT CHECK
		if(Grid.getCell(1,2).isEaten()) {
			if(Grid.getCell(6,2).isEaten()) {
				if(Grid.getCell(12,2).isEaten()) {
					if(Grid.getCell(15,2).isEaten()) {
						if(Grid.getCell(21,2).isEaten()) {
							if(Grid.getCell(26,2).isEaten()) {
								eatRow2=true;
							}
						}
					}
				}
			}
		}
		//ROW 3 EAT CHECK
		if(Grid.getCell(1,3).isEaten()) {
			if(Grid.getCell(6,3).isEaten()) {
				if(Grid.getCell(12,3).isEaten()) {
					if(Grid.getCell(15,3).isEaten()) {
						if(Grid.getCell(21,3).isEaten()) {
							if(Grid.getCell(26,3).isEaten()) {
								eatRow3=true;
							}
						}
					}
				}
			}
		}
		// ROW 4 EAT CHECK
		if(Grid.getCell(1,4).isEaten()) {
			if(Grid.getCell(6,4).isEaten()) {
				if(Grid.getCell(12,4).isEaten()) {
					if(Grid.getCell(15,4).isEaten()) {
						if(Grid.getCell(21,4).isEaten()) {
							if(Grid.getCell(26,4).isEaten()) {
								eatRow4=true;
							}
						}
					}
				}
			}
		}
		//ROW 5 EAT CHECK
		if(Grid.getCell(1,5).isEaten()) {
			if(Grid.getCell(2,5).isEaten()) {
				if(Grid.getCell(3,5).isEaten()) {
					if(Grid.getCell(4,5).isEaten()) {
						if(Grid.getCell(5,5).isEaten()) {
							if(Grid.getCell(6,5).isEaten()) {
								if(Grid.getCell(7,5).isEaten()) {
									if(Grid.getCell(8,5).isEaten()) {
										if(Grid.getCell(9,5).isEaten()) {
											if(Grid.getCell(10,5).isEaten()) {
												if(Grid.getCell(11,5).isEaten()) {
													if(Grid.getCell(12,5).isEaten()) {
														if(Grid.getCell(13,5).isEaten()) {
															if(Grid.getCell(14,5).isEaten()) {
																if(Grid.getCell(15,5).isEaten()) {
																	if(Grid.getCell(16,5).isEaten()) {
																		if(Grid.getCell(17,5).isEaten()) {
																			if(Grid.getCell(18,5).isEaten()) {
																				if(Grid.getCell(19,5).isEaten()) {
																					if(Grid.getCell(20,5).isEaten()) {
																						if(Grid.getCell(21,5).isEaten()) {
																							if(Grid.getCell(22,5).isEaten()) {
																								if(Grid.getCell(23,5).isEaten()) {
																									if(Grid.getCell(24,5).isEaten()) {
																										if(Grid.getCell(25,5).isEaten()) {
																											if(Grid.getCell(26,5).isEaten()) {
																												eatRow5=true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 6 EAT CHECK
		if(Grid.getCell(1,6).isEaten()) {
			if(Grid.getCell(6,6).isEaten()) {
				if(Grid.getCell(9,6).isEaten()) {
					if(Grid.getCell(18,6).isEaten()) {
						if(Grid.getCell(21,6).isEaten()) {
							if(Grid.getCell(26,6).isEaten()) {
								eatRow6=true;
							}
						}
					}
				}
			}
		}
		//ROW 7 EAT CHECK
		if(Grid.getCell(1,7).isEaten()) {
			if(Grid.getCell(6,7).isEaten()) {
				if(Grid.getCell(9,7).isEaten()) {
					if(Grid.getCell(18,7).isEaten()) {
						if(Grid.getCell(21,7).isEaten()) {
							if(Grid.getCell(26,7).isEaten()) {
								eatRow7=true;
							}
						}
					}
				}
			}
		}
		//ROW 8 EAT CHECK
		if(Grid.getCell(1,8).isEaten()) {
			if(Grid.getCell(2,8).isEaten()) {
				if(Grid.getCell(3,8).isEaten()) {
					if(Grid.getCell(4,8).isEaten()) {
						if(Grid.getCell(5,8).isEaten()) {
							if(Grid.getCell(6,8).isEaten()) {
								if(Grid.getCell(9,8).isEaten()) {
									if(Grid.getCell(10,8).isEaten()) {
										if(Grid.getCell(11,8).isEaten()) {
											if(Grid.getCell(12,8).isEaten()) {
												if(Grid.getCell(15,8).isEaten()) {
													if(Grid.getCell(16,8).isEaten()) {
														if(Grid.getCell(17,8).isEaten()) {
															if(Grid.getCell(18,8).isEaten()) {
																if(Grid.getCell(21,8).isEaten()) {
																	if(Grid.getCell(22,8).isEaten()) {
																		if(Grid.getCell(23,8).isEaten()) {
																			if(Grid.getCell(24,8).isEaten()) {
																				if(Grid.getCell(25,8).isEaten()) {
																					if(Grid.getCell(26,8).isEaten()) {
																						eatRow8=true;
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 9 EAT CHECK
		if(Grid.getCell(6,9).isEaten()) {
			if(Grid.getCell(12,9).isEaten()) {
				if(Grid.getCell(15,9).isEaten()) {
					if(Grid.getCell(21,9).isEaten()) {
						eatRow9=true;
					}
				}
			}
		}
		//ROW 10 EAT CHECK
		if(Grid.getCell(6,10).isEaten()) {
			if(Grid.getCell(12,10).isEaten()) {
				if(Grid.getCell(15,10).isEaten()) {
					if(Grid.getCell(21,10).isEaten()) {
						eatRow10=true;
					}
				}
			}
		}
		//ROW 11 EAT CHECK
		if(Grid.getCell(6,11).isEaten()) {
			if(Grid.getCell(9,11).isEaten()) {
				if(Grid.getCell(10,11).isEaten()) {
					if(Grid.getCell(11,11).isEaten()) {
						if(Grid.getCell(12,11).isEaten()) {
							if(Grid.getCell(13,11).isEaten()) {
								if(Grid.getCell(14,11).isEaten()) {
									if(Grid.getCell(15,11).isEaten()) {
										if(Grid.getCell(16,11).isEaten()) {
											if(Grid.getCell(17,11).isEaten()) {
												if(Grid.getCell(18,11).isEaten()) {
													if(Grid.getCell(21,11).isEaten()) {
														eatRow11=true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 12 EAT CHECK
		if(Grid.getCell(6,12).isEaten()) {
			if(Grid.getCell(9,12).isEaten()) {
				if(Grid.getCell(18,12).isEaten()) {
					if(Grid.getCell(21,12).isEaten()) {
						eatRow12=true;
					}
				}
			}
		}
		//ROW 13 EAT CHECK
		if(Grid.getCell(6,13).isEaten()) {
			if(Grid.getCell(9,13).isEaten()) {
				if(Grid.getCell(18,13).isEaten()) {
					if(Grid.getCell(21,13).isEaten()) {
						eatRow13=true;
					}
				}
			}
		}
		//ROW 14 EAT CHECK
		if(Grid.getCell(0,14).isEaten()) {
			if(Grid.getCell(1,14).isEaten()) {
				if(Grid.getCell(2,14).isEaten()) {
					if(Grid.getCell(3,14).isEaten()) {
						if(Grid.getCell(4,14).isEaten()) {
							if(Grid.getCell(5,14).isEaten()) {
								if(Grid.getCell(6,14).isEaten()) {
									if(Grid.getCell(7,14).isEaten()) {
										if(Grid.getCell(8,14).isEaten()) {
											if(Grid.getCell(9,14).isEaten()) {
												if(Grid.getCell(18,14).isEaten()) {
													if(Grid.getCell(19,14).isEaten()) {
														if(Grid.getCell(20,14).isEaten()) {
															if(Grid.getCell(21,14).isEaten()) {
																if(Grid.getCell(22,14).isEaten()) {
																	if(Grid.getCell(23,14).isEaten()) {
																		if(Grid.getCell(24,14).isEaten()) {
																			if(Grid.getCell(25,14).isEaten()) {
																				if(Grid.getCell(26,14).isEaten()) {
																					if(Grid.getCell(27,14).isEaten()) {
																						eatRow14=true;
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 15 EAT CHECK
		if(Grid.getCell(6,15).isEaten()) {
			if(Grid.getCell(9,15).isEaten()) {
				if(Grid.getCell(18,15).isEaten()) {
					if(Grid.getCell(21,15).isEaten()) {
						eatRow15=true;
					}
				}
			}
		}
		//ROW 16 EAT CHECK
		if(Grid.getCell(6,16).isEaten()) {
			if(Grid.getCell(9,16).isEaten()) {
				if(Grid.getCell(18,16).isEaten()) {
					if(Grid.getCell(21,16).isEaten()) {
						eatRow16=true;
					}
				}
			}
		}
		//ROW 17 EAT CHECK
		if(Grid.getCell(6,17).isEaten()) {
			if(Grid.getCell(9,17).isEaten()) {
				if(Grid.getCell(10,17).isEaten()) {
					if(Grid.getCell(11,17).isEaten()) {
						if(Grid.getCell(12,17).isEaten()) {
							if(Grid.getCell(13,17).isEaten()) {
								if(Grid.getCell(14,17).isEaten()) {
									if(Grid.getCell(15,17).isEaten()) {
										if(Grid.getCell(16,17).isEaten()) {
											if(Grid.getCell(17,17).isEaten()) {
												if(Grid.getCell(18,17).isEaten()) {
													if(Grid.getCell(21,17).isEaten()) {
														eatRow17=true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 18 EAT CHECK
		if(Grid.getCell(6,18).isEaten()) {
			if(Grid.getCell(9,18).isEaten()) {
				if(Grid.getCell(18,18).isEaten()) {
					if(Grid.getCell(21,18).isEaten()) {
						eatRow18=true;
					}
				}
			}
		}
		//ROW 19 EAT CHECK
		if(Grid.getCell(6,19).isEaten()) {
			if(Grid.getCell(9,19).isEaten()) {
				if(Grid.getCell(18,19).isEaten()) {
					if(Grid.getCell(21,19).isEaten()) {
						eatRow19=true;
					}
				}
			}
		}
		//ROW 20 EAT CHECK
		if(Grid.getCell(1,20).isEaten()) {
			if(Grid.getCell(2,20).isEaten()) {
				if(Grid.getCell(3,20).isEaten()) {
					if(Grid.getCell(4,20).isEaten()) {
						if(Grid.getCell(5,20).isEaten()) {
							if(Grid.getCell(6,20).isEaten()) {
								if(Grid.getCell(7,20).isEaten()) {
									if(Grid.getCell(8,20).isEaten()) {
										if(Grid.getCell(9,20).isEaten()) {
											if(Grid.getCell(10,20).isEaten()) {
												if(Grid.getCell(11,20).isEaten()) {
													if(Grid.getCell(12,20).isEaten()) {
														if(Grid.getCell(15,20).isEaten()) {
															if(Grid.getCell(16,20).isEaten()) {
																if(Grid.getCell(17,20).isEaten()) {
																	if(Grid.getCell(18,20).isEaten()) {
																		if(Grid.getCell(19,20).isEaten()) {
																			if(Grid.getCell(20,20).isEaten()) {
																				if(Grid.getCell(21,20).isEaten()) {
																					if(Grid.getCell(22,20).isEaten()) {
																						if(Grid.getCell(23,20).isEaten()) {
																							if(Grid.getCell(24,20).isEaten()) {
																								if(Grid.getCell(25,20).isEaten()) {
																									if(Grid.getCell(26,20).isEaten()) {
																										eatRow20=true;
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 21 EAT CHECK
		if(Grid.getCell(1,21).isEaten()) {
			if(Grid.getCell(6,21).isEaten()) {
				if(Grid.getCell(12,21).isEaten()) {
					if(Grid.getCell(15,21).isEaten()) {
						if(Grid.getCell(21,21).isEaten()) {
							if(Grid.getCell(26,21).isEaten()) {
								eatRow21=true;
							}
						}
					}
				}
			}
		}
		//ROW 22 EAT CHECK
		if(Grid.getCell(1,22).isEaten()) {
			if(Grid.getCell(6,22).isEaten()) {
				if(Grid.getCell(12,22).isEaten()) {
					if(Grid.getCell(15,22).isEaten()) {
						if(Grid.getCell(21,22).isEaten()) {
							if(Grid.getCell(26,22).isEaten()) {
								eatRow22=true;
							}
						}
					}
				}
			}
		}
		//ROW 23 EAT CHECK
		if(Grid.getCell(1,23).isEaten()) {
			if(Grid.getCell(2,23).isEaten()) {
				if(Grid.getCell(3,23).isEaten()) {
					if(Grid.getCell(6,23).isEaten()) {
						if(Grid.getCell(7,23).isEaten()) {
							if(Grid.getCell(8,23).isEaten()) {
								if(Grid.getCell(9,23).isEaten()) {
									if(Grid.getCell(10,23).isEaten()) {
										if(Grid.getCell(11,23).isEaten()) {
											if(Grid.getCell(12,23).isEaten()) {
												if(Grid.getCell(13,23).isEaten()) {
													if(Grid.getCell(14,23).isEaten()) {
														if(Grid.getCell(15,23).isEaten()) {
															if(Grid.getCell(16,23).isEaten()) {
																if(Grid.getCell(17,23).isEaten()) {
																	if(Grid.getCell(18,23).isEaten()) {
																		if(Grid.getCell(19,23).isEaten()) {
																			if(Grid.getCell(20,23).isEaten()) {
																				if(Grid.getCell(21,23).isEaten()) {
																					if(Grid.getCell(24,23).isEaten()) {
																						if(Grid.getCell(25,23).isEaten()) {
																							if(Grid.getCell(26,23).isEaten()) {
																								eatRow23=true;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 24 EAT CHECK
		if(Grid.getCell(3,24).isEaten()) {
			if(Grid.getCell(6,24).isEaten()) {
				if(Grid.getCell(9,24).isEaten()) {
					if(Grid.getCell(18,24).isEaten()) {
						if(Grid.getCell(21,24).isEaten()) {
							if(Grid.getCell(24,24).isEaten()) {
								eatRow24=true;
							}
						}
					}
				}
			}
		}
		//ROW 25 EAT CHECK
		if(Grid.getCell(3,25).isEaten()) {
			if(Grid.getCell(6,25).isEaten()) {
				if(Grid.getCell(9,25).isEaten()) {
					if(Grid.getCell(18,25).isEaten()) {
						if(Grid.getCell(21,25).isEaten()) {
							if(Grid.getCell(24,25).isEaten()) {
								eatRow25=true;
							}
						}
					}
				}
			}
		}
		//ROW 26 EAT CHECK
		if(Grid.getCell(1,26).isEaten()) {
			if(Grid.getCell(2,26).isEaten()) {
				if(Grid.getCell(3,26).isEaten()) {
					if(Grid.getCell(4,26).isEaten()) {
						if(Grid.getCell(5,26).isEaten()) {
							if(Grid.getCell(6,26).isEaten()) {
								if(Grid.getCell(9,26).isEaten()) {
									if(Grid.getCell(10,26).isEaten()) {
										if(Grid.getCell(11,26).isEaten()) {
											if(Grid.getCell(12,26).isEaten()) {
												if(Grid.getCell(15,26).isEaten()) {
													if(Grid.getCell(16,26).isEaten()) {
														if(Grid.getCell(17,26).isEaten()) {
															if(Grid.getCell(18,26).isEaten()) {
																if(Grid.getCell(21,26).isEaten()) {
																	if(Grid.getCell(22,26).isEaten()) {
																		if(Grid.getCell(23,26).isEaten()) {
																			if(Grid.getCell(24,26).isEaten()) {
																				if(Grid.getCell(25,26).isEaten()) {
																					if(Grid.getCell(26,26).isEaten()) {
																						eatRow26=true;
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//ROW 27 EAT CHECK
		if(Grid.getCell(1,27).isEaten()) {
			if(Grid.getCell(12,27).isEaten()) {
				if(Grid.getCell(15,27).isEaten()) {
					if(Grid.getCell(26,27).isEaten()) {
						eatRow27=true;
					}
				}
			}
		}
		//ROW 28 EAT CHECK
		if(Grid.getCell(1,28).isEaten()) {
			if(Grid.getCell(12,28).isEaten()) {
				if(Grid.getCell(15,28).isEaten()) {
					if(Grid.getCell(26,28).isEaten()) {
						eatRow28=true;
					}
				}
			}
		}
		//ROW 29 EAT CHECK
		if(Grid.getCell(1,29).isEaten()) {
			if(Grid.getCell(2,29).isEaten()) {
				if(Grid.getCell(3,29).isEaten()) {
					if(Grid.getCell(4,29).isEaten()) {
						if(Grid.getCell(5,29).isEaten()) {
							if(Grid.getCell(6,29).isEaten()) {
								if(Grid.getCell(7,29).isEaten()) {
									if(Grid.getCell(8,29).isEaten()) {
										if(Grid.getCell(9,29).isEaten()) {
											if(Grid.getCell(10,29).isEaten()) {
												if(Grid.getCell(11,29).isEaten()) {
													if(Grid.getCell(12,29).isEaten()) {
														if(Grid.getCell(13,29).isEaten()) {
															if(Grid.getCell(14,29).isEaten()) {
																if(Grid.getCell(15,29).isEaten()) {
																	if(Grid.getCell(16,29).isEaten()) {
																		if(Grid.getCell(17,29).isEaten()) {
																			if(Grid.getCell(18,29).isEaten()) {
																				if(Grid.getCell(19,29).isEaten()) {
																					if(Grid.getCell(20,29).isEaten()) {
																						if(Grid.getCell(21,29).isEaten()) {
																							if(Grid.getCell(22,29).isEaten()) {
																								if(Grid.getCell(23,29).isEaten()) {
																									if(Grid.getCell(24,29).isEaten()) {
																										if(Grid.getCell(25,29).isEaten()) {
																											if(Grid.getCell(26,29).isEaten()) {
																												eatRow29=true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						
					}
					
				}
				
			}
			
		}
		if(eatRow1&&eatRow2&&eatRow3&&eatRow4&&eatRow5&&eatRow6&&eatRow7&&eatRow8&&eatRow9&&eatRow10&&eatRow11&&eatRow12&&eatRow13&&eatRow14&&eatRow15&&eatRow16&&eatRow17&&eatRow18&&eatRow19&&eatRow20&&eatRow21&&eatRow22&&eatRow23&&eatRow24&&eatRow25&&eatRow25&&eatRow26&&eatRow27&&eatRow28&&eatRow29) {
			
			eatenAll=true;
		}
	}
	
	public void addGhost()
	{
		
	}
	
}
