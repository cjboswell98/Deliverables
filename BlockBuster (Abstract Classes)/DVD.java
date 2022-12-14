
import java.util.List;
import java.util.Scanner;

public class DVD extends Movie{

	static Scanner scan = new Scanner(System.in);

	public DVD(List<String> scenes) {
		super();
	}

	public DVD(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}

	static Scanner scnr = new Scanner(System.in);

	@Override
	public void play() {
		System.out.println("");
		System.out.println("What scene of "+ title + " would you like to watch?: (0-4) ");
		System.out.println("");
		
		int input = scan.nextInt();
		System.out.println(scenes.get(input) + " is now playing...");
	}	
}
