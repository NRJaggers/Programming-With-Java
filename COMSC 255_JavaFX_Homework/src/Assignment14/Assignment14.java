//Nathan Jaggers
//1547609

package Assignment14;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment14 {
	public static void main(String[] args) throws Exception{
		 
		//declarations
		  Scanner input = new Scanner(System.in); 
		  ArrayList<String> keyWords = new ArrayList<String>();
		  String fileName = new String();
		  String word = new String();
		  int kwAmount, count ;
		  
		//welcome
		  System.out.println("Welcome to Program 14!\n");
		  
		//get file name from user
		  System.out.print("Please enter the filename or file path\n"
		  				 + "of the file you would like to read from: ");
		  fileName = input.next(); //C:\COMSC255\read.txt
		
		//create file object and test if open
		  File file = new File(fileName);
		  
		  if (!file.exists())
		  {
			  System.out.println("\nFile name or path does not exist.\n"
						  		+ "Please check and try again.\n"
						  		+ "Input: "+ fileName );
			  return ;
		  }
		  
		//get number of key words
		  System.out.print("\nPlease enter the number of key words\n"
	  				 + "you would like to search for in the file: ");
		  kwAmount = input.nextInt();
		  
		//user input amount of key words
		  for (int i = 0; i < kwAmount; i++)
		  {
			  System.out.print("\nPlease enter key word "+ (i+1) + " : ");
			  word = input.next();
			  keyWords.add(word);
		  }
		
		//call function to count key words in file and print results
		  count = countKeywords(file, keyWords) ;
		  System.out.println("\nThe number of key words in "+ fileName + " is " + count);
		  
		//goodbye
		  System.out.println("\nThank you for using the program!"
		  					+"\nHave a wonderful day!");
		 
		
	  }
	
	public static int countKeywords(File file, ArrayList<String> list) throws Exception  {
		//declarations
		  HashSet<String> kwSet = new HashSet<String>(list);
		  Scanner fileInput = new Scanner(file);
		  int count = 0 ;
		  
		  while(fileInput.hasNext()) {
			  if(kwSet.contains(fileInput.next()))
				  count++ ;
		  }
		
		  fileInput.close();
		  
		return count;
		
	}
}
