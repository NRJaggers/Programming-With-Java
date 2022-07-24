// COMSC-255 Module 4
// TestCircle example to create a Circle object
package DemosM4;

public class TestCircle {
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  // Create a Circle object with the default radius = 1
  Circle c1 = new Circle();
  System.out.println("The area of the circle of radius = " 
		  + c1.radius + " is " + c1.getArea());
  
  //Create a Circle object with the default radius = 1
  Circle c2 = new Circle(25);
  System.out.println("The area of the circle of radius = " 
		 + c2.radius + " is " + c2.getArea());
  
  // Modify the radius of two Circle objects
  c1.radius = 10;
  c2.radius = 125;
  System.out.println("The area of the circle of radius = " 
		  + c1.radius + " is " + c1.getArea());
  System.out.println("The area of the circle of radius = " 
			 + c2.radius + " is " + c2.getArea());
  }
}
