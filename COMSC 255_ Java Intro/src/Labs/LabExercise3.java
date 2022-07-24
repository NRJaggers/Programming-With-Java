//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Feb 5th 2020

// Test program for Module 3 - Lab Exercise 3
// Apply the Babylonian method to the approximate the square root of a number, n

package Labs;

//import java.util.Scanner ;
import java.lang.Math ;

public class LabExercise3 {
  // Main method
  public static void main(String[] args) {
	System.out.print("Enter a positive number: ");
	java.util.Scanner input = new java.util.Scanner(System.in);
	double number = input.nextDouble();
	    
	System.out.printf("The square root for %.4f is %.4f", number ,sqrt(number));
	input.close();
  }
  
  public static double sqrt(double number) 
  {
  // Find the square root of the value
  // Apply the Babylonian method to find the quare root of number
  // and return the value
	  
	  double nextGuess = 1, lastGuess = 0;
	  
	  while (Math.abs(nextGuess - lastGuess)> 0.00000001)
	  {
		  lastGuess = nextGuess ;
		  
		  nextGuess = (lastGuess + number/lastGuess)/2 ;
	  }
	  
	  return nextGuess ;
  }
}
