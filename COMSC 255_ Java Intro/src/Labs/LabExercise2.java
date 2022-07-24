//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Feb 5th 2020

package Labs;

import java.util.Scanner ;
import java.lang.Math ;
import javax.swing.JOptionPane;

public class LabExercise2 {
	public static void main(String[] args) {
		
		//Declarations and Create Scanner Object
		Scanner input = new Scanner(System.in) ;
		int option, loanPeriod = 0 ;
		double loanAmount = 0, intRate, payMon, payTotal, increment = 0.125 ;
		String temp, message, intRateS = "Interest Rate (%)", payMonS = "Monthly Payment($)", payTotalS = "Total Payment($)" ;
		
		//Welcome message
		System.out.println("Hello and welcome to the program!\n"
				+ "Here you will be able to enter a loan amount and period \n"
				+ "and it will be used to calculate and display monthly and \n"
				+ "total payments based on varying interest rates\n") ;
		
		//Get user input
		option = JOptionPane.NO_OPTION ;
		while (option != JOptionPane.YES_OPTION)
		{
			temp = JOptionPane.showInputDialog(null,"Please enter the borrowed loan amount:", "Lab Exercise 2", 3) ;
			loanAmount = Double.parseDouble(temp) ;

			temp = JOptionPane.showInputDialog(null,"Please enter the borrowed loan period:", "Lab Exercise 2", 3) ;
			loanPeriod = Integer.parseInt(temp) ;
			
			message = String.format("Loan amount: $%.2f \nLoan period: %d years \n\nIs this correct?" , loanAmount, loanPeriod);
			
			option = JOptionPane.showConfirmDialog(null,message, "Lab Exercise 2", 1);
		}
		
		//Format Heading
		message = String.format("%19s %20s %18s \n",intRateS,payMonS,payTotalS); 
		
		//Calculate and Display monthly and total payments
		for (intRate = 5; intRate <= 8; intRate += increment)
		{ 
			
			payMon = (loanAmount*(intRate/1200))/(1-(1/(Math.pow((1+(intRate/1200)),(loanPeriod*12))))) ;
			payTotal = payMon * loanPeriod * 12 ;
			
			message += String.format("%26.3f %33.2f %26.2f \n",intRate,payMon,payTotal);
		}
		
		JOptionPane.showMessageDialog(null, message, "Lab Exercise 2", 1) ;
	}
}
