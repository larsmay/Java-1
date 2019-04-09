package inClass;

import java.util.Scanner;

public class InClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double g1, g2, g3, g4, g5, avg;
		char grade;
		//Get user inputs
		System.out.println("You will input 5 grades and I will return the grade and average");
		System.out.print("Input grade 1: ");
		g1 = input.nextDouble();
		System.out.print("Input grade 2: ");
		g2 = input.nextDouble();
		System.out.print("Input grade 3: ");
		g3 = input.nextDouble();
		System.out.print("Input grade 4: ");
		g4 = input.nextDouble();
		System.out.print("Input grade 5: ");
		g5 = input.nextDouble();
		//Call method to calculate average
		avg = calcAverage(g1, g2, g3, g4, g5);
		//Call method to determine grade
		grade = determineGrade(avg);
		//display grade
		System.out.println("Your average score is: " + avg + "\nYour grade is: "+ grade);
		input.close();
	}
	//calculate average method
	public static double calcAverage(double num1, double num2, double num3, double num4, double num5) {
		double average = (num1 + num2 + num3 + num4 + num5) / 5.0;
		return average;
	}
	//determine grade method
	public static char determineGrade(double average) {
		char ch;
		if (average >= 90)
			ch = 'A';
		else if (average >= 80)
			ch = 'B';
		else if (average >= 70)
			ch = 'C';
		else if (average >= 60)
			ch = 'D';
		else
			ch = 'F';
		return ch;
	}
}
