//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment8;

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
			String output ;
			output = String.format("%-19s%-20s%-21s%-22s\n","Account Number","Balance","Monthly Interest","Date Created");
			output += "============================================================================================\n" ;
			output += String.format("%14d%20.2f%21.2f%12.2f%33s\n",
								  this.getID(), this.getBalance(), getMonthlyInterest(),
								  getDate().toString());
			return output ;
		}
	}
