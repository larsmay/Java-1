package lab7;

import java.util.Scanner;

public class rightTest {

	public static void main(String[] args) {
		// DATA
				RightTriangle [] triangles = new RightTriangle[10];
				int nextIDNumber = 1;
				boolean exit = false;
				int selection=0;
				Scanner input = new Scanner(System.in);
				int id=0;
				int x=0, y=0;
				double base=0, height=0, sf=0;
				boolean found = false;
				String quit;

				// ALGORITHM
				// loop until user exits
				System.out.println("This program will allow you to build a right triangle, place it on a grid, move it and adjust its scale factor");
				do
				{
					// display options
					System.out.println("Your options are:\n1 Create new triangle\n2 Delete a triangle\n3 Delete all triangle\n4 Display all triangles\n5 Move a triangle\n6 Resize a triangle\n7 Enter a scale factor\n8 Scale all triangles\n9 Exit program\nEnter your choice:");

					// get selection (validate)
					selection = input.nextInt();
					// switch on selection
					switch(selection)
					{
					case 1:
					// get size from user (two variables only, calculate the hypotenuse)
						System.out.print("Enter the base: ");
						base = input.nextDouble();
						System.out.print("\nEnter the base: ");
						height = input.nextDouble();
					// get location from user (two variables, X,Y location)
						input.nextLine();
						System.out.print("\nEnter X location: ");
						x = input.nextInt();
						System.out.print("\nEnter Y location: ");
						y = input.nextInt();

					// set found to false
						found = false;
					// loop through array
						for (int i = 0; i < triangles.length; i++)
						{
							// if this is an empty spot
							if (triangles[i] == null)
							{
								// create new RightTriangle object and assign to current array element
								triangles[i] = new RightTriangle(nextIDNumber++, base, height, x, y);

								// set found to true
								found = true;

								// break out of loop
								break;
							}
						}

						// if not found, give error message
						if (!found) {
							System.out.println("Too many triangles delete one");
						}
						// break out of switch statement
						break;

					case 2:
						// get id number to delete
							System.out.print("Enter the id number for the triangle to delete: ");
							id = input.nextInt();
							// set found to false
							found = false;
							// loop through array
							for (int i = 0; i < triangles.length; i++)
							{
								// if this is a valid object and the correct object
								if (triangles[i] != null && triangles[i].getID() == id)
								{
									// delete object
									triangles[i] = null;

									// set found to true
									found = true;
									// break out of loop
									break;
								}
							}

						// if not found, give error message
						if (!found) {
							System.out.println("Triangle does not exist");
						}
						// break out of switch statement
						break;

					case 3:
					// loop through array
						for (int i = 0; i < triangles.length; i++)
						{
							// if this is a valid object
							if (triangles[i] != null)
							{
								// delete object
								triangles[i] = null;

							}
						}

						// break out of switch statement
						break;

					case 4:
					// display header
						System.out.println("Listing all triangle information");
					// loop through array
						for (int i = 0; i < triangles.length; i++)
						{
							// if this is a valid object
							if (triangles[i] != null)
							{
								// display all info about object. This should call and display all 8 get methods that return information.
								System.out.println("Triangle ID: "+ triangles[i].getID());
								System.out.println("Base: " + triangles[i].getBase());
								System.out.println("Height: " + triangles[i].getHeight());
								System.out.println("Hypotenuse: " + triangles[i].getHypotenuse());
								System.out.println("X Location: " + triangles[i].getXLoc());
								System.out.println("Y Location: " + triangles[i].getYLoc());
								System.out.println("Perimeter: " + triangles[i].getPerimeter());
								System.out.println("Area: " + triangles[i].getArea());
								System.out.println();
							}
						}
							// display all info about object. This should call and display all 8 get methods that return information.

						// break out of switch statement
						break;

					case 5:
					// get id number to move
						System.out.print("Enter the ID for the Triangle you would like to move: ");
						id = input.nextInt();
					// get location from user (two variables new X,Y location)
						System.out.print("\nEnter the X Location: ");
						x = input.nextInt();
						System.out.print("\nEnter the Y Location: ");
						y = input.nextInt();
					// set found to false
						found = false;

						for (int i = 0; i < triangles.length; i++)
						{
							// if this is a valid object and the correct object
							if (triangles[i] != null && triangles[i].getID() == id)
							{
								
								triangles[i].setXLoc(x);
								triangles[i].setYLoc(y);
								// set found to true
								found = true;
								// break out of loop
								break;
							}
						}
					// if not found, give error message
						if (!found) {
							System.out.println("Triangle does not exist");
						}
					// break out of switch statement
						break;

					case 6:
					// get id number to resize
						System.out.print("Enter the ID for the Triangle you would like to resize: ");
						id = input.nextInt();
					// get size from user (two variables)
						System.out.print("\nEnter the Base: ");
						base = input.nextDouble();
						System.out.print("\nEnter the height: ");
						height = input.nextDouble();
					// set found to false
						found = false;

					// loop through array
						for (int i = 0; i < triangles.length; i++)
						{
							// if this is a valid object and the correct object
							if (triangles[i] != null && triangles[i].getID() == id)
							{
								
								triangles[i].setBase(base);
								triangles[i].setHeight(height);
								// set found to true
								found = true;
								// break out of loop
								break;
							}
						}

					// if not found, give error message
						if (!found) {
							System.out.println("Triangle does not exist");
						}
					// break out of switch statement
						break;
					case 7:
					// get new scale factor (validate)
						while(sf <= 0) {
							System.out.print("\nPlease enter a decimal scale factor(must be positive): ");
							sf = input.nextDouble();
							if (sf<=0)
								System.out.print("\nInvalid input");
						}
						

					// call SetScaleFactor to set the new scale factor
						RightTriangle.setScale(sf);

					// break out of switch statement
					break;

					case 8:
					// loop through array
						for (int i = 0; i < triangles.length; i++)
						{
							// if this is a valid object
							if (triangles[i] != null)
							{
								// call ScaleShape method on object
								triangles[i].scaleShape();

							}
						}
					// break out of switch statement
					break;

					case 9:
					// confirm user wants to exit
						input.nextLine();
						System.out.println("Are you sure you would like to exit the program(Y/N)?");
						quit = input.nextLine();
						while(!quit.equalsIgnoreCase("N") && !quit.equalsIgnoreCase("Y")) {
							System.out.println("Invalid Input");
							System.out.println("Would you like to exit the program(Y/N)?");
							quit = input.nextLine();
						}
						// set variable to break out of loop
						if (quit.equalsIgnoreCase("Y"))
							exit = true;
					// break out of switch statement
					break;

					}
				// End loop
					
				} while (!exit);
				System.out.println("Thank you for using this program");
				input.close();
			}			
		}