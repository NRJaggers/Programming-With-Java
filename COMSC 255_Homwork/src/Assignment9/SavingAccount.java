//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment9;

public class SavingAccount extends Account {

//member variables
	private int numberWithdraw ;
	private static double minBalance ;
	private static int maxWithdraw ;
	
//constructor
	public SavingAccount(int id, double balance) {
		this.setID(id);
		this.setBalance(balance);
		minBalance = 300 ;
		maxWithdraw = 3 ;
	}
//getters
	public static double getMinBalance() {
		return minBalance ;
	}
	
	public static double getMaxWithdraw() {
		return maxWithdraw ;
	}
	
	public int getNumberWithdraw() {
		return numberWithdraw ;
	}
	
//setters
	public void setNumberWithdraw(int numberWithdraw) {
		this.numberWithdraw = numberWithdraw ;
	}
	
//other methods
	@Override
	public void withdraw(double amount) {
		if (numberWithdraw >= maxWithdraw)
		{
			System.out.println("Unable to complete withdraw.\n"
					+ "Reached withdraw limit for the month.") ;
		}
		else if ((this.getBalance()-amount) < minBalance) {
			System.out.println("Unable to complete withdraw.\n"
					+ "Insufficient Funds, Cannot go below $" + minBalance + " .") ;
		}
		else {
			this.setBalance(this.getBalance()-amount);
			numberWithdraw++ ;
			
			System.out.println("Withdraw Complete") ;
			
		}
		 System.out.println("Account Number: "+ this.getID()
			+ " Account Balance: $"+ this.getBalance() + "\n");
	}
	
	@Override
	public String toString() {
		 String output = String.format("%d %f %f", getID(), getBalance(), Account.getAnnualInterestRate()) ;
		 return output ;
	}
}
