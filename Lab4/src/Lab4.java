import java.util.Random;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare and create variables
			int probType=0, level=0;
			int op1=0, op2=0, op3=0, correctAnswer=0, studentAnswer;
			int numCorrect = 0;
			Random random = new Random();
			Scanner input = new Scanner(System.in);
			boolean playAgain = true, value = false;
			String play;
			String [] pos = {"Correct!", "Good job!", "Wonderful!"};
			String [] neg = {"Wrong Answer!", "Nice Try!", "Try Again!"};

			// loop until student wants to end game
			do
			{
				// get level
				while (value == false) {
					System.out.print("Choose a difficulty between 1 and 3\n1: Numbers 0 through 9\n2: Numbers 0 through 99\n3: Numbers 0 through 999\nChoose: ");
					level = input.nextInt();
					if (level > 0 && level < 4) {
						value = true;
					}
					else {
						System.out.println("Your input is invalid");
					}						
				}
				value = false;
				// get problem Type
				while (value == false) {
					System.out.print("Choose the type of problem you would like\n1: Addition\n2: Average value\n3: Largest number\n4: Smallest number\nChoose: ");
					probType = input.nextInt();
					if (probType > 0 && probType < 5) {
						value = true;
					}
					else {
						System.out.println("Invalid input");
					}
				}
				// loop 10 times
				for (int i = 1; i <= 10; i++)
				{
					// generate numbers
					switch (level)
					{
					case 1:
						op1 = random.nextInt(10);
						op2 = random.nextInt(10);
						op3 = random.nextInt(10);
						break;
					case 2:
						op1 = random.nextInt(100);
						op2 = random.nextInt(100);
						op3 = random.nextInt(100);
						break;
					case 3:
						op1 = random.nextInt(1000);
						op2 = random.nextInt(1000);
						op3 = random.nextInt(1000);
						break;
					}

					// display problem, calculate the correct answer
					switch (probType)
					{
					case 1:
						correctAnswer = op1+op2+op3;
						System.out.print("What is the sum of " + op1 + " " + op2 + " "+ op3 +": ");
						break;
					case 2:
						correctAnswer = (op1+op2+op3)/3;
						System.out.print("What is the average of " + op1 + " " + op2 + " "+ op3 +": ");
						break;
					case 3:
						correctAnswer = Math.max(op1, op2);
						correctAnswer = Math.max(correctAnswer, op3);
						System.out.print("What is the largest number between " + op1 + " " + op2 + " "+ op3 +": ");
						break;
					case 4:
						correctAnswer = Math.min(op1, op2);
						correctAnswer = Math.min(correctAnswer, op3);
						System.out.print("What is the smallest number between " + op1 + " " + op2 + " "+ op3 +": ");
						break;
					}
					
					// get student answer
					studentAnswer = input.nextInt();
						
					// check answer, give feedback, update numCorrect
						if (correctAnswer == studentAnswer) {
							numCorrect++;
							int select = random.nextInt(pos.length);
							System.out.println(pos[select]);
						}
						else {
							int select = random.nextInt(neg.length);
							System.out.println(neg[select]);
						}
				}

				// display number correct
				System.out.println("You had " + numCorrect + " problems correct");
				// ask if user wants to play again
				value = false;
				while (value == false) {
					System.out.print("Do you want to play again? (yes or no): ");
					play = input.next();
					input.nextLine();
					String yes = "yes";
					String no = "no";
					play = play.toLowerCase();
					if (play.equals(yes)) {
						playAgain = true;
						value = true;
					}
					else if (play.equals(no)) {
						playAgain = false;
						value = true;
					}
					else {
						System.out.println("Incorrect input.");
					}
				}
				numCorrect = 0;
			} while (playAgain == true);
	}
}
