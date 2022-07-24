//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment8;

public class Assignment8_Part2 {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException
    {
    	//welcome
    	System.out.println("Welcome to Assignment 8 - Part2!\n"
				+ "================================\n"
				+ "Creating Accounts") ;
    	
        // Create 5 ComparableAccount objects
        ComparableAccount[] accountArray = new ComparableAccount[5];
        for (int i = 0; i < accountArray.length; i++)
        {
            accountArray[i] = new ComparableAccount(1000+(i+1), 1000.0);
            accountArray[i].deposit(500);
            accountArray[i].withdraw(100*(i+1));
            System.out.print(accountArray[i]);
        }
        
        // Create another array to contain the 5 cloned ComparableAccount objects
        ComparableAccount[] accountCloneArrayElement = new ComparableAccount[accountArray.length];
        
        // Invoke the clone() method through each ComparableAccount object from the ComparableAccount array
        System.out.println("\nClone Array from elements");
        for (int i = 0; i < accountArray.length; i++)
        {
            accountCloneArrayElement[i] = (ComparableAccount)(accountArray[i].clone()) ;
        }
        // Compare the dateCreate object from the original array and clone array - deep copy
        for (int i = 0; i < accountArray.length; i++)
        {
        	System.out.print("accountArray["+i+"].getDate() == accountCloneArrayElement["+i+"].getDate() : ");
        	
            if (accountArray[i].getDate() == accountCloneArrayElement[i].getDate()) {
            	System.out.print("True \n");
            }
            else
            {
            	System.out.print("False \n");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < accountArray.length; i++)
        {
            System.out.println("CloneArray.dateCreated.compareTo(OrignalArray.dateCreates[" + i + "]) is : " + (accountCloneArrayElement[i].dateCreated.compareTo(accountArray[i].dateCreated)));
        }
        
        System.out.println("\nBefore Sorting");
        for (int i = 0; i < accountArray.length; i++)
        {
            System.out.print(accountArray[i]);
        }
        java.util.Arrays.sort(accountArray);
        System.out.println("\nAfter Sorting");
        for (int i = 0; i < accountArray.length; i++)
        {
            System.out.print(accountArray[i]);
        }
    }
}
