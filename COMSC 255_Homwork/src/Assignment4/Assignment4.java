//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment4;

public class Assignment4 {
	
	public static void main(String[] args) {

		//welcome
		System.out.println("Welcome to the driver program for Account.java!\n\n") ;
		
		//create object reference array
		Account[] accountRecords = new Account[5] ;
		
		//Initialize references to new objects
		for(int i = 0 ; i < accountRecords.length ; i++)
		{
			accountRecords[i] = new Account(((i+1)*1000),((i+1)*1000)) ;
		}
		
		//set interest rate
		Account.setAnnualInterestRate(3);
		
		//withdraw money
		for(int i = 0 ; i < accountRecords.length ; i++)
		{
			accountRecords[i].withdraw(500);
		}
		
		//deposit money
		for(int i = 0 ; i < accountRecords.length ; i++)
		{
			accountRecords[i].deposit(1000);
		}
		
		//print out results
		displayAccounts(accountRecords) ;
	}
	
	public static void displayAccounts(Account[] array)
	{
		System.out.printf("%-19s%-20s%-21s%-12s%-22s\n","Account Number","Initial Balance","Monthly Interest","Balance","Date Created");
		System.out.println("============================================================================================") ;
		for (int i = 0; i < array.length ; i++)
		{
			System.out.printf("%14d%20.2f%21.2f%12.2f%33s\n",
							  array[i].getID(),array[i].getBalance(),array[i].getMonthlyInterest(),
							  (array[i].getBalance()+array[i].getMonthlyInterest()),array[i].getDate().toString());
		}
	}
	
}

