//COMSC-255 case study guessing number example 
//Module 2
//Randomly generate a number between 0~100
//Ask the user to guess the number until it is right
//provide hints to the user to adjust their answer

package DemosM2;
import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args)
{
 //Generate a random number to guess
	//numbers from 0-100
	int number = (int) (Math.random() * 101);
	//numbers from 60-85
	//int number = 60 + (int) (Math.random() * 26);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a magic number between 0 to 100 ");
	//System.out.println("Guess a magic number between 60 to 85 ");
		
	int guess = -1;
	while ( guess != number)
	{
	  System.out.print("Enter your guess: ");
	  guess = input.nextInt();
			
	  if (guess == number)
	    System.out.println("Yes, the number is " + number);
	  else if (guess > number)
	    System.out.println("Your guess is too high!");
	  else
		System.out.println("Your guess is too low!");
	}// End of loop
	
	input.close();
}
}
	