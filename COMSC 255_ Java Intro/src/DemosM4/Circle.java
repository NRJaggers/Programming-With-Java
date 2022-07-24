// COMSC-255 Module 4
// Circle example
package DemosM4;

public class Circle{
  // the radius of this circle
  double radius;

  /**Default constructor*/
  Circle() {
	radius = 1; // default value for the radius
  }

  /**Construct circle with a specified radius*/
  Circle(double newRadius) {
	radius = newRadius;
  }
  
  /**Return the area of this circle*/
  double getArea() {
    return radius * radius * Math.PI;
  }

  /**Return the perimeter of this circle*/
  double getPerimeter() {
	return 2 * radius * Math.PI;
  }  
	  
  /**Set a new radius*/
  void setRadius(double newRadius) {
	radius = newRadius;
  }
}
