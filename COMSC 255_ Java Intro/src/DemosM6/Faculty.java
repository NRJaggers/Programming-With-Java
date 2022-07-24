// COMSC-255 Module 6 Example
package DemosM6;

public class Faculty extends Employee {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
    new Faculty();
  }
  
  public Faculty(){
	System.out.println("(4) Performs Faculty's tasks - constructor");
  }
}

class Employee extends Person{
  public Employee(){
	this("(2) Invoke Employee's overloaded constructor");
	System.out.println("(3) Perform Employee's tasks");
  }
  public Employee(String s){
	System.out.println(s);
  }
}

class Person{
  public Person(){
	System.out.println("(1) Perform Person's tasks - constructor");
  }
}
