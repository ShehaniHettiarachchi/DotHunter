//IT20641238-Hettiarachchi G.D.R.S.S(Batch 3.1)

//Hunter class
public class Hunter {
	//attributes
	private String name;
	private String colour;
	private int X;
	private int Y;
	
	
	//Default constructor
	public Hunter() {
		name = null;
		colour = null;
	}

	//overloaded constructor
	public Hunter(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}
	
	//setter for x position
	public void setxPOS(int X){
		 this.X = X;
		
	}
	//setter for y position
	public void setyPOS(int Y){
		this.Y = Y;
	}
	
	//getter for y position
	public int getyPOS(int Y){
		return Y;
	}
	//getter for x position
	public int getxPOS(int X){
		return X;
	}
	
	//Hunter movement
	public void move(Hunter myhunter)throws SoundException { 
		
		if(myhunter.X<1 || myhunter.X >= 250 || myhunter.Y < 1 || myhunter.Y >=360) {
			
		System.out.println("Hunter is moving, " + "X :" +myhunter.X+ " Y :" +myhunter.Y);
		
		throw new SoundException("Oh oo!");	
		
		}
		
		else {
			
			System.out.println("Hunter is moving, X: " +myhunter.X + " Y :" +myhunter.Y);
		} 
	}	
	
	//Dot hunting method
	public void hunt(Board myboard,String dotType) {
		
		if(dotType == "superDot") {
			System.out.println("Hunting Super Dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0) {}
		}
		
		else if(dotType == "hunterdot") {
			System.out.println("Hunting Hunter Dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0) {
				System.out.println("Game Over, You Win");
			}	
		}
		
		
	}

	
	
	
}








//Board class
public class Board {
	//attributes
	private int Dot;
	private String dotType;
	private int dotCount;
	private int superDot;
	private int hunterDot;
	Hunter myhunter;
	private Soldier[] threeSoldier;
	
	
	
	//overloaded constructor
	public Board(String dotType, Hunter myhunter, Soldier[] threeSoldier) {
		this.dotType = dotType;
		this.myhunter = myhunter;
		this.threeSoldier = threeSoldier;
		this.init();
		

	}
	//setter for Dot
	public void SetDot(int Dot) { 

		this.Dot = Dot; 
	}
	//getter for Dot
	public int GetDot() {
	
		return Dot;
	}
	

	//setter for dotType
	public void setDotType(String dotType) {
		
		this.dotType = dotType;
	}
	



	//getter for dotType
	public String getDotType() {
		// TODO Auto-generated method stub
		return dotType;
	}
	//setter for superDot
	public void SetSuperDot(int superdot) 
	{

		this.superDot = superdot;
	}
	//getter for superDot
	public int GetSuperDot()
	{ 

		return 3; 
	}
	//setter for hunterDot
	public void SetHunterDot(int hunterdot)
	{ 

		this.hunterDot = hunterdot;
	}
	//getter for hunterDot
	public int getHunterDot()
	{ 

		return 97; 
	}

	//init method
	public void init() 
	{ 

		for(int Counter = 0; Counter<3; Counter++)
		{
			threeSoldier[Counter].setxPOS((int)Math.random()* 360);
			threeSoldier[Counter].setyPOS((int)Math.random()* 250); 
			
		}
		
		System.out.println("Board is Ready and there soldiers and the hunter is positioned in the board");

	}


}






//Soldier class
//Soldier class is the parent class of all the 3 soldier classes which are red soldier,green soldier and blue soldier
public abstract class  Soldier {
	private int X;
	private int Y;

	//hunting method(abstract method) which particular soldier use
	protected abstract void hunt();

	//setter for x position
	public void setxPOS(int X){
		 this.X = X;
			
	}
	//setter for y position
	public void setyPOS(int Y){
		this.Y = Y;
	}
		
	//getter for y position
	public int getyPOS(int Y){
		return Y;
	}
	//getter for x position
	public int getxPOS(int X){
		return X;
	}

	
}
	


//Red soldier class
//Red soldier inherits the soldier
public class RedSoldier extends Soldier{
	public void hunt() {
		System.out.println("Killed using hand.\nGame Over");
	}
	
}


//Green soldier class
//Green soldier inherits the soldier
public class GreenSoldier extends Soldier {
	public void hunt() {
		System.out.println("Killed using a knife.\nGame Over");
	}
	
}


//Blue soldier class
//Blue soldier inherits the soldier
public class BlueSoldier extends Soldier{
	public void hunt() {
		System.out.println("Killed using a gun.\nGame Over");
	}
	
}


//class SoundException
public class SoundException extends Exception{
	
	public SoundException(String soundMsg) {
		super(soundMsg);
	}
	
}


//Main class
import java.util.Scanner;
import java.util.Random;

public class MainApp {

	public static void main(String[] args) throws SoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hunter myhunter = new Hunter("Maha Deva","Brown");
		Soldier threeSoldiers[]= {new RedSoldier(), new BlueSoldier(), new GreenSoldier()};
		Board myboard = new Board("SuperDot", myhunter, threeSoldiers);
		
		System.out.println("Use the keyboard up,down,left,right arrow keys to move the hunter ");
		myhunter.setxPOS(sc.nextInt());
		myhunter.setyPOS(sc.nextInt());
		myhunter.move(myhunter);
		myhunter.hunt(myboard, "superDot");
		threeSoldiers[2].hunt();
		
		
	}

}

