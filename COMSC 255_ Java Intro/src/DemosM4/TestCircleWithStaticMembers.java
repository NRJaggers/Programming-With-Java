// COMSC-255 Module 4
// TestCircleWithStaticMembers created Circle objects
// and test the static variable and method
package DemosM4;

public class TestCircleWithStaticMembers {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  	System.out.println("**Before creating objects**");
  	System.out.println("The number of Circle objects is " +
  	CircleWithStaticMembers.numberOfObjects);
  	
  	//Create c1 object
  	CircleWithStaticMembers c1 = new CircleWithStaticMembers();	
  	
  	//Display c1 Before c2 is created
  	System.out.println("\n**After creating c1**");
  	System.out.println("c1: radius (" + c1.radius + 
  	  ") and the number of Circle objects (" +
  	  CircleWithStaticMembers.numberOfObjects + ")");
  	
    //Create c2 object
  	CircleWithStaticMembers c2 = new CircleWithStaticMembers(25);	
  	
  	//Modify c1
  	c1.radius = 100;
  	
  	//Display c1 and c2 After c2 is created
  	System.out.println("\n**After creating c2 and modifying c1**");
  	System.out.println("c1: radius (" + c1.radius + 
  	  ") and the number of Circle objects (" +
  	  CircleWithStaticMembers.numberOfObjects + ")");
  	System.out.println("c2: radius (" + c2.radius + 
  	  	  ") and the number of Circle objects (" +
  	  	  CircleWithStaticMembers.numberOfObjects + ")");
  }

}
