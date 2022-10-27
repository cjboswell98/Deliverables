import java.util.Scanner;
import java.util.Random;

public class CoinFLipTest 
{
	
	public static void main(String[] args) 
	{
		int guess, coin, flip, hcount = 0, tcount = 0;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();	
		
		
		System.out.println("How many times do you want to flip the coin?");
		flip = scan.nextInt();
	
		if(flip < 0) 
		{
			System.out.println("Error enter a number greater than 0"); 
		}
		else 
		{
			for (int i = 0;i < flip; i++) {
				coin = rand.nextInt(2);
			
				if(coin == 0)
				{
					System.out.println("Heads");
					hcount++;
				}
				else 
				{
					System.out.println("Tails");
					tcount++;
				}
			}
			System.out.println("Heads ratio: " + hcount * 1.0 / flip);
			System.out.println("Tails ratio: " + tcount * 1.0 / flip);
		}
		
	}	}
