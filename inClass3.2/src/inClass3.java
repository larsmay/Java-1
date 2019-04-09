import java.util.Scanner;

public class inClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		System.out.print("Enter an integer: ");
		num1 = input.nextInt();
		if (num1 > 99)
			System.out.println("Your number is more than 2 digits.");
		else if(num1 > 9)
			System.out.println("Your number has 2 digits.");
		else
			System.out.println("Your number has less than 2 digits.");
			

	}

}
