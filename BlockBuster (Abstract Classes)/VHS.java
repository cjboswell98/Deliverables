import java.util.Scanner;

public class VHS extends Movie {

	static Scanner scan = new Scanner(System.in);
	
	public VHS(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}


	public double getCurrentTime() {
		return currentTime = getScenes().size();
	}

	public double setCurrentTime(double currentTime) {
		return this.currentTime = 0;
	}


	private double currentTime = 0;
	

	public void rewind() {
		currentTime = 0;
		System.out.println(" ");
		System.out.println("Rewiniding... ");
		System.out.println("Current Time: " + currentTime);
	}

	@Override
	public void play() {
		System.out.println("");
		System.out.println("What scene of "+ title + " would you like to watch?: (0-4) ");
		System.out.println("");
		
		int input = scan.nextInt();
		System.out.println(scenes.get(input) + " is now playing...");
		for(int currenttime = 0; currenttime < getScenes().size();currenttime++) {
			//System.out.println(scenes.get(currentTime));
			if(currenttime > scenes.size()) {
			}
			rewind();
			System.out.println("Current Time: " + currenttime);
		}
		//System.out.println("Current Time: " + currenttime);
	}
}
