//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment7;

import java.util.Date ;

public class CDAccount extends Account {
	
	//member variables
	int duration ;
	double CDannualInterestRate ;
	
	//constructors
	public CDAccount() {
		super();
		setCDAnnualInterestRate() ;
	}
	
	public CDAccount(int id, double balance, int duration) {
		super(id,balance);
		this.duration = duration ;
		setCDAnnualInterestRate() ;
	}
	
	//setters
	public void setDuration(int duration) {
		this.duration = duration ; 
	}
	
	private void setCDAnnualInterestRate() {
		CDannualInterestRate = getAnnualInterestRate() + (0.5 * (duration/3)) ;
	}
	
	//getters
	public int getDuration() {
		return duration ;
	}
	
	public double getMatureBalance() {
		return (getBalance() * Math.pow((1 + getMonthlyInterestRate()/100 ), duration) ) ;
	}
	
	public double getCDAnnualInterestRate() {
		return CDannualInterestRate ; 
	}
	
	@Override
	public double getMonthlyInterestRate() {
		return (CDannualInterestRate/12) ;
	}
	@Override
	public double getMonthlyInterest() {
		return (getBalance() * getMonthlyInterest()) ;
	}
	
	//other member methods
	@Override
	public final void withdraw(double amount) {
		System.out.println("You cannot withdraw any money from a CD account.\n"
				+ "Please close this account to withdraw.");
	}
	
	@Override
	public final void deposit(double amount) {
		System.out.println("You cannot deposit additional money to a CD account.\n"
				+ "Please open another account to deposit.");
	}
	
	@Override
	public String toString() {
			   String output ;
			   output = String.format("\n\n%-19s%-20s%-21s%-12s%-22s\n","Account Number","Initial Balance","Matural Balance","Rate(%)","Date Created");
			   output += "============================================================================================\n" ;
			   output += String.format("%14d%20.2f%21.2f%12.2f%33s\n", 
							 getID(), getBalance(), getMatureBalance(), CDannualInterestRate, getDate() ) ;
			   return output ;
	}
	
	public void displayMonthlyInterest() {
		for(int i = 1; i <= duration ; i++)
		{
			System.out.printf("Month " + i + "=\t %.2f \n", 
							  (getBalance() * (Math.pow( (1.0 + getMonthlyInterestRate()/100), i ) ) ) )  ;
			
		}
		System.out.println();
	}
}




