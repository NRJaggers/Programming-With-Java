//  COMSC-255  Module 13
//  Recursions
//  computer Fibonacci Sequence using recursions

package DemosM15;

import java.util.Scanner;

public class ComputeFibonacci {
// Main Method
  public static void main(String[] args) {
	// Create a scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an index to display all Fibonacci numbers: ");
	int index = input.nextInt();
	
	// Find and display the Fibonacci numbers
	for ( int i = 0; i <= index; i++)
	  System.out.printf("Fibonacci( %2d ) =  %d \n", i, fib(i));
    
	input.close();
  }

  public static long fib(int index) {
	if (index == 0 || index == 1) //base case
	  return index;
	else // make the recursive calls
	  return fib(index - 1) + fib(index - 2);
  }
}
