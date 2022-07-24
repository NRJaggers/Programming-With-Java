//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment8;

import java.util.ArrayList ;

public class Assignment8_Part1 {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to Assignment 8 - Part1!\n"
				+ "================================\n") ;
		
		//declarations
		ArrayList<Account> AccountList = new ArrayList<Account>() ;
		
		//add accounts
		AccountList.add(new SavingAccount(1000,2000)) ;
		AccountList.add(new SavingAccount(1001,800)) ;
		AccountList.add(new CheckingAccount(1002,1000)) ;
		
		//withdraw loop
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Account: "+ AccountList.get(0).getID() +" - Savings") ;
			AccountList.get(0).withdraw(300);
			System.out.println("Account: "+ AccountList.get(1).getID() +" - Savings") ;
			AccountList.get(1).withdraw(300);
			System.out.println("Account: "+ AccountList.get(2).getID() +" - Checking") ;
			AccountList.get(2).withdraw(300);
		}
		
		//goodbye
		System.out.println("================================\n"
				+ "Thanks for using the program, have a great day!") ;
	}

}
