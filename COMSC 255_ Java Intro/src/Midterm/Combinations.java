package Midterm;

import java.util.ArrayList ;
import java.util.Scanner ;

public class Combinations {

	public static void main(String[] args) {
		//declarations
		ArrayList<Integer> test = new ArrayList<Integer>() ;
		Scanner input = new Scanner(System.in) ;
		
		//instructions and input
		System.out.println("Enter 10 numbers into the Array list : ") ;
		for(int i = 0; i < 10; i++) {
			test.add(input.nextInt()) ;
		}
		
		//calling combinations
		combinations(test) ;
	}

	public static void combinations(ArrayList<Integer> list)
	{
		for(int i = 0; i < list.size(); i++) {
			
			for(int j = 0; j < list.size(); j++) {
				{
					System.out.print(list.get((i))+ "" + list.get((j)) + " ");
				}
			}
		}
	}
}
