//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Labs;

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

 	class Account {
	//member variables
	
	
	private int 	id ;
	private double 	balance ; 
	private static double 	annualInterestRate ; 
	private Date 	dateCreated ;
	
	
	//constructors
	public Account() {
		id = 0 ;
		balance = 0 ;
		annualInterestRate = 0 ; 
		dateCreated = new Date() ; // constructing Date object for current time
	}
	
	public Account(int id, double balance) {
		this.id = id ;
		this.balance = balance ;
		dateCreated = new Date() ; // constructing Date object for current time
		
		
	}
	//setters
	public void setID(int id) {
		this.id = id ;
	}
	
	public void setBalance(double balance) {
		this.balance = balance ;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate ;
	}
	
	//getters
	public int getID() {
		return id ;
	}
	
	public double getBalance() {
		return balance ;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate ;
	}
	
	public Date getDate() {
		return dateCreated ;
	}
	
	public double getMonthlyInterestRate() {
		return	(annualInterestRate/100)/12 ;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() ;
	}
	
	//other member methods
	public void withdraw(double amount) {
		balance = balance - amount ; 
	}
	
	public void deposit(double amount) {
		balance = balance + amount ;
	}
	
	public void displayHeader() {
		System.out.printf("%-19s%-20s%-21s%-12s%-22s\n","Account Number","Initial Balance","Monthly Interest","Balance","Date Created");
		System.out.println("============================================================================================") ;
	}
	public String toString()
	{
		String output ;
		output = String.format("%-19s%-20s%-21s%-12s%-22s\n","Account Number","Initial Balance","Monthly Interest","Balance","Date Created");
		output += "============================================================================================\n" ;
		output += String.format("%14d%20.2f%21.2f%12.2f%33s\n",
							  id, balance, getMonthlyInterest(),
							  (getBalance()+getMonthlyInterest()),getDate().toString());
		return output ;
	}
	
}




