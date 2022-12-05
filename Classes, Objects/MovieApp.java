import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	static Scanner scnr = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("");
		System.out.println("There are 10 movies in this list."); 
		getMovie();
	do {
		System.out.println(" ");
		System.out.println("Continue?: (y/n)");
		String yesNo = cont.next();
		if(yesNo.equals("y")) {
			getMovie();
		}
		if(yesNo.equals("n")){
			break;
		} 
	} while (true);
	}
	public static void getMovie() {
		Movie movie1 = new Movie("Star Wars", "scifi");
		Movie movie2 = new Movie("Free Guy", "scifi");
		Movie movie3 = new Movie("Dune", "scifi");
		Movie movie4 = new Movie("IT", "horror");
		Movie movie5 = new Movie("Paranormal Activity", "horror");
		Movie movie6 = new Movie("Toy Story", "anmiated");
		Movie movie7 = new Movie("Lightyear", "animated");
		Movie movie8 = new Movie("Luca", "anmiated");
		Movie movie9 = new Movie("Southpaw", "drama");
		Movie movie10 = new Movie("Creed", "drama");

		List<Movie> scifiMovies = new ArrayList<>();
		//two different ways to add students to list
		scifiMovies.add(movie1);
		scifiMovies.add(movie2);
		scifiMovies.add(movie3);
		
		List<Movie> horrorMovies = new ArrayList<>();
		horrorMovies.add(movie4);
		horrorMovies.add(movie5);
		
		List<Movie> animatedMovies = new ArrayList<>();
		animatedMovies.add(movie6);
		animatedMovies.add(movie7);
		animatedMovies.add(movie8);
		
		List<Movie> dramaMovies = new ArrayList<>();
		dramaMovies.add(movie9);
		dramaMovies.add(movie10);
		
		System.out.println("What category are you interested in?: ");
		String choice = scnr.nextLine();
		System.out.println(" ");
	
		if(choice.equals("scifi")) {
			System.out.println(movie1.title);
			System.out.println(movie2.title);
			System.out.println(movie3.title);
		}
		else if(choice.equals("horror")) {
			System.out.println(movie4.title);
			System.out.println(movie5.title);
		}
		else if(choice.equals("animated")) {
			System.out.println(movie6.title);
			System.out.println(movie7.title);
			System.out.println(movie8.title);
		} 
		else if(choice.equals("drama")) {
			System.out.println(movie9.title);
			System.out.println(movie10.title);
		} else {
			System.out.println("Please try again");
		}

	}

}
