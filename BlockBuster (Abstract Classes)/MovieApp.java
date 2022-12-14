import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to BlockBuster Movie Application ");
		System.out.println("Please Select a Movie from the list: ");
		System.out.println(" ");

		List<Movie> movies = new ArrayList<>();
		movies.add(new DVD("Star Wars", 136));
		movies.add(new DVD("Duck Tales", 22));
		movies.add(new DVD("Avengers", 120));
		movies.add(new VHS("Private Ryan", 115));
		movies.add(new VHS("Dora", 200));
		movies.add(new VHS("Boxing", 106));

		movies.get(0).setScenes(new ArrayList<>(Arrays.asList("Once upon a time", "Vador", "Peace out", "Obi-Wan", "Lets do it")));
		movies.get(1).setScenes(new ArrayList<>(Arrays.asList("Quack", "Shotgun", "Camp", "Flyover", "Not Again")));
		movies.get(2).setScenes(new ArrayList<>(Arrays.asList("To infinty!", "End game", "Ultron", "Mighty", "Dark Lord")));
		movies.get(3).setScenes(new ArrayList<>(Arrays.asList("Frontline", "Army", "Base Camp", "Time for war", "RIP")));
		movies.get(4).setScenes(new ArrayList<>(Arrays.asList("Swiper no Swiping", "Backpack!", "Im the map", "Spanish Time", "Where's Boots?")));
		movies.get(5).setScenes(new ArrayList<>(Arrays.asList("Training Day", "Hardwork", "Promotion Day", "Weigh Ins", "Fight Night")));
		
		for (Movie s : movies) {
			System.out.println(s.title);
		}
		System.out.println(" ");
		System.out.println("Select a movie you want to watch: (0-5)");
		int input = scan.nextInt();

		System.out.println("Title: " + movies.get(input).title);
		System.out.println("Category: scifi");
		System.out.println("RunTime: " + movies.get(input).runTime +" minutes");
		System.out.println(" ");
		System.out.println("Do you want to watch " + movies.get(input).title + "? : (y/n)");
		String yesNo = cont.next();
		if (yesNo.equals("y")) {
			movies.get(input).printScenes();
			movies.get(input).play();

		}
		if (yesNo.equals("n")) {
		}

	}
}
