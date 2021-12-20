import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Hunter myhunter = new Hunter("Maha Deva", "Brown");
		Soldier threeSoldier[] = {new RedSoldier(), new RedSoldier(), new GreenSoldier};
		Board myboard = new Board("superDot", myhunter, threeSoldiers);
		
		System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");
		myhunter.setxPos(sc.nextInt());
		myhunter.setyPos(sc.nextInt());
		myhunter.move(myhunter);
		threeSoldier[2].hunt();
		
		

	}

}
