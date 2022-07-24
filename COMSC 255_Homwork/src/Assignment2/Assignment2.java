//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment2;

import java.util.Scanner ;

public class Assignment2 {

	public static void main(String[] args) {

		//declarations
		Scanner input = new Scanner(System.in) ;
		int userWins = 0, userChoice, comWins = 0, comChoice ;
		
		//welcome
		System.out.println("Welcome to Rock-Paper-Scissors!\n"
				+ "In this program you will play Rock-Paper-Scissors against\n"
				+ "the computer. First to 3 wins is the champion!\n"
				+ "************************************************************\n") ;
		
		//rock paper scissors
		while ((userWins < 3) && (comWins < 3))
		{
			//get user and computer choice
			comChoice = (int) (Math.random()*3) ;
			
			System.out.print("Please enter your choice - scissor (0), rock (1), paper (2): ");
			userChoice = input.nextInt() ; 
			while((userChoice < 0) || (userChoice > 2))
			{
				System.out.print("Sorry, that is not a vaild input, please try again.\n"
						+ "Please enter your choice - scissor (0), rock (1), paper (2): ");
				userChoice = input.nextInt() ; 
			}
			
			//show computer choice and user choice
			switch (comChoice)
			{
				case 0: System.out.println("Computer's choice is scissor (0).") ;
						break ;
				case 1: System.out.println("Computer's choice is rock (1).") ;
						break ;
				case 2: System.out.println("Computer's choice is paper (2).") ;
						break ;
				default:System.out.println("Something went wrong, please try again.");
						break ;
			}
			
			switch (userChoice)
			{
				case 0: System.out.println("Your choice is scissor (0).") ;
						break ;
				case 1: System.out.println("Your choice is rock (1).") ;
						break ;
				case 2: System.out.println("Your choice is paper (2).") ;
						break ;
				default:System.out.println("Something went wrong, please try again.");
						break ;
			}
			
			//compute and show round winner
			switch (comChoice)
			{
				case 0: switch (userChoice)
						{
						case 0: System.out.println("It is a draw.") ;
								break ;
						case 1: System.out.println("You won!") ;
								userWins++ ;
								break ;
						case 2: System.out.println("You lost.") ;
								comWins++ ;
								break ;
						}
						break ;
						
				case 1:  switch (userChoice)
						{
						case 1: System.out.println("It is a draw.") ;
								break ;
						case 2: System.out.println("You won!") ;
								userWins++ ;
								break ;
						case 0: System.out.println("You lost.") ;
								comWins++ ;
								break ;
						}
						break ;
						
				case 2:  switch (userChoice)
						{
						case 2: System.out.println("It is a draw.") ;
								break ;
						case 0: System.out.println("You won!") ;
								userWins++ ;
								break ;
						case 1: System.out.println("You lost.") ;
								comWins++ ;
								break ;
						}
						break ;	
				default:System.out.println("Something went wrong, please try again.");
						break ;
			}
			System.out.println("\n************************************************************\n") ;
			
			
		}
		
		//display champion
		if(comWins == 3)
		{
			System.out.println("The champion is the Computer!\n") ;
		}
		else
		{
			System.out.println("The champion is the User!\n") ;
		}
		
		System.out.println("Game Record:\nUser: "+ userWins + "\nComputer: "+ comWins) ;
			
		//goodbye
		System.out.println("\n************************************************************\n\n"
				+ "Thank you for using the program! Have a great day!");
		
	}

}
