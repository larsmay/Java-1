package connectFour;
import java.util.Scanner;
public class ConnectFour
{
	public static void main(String args[])
	{
		// variables
		Scanner input = new Scanner(System.in);
		char[][] board = new char[7][8];
		boolean finished = false;
		boolean gameOver = false;
		char currentPlayer = 'X';
		int numMoves = 0;
		boolean changePlayer = false;
		String userChoice = "no";
		String yes = "yes";
		String no = "no";

		// loop until user wants to stop
		do
		{
			// initialize game board
			for (int r = 0; r < 7; r++)
			{
				for (int c =0; c < 8; c++)
				{
					board[r][c] = ' ';
				}
			}

			// display the board
			DisplayBoard(board);

			// loop until this game is over
			do
			{
				// get the next move for the current player
				int columnChosen = 0;
				do
				{
					do
					{
						System.out.println("Enter the column you want to place your piece.");
						columnChosen = input.nextInt();
						if (columnChosen < 1 || columnChosen > 7 || board[1][columnChosen] != ' ')
							System.out.println("Invalid Input");

					} while (columnChosen < 1 || columnChosen > 7 || board[1][columnChosen] != ' ');

					// place piece
					for (int r =6; r >=1; r--) {
						if (board[r][columnChosen] == ' '){
							board[r][columnChosen] = currentPlayer;	
							changePlayer = true;
							break;
						}
					}
				}while(!changePlayer);
				// increment number of moves
				numMoves++;
				// display the board
				DisplayBoard(board);

				// check for win
				if (CheckForWin(board))
				{
					// if winner, display congratulations and set gameOver true
					System.out.println("Congratulations you won!");
					gameOver = true;
					
				}
				else if (numMoves == 42)
				{
					// if tie, display result and set gameOver true
					System.out.print("No more moves, it's a tie!");
					gameOver = true;
				}
				else
				{
					// switch current player
					if (currentPlayer == 'X')
						currentPlayer = 'O';
					else
						currentPlayer = 'X';
				}

			} while (!gameOver);
			input.nextLine();
			do {
				System.out.println("Would you like to play again?(yes/no)");
				userChoice = input.nextLine();
				
				if (no.equalsIgnoreCase(userChoice))
				{
					System.out.println(userChoice);
					finished = true;
					break;
				}
				else if (yes.equalsIgnoreCase(userChoice))
				{
					System.out.println(userChoice);
					input.nextLine();
					finished = false;
					break;
				}
				else
				{
					System.out.println("Invalid Input");
				}
			} while (!no.equalsIgnoreCase(userChoice) || !yes.equalsIgnoreCase(userChoice));
		} while (!finished);
	}

	// this method displays the board passed in
	public static void DisplayBoard(char[][] board)
	{
		for (int r = 0; r < 7; r++)
		{
			for (int c =0; c < 8; c++)
			{
				System.out.print(board[r][c]+"|");
			}
			System.out.println();
		}
	}

	// this method determines if a game has been won
	public static boolean CheckForWin(char[][] board)
	{
		// check for horizontal
		for (int r = 1; r <= 6; r++)
		{
			for (int c = 1; c <= 4; c++)
			{
				if (board[r][c] == board[r][c+1] &&
				    board[r][c] == board[r][c+2] &&
				    board[r][c] == board[r][c+3] &&
				    board[r][c] != ' ')
				    {
						return true;
					}
			}
		}

		// check for vertical
		for (int c = 1; c <=7; c++)
		{
			for (int r = 1; r <= 3; r++)
			{				
				if (board[r][c] == board[r+1][c] &&
					board[r][c] == board[r+2][c] &&
					board[r][c] == board[r+3][c] &&
					board[r][c] != ' ')
					{
						return true;
					}
			}
		}

		// check for diagonal up

		for (int c = 1; c <=4; c++)
		{
			for (int r = 1; r <= 3; r++)
			{				
				if (board[r+3][c] == board[r+2][c+1] &&
					board[r+3][c] == board[r+1][c+2] &&
					board[r+3][c] == board[r][c+3] &&
					board[r+3][c] != ' ')
					{
						return true;
					}
			}
		}

		// check for diagonal down
		
		for (int c = 1; c <=4; c++)
		{
			for (int r = 1; r <= 3; r++)
			{				
				if (board[r][c] == board[r+1][c+1] &&
					board[r][c] == board[r+2][c+2] &&
					board[r][c] == board[r+3][c+3] &&
					board[r][c] != ' ')
					{
						return true;
					}
			}
		}
		return false;
	}
}

