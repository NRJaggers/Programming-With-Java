//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment9;

import Assignment9.Account ;
import Assignment9.CDAccount ;
import Assignment9.CheckingAccount ;
import Assignment9.SavingAccount ;
import java.util.Scanner; 
import java.util.ArrayList ;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class Assignment9 {
	public static void main(String[] args) throws IOException {
		
		//declarations
		Scanner input = new Scanner(System.in) ;
		ArrayList<Account> accountList = new ArrayList<Account>() ;
		int choice = 1 ;
		
		//welcome
		System.out.println("Welcome to Assignment 9!\n"
				+ "================================\n") ;
		
		//get user input for file location to save info
		System.out.print("Type the file path of the location to save account info : ") ;
		String fileName = input.next() ;
		input.nextLine();
		File file = new File(fileName) ;
		PrintWriter output = new PrintWriter(file) ;
		
		//repeat process until user opts out
		while(choice == 1) {
			
		//get user input for balance and duration using validation methods
		double balance = getDouble(input,"Enter the inital balance of the account : ") ;
		int duration = getNonNegativeInt(input,"Enter the duration of the account (0 for Saving or Checking) : ") ;
		
		//create new account and set interest rate
		SavingAccount.setAnnualInterestRate(3);
		if (duration != 0) {
			accountList.add(new CDAccount(1000+accountList.size(),balance,duration)) ;
			choice = 0 ;
		}
		else {
			choice = getNonNegativeInt(input,"Enter 1 for Savings Account and 2 for Checking Account : ") ;
			while (choice != 1 && choice != 2)
			{
				System.out.println("Invalid choice. Try again. ") ;
				choice = getNonNegativeInt(input,"Enter 1 for Savings Account and 2 for Checking Account : ") ;
			}
			
			if(choice == 1) {
				accountList.add(new SavingAccount(1000+accountList.size(),balance)) ;
			}
			else {
				accountList.add(new CheckingAccount(1000+accountList.size(),balance)) ;
			}
		}
		
		//write account info to file
		output.print(accountList.get(accountList.size()-1).toString());
		
		if(choice == 0) {
			output.print(" CDAccount\n");
		}
		else if(choice == 1) {
			output.print(" SavingAccount\n");
		}
		else {
			output.print(" CheckingAccount\n");
		}
		
		//user input for again
		System.out.print("Enter 1 to create another account : ") ;
		choice = input.nextInt() ;
		
		}
		//close output file
		output.close();
		
		//read info from file and format print to console
		Scanner fileInput = new Scanner(file) ;
		
		System.out.printf("\n%-13s%-18s%-23s%-15s\n","Account ID","Initial Balance","Annual Interest Rate","Account Type") ;
		System.out.print("=========================================================================================\n");
		
		while(fileInput.hasNext()) {
			System.out.printf("%-13d%-18.2f%-23.2f%-15s\n",
					Integer.parseInt(fileInput.next()),
					Double.parseDouble(fileInput.next()),
					Double.parseDouble(fileInput.next()),
					fileInput.next()
					);
		}
		
		//close input file
		fileInput.close();
		
		//goodbye
		System.out.println("\n================================\n"
				+ "Thanks for using the program, have a great day!") ;
	}
	
	public static double getDouble(Scanner sc, String prompt) {
		double output = 0 ;
		boolean isValid = false ;
		while(!isValid) {
			System.out.print(prompt);
			if(sc.hasNextDouble()) {
				output = sc.nextDouble();
				isValid = true ;
			}
			else {
				System.out.println("Error! Invalid decimal value. Try again. ") ;
			}
			sc.nextLine();
		}
		return output ;
	}
	
	public static int getNonNegativeInt(Scanner sc, String prompt) {
		int output = 0, temp ;
		boolean isValid = false ;
		while(!isValid) {
			System.out.print(prompt);
			if(sc.hasNextInt() && (temp = sc.nextInt()) >= 0) {
				output = temp;
				isValid = true ;
			}
			else {
				System.out.println("Error! Invalid positive integer value. Try again. ") ;
			}
			sc.nextLine();
		}
		return output ;
	}
}
