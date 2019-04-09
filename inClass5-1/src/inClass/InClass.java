package inClass;
import java.util.Scanner;


public class InClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vowel;
		String str;
		Scanner input = new Scanner(System.in);
		int count = 0;
		//loop for getting 5 letter inputs
		for (int i = 1; i <= 5; i++) {
		System.out.print("Please enter a letter, we will determine if it's a vowel: ");
		str = input.next();
		//convert string to char
		char ch = str.toUpperCase().charAt(0);
		//call the check vowel function
		vowel = isVowel(ch);
		//increment the vowel counter
		if (vowel == true)
			count++;
		}
		//displays how many vowels available
		System.out.println(count + " is how many vowels input to the program.");
		input.close();
	}
	//method to check if char is a vowel
	public static boolean isVowel(char ch) {
		boolean vowel;
		if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			vowel = true;
		else
			vowel = false;
		return vowel;
	}

}


