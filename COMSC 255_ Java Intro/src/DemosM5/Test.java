package DemosM5;

public class Test {
  int i = 5;
  static int k = 2;
  public static void main(String[] args){
	// the static method can access static variables and static method
	
//	int j = i; //Wrong because i is an instance variable
//	m1(); //Wrong because m1() is an instance method
	  
	  Test t = new Test() ; 
	  int j = t.i ; 
	  t.m1();
  }
  
  public void m1(){
	//Correct instance variables, and static variables/methods 
	//can be used in an instance method
	i = i + k  + m2(i, k);
  }
  
  public static int m2(int i, int j){
	return (int)(Math.pow(i, j));
  }
}
