//Nathan Jaggers
//1547609
//COMSC 255-3666 - Java

package Assignment8;

public class ComparableAccount extends Account implements Cloneable, Comparable<ComparableAccount> {

	//constructor
	ComparableAccount(int id, double balance){
		super(id, balance) ; //? see if this is what i need.
	}

	//inherited methods
	@Override
	public String toString( ) {
		String output = new String();
		
		output = "Account ID : " + this.getID()
			   + " Balance: $" + this.getBalance()
			   + " " + this.getDate() + "\n";
		
		return output ;
	}
	
	@Override
	public int compareTo(ComparableAccount that)
	{
		if (this.getBalance()>that.getBalance()) {
			return 1 ;
		}
		else if (this.getBalance()<that.getBalance()) {
			return -1 ;
		}
		else {
			return 0 ;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ComparableAccount cloneAccount = (ComparableAccount)super.clone() ;
		cloneAccount.dateCreated = (java.util.Date)(dateCreated.clone()) ;
		
		return cloneAccount ;
	}
	
}
