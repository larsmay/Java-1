package areaTest;
import java.util.Scanner;

import circle.Circle;
import rightTriangle.RightTriangle;

public class areaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This program calculates area and perimeter of rectangles and circles then displays their details");
		System.out.print("Enter the radius for the first circle: ");
		double r1 = input.nextDouble();
		Circle c1 = new Circle(r1);
		
		System.out.print("Enter the radius for the second circle: ");
		double r2 = input.nextDouble();
		Circle c2 = new Circle(r2);
		
		System.out.print("Enter the base for the first triangle: ");
		double b1 = input.nextDouble();
		System.out.print("Enter the height for the first triangle: ");
		double h1 = input.nextDouble();
		RightTriangle t1 = new RightTriangle(b1,h1);
		
		System.out.print("Enter the base for the second triangle: ");
		double b2 = input.nextDouble();
		System.out.print("Enter the height for the second triange: ");
		double h2 = input.nextDouble();
		RightTriangle t2 = new RightTriangle(b2, h2);
		
		System.out.print("\n\n------------------------------CIRCLE 1------------------------------");
		System.out.print("\n   Area: " + c1.getArea());
		System.out.print("   Perimeter: " + c1.getPerimeter());
		System.out.print("   Radius: " + c1.getRadius());
		System.out.print("\n------------------------------CIRCLE 2------------------------------");
		System.out.print("\n   Area: " + c2.getArea());
		System.out.print("   Perimeter: " + c2.getPerimeter());
		System.out.print("   Radius: " + c2.getRadius());
		
		System.out.print("\n-----------------WHICH CIRCLE HAS THE MOST AREA?--------------------");
		if (c1.getArea() > c2.getArea())
			System.out.println("\nCircle 1 is larger than circle 2 with area: " + c1.getArea());
		else if (c2.getArea() > c1.getArea())
			System.out.println("\nCircle 2 is larger than circle 1 with area: " + c2.getArea());
		else
			System.out.println("\nThe circles are the same area.");
		
		System.out.print("\n\n------------------------------TRIANGLE 1------------------------------");
		System.out.print("\n            Area: " + t1.getArea());
		System.out.print("  Perimeter: " + t1.getPerimeter());
		System.out.print("\n     Base: " + t1.getBase());
		System.out.print("  Height: " + t1.getHeight());
		System.out.print("  Hypotenuse: " + t1.getHypotenuse());
		
		System.out.println("\n------------------------------TRIANGLE 2------------------------------");
		System.out.print("            Area: " + t2.getArea());
		System.out.print("  Perimeter: " + t2.getPerimeter());
		System.out.print("\n     Base: " + t2.getBase());
		System.out.print("  Height: " + t2.getHeight());
		System.out.print("  Hypotenuse: " + t2.getHypotenuse());

		System.out.print("\n-----------------WHICH TRIANGLE HAS THE MOST AREA?--------------------");
		if (t1.getArea() > t2.getArea())
			System.out.println("\nTriangle 1 is larger than triangle 2 with area: " + t1.getArea());
		else if (t2.getArea() > t1.getArea())
			System.out.println("\nTriangle 2 is larger than triangle 1 with area: " + t2.getArea());
		else
			System.out.println("\nThe triangles have the same area.");
		input.close();
	}

}
