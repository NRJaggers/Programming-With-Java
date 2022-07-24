//Nathan Jaggers
//1547609,
//COMSC 255-3666 - Java

package Assignment7;

//imports
import Assignment7.CDAccount;
import java.util.ArrayList ;
import java.util.Scanner ;

public class Assignment7 {
  // Main method
  public static void main(String[] args) {
	  
	  //welcome
	  System.out.println("Welcome to Assignment 7!\n") ;
	  
	  //declarations
	  float randomInitial ;
	  int randomDuration, find, index;
	  Scanner input = new Scanner(System.in) ;
	  ArrayList<Account> accountList = new ArrayList() ;
	  
	  //allocate new account by random
	  while (accountList.size() < 100)
	  {
		  randomInitial = (float)(Math.random()*10000) ;
		  randomDuration = (int)(Math.random()*51) ;
		  //System.out.println(random);
		  if (((int)randomInitial)%2 == 0)
		  {
			  //Account data = new Account((accountList.size()+1001),(randomInitial)) ;
			  //accountList.add(data) ;
			  accountList.add(new Account((accountList.size()+1001),(randomInitial))) ;
		  }
		  else
		  {
			  //CDAccount data = new CDAccount((accountList.size()+1001),(randomInitial),randomDuration) ;
			  // accountList.add(data)
			  accountList.add(new CDAccount((accountList.size()+1001),(randomInitial),randomDuration)) ; 
		  }
		  
//		  System.out.println("Account #" + accountList.get(accountList.size()-1).getID() +" created with balance of $"
//				  	+ accountList.get(accountList.size()-1).getBalance() );
	  }
	  
	  System.out.print("All " + accountList.size() + " accounts created.\nNow shuffling list...\n\n"
	  		+ "Please enter an account number to search for in the list (or 0 to exit): ") ;
	  java.util.Collections.shuffle(accountList) ;
	  find = input.nextInt();
	  
	  while (find != 0) {
		  if (accountList.contains(new Account(find,0)))
		  {
			  index = accountList.indexOf(new Account(find,0)) ;
			  
			  if(accountList.get(index) instanceof CDAccount) {
				  System.out.printf("Account id: %d | Account Type: CDAccount | Account mature balance: $%.2f", accountList.get(index).getID(), ((CDAccount)accountList.get(index)).getMatureBalance() );
				  
			  }
			  else {
				  //(accountList.get(index) instanceof Account)
				  System.out.printf("Account id: %d | Account balance: $%.2f", accountList.get(index).getID(), accountList.get(index).getBalance() );
				  
			  }
				  
		   }
		  else {
			  System.out.println("Account number " + find + " doesn't exsist!\nPlease try again.\n") ;
		  }
		  System.out.print("\nPlease enter an account number to search for in the list (or 0 to exit): ") ;
		  find = input.nextInt();
	  }
	  
	//goodbye
	  System.out.println("\nProgram exiting...") ;
 }
  

}
