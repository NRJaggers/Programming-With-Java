//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment9;

import java.util.Date ;

public abstract class Account {
	//member variables
	
	
	private int 	id ;
	private double 	balance ; 
	private static double 	annualInterestRate ; 
	protected Date 	dateCreated ;
	
	
	//constructors
	protected Account() {
		id = 0 ;
		balance = 0 ;
		dateCreated = new Date() ; // constructing Date object for current time
	}
	
	protected Account(int id, double balance) {
		this.id = id ;
		this.balance = balance ;
		dateCreated = new Date() ; // constructing Date object for current time
		
		
	}
	//setters
	public void setID(int id) {
		this.id = id ;
	}
	
	protected void setBalance(double balance) {
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
	
	@Override
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
	
	@Override
	public boolean equals(Object o) {
		boolean found = false ;
		
		if (o instanceof Account)
		{	
			if(this.getID() == ((Account)o).getID())
			{
				found = true ;
			}
		}
		else {
			System.out.println("Object is not an instance of Account.") ;
		}
		
		return found ;
	}
	
}




