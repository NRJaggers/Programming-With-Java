//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment6;

import Assignment6.CDAccount;

public class Assignment6 {
	public static void main(String[] args) {
		//Welcome
		System.out.println("Welcome to the implementation of the CDAccount program!") ;
		
		//set interest rate
		Account.setAnnualInterestRate(3) ; // 3 for 3%
		
		//declarations
		CDAccount[] savingsRecords = new CDAccount[5] ;
		for(int i = 0; i < 5; i++) {
			savingsRecords[i] = new CDAccount(((i+1)*1000),((i+1)*1000),((i+1)*3)) ;
		}

		//display accounts information
		for(int i = 0; i < 5; i++) {
			displayCDAHeading();
			System.out.println(savingsRecords[i].toString());
			savingsRecords[i].displayMonthlyInterest();
			
			//test deposit and withdraw methods
			savingsRecords[i].deposit(1000);
			savingsRecords[i].withdraw(1000);
		}
		
	}

	public static void displayCDAHeading()
	{
		System.out.printf("\n\n%-19s%-20s%-21s%-12s%-22s\n","Account Number","Initial Balance","Matural Balance","Rate(%)","Date Created");
		System.out.println("============================================================================================") ;
		
	}
	
}
