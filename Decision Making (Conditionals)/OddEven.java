import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Hello! What is your name?");
		String userName = scnr.nextLine();
		
		do {
			System.out.println(userName + ", enter an integer between 1 and 100: ");
			int userIn = scnr.nextInt();
	    
		    if(userIn % 2 == 0 && userIn >= 2 && userIn <= 25) {
		    	System.out.println(userName + ", " +  userIn + " is even and less than 25!");
		    }
		    else if(userIn % 2 == 0 && userIn >= 26 && userIn <= 60) {
		    	System.out.println(userName + ", this number is even Steven!");
		    }
		    else if(userIn % 2 == 0 && userIn >= 60) {
		    	System.out.println(userName + ", " + userIn + " is even..");
		    }    
	        else if(userIn % 2 == 1 && userIn >= 60){
	            System.out.println(userName + ", " + userIn + " is odd and over 60!");
	        }
	        else if(userIn % 2 == 1){
	            System.out.println(userName + ", " + userIn + " is odd..");
	        }
		} while (true);
	}

}
