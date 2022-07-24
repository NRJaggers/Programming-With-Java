//COMSC255 Module 15
//Runtime testing for the recursive function of the fibonacci problem
package DemosM15;

import java.util.Scanner;

public class RecursiveFibRuntime {
// Main Method
  public static void main(String[] args) {
	// Create a scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer to display all Fibonacci numbers: ");
	int index = input.nextInt();
	long startTime = System.currentTimeMillis();
	// Find and display the Fibonacci numbers
	for ( int i = 0; i <= index; i++)
	  System.out.printf("Fibonacci( %2d ) =  %4d \n", i, fib(i));
		  
	double runtime = (System.currentTimeMillis() - startTime) / 1000.0;
	System.out.printf("The total runtime is, %.6f (second)", runtime);
	input.close();
  }

  public static long fib(int index) {
    if (index == 0 || index == 1) //base case
	  return index;
	else // make the recursive calls
	  return fib(index - 1) + fib(index - 2);
  }
}
