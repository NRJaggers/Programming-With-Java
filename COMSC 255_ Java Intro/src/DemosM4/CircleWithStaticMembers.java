// COMSC-255 Module 4
// CircleWithStaticMembers included static variable and method
package DemosM4;

public class CircleWithStaticMembers {
  // the radius of this circle
  double radius;
  // The number of objects created
  static int numberOfObjects = 0;

  /**Default constructor*/
  CircleWithStaticMembers() {
    radius = 1; // default value for the radius
    numberOfObjects++;
  }

  /**Construct circle with a specified radius*/
  CircleWithStaticMembers(double newRadius) {
	radius = newRadius;
	numberOfObjects++;
  }
	  
  /**Return numberOfObjects*/
  static int getNumberOfObjects() {
	return numberOfObjects;
  }
  
  /**Return the area of this circle*/
  double getArea() {
	return radius * radius * Math.PI;
  }
}
