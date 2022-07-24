//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment9;

public class CheckingAccount extends Account {

	//member variables
		private static double minBalance ;
		
	//constructor
		public CheckingAccount(int id, double balance) {
			this.setID(id);
			this.setBalance(balance);
			minBalance = 0 ;
		}
	//getters
		public static double getMinBalance() {
			return minBalance ;
		}
		
		@Override
		public double getMonthlyInterestRate() {
			return 0 ;
		}
		
		public double getCheckingInterestRate() {
			return 0 ;
		}
		
	//other methods
		@Override
		public void withdraw(double amount) {
			 if ((this.getBalance()-amount) < minBalance) {
				System.out.println("Unable to complete withdraw.\n"
						+ "Insufficient Funds, Cannot go below $" + minBalance + " .") ;
			}
			else {
				this.setBalance(this.getBalance()-amount);
				
				System.out.println("Withdraw Complete") ;
						
			}
			 System.out.println("Account Number: "+ this.getID()
				+ " Account Balance: $"+ this.getBalance() + "\n");
		}
		
		@Override
		public String toString() {
			 String output = String.format("%d %f %f", getID(), getBalance(), getCheckingInterestRate()) ;
			 return output ;
		}
	}
