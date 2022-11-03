import java.util.Scanner;
import java.util.Random;

public class DiceRollerLab {

	public static void main(String[] args) {
		Scanner rollAgain = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println(" ");
		System.out.println("How many sides should each die have? ");
		generateRandomDieRoll();
		
		System.out.println("Roll Again? (y/n)");
		String yesno = rollAgain.next();
	
		if(yesno.equals("y")) {
			System.out.println("How many sides are your di?");
			generateRandomDieRoll();
		}
		else if (yesno.equals("n")){	
		}
	}
	public static void generateRandomDieRoll() {
		Scanner sides = new Scanner(System.in);
		Random ran = new Random();
		
		int number;
		
		for(int i = 1; i <= 20; i++) {
			number = sides.nextInt();
			System.out.println(ran.nextInt(number + i++));
			System.out.println(ran.nextInt(number + i++));
			break;
		}
	}
}
