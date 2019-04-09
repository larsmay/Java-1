import java.util.Scanner; // program uses class Scanner

public class InClass {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number1, number2, number3, sum, sub;
		System.out.println("First Substraction");
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		sub = number1 - number2;
		System.out.print("Difference is " + sub + "\n");
		
		System.out.println("Now addition of 3 numbers");
		System.out.print("Enter First Integer: ");
		number1 = input.nextInt();
		System.out.print("Enter Second Integer: ");
		number2 = input.nextInt();
		System.out.print("Enter Third Integer: ");
		number3 = input.nextInt();
		sum = number1 + number2 + number3;
		System.out.print("Sum is " + sum);
	}


}
