//  COMSC-255  Module 13
//  Recursions
//  computer Fibonacci using a for-loop (iteration)

package DemosM15;

public class TestFibonacciIteration {

  public static void main(String[] args) {
// Calculate the Fibonacci of 0 ~ 10
    for (int i = 0; i <= 10; i++ )
	  System.out.printf("%2d ! = %d \n", i, fibonacci(i));

    System.out.printf("%2d ! = %d \n", 20, fibonacci(20));
    System.out.printf("%2d ! = %d \n", 30, fibonacci(30));
    System.out.printf("%2d ! = %d \n", 40, fibonacci(40));
  }
  
  // iterative static method to find the Fibonacci numbers
  public static long fibonacci (int number){
	long f0 = 0, f1 = 1, result = 0;
	
	for (int i = 2; i <= number; i++)
	{
	   result = f0;
	   result += f1;
	   f0 = f1;
	   f1 = result;
	}
	
	if (number == 0 || number == 1)
	  return number;
	
	return result;  
  }
}
