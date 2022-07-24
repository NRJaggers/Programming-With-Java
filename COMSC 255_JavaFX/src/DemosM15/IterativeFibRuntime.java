//COMSC255 Module 15
//Runtime testing for the iterative function of the fibonacci problem
package DemosM15;

import java.util.Scanner;

public class IterativeFibRuntime {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer to display all Fibonacci numbers: ");
	int index = input.nextInt();
	long startTime = System.currentTimeMillis();
	for (int i = 0; i <= index; i++ )
	  System.out.printf("%2d fib = %d \n", i, fibonacci(i));
    
	double runtime = (System.currentTimeMillis() - startTime) / 1000.0;
	System.out.printf("The total runtime is, %.6f (second)", runtime);
  }
  
  // iterative static method to find the Fibonacci numbers
  public static long fibonacci (int number){
	long f0 = 0, f1 = 1, result = 0;
	
	for (int i = 2; i <= number; i++)
	{
	   result = f0 + f1;
	   f0 = f1;
	   f1 = result;
	}
	
	if (number == 0 || number == 1)
	  return number;
	
	return result;  
  }
}
