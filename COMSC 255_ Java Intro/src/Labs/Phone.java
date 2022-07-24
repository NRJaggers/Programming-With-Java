//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Feb 18th 2020

package Labs;

import java.util.Scanner ;

public class Phone {

	//member variables
	private String brand ;
	private String itemName ;
	private float screenWidth;
	private float screenLength ;
	
public Phone()
	{
		brand = "None" ;
		itemName = "None" ;
		screenWidth = 0 ;
		screenLength = 0 ;
	}
	
	//member methods
	
	//getters
public	String getBrand() {
		return brand ;
	}

public	String getItemName() {
		return itemName ;
	}
	
public	float getScreenW() {
		return screenWidth ; 
	}
	
public	float getScreenL() {
		return screenLength ;
	}

	//setters
public	void setBrand(String tempB) {
		brand = tempB ;
	}
	
public	void setItemName(String tempIN) {
		itemName = tempIN ;
	}
	
public	void setScreenW(float tempW) {
		screenWidth = tempW ;
	}
	
public	void setScreenL(float tempL) {
		screenLength = tempL ;
	}
	
	//area and perimeter
public	float getArea() {
		return (screenWidth * screenLength) ;
	}
public	float getPerimeter() {
		return (2*screenWidth + 2*screenLength) ;
	}
protected void displayInfo () {
	System.out.println("The phone is " + getBrand() + "'s " + getItemName()) ;
}
	
public class iPhone extends Phone {
		
	private String operatingSystem ;
	private String displayType ;
	private String mobileCarrier ;
	private int	   connection ;
	
	public iPhone() {
		super() ;
		operatingSystem = "iOS10" ;
		displayType = "Home button" ;
		mobileCarrier = "N/A" ;
		connection = 2 ;
	}
	
	public iPhone(String oSys, String dispT, String carrier, int connect ) {
		super() ;
		operatingSystem = oSys ;
		displayType = dispT ;
		mobileCarrier = carrier ;
		connection = connect ;
	}
	
	public void checkiOSupdate() {
		if(operatingSystem == "iOS13")
		{
			System.out.println("System is up to date");
		}
		else
		{
			System.out.println("iOS 13 is out... updating");
			operatingSystem = "iOS13" ;
			System.out.println("updated");
		}
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("It is running on " + operatingSystem + " and has a " + displayType + ".") ;
	}
	
	public void isLTEAvailible () {
		if (connection >= 3)
		{
			System.out.println("LTE is availible");
		}
		else
		{
			System.out.println("LTE is not availible");
		}
	}
	
}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//declare scanner and phone
	Scanner input = new Scanner(System.in) ;
	Phone whoDis = new Phone() ;
	iPhone joe = whoDis.new iPhone() ;
	
	System.out.print("Enter the phone brand: ");
	String b = input.next();
	
	System.out.print("Enter the phone item name: ");
	String i = input.next();
	
	System.out.print("Enter the phone screen width: ");
	float w = input.nextFloat();
	
	System.out.print("Enter the phone screen length: ");
	float l = input.nextFloat();
	
	
	whoDis.setBrand(b);
	whoDis.setItemName(i);
	whoDis.setScreenW(w);
	whoDis.setScreenL(l);
	
	System.out.print("\nPhone brand is: " + whoDis.getBrand());
	System.out.print("\nPhone item name is: " + whoDis.getItemName());
	System.out.print("\nPhone screen width is: " + whoDis.getScreenW());
	System.out.print("\nPhone screen length is: " + whoDis.getScreenL());
	System.out.print("\nPhone screen area is: " + whoDis.getArea());
	System.out.print("\nPhone screen perimeter is: " + whoDis.getPerimeter());
	
	joe.checkiOSupdate();
	joe.isLTEAvailible();
	joe.displayInfo();
	
}

}
