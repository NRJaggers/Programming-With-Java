package DemosM1;

import java.util.Scanner;

public class ComputerAreaWithConsoleInput {
  public static void main(String[] args){
	//Create a Scanner Object
	Scanner input = new Scanner(System.in);
	
	//prompt the user to enter a radius
	System.out.print("Enter a number for radius: ");
	double radius = input.nextDouble();
	
	//Calculate the area
	double area = radius * radius * 3.14159;
	
	//Display the output without formatting
	System.out.println("The area of a circile with radius = "
			+ radius + "  is " + area);
	//Display the output with formatting
		System.out.printf("The area of a circile with radius = %6.2f is %6.2f in two-decimal places", 
			radius, area);
  }
}
