//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment1;

import java.util.Scanner ;
import java.lang.Math ; 

public class Assignment1 {
	public static void main(String[] args) {
		
		//Declarations and Create Scanner Object
		Scanner input = new Scanner(System.in) ;
		double loanAmount, loanPeriod, intRate, payMon, payTotal, increment = 0.125 ;
		String intRateS = "Interest Rate (%)", payMonS = "Monthly Payment($)", payTotalS = "Total Payment($)" ;
		
		//Welcome message
		System.out.println("Hello and welcome to the program!\n"
				+ "Here you will be able to enter a loan amount and period \n"
				+ "and it will be used to calculate and display monthly and \n"
				+ "total payments based on varying interest rates\n") ;
		
		//Get user input
		System.out.print("Please enter the borrowed loan amount:") ;
		loanAmount = input.nextFloat() ;

		System.out.print("Please enter the borrowed loan period:") ;
		loanPeriod = input.nextFloat() ;
		
		//Print Headings
		System.out.printf("%19s %20s %18s \n",intRateS,payMonS,payTotalS); 
		
		//Calculate and Display monthly and total payments
		for (intRate = 5; intRate <= 8; intRate += increment)
		{ 
			payMon = (loanAmount*(intRate/1200))/(1-(1/(Math.pow((1+(intRate/1200)),(loanPeriod*12))))) ;
			payTotal = payMon * loanPeriod * 12 ;
			
			System.out.printf("%19.3f %20.2f %18.2f \n",intRate,payMon,payTotal);
		}
		
	}
}
