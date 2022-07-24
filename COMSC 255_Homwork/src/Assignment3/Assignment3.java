//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment3;

import java.util.Scanner ;

public class Assignment3 {
	public static void main(String[] args) {

		//declarations
		Scanner input = new Scanner(System.in) ;
		int size1, size2 ;
		
		//welcome
		System.out.println("Welcome to the program!\nHere you will enter in"
				+ "the size for two arrays and then fill in the arrays\n"
				+ "with acending values. Then these two arrays will be \n"
				+ "merged and sorted in acending order.\n") ;
		
		//get input from user
		System.out.print("Enter a number for the size of the first array: ");
		size1 = input.nextInt();
		
		System.out.print("Enter a number for the size of the second array: ");
		size2 = input.nextInt();
		
		//create arrays based on size
		int[] array1 = new int[size1] ;
		int[] array2 = new int[size2] ;
		
		
		//fill in arrays 
		System.out.println("\nFill in values for the first array: ");
		for (int i = 0 ; i < array1.length ; i++)
		{
			array1[i] = input.nextInt();
			
			if((i != 0))
			{
				while((array1[i-1]>array1[i]))
				{
					System.out.printf("\nThis is not acending order.\n"
							+ "Please enter a value greater than %d \n",array1[i-1]);
					
					array1[i] = input.nextInt();
				}
			}
			
		}
		
		System.out.println("Fill in values for the second array: ");
		for (int i = 0 ; i < array2.length ; i++)
		{
			array2[i] = input.nextInt();
			
			if((i != 0))
			{
				while((array2[i-1]>array2[i]))
				{
					System.out.printf("\nThis is not acending order.\n"
							+ "Please enter a value greater than %d \n",array2[i-1]);
					
					array2[i] = input.nextInt();
				}
			}
			
		}
		
		//merge and sort arrays
		int[] array3 = merge(array1,array2) ;
		
		//display results
		System.out.print("The contents of the merged array are as follows: \n");
		
		for(int i = 0; i < (array1.length + array2.length); i++)
		{
			System.out.print( array3[i] + " ");
		}
		
		//goodbye
		System.out.print("\n\nThank you for using the program and have a nice day.");
		
	}
	
	public static int[] merge(int[] list1, int[] list2)
	{
		int[] merged = new int[(list1.length + list2.length)] ;
		int j = 0 , k = 0 ;
		
		for (int i = 0 ; i < (list1.length + list2.length); i++)
		{
			if((j<list1.length) && (k<list2.length) )
			{
				if(list1[j]<=list2[k])
				{
					//trouble shooting
					//System.out.print(list1[j]+ " ");
					merged[i] = list1[j] ;
					j++ ;
				}
				else if(list2[k]<list1[j])
				{
					//trouble shooting
					//System.out.print(list2[k]+ " ");
					merged[i] = list2[k] ;
					k++ ;
				}
			}
			else if(j == list1.length)
			{
				merged[i] = list2[k] ;
				k++ ;	
			}
			else if(k == list2.length)
			{
				merged[i] = list1[j] ;
				j++ ;
			}
			else {
				System.out.print("Case not caught \n");
			}
		}
		
		return merged ;
	}
}
