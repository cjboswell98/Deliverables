import java.util.Scanner;

public class WhatToEat {
	private static Scanner sc;
	public static void main(String[] args) {
		final int NUM_UPPER_LETTERS = 1;
		final int NUM_LOWER_LETTERS = 1;
		final int MIN_LETTERS = 7;
		final int MAX_LETTERS = 12;
		
		int upperCount = 0;
		int lowerCount = 0;
		int minletterCount = 7;
		int maxletterCount = 12;
		sc = new Scanner(System.in);
		System.out.println("Enter a valid passcode: ");
		String input = sc.nextLine();
		int inputLen = input.length();
		
		for(int i=0;i<inputLen;i++){
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
		}
		if (upperCount >= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS && minletterCount == MIN_LETTERS)
			System.out.println("Password valid and accepted");
		else {
			System.out.println("Error");
			if (upperCount < NUM_UPPER_LETTERS)
				System.out.println();
			if (lowerCount < NUM_LOWER_LETTERS)
				System.out.println();
			if (minletterCount < MIN_LETTERS)
				System.out.println("Not Enough");
		}
		}
	}


