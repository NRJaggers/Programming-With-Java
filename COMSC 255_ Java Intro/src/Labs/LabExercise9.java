//Nathan Jaggers
//1547609
//Feb 5th 2020

package Labs;

//imports

public class LabExercise9 {
  // Main method
  public static void main(String[] args) {
	  
	  //welcome
	  System.out.println("Welcome to Lab Exercise 9!\n") ;
	  
	  //declarations
	  int size = 100 , choice = 0 ;
	  int[] array = new int[size]; 
	  java.util.Scanner input = new java.util.Scanner(System.in) ;
	  
	  //populate array with random numbers
	  for(int i = 0; i < array.length ; i++) {
		  array[i] = (int) (Math.random() * 250) ;
		  
		  //Test if array is populated
		  //System.out.print(array[i] + " ");
	  }
	  
	  //get user input and find element in array or quit
	  
	        System.out.print("Choose a number between 0-"+ (array.length - 1) +
		  		   " to see the contents of that element in the array.\n");
		    while (choice!=-1) {
		    	try {  
		    	System.out.print("enter a valid number or -1 to quit: ");
			    choice = input.nextInt() ;
		    	
			    System.out.println("The integer at element "+ choice +" is "+ array[choice] +".\n");
		    	}
		    	catch (ArrayIndexOutOfBoundsException ex) {
		  		  System.out.println("Error! Invalid number, please try again.\n");
		  		  input.nextLine() ;
		  		  continue ;
		  	  }
		 }
	  
	  
	  //goodbye
	  System.out.println("Thank you for using the program! Have a great day!") ;
	  
  }
  

}
