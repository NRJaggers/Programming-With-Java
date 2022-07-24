//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment4;

import java.util.Date ;

public class Account {
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
	
}


