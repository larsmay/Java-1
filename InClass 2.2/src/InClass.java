import java.util.Scanner;

public class InClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, div, rem;
		double num3, num4, div2;
		System.out.print("Input two integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		div = num1 / num2;
		rem = num1 % num2;
		System.out.println("The qoutient is: " + div + " with a remainder of: " + rem);
		System.out.print("Input two decimals: ");
		num3 = input.nextDouble();
		num4 = input.nextDouble();
		div2 = num3 / num4;
		System.out.println("The qoutient is: " + div2);

	}

}
