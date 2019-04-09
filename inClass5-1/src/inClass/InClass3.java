package inClass;

import java.util.Scanner;

public class InClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int conversion;
		double meters;
		//prompts user to enter meters
		System.out.print("Please enter a distance in meters: ");
		meters = input.nextDouble();
		//do while loop that runs to convert until user tells it to quit
		do {
			System.out.print("Choose between conversion options\n1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit program\nInput:");
			conversion = input.nextInt();
			if (conversion == 1)
				showKilometers(meters);
			else if (conversion == 2)
				showInches(meters);
			else if (conversion == 3)
				showInches(meters);
			else if (conversion == 4)
				System.out.println("Goodbye!");
			else
				System.out.println("Invalid Input.");	
		} while (conversion != 4);
		input.close();
	}
	
	public static void showKilometers(double meters) {
		double kilometers = meters * .001;
		System.out.print(meters + " is " + kilometers + " kilometers"); 
	}

	public static void showInches(double meters) {
		double inches = meters * 39.37;
		System.out.print(meters + " is " + inches + " inches");
	}
	
	public static void showFeet(double meters) {
		double feet = meters * 3.281;
		System.out.print(meters + " is " + feet + " feet");
	}
}
