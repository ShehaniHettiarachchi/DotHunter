
public class Soldier {

	private int xPos;
	private int yPos;
	
	public Soldier(int x, int y) {
		
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public void SetxPos(int x) 
	{
		this.xPos = x;
		
	}
	
	public void SetyPos(int y)
	{
		this.yPos =y;
	}
	
	public int GetxPos()
	{
		return xPos;
		
	}
	
	public int GetyPos()
	{
		return yPos;
	}
	
	public void hunt() {
		
		
	}
	
	class RedSoldier extends Soldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by hand");
			System.out.println("Game over");
			
		}
	}
	
	class BlueSoldier extends Soldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by gun");
			System.out.println("Game over");
			
		}
	}
	
	class GreenSoldier extends Soldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by knife");
			System.out.println("Game over");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
