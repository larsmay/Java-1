import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 1
		Scanner input = new Scanner(System.in);
		String name, hobby, movie, color, place;
		int age;
		System.out.print("What is your name?  ");
		name = input.nextLine();
		name = name.toUpperCase();
		System.out.print("How old are you?  ");
		age = input.nextInt();
		input.nextLine();
		System.out.print("What is your favorite hobby?  ");
		hobby = input.nextLine();
		hobby = hobby.toUpperCase();
		System.out.print("What is your favorite movie?  ");
		movie = input.nextLine();
		movie = movie.toUpperCase();
		System.out.print("What is your favorite color?  ");
		color = input.nextLine();
		color = color.toUpperCase();
		System.out.print("Where do you love visiting?  ");
		place = input.nextLine();
		place = place.toUpperCase();
		
		System.out.println("My name is " + name + ". I am " + age + " years old. My favorite hobby is " + hobby + " and my favorite movie is " + movie + ". I love the color " + color + " and I love visiting " + place + ".");
		
		//Part 2
		double shares, purPrice, purCommission, salePrice, saleCommission, sharePrice, commissionTotal, netLoss;
		
		System.out.print("Total Shares:  ");
		shares = input.nextDouble();
		System.out.print("Purchase Price:  ");
		purPrice = input.nextDouble();
		System.out.print("Purchase Commission:  ");
		purCommission = input.nextDouble();
		System.out.print("Sale Price:  ");
		salePrice = input.nextDouble();
		System.out.print("Sale Commission:  ");
		saleCommission = input.nextDouble();
		sharePrice = (shares * purPrice ) - (shares * salePrice);
		commissionTotal = (shares * purPrice * purCommission) + (shares * salePrice * saleCommission);
		netLoss = commissionTotal + sharePrice;
		
		System.out.print("The price for each share is: $" + sharePrice + "\nThe total commission is: $" + commissionTotal + "\nThe netLoss is: $"+netLoss);
		
		

	}

}
