import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10): ");
			
		names[1] = "Aubrey Graham";
		names[2] = "Luke Skywalker";
		names[3] = "Max Payne";
		names[4] = "Timmy Turner";
		names[5] = "Cedric Boswell";
		names[6] = "Maximillian Siu";
		names[7] = "Jimmy Newtron";
		names[8] = "Amanda Bledsoe";
		names[9] = "Tom Brady";
		names[10] = "Kim Drisoll";
		
		favFood[1] = "Scallops";
		favFood[2] = "Steak";
		favFood[3] = "Hamburgers";
		favFood[4] = "Hot Dogs";
		favFood[5] = "Lobster";
		favFood[6] = "Soup";
		favFood[7] = "Pie";
		favFood[8] = "Fries";
		favFood[9] = "Crabby Patties";
		favFood[10] = "Peanut Butter";
		
		hometown[1] = "Toronto";
		hometown[2] = "Polis Massa";
		hometown[3] = "New York City";
		hometown[4] = "Dimmsdale";
		hometown[5] = "Detroit";
		hometown[6] = "Austin";
		hometown[7] = "Retroville";
		hometown[8] = "Roseville";
		hometown[9] = "San Mateo";
		hometown[10] = "Michigan";
		
		for (int i = 1; i < names.length; i++) {
			System.out.println(i + ". " + names[i]);
		}
		
		int input1 = nameIn.nextInt();

		if(input1 == 1) {
			Aubrey();
		}
		if(input1 == 2) {
			Luke();
		}
		if(input1 == 3) {
			Max();
		}
		if(input1 == 4) {
			Timmy();
		}
		if(input1 == 5) {
			Ced();
		}
		if(input1 == 6) {
			Maxi();
		}
		if(input1 == 7) {
			Jimmy();
		}
		if(input1 == 8) {
			Amanda();		}
		if(input1 == 9) {
			Tom();
		}
		if(input1 == 10) {
			Kim();
		}
		else {
			System.out.println("That student does not exist.  Please try again. (enter a number 1-10): ");
		}
		}

	public static void Aubrey() {
		System.out.println("Student 1 is " + names[1] + ".  What would you like to know about Aubrey? (enter or “hometown” or “favorite food”): ");
		String input = userIn.nextLine().toLowerCase();
		if(input.contains("hometown")) {
			System.out.println("Aubrey is from " + hometown[1]);
		}
		else if(input.contains("favorite food")) {
			System.out.println("Aubrey's favorite food is " + favFood[1]);
		}
		return;
	}
	public static void Luke() {
		System.out.println("Student 2 is " + names[2] + ".  What would you like to know about Luke? (enter or “hometown” or “favorite food”): ");
		String input2 = userIn.nextLine().toLowerCase();
		if(input2.contains("hometown")) {
			System.out.println("Luke is from " + hometown[2]);
		}
		else if(input2.contains("favorite food")) {
			System.out.println("Luke's favorite food is " + favFood[2]);
		}
	}
	public static void Max() {
		System.out.println("Student 3 is " + names[3] + ".  What would you like to know about Max? (enter or “hometown” or “favorite food”): ");
		String input3 = userIn.nextLine().toLowerCase();
		if(input3.contains("hometown")) {
			System.out.println("Luke is from " + hometown[3]);
		}
		else if(input3.contains("favorite food")) {
			System.out.println("Luke's favorite food is " + favFood[3]);
		}
	}
	public static void Timmy() {
		System.out.println("Student 4 is " + names[4] + ".  What would you like to know about Timmy? (enter or “hometown” or “favorite food”): ");
		String input4 = userIn.nextLine().toLowerCase();
		if(input4.contains("hometown")) {
			System.out.println("Timmy is from " + hometown[4]);
		}
		else if(input4.contains("favorite food")) {
			System.out.println("Timmy's favorite food is " + favFood[4]);
		}
	}
	public static void Ced() {
		System.out.println("Student 5 is " + names[5] + ".  What would you like to know about Cedric? (enter or “hometown” or “favorite food”): ");
		String input5 = userIn.nextLine().toLowerCase();
		if(input5.contains("hometown")) {
			System.out.println("Ced is from " + hometown[5]);
		}
		else if(input5.contains("favorite food")) {
			System.out.println("Ced's favorite food is " + favFood[5]);
		}
	}
	public static void Maxi() {
		System.out.println("Student 6 is " + names[6] + ".  What would you like to know about Max? (enter or “hometown” or “favorite food”): ");
		String input6 = userIn.nextLine().toLowerCase();
		if(input6.contains("hometown")) {
			System.out.println("Max is from " + hometown[6]);
		}
		else if(input6.contains("favorite food")) {
			System.out.println("Max's favorite food is " + favFood[6]);
		}
	}
	public static void Jimmy() {
		System.out.println("Student 7 is " + names[7] + ".  What would you like to know about Jimmy? (enter or “hometown” or “favorite food”): ");
		String input7 = userIn.nextLine().toLowerCase();
		if(input7.contains("hometown")) {
			System.out.println("Jim is from " + hometown[7]);
		}
		else if(input7.contains("favorite food")) {
			System.out.println("Jimmy's favorite food is " + favFood[7]);
		}
	}
	public static void Amanda() {
		System.out.println("Student 8 is " + names[8] + ".  What would you like to know about Amanda? (enter or “hometown” or “favorite food”): ");
		String input8 = userIn.nextLine().toLowerCase();
		if(input8.contains("hometown")) {
			System.out.println("Amanda is from " + hometown[8]);
		}
		else if(input8.contains("favorite food")) {
			System.out.println("Amanda's favorite food is " + favFood[8]);
		}
	}
	public static void Tom() {
		System.out.println("Student 9 is " + names[9] + ".  What would you like to know about Tom? (enter or “hometown” or “favorite food”): ");
		String input9 = userIn.nextLine().toLowerCase();
		if(input9.contains("hometown")) {
			System.out.println("Tom is from " + hometown[9]);
		}
		else if(input9.contains("favorite food")) {
			System.out.println("Tom's favorite food is " + favFood[9]);
		}
	}
	public static void Kim() {
		System.out.println("Student 10 is " + names[10] + ".  What would you like to know about Kim? (enter or “hometown” or “favorite food”): ");
		String input10 = userIn.nextLine().toLowerCase();
		if(input10.contains("hometown")) {
			System.out.println("Kim is from " + hometown[10]);
		}
		else if(input10.contains("favorite food")) {
			System.out.println("Kim's favorite food is " + favFood[10]);
		}
	}
	
	
	static String[] names = new String[11];
	static String[] hometown = new String[11];
	static String[] favFood = new String[11];
	static Scanner userIn = new Scanner(System.in);
	static Scanner nameIn = new Scanner(System.in);
	int nameIn1 = names.length;
}
