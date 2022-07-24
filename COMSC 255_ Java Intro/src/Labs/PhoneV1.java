//Nathan Jaggers, Daehoon Kwack
//1547609, 1617183
//Feb 18th 2020

package Labs;

import java.util.Scanner ;

public class PhoneV1 {

	//member variables
private 
	String brand ;
	String itemName ;
	float screenWidth;
	float screenLength ;
	
public
	PhoneV1()
	{
		brand = "None" ;
		itemName = "None" ;
		screenWidth = 0 ;
		screenLength = 0 ;
	}
	
	//member methods
	
	//getters
	String getBrand() {
		return brand ;
	}

	String getItemName() {
		return itemName ;
	}
	
	float getScreenW() {
		return screenWidth ; 
	}
	
	float getScreenL() {
		return screenLength ;
	}

	//setters
	void setBrand(String tempB) {
		brand = tempB ;
	}
	
	void setItemName(String tempIN) {
		itemName = tempIN ;
	}
	
	void setScreenW(float tempW) {
		screenWidth = tempW ;
	}
	
	void setScreenL(float tempL) {
		screenLength = tempL ;
	}
	
	//area and perimeter
	float getArea() {
		return (screenWidth * screenLength) ;
	}
	float getPerimeter() {
		return (2*screenWidth + 2*screenLength) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare scanner and phone
		Scanner input = new Scanner(System.in) ;
		PhoneV1 whoDis = new PhoneV1() ;
		
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
		
		
	}

}
