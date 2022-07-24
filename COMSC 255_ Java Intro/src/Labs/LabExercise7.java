//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Feb 5th 2020

package Labs;

//imports
import Labs.CDAccount;

public class LabExercise7 {
  // Main method
  public static void main(String[] args) {
	  
	  //welcome
	  System.out.println("Welcome to Lab Exercise 7!\n") ;
	  
	  //declarations
	  int count = 0 , random;
	  Account[] accountList = new Account[10] ;
	  
	  //allocate new account by random
	  while (count < 10)
	  {
		  random = (int)(Math.random()*10000) ;
		  //System.out.println(random);
		  if (random%2 == 0)
		  {
			  accountList[count] = new Account((count+1001),(random)) ;
		  }
		  else
		  {
			  accountList[count] = new CDAccount((count+1001),(random),count+1) ;
		  }
		  
		  System.out.println("Account #" + accountList[count].getID() +" created with balance of $"
				  	+ accountList[count].getBalance() );
		  count++ ;
	  }
	  
	  System.out.println() ;
	  
	  for(int i = 0; i < 10 ; i++) {
		  System.out.print(accountList[i].toString());
	  }
	  
	  for(int i = 0; i < 10 ; i++) {
		  System.out.println("\nAccount #" + accountList[i].getID()) ;
		  System.out.println("Withdraw $500 : " );
		  accountList[i].withdraw(500);
		  System.out.println("Deposit $1000 : " );
		  accountList[i].deposit(1000);
		  System.out.println("Balance : " + accountList[i].getBalance() );
		  
	  }
	  
	  for(int i = 0; i < 10 ; i++) {
		  System.out.print(accountList[i].toString());
	  }
	  
  }
  

}
