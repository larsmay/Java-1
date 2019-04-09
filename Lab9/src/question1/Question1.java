package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Random rand = new Random();
		try {
			PrintWriter pw = new PrintWriter("./data/input.txt");
			
				for (int i = 1; i <20; i++) {
					pw.println(rand.nextInt(100));
				}
				pw.close();
			}
			catch(FileNotFoundException e){
				System.out.println(e.getMessage());			
			}
		try {
			Scanner scanner = new Scanner(new File("./data/input.txt"));
			int [] avg = new int [20];
			int sum = 0;
			for (int i = 1; i < avg.length; i++) {
				avg[i] = scanner.nextInt();
				sum = sum + avg[i];
			}
			int average = sum / avg.length;
			System.out.println("The average of the numbers in the file is: " + average);
			scanner.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());			
			}
		}
		
	}


