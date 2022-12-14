import java.util.List;
import java.util.Scanner;

public abstract class Movie {
	
	public String title;
	public int runTime;
	public List<String> scenes;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public List<String> getScenes() {
		return scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;
	}

	Scanner scnr = new Scanner(System.in);
	
	public Movie() {
	}

	public abstract void play();
	

	public String printInfo() {
		return(title + runTime);
	}
	
	public void printScenes() {
		for(int i = 0; i < getScenes().size();i++) {
			System.out.println(scenes.get(i));
    }	
	}
}
