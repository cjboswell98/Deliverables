import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to my Greeter Application, please enter a greeting: ");
		
		Scanner sc = new Scanner(System.in);
		String greeting = sc.next();
		
		Greeter regGreet = new Greeter(greeting);
		System.out.println("Please enter a name:");
		String name = sc.next();
		System.out.println(regGreet.greet(name));
		
		System.out.println("Enter another greeting: ");
		greeting = sc.next();
		
		System.out.println("Enter a name: ");
		name = sc.next();
		Greeter normGreeting = new Greeter(greeting);
		LoudGreeter loudGreeting = new LoudGreeter(greeting);
		HtmlGreeter htmlGreeting = new HtmlGreeter(greeting);
		SimonGreeter simonGreeting = new SimonGreeter(greeting);
		loudGreeting.addVolume();
		System.out.println("Would you like the default HTML tag? (y/n)");
		String yn = sc.next();
		if(yn.equalsIgnoreCase("n")) {
			System.out.println("Enter your desired HTML tag");
			String tagname = sc.next();
			htmlGreeting.setTagname(tagname);
		}
		System.out.println(normGreeting.greet(name));
		System.out.println(loudGreeting.greet(name));
		System.out.println(simonGreeting.greet(name));
		System.out.println(htmlGreeting.greet(name));
	}

}
