package question3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Name the number you want added recursively: ");
		int x = input.nextInt();
		int added = addTheThings(x);
		System.out.println(added);
		input.close();
	}
	public static int addTheThings(int a) {;
		if (a==1) {
			return 1;
		}
		else {
			return a + addTheThings(a-1);
		}
	}
}
