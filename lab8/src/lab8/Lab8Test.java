package lab8;
import java.util.Scanner;

public class Lab8Test
{
	public static void main(String args[])
	{
		// DATA
		Shape[] shapes = new Shape[10];
		int nextIDNumber = 1;
		boolean exit = false;
		int selection;
		Scanner input = new Scanner(System.in);
		int id;
		int x, y;
		double base, height, radius;
		boolean found = false;
		double sf = 0;

		// ALGORITHM
		// loop until user exits
		do
		{
			// display menu
			System.out.println("1 Add a new circle");
			System.out.println("2 Add a new rectangle");
			System.out.println("3 Add a new right triangle");
			System.out.println("4 Delete a shape");
			System.out.println("5 Delete all shape");
			System.out.println("6 Display all shapes");
			System.out.println("7 Move a shape");
			System.out.println("8 Enter a scale factor");
			System.out.println("9 Scale all shapes");
			System.out.println("10 Exit program");

			// get user choice
			selection = input.nextInt();
			while (selection < 1 || selection > 10)
			{
				System.out.println("Please enter valid choice");
				selection = input.nextInt();
			}

			// switch on selection
			switch(selection)
			{
			case 1:
				// ADD NEW CIRCLE
				// get size from user (one variable)
				System.out.print("Please enter the circle radius: ");
				radius = input.nextDouble();
				while (radius <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					radius = input.nextDouble();
				}
				// get location from user (two variables)
				System.out.print("\nEnter a X Location: ");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}
				System.out.print("\nEnter a Y Location: ");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}

				// set found to false
				
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new Circle object and assign to current array element
						shapes[i] = new Circle( x, y, nextIDNumber++, radius);

						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}
				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;
			case 2:
				// ADD NEW RECTANGLE
				// get size from user (two variables)
				System.out.println("Enter the length");
				base = input.nextDouble();
				while (base <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					base = input.nextDouble();
				}

				System.out.println("Enter the width");
				height = input.nextDouble();
				while (height <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					height = input.nextDouble();
				}

				// get location from user (two variables)
				System.out.println("Enter X location");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}

				System.out.println("Enter Y location");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}

				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new RightTriangle object and assign to current array element
						shapes[i] = new Rectangle( x, y, nextIDNumber++, base, height);

						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;
			case 3:
				// ADD NEW RIGHT TRIANGLE
				// get size from user (two variables)
				System.out.println("Enter the base");
				base = input.nextDouble();
				while (base <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					base = input.nextDouble();
				}

				System.out.println("Enter the height");
				height = input.nextDouble();
				while (height <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					height = input.nextDouble();
				}

				// get location from user (two variables)
				System.out.println("Enter X location");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}

				System.out.println("Enter Y location");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}

				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new RightTriangle object and assign to current array element
						shapes[i] = new RightTriangle( x, y, nextIDNumber++, base, height);

						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;

			case 4:
				// DELETE ONE SHAPE
				// get id number to delete
				System.out.print("Please enter the shape id number: ");
				id = input.nextInt();

				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					if (shapes[i] == null)
					{
						if (shapes[i] != null && shapes[i].getID() == id)
						{
							// delete object
							shapes[i] = null;

							// set found to true
							found = true;
							// break out of loop
							break;
						}
						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found) {
					System.out.println("This shape does not exist");
				}

				// break out of switch statement
				break;

			case 5:
				// DELETE ALL SHAPES
				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is a valid object
					if (shapes[i] != null)
					{
						// delete object
						shapes[i] = null;

					}
				}
					
				// break out of switch statement
				break;

			case 6:
				// DISPLAY ALL SHAPES
				// print header
				System.out.println("Here are our shapes");

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is a valid object
					if (shapes[i] != null)
					{
						System.out.print("Shape ID: "+ shapes[i].getID());
						System.out.println("      Shape type: " + shapes[i].getType());
						System.out.print("X Location: " + shapes[i].getXLoc());
						System.out.println("      Y Location: " + shapes[i].getYLoc());
						System.out.print("Perimeter: " + shapes[i].GetPerimeter());
						System.out.println("      Area: " + shapes[i].GetArea());
						if (shapes[i] instanceof RightTriangle)
						{
							System.out.print("Triangle Base: " + ((RightTriangle) shapes[i]).GetBase());
							System.out.print("   ||Triangle Height: " + ((RightTriangle) shapes[i]).GetHeight());
							System.out.println("   ||Triangle Hypotenuse: " + ((RightTriangle) shapes[i]).GetHypotenuse());
							System.out.println();
						}
						else if (shapes[i] instanceof Circle)
						{
							System.out.println("Circle Radius: " + ((Circle) shapes[i]).GetRadius());
							System.out.println();
						}
						else
						{
							System.out.print("Rectangle Length: " + ((Rectangle) shapes[i]).GetBase());
							System.out.println("       Rectangle Width: " + ((Rectangle) shapes[i]).GetHeight());
							System.out.println();
						}
					}
				}


				// break out of switch statement
				break;

			case 7:
				// get id number to move
				System.out.print("Enter the ID for the Shape you would like to move: ");
				id = input.nextInt();
			// get location from user (two variables new X,Y location)
				System.out.print("\nEnter the X Location: ");
				x = input.nextInt();
				System.out.print("\nEnter the Y Location: ");
				y = input.nextInt();
			// set found to false
				found = false;

				for (int i = 0; i < shapes.length; i++)
				{
					// if this is a valid object and the correct object
					if (shapes[i] != null && shapes[i].getID() == id)
					{
						
						shapes[i].setXLoc(x);
						shapes[i].setYLoc(y);
						// set found to true
						found = true;
						// break out of loop
						break;
					}
				}
			// if not found, give error message
				if (!found) {
					System.out.println("Shape does not exist");
				}
			// break out of switch statement
				break;


			case 8:
				// get new scale factor (validate)
				while(sf <= 0) {
					System.out.print("\nPlease enter a decimal scale factor(must be positive): ");
					sf = input.nextDouble();
					if (sf<=0)
						System.out.print("\nInvalid input");
				}
				

			// call SetScaleFactor to set the new scale factor
				Shape.setScale(sf);

			// break out of switch statement
			break;

			case 9:
				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is a valid object
					if (shapes[i] != null)
					{
						// call ScaleShape method on object
						shapes[i].scaleShape();

					}
				}
			// break out of switch statement
			break;

			case 10:
				// confirm user wants to exit
				input.nextLine();
				System.out.println("Are you sure you would like to exit the program(Y/N)?");
				String quit = input.nextLine();
				while(!quit.equalsIgnoreCase("N") && !quit.equalsIgnoreCase("Y")) {
					System.out.println("Invalid Input");
					System.out.println("Would you like to exit the program(Y/N)?");
					quit = input.nextLine();
				}
				// set variable to break out of loop
				if (quit.equalsIgnoreCase("Y"))
					exit = true;
			// break out of switch statement
			}

		} while (!exit);

	}

}