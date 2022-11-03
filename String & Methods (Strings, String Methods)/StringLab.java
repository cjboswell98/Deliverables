import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		System.out.println("Which game would you like to play?");
		System.out.println(" ");
		System.out.println("1. Captialize?");
		System.out.println("2. Wheres Waldo?");
		System.out.println("3. First Things First? ");
		System.out.println("4. Reverse? ");
		System.out.println("5. So Long? ");
		System.out.println("6. After Math? ");
		System.out.println("7. Letterize? ");
		int userIn = forward.nextInt();
		
		if(userIn == 1) {
			capitalizeString();
		}
		else if(userIn == 2) {
			wheresWaldo();
		}
		else if(userIn == 3) {
			firstThingsFirst();
		}
		else if(userIn == 4) {
			reverse();
		}
		else if(userIn == 5) {
			soLong();
		}
		else if(userIn == 6) {
			afterMath();
		}
		else if(userIn == 7) {
			letterize(); 
		}
	}
	public static void capitalizeString() {
		System.out.println("You are playing [Capitalize]");
		System.out.println("Enter a word: ");
		String lcase = cap.nextLine().toLowerCase();
		System.out.println(lcase.substring(0,1).toUpperCase() + lcase.substring(1));
	}
	public static void wheresWaldo() {
		System.out.println("You are playing [Wheres Waldo?]");
		System.out.println("Enter a phrase: ");
		String waldo = wheresWaldo.nextLine().toLowerCase();
		System.out.println(waldo.indexOf("waldo"));
	}
	public static void firstThingsFirst() {
		System.out.println("You are playing [First Things First]");
		System.out.println("Enter the first word: ");
		String first = firstThingsFirst.nextLine();
		System.out.println("Enter the second word: ");
		String second = firstThingsFirst.nextLine();
		
		String answer = first + " " + second;
		System.out.println(answer);
	} 
	public static void reverse() {
		System.out.println("You are playing [Reverse]");
		System.out.println("Enter a word to reverse: ");
		original = reverse.nextLine();
		int len = original.length();
		for(int i = len -1; i >= 0; i--)
			rev = rev + original.charAt(i);
		System.out.println("Original String: " + original);
		System.out.println("Reversed String: " + rev);
	}
	public static void soLong() {
		System.out.println("You are playing [So Long]");
		System.out.println("Enter the first word: ");
		String first = firstThingsFirst.nextLine();
		int len1 = first.length();
		System.out.println("Enter the second word: ");
		String second = firstThingsFirst.nextLine();
		int len2 = second.length();
		if(len1 > len2) {
			System.out.println(first);
		}
		else if(len2 > len1) {
			System.out.println(second);
		}
		else if(len1 == len2) {
			System.out.println(first + " " + second);
		}
	}
	public static void afterMath() {
		System.out.println("You are playing [After Math]");
		System.out.println("Enter a sentence: ");
		String math = afterMath.nextLine().toLowerCase();
		
		if(math.contains("math")) {
			System.out.println(math.substring(math.indexOf("math")));
		}
		else {
			System.out.println("dud");
		}
	}
	public static void letterize() {
		System.out.println("You are playing [Letterize]");
		System.out.println("Enter a word: ");
		String letter = letterize.next();
		
		for(int x = 0; x < letter.length(); x++) {
			System.out.println(letter.charAt(x));
		}
	}
		
	static Scanner forward = new Scanner(System.in);
	static Scanner cap = new Scanner(System.in);
	static Scanner wheresWaldo = new Scanner(System.in);
	static Scanner firstThingsFirst = new Scanner(System.in);
	static Scanner reverse = new Scanner(System.in);
	Scanner soLong = new Scanner(System.in);
	static Scanner afterMath = new Scanner(System.in);
	static Scanner letterize = new Scanner(System.in);
	static String original;
	static String rev = ""; 
	
}
