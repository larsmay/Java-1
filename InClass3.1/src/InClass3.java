import java.util.Scanner;

public class InClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1;
		System.out.print("Enter integer: ");
		number1 = input.nextInt();
		if (number1 == 0)
			System.out.println("Your number is zero");
		else if(number1 > 0)
			System.out.println("Your number is positive");
		else
			System.out.println("Your number is negative");

	}

}
