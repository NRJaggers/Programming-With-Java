//  COMSC-255  Module 13
//  Recursions
//  computer Factorial using a for-loop (iteration)

package DemosM15;

public class TestFactorialIteration {

  public static void main(String[] args) {
  // calculate the factorial of 0 through 10
	for (int i = 0; i <= 10; i++ )
	  System.out.printf("%2d ! = %d \n", i, factorial(i));

  }
  
  public static long factorial(int number){
	long result = 1;
	
	for (; number > 0; number--)
	  result *= number;
	
	return result;
  }
}
