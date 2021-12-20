

public class Hunter {

	private String name;
	private String color;
	private int xPos;
	private int yPos;
	

public Hunter(String Hname, String Hcolor)
{
	
	this.name = Hname;
	this.color = Hcolor;

}

public void SetxPos(int x)
{
	
	this.xPos = x;
}

public void SetyPos(int y)
{
	
	this.yPos = y;
}

public int GetxPos()
{
	
	return xPos;
}

public int GetyPos()
{
	
	return yPos;
}

	public void move(Hunter myhunter)throws SoundException
	{
		
		if(myhunter.xPos<1 || myhunter.xPos >= 250 || myhunter.yPos < 1 || myhunter.yPos >=360) 
		{ 
		    System.out.println("Hunter is moving, " + "x :" +myhunter.xPos+ " Y :" +myhunter.yPos);
				throw new SoundException("Oh oo!");	 
		}
		else 
		{
			System.out.println("Hunter is moving, X: " +myhunter.xPos + " Y :" +myhunter.yPos);
		} 
	}
	
	public void hunt(Board myboard, String dotType ) 
	{ 
		if(dotType == "superDot") 
		{ 
			System.out.println("Hunting super dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0){
				
			}
		}

		else if(dotType == "hunterdot") 
		{ 
			System.out.println("Hunting hunter dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0) {
			System.out.println("Game Over, You Win");
		}

	   }
		
	}


}
