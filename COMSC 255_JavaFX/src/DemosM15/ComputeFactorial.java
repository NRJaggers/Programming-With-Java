//  COMSC-255  Module 13
//  Recursions
//  computer Factorial using recursions

package DemosM15;

import java.util.Scanner;

public class ComputeFactorial {
  //Main method
  public static void main(String[] args){
	//Create a scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a nonnegative integer: ");
	int n = input.nextInt();
	
	//Display factorial
	for (int i = 0; i <= n; i++)
	  System.out.printf("%2d ! = %d \n", i , factorial(i));
	input.close();
  }

  //Return the factorial for the specified number
  public static long factorial(int n) {
	if (n == 1 || n == 0) // the base cases
	  return 1;
	else
	  return n * factorial(n-1);
  }
}
