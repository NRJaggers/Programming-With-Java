//Nathan Jaggers
//1547609

package Lab15;

import java.util.Scanner;

public class LabExercise15 {
// Main Method
  public static void main(String[] args) {
	// Create a scanner
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an index to display all Fibonacci numbers: ");
	int index = input.nextInt();
	
	// Create static counter
	  
	// Find and display the Fibonacci numbers
	for ( int i = 0; i <= index; i++)
	{
		counter = 0 ;
		System.out.printf("Fibonacci( %2d ) =  %d ***number of recursive function calls %d \n", i, fib(i),counter);
	}

	input.close();
  }
  public static int counter ;
  public static long fib(int index) {
		//increment counter
	  	  counter++;
	if (index == 0 || index == 1) //base case
	  return index;
	else // make the recursive calls
	  return fib(index - 1) + fib(index - 2);
  }
  
  
}
