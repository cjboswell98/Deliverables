import java.util.Scanner;
import java.util.ArrayList;

public class GeunthersMarket {

	static Scanner in = new Scanner(System.in);
	static ArrayList<String> itemsInputs = new ArrayList<String>();
	static ArrayList<Double> pricesInputs = new ArrayList<Double>();
	static Scanner scnr = new Scanner(System.in);
	static Scanner orderAgain = new Scanner(System.in);
	static String userIn;
	static String[] items = new String[]{"pomegranate", "watermelon", "cauliflower", 
			"dragonfruit", "elderberry", "raspberry", "grapefruit", "honeydew"};
	static double[] prices = new double[] {2.99, 5.59, 1.59, 2.19, 1.79,
			4.09, 1.99, 3.49};
	static int cart = -1;
	static double sum = 0;
	
	public static void main(String[] args) {

		System.out.println("Welcome to Geunthers Market!");
		System.out.println(" ");
		userInput();
	do {
		System.out.println("Would you like to order anything else? (y/n)");
		String yesNo = orderAgain.next();
		if(yesNo.equals("y")) {
			userInput();
		}
		if(yesNo.equals("n")){
			ending();
			averageCost();
			break;
		} 
	} while (true);
	}
	public static void averageCost() {
		for(int count = 0; count < pricesInputs.size(); count++) {
			sum += pricesInputs.get(count);
		}
		System.out.println(" ");
		System.out.println("Average price per item in order was $" + sum/pricesInputs.size());
	}
	public static void userInput( ) {
	
		System.out.println("Item			Price");
		System.out.println("===============================");
		System.out.println(" ");

		String list = "";
		for(int i = 0; i < items.length; i++) {
			list = list + items[i] + "\t" + "\t" + " $" + prices[i] + "\n";
		}
		System.out.println(list);
		
		int cart = -1;
		System.out.println("What item would you like to add to order?: ");
			userIn = scnr.nextLine();
			
		for(int index = 0; index < items.length; index++) {
			if(userIn.contains(items[index])) {
				pricesInputs.add(prices[index]);
				itemsInputs.add(items[index]);
				cart = index;
			}
		}
		if(cart == -1) {
			System.out.println("Sorry, we don't have those.");
		}
		else {
			System.out.println("Adding " + items[cart] + " to cart at $" + prices[cart]);
			System.out.println(" ");
			return;
		}
	}
	public static void ending() {
		
		System.out.println("Thanks for your order!");
		System.out.println(" ");
		System.out.println("Heres what you got: ");
		System.out.println(" ");
		System.out.println("Cart	");
		System.out.println("===============================");
		System.out.println(" ");
		
		for(int x = 0; x < itemsInputs.size(); x++) {
			System.out.format("%-25s $%s%n", itemsInputs.get(x), pricesInputs.get(x));
		}
	}
	}
