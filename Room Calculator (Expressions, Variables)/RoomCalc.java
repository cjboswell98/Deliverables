import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoomCalc {
	public static void main (String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner YesNo = new Scanner(System.in);
		float length = 0;
		float area = 0;
		float width = 0;
		double perimeter = 0;
		//boolean notdone = true;
		//boolean isdone = false;

		System.out.print("Enter Length: ");
		float length1 = Float.parseFloat(br.readLine());

		System.out.print("Enter Width: ");
		float width1 = Float.parseFloat(br.readLine());

		area = width1 * length1;
		double lw = length1 + width1;
		perimeter = (2 * lw);
		
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		System.out.println("Continue?: ");
		String yesno = YesNo.next();
		//isdone = Boolean.parseBoolean(br.readLine());
		//notdone = Boolean.parseBoolean(br.readLine());
		if(YesNo.equals("y")) {
			System.out.print("Enter Length: ");
			float length2= Float.parseFloat(br.readLine());

			System.out.print("Enter Width: ");
			float width2 = Float.parseFloat(br.readLine());

			area = width2 * length2;
			double lw1 = length2 + width2;
			perimeter = (2 * lw1);
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
	
		}
		else if(YesNo.equals("n")) {
			
		}
		
	}
	}
